(fn my-map [func coll]
  (if (not (empty? coll))
    (lazy-seq (cons (func (first coll))
                    (my-map func (rest coll))))))

