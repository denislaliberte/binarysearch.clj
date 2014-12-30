(ns search.core)


(defn middleIndex "return the index of the middle item of a vector" [a]
  (quot (count a) 2)
)

(defn search [a b ]
  (cond
    (= a (get b (middleIndex b))) (middleIndex b)
    :else -1
  )
)

