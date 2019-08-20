(fn lcm [a b & more]
  (let [gcd (fn gcd [a b]
    (if (= b 0)
      a
      (gcd b (mod a b))))]
    (let [_lcm (/ (* a b) (gcd (max a b) (min a b)))]
      (if (empty? more)
        _lcm
        (apply lcm (cons _lcm more))))))

