(ns gyk.clojure-ci-testbed
  (:gen-class))

(defn add
  "Adds two numbers."
  [a b]
  (+ a b))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (println (add 2 2)))
