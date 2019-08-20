(fn itr [row]
  (let [tr (fn tr [row]
            (cons (first row)
                  (concat (map #(apply +' %)
                               (partition 2 1 row))
                          (drop (- (count row) 1)
                                row))))]
    (iterate tr row)))
