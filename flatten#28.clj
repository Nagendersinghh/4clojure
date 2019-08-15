(def flattn (fn flatn [coll]
              (reduce (fn [acc, item]
                        (cond (coll? item) (concat acc (flatn item))
                              :else (concat acc [item])))
                      ()
                      coll)))

