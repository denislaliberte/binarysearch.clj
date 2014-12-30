(ns search.core-spec
  (:require [speclj.core :refer :all]
            [search.core :refer :all]))

(describe "Search"
  (it "return not found flag when i search an item in an empty list"
    (should= -1 (search  3 []))
  )
  (it "return the first index when the item is in the first position"
    (should= 0 (search  3 [3]))
  )
  (it "return the middle index of middle item"
   (pending)
    (should= 1 (search 3 [1 3 5 ]))
  )
)
