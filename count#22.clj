(fn cnt [lst]
  ((fn _cnt [lst length]
    (if (empty? lst) length
      (_cnt (rest lst) (inc length)))) lst 0))
