(ns diceapi.dice)

(defn die
  "Returns a function of a die that rolls to its given maxiumum"
  [n]
  (fn []
    (if (< n 1)
      0
      (+ (rand-int (- n 1)) 1))))
