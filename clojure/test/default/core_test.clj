(ns default.core-test
  (:require [clojure.test :refer :all]
            [default.core :refer :all]))

(deftest test-simple-media
  (let [media (create "simple" "AUDIO" "video")]

    (testing "Should Decode Simple Audio By Lower Case"
      (is (= "audio" (decode-audio media))))

    (testing "Should Decode Simple Video By Upper Case"
      (is (= "VIDEO" (decode-video media))))))

