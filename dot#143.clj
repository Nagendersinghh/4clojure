(fn [a b]
  (apply + (map #(* (first %) (last %))
     (partition 2 (interleave a b)))))
