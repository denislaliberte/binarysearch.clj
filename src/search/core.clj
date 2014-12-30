(ns search.core)


(defn middleIndex "return the index of the middle item of a vector" [a]
  (quot (count a) 2)
)

(defn firstHalf "Return the first half of a vector" [a]
  (into [] (first (split-at (middleIndex a) a)))
)

(defn moreThanOne "Test if the vector have more than one item" [a]
  (> (count a) 1)
)

(defmacro dbg[x] `(let [x# ~x] (println "dbg:" '~x "=" x#) x#))

(defn search [a b ]
  (cond
    (= a (get b (middleIndex b))) (middleIndex b)
    (moreThanOne b) (search a (firstHalf b))
    :else -1
  )
)

