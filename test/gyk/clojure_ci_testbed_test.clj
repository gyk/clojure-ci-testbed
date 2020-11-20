(ns gyk.clojure-ci-testbed-test
  (:require [clojure.test :refer :all]
            [gyk.clojure-ci-testbed :refer :all]))

(deftest two-plus-two
  (testing "2 + 2"
    (is (add 2 2) 4)))
