(ns search.core)


(defn search [a b ]
  (cond
    (= a (get b 0)) 0
    :else -1
  )
)
