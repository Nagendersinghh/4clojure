(fn [coll]
  (count (filter (fn [number]
                   (< number
                      (reduce
                        #(+ %1
                            (* (Character/getNumericValue %2)
                               (Character/getNumericValue %2)))
                        0
                        (str number))))
                 coll)))
