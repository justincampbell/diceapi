(ns diceapi.dice)

(defn die
  "Returns a function of a die that rolls to its given maxiumum"
  [sides]
  (fn []
    (if (< sides 1)
      0
      (+ (rand-int sides) 1))))

(defn dice
  "Returns a sequence of dice"
  [sides & n]
  (repeat (or (first n) 1) (die sides)))

(defn roll
  "Rolls [sides] dice [n] times"
  [sides & n]
  (map #(%) (dice sides (or (first n) 1))))
