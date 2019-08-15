(def iseq (fn [coll]
            (map-indexed #(vector %2 %1)
                         coll)))
