(defproject diceapi "0.1.0-SNAPSHOT"
  :description "Dice API"
  :url "http://github.com/justincampbell/diceapi"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.1.3"]]
  :plugins [[lein-ring "0.7.5"]
            [speclj "2.5.0"]]
  :test-paths ["spec/"]
  :ring {:handler diceapi.handler/app}
  :profiles { :dev {:dependencies [[ring-mock "0.1.3"]
                                   [speclj "2.5.0"]
                                   [speclj-tmux "1.0.0"]]}})
