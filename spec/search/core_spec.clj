(ns search.core-spec
  (:require [speclj.core :refer :all]
            [search.core :refer :all]))

(describe "Search"
  (it "return not found flag when the item is not in the vector"
    (should= -1 (search  3 []))
    (should= -1 (search  3 [5]))
    (should= -1 (search 2 [1 3 5 ]))
  )
  (it "return the first index when the item is in the first position"
    (should= 0 (search  3 [3]))
    (pending)
    (should= 0 (search  1 [1 3 5]))
  )
  (it "return the middle index of a three item vector when the item is in the second position"
    (should= 1 (search 3 [1 3 5 ]))
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
  )
)

