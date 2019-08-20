(fn [coll]
  (reduce (fn [acc [ky vl]]
            (merge acc {ky (count vl)}))
          {}
          (group-by identity coll)))
