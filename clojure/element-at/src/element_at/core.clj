(ns element-at.core)

(defn element-at
 "Find the K'th element of an ISeq"
 [lst n]
 (nth lst (- n 1))
)
