(ns diceapi.handler
  (:use compojure.core
        [diceapi.dice :only (roll-string)]
        [clojure.string :only (join)])
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app

   (GET "/" []
     (str "<h1>diceapi</h1><br />"
          "<a href=\"d6\">/d6</a><br />"
          "<a href=\"d20\">/d20</a><br />"
          "<a href=\"2d6\">/2d6</a>"))

   (GET ["/:roll" :roll #"\d*d\d+"] [roll]
     (str "[" (join ", " (roll-string roll)) "]"))

   (route/not-found "<h1>Page not found</h1>")

)
