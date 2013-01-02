(ns diceapi.dice-spec 
  (:require [speclj.core :refer :all]
            [diceapi.dice :refer :all]))

(describe "die"

  (it "returns a function"
    (should (fn? (die 6))))

  (it "which returns 0 when given a negative"
    (should= 0 ((die -1))))

  (it "which returns 0 when given 0"
    (should= 0 ((die 0))))

  (it "which returns 1 when given 1"
    (should= 1 ((die 1))))

  (it "which rolls between 1 and the given maxiumum"
    (let [rolls (map #(%) (repeat 1000 (die 6)))]
      (should= 1 (reduce min rolls))
      (should= 6 (reduce max rolls))))

)

(run-specs)
