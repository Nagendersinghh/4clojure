(fn [func coll]
  (reduce (fn [acc, value]
            (if (nil? (acc (func value)))
              (assoc acc (func value) [value])
              (update-in acc [(func value)] concat [value])))
          {}
          coll))
