(fn n-th [lst idx]
  (loop [distance idx sq lst]
    (if (zero? distance) (first sq)
      (recur (dec distance) (rest sq)))))
