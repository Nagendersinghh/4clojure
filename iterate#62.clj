(defn new-iterate [f x]
  (lazy-seq (cons x (new-iterate f (f x)))))
