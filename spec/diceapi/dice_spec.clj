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

  (it "which rolls to the given maxiumum"
    (should= 5 (reduce max (map #(%) (repeat 1000 (die 6))))))

)

(run-specs)
