(ns search.core)


(defn middleIndex "return the index of the middle item of a vector" [a]
  (quot (count a) 2)
)

(defn firstHalf "Return the first half of a vector" [a]
  (into [] (first (split-at (middleIndex a) a)))
)

(defn secondHalf "Return the first half of a vector" [a]
  (into [] (last (split-at (inc (middleIndex a)) a)))
)

(defn moreThanOne "Test if the vector have more than one item" [a]
  (> (count a) 1)
)

(defn greaterThanMiddle "Test if the argument is greater than the middle ellement of the vector" [a b]
  (> a (get b (middleIndex b)))
)


(defn search "Search an item in a vector, implement binary search" [item vector]
  (let [middle (middleIndex vector), emptyFlag -1]
    (cond
      (= item (get vector middle)) middle
      (moreThanOne vector)
        (cond
          (greaterThanMiddle item vector)
            (let [result (search item (secondHalf vector))]
              (cond
                (= emptyFlag result ) emptyFlag
                :else (+ (inc middle) result))
            )
          :else (search item (firstHalf vector))
        )
      :else emptyFlag
    )
  )
)

