(ns comet-fan.core-test
  (:require [clojure.test :refer :all]
            [comet-fan.core :refer :all]))

(deftest name-to-number
  (testing "single letter value should return its value"
    (is (= (to-number "A") 1)))
  (testing "a different single letter value should return a different value"
    (is (= (to-number "Z") 26)))
  )
