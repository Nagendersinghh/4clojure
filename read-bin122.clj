(fn [bin-string]
  (int (reduce (fn [acc [place value]]
            (+ acc (* value (Math/pow 2 place))))
          0
          (map-indexed
           (fn [idx itm] [idx (Character/getNumericValue itm)])
           (reverse bin-string)))))
