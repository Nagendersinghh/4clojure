(def capfltr (fn capflr [strr]
               (reduce (fn [result, chr]
                         (if (Character/isUpperCase chr)
                           (str result chr)
                           result))
                       ""
                       strr)))
