(ns polymorphism.licence-test
  (:require [clojure.test :refer :all]
            [polymorphism.core :refer :all]
            [polymorphism.licence :refer :all]))

(deftest simple-licence
  (let [media (create :simple "AUDIO" "vide")]

    (testing "Should not need a licence for a short simple video"
      (is (= false (needs-licence? media)))))

  (let [media (create :simple "AUDIO" "video")]

    (testing "Should need a licence for a short simple video"
      (is (= true (needs-licence? media))))))

(deftest adv-audio-licence
  (let [media (create :advanced-audio "AUDIO" "video")]
    (testing "Should need a licence for advanced audio simple video"
      (is (= true (needs-licence? media))))))

(deftest adv-video-licence
  (let [media (create :advanced-video "AUDIO" "video")]
    (testing "Should need a licence for advanced video simple video"
      (is (= true (needs-licence? media))))))

(deftest adv-both-licence
  (let [media (create :advanced-both "AUDIO" "video")]
    (testing "Should need a licence for advanced both simple video"
      (is (= true (needs-licence? media))))))




