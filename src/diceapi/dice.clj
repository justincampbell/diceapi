(ns diceapi.dice)

(use '[clojure.string :only (blank? split)])

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
  (map #(%) (dice sides (first n))))

(defn roll-string
  "Rolls a given string of dice (d6, 2d6)"
  [string]
  (let [options (split string #"d")
        sides (Integer. (last options))
        n (if-not (blank? (first options)) (Integer. (first options)))]
    (roll sides n)))
