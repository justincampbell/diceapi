(ns diceapi.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app
   (GET "/" [] "<h1>Hello World</h1>")
   (route/not-found "<h1>Page not found</h1>"))
