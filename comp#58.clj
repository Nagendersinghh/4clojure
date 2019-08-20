(fn my-comp [& fn-list]
  (cond (empty? fn-list) my-comp
        (empty? (rest fn-list)) (fn [& args]
                                 (apply (first fn-list)
                                        args))
        :else (fn [& args]
                ((first fn-list)
                 (apply (apply my-comp (rest fn-list)) args)))))
