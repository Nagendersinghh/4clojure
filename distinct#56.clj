(fn [coll]
  (let [dis (fn dis [seen coll]
              (cond (empty? coll) coll
                    (true? (seen (first coll))) (dis seen (rest coll))
                    :else (cons (first coll)
                                (dis
                                 (merge seen {(first coll) true})
                                 (rest coll)))))]
    (dis {} coll)))
