(ns search.core-spec
  (:require [speclj.core :refer :all]
            [search.core :refer :all]))

(describe "Search"
  (it "return not found flag when i search an item in an empty list"
    (should= -1 (search  3 '()))
  )
)
