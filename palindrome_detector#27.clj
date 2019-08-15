(defn pal [[firrst & resst]]
  (cond (empty? resst) true
        (not= firrst (last resst)) false
        :else (pal (butlast resst))))

