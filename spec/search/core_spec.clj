(ns search.core-spec
  (:require [speclj.core :refer :all]
            [search.core :refer :all]))

(describe "Search"
  (it "return not found flag when the item is not in the vector"
    (should= -1 (search  3 []))
    (should= -1 (search  3 [5]))
    (should= -1 (search 2 [1 3 5 ]))
    (should= -1 (search 9 [1 3 5 ]))
  )
  (it "return the first index when the item is in the first position"
    (should= 0 (search  3 [3]))
    (should= 0 (search  1 [1 3 5]))
    (should= 0 (search  1 [1 3 5 7]))
    (should= 0 (search  1 [1 3 5 7 9]))
  )
  (it "return the middle index of a vector when the item is in the middle position"
    (should= 1 (search 3 [1 3 5 ]))
    (should= 2 (search 5 [1 3 5 7 9 ]))
  )
  (it "return the index of the last element"
    (should= 2 (search 5 [1 3 5]))
    (should= 2 (search 3 [1 2 3 ]))
  )
)

(describe "middleIndex"
  (it "return the first index when the vector is empty or contain only one item"
    (should= 0 (middleIndex []))
    (should= 0 (middleIndex [1]))
  )
  (it "return the second item index in an three item vector "
    (should= 1 (middleIndex[1 2 3]))
  )
)

(describe "firstHalf"
  (it "return the first half of a vector"
    (should= [1] (firstHalf [1 3 5] ))
    (should= [1 3] (firstHalf [1 3 5 7 9] ))
    (should-be-a clojure.lang.PersistentVector (firstHalf [1 3 5 7 9] ))
  )
)

(describe "secondHalf"
  (it "return the second half of a vector"
    (should= [5] (secondHalf [1 3 5] ))
    (should-be-a clojure.lang.PersistentVector (secondHalf [1 3 5 7 9] ))
  )
)

(describe "moreThanOne"
  (it "return true when the array count is greater than 1"
    (should (moreThanOne [1 2]))
    (should-not (moreThanOne [1]))
    (should-not (moreThanOne []))
  )
)

(describe "greaterThanMiddle"
  (it "return test if the first argument is greater than the middle element"
    (should (greaterThanMiddle 5 [1 3 5]))
    (should-not (greaterThanMiddle 1 [1 3 5]))
  )
)


