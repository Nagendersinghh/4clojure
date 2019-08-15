(def cmp (fn [sttr]
           (reduce #(apply str %)
                   ""
                   (filter
                     #(not= (first %) (last %))
                     (partition 2 1 sttr)))))
(def cmp (fn [col]
           (reduce #(if (= (last %1) %2) %1
                      (concat %1 [%2]))
                   (empty col)
                   col)))

