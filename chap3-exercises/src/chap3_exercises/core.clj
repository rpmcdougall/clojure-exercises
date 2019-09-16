(ns chap3-exercises.core)

;; Exercise 1
(str "Hello" " world!")
(vector 1 2 3)
(list "a" "b" "c")
(hash-map :key "value")
(hash-set :val1 :val2 :val2 :val3)

;; Exercise 2
(defn add-hundo
  [input]
  (+ input 100))

(add-hundo 50)

;; Exercise 3
(defn dec-maker
  [dec-by]
  #(- % dec-by))

(def dec9 (dec-maker 9))
(dec9 10)

;; Exercise 4
(defn mapset
  [op input]
  (def x (map op input))
  (set x))

(mapset inc [1 1 2 2])

;; Exercise 5

;; Exercise 6