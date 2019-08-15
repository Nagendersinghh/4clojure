(fn pascal [n]
  (if (= n 1)
    [1]
    (cons
      1
      (concat
        (map #(apply + %) (partition 2 1 (pascal (- n 1))))
        [1]))))
