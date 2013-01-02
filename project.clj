(defproject diceapi "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.1.3"]
                 [speclj "2.5.0"]]
  :plugins [[lein-ring "0.7.5"]
            [speclj "2.5.0"]]
  :test-paths ["spec/"]
  :ring {:handler diceapi.handler/app}
  :profiles {:dev {:dependencies [[ring-mock "0.1.3"]]}})
