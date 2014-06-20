(ns polymorphism.core-test
  (:require [clojure.test :refer :all]
            [polymorphism.core :refer :all]
            [polymorphism.licence :refer :all]))

(deftest test-simple-media
  (let [media (create :simple "AUDIO" "video")]

    (testing "Should Decode Simple Audio By Lower Case"
      (is (= "audio" (decode-audio media))))

    (testing "Should Decode Simple Video By Upper Case"
      (is (= "VIDEO" (decode-video media))))))

(deftest test-advanced-audio
  (let [media (create :advanced-audio "AUDIO" "video")]

    (testing "Should Decode Simple Audio By Expand And Lower Case"
      (is (= "aauuddiioo" (decode-audio media))))

    (testing "Should Decode Simple Video By Upper Case"
      (is (= "VIDEO" (decode-video media))))))

(deftest test-advanced-video
  (let [media (create :advanced-video "AUDIO" "video")]

    (testing "Should Decode Simple Audio By Lower Case"
      (is (= "audio" (decode-audio media))))

    (testing "Should Decode Simple Video By Upper Case Every Other Letter"
      (is (= "ViDeO" (decode-video media))))))

(deftest test-advanced-both
  (let [media (create :advanced-both "AUDIO" "video")]

    (testing "Should Decode Simple Audio By Expand And Lower Case"
      (is (= "aauuddiioo" (decode-audio media))))

    (testing "Should Decode Simple Video By Upper Case Every Other Letter"
      (is (= "ViDeO" (decode-video media))))))