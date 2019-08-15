(fn last-element [sq]
  (cond (empty? (rest sq)) (first sq)
        :else (last-element (rest sq))))
