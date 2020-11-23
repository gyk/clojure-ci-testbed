(ns gyk.clojure-ci-testbed
  (:require [gyk.helpers :refer [add]]))

(defn init []
  (js/console.log "init"))

(defn start []
  (js/console.log "start"))

(defn stop []
  (js/console.log "stop"))

(defn -main
  [& args]
  (println (add 2 2)))
