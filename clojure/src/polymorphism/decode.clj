(ns polymorphism.decode
  (:require [clojure.string :as str]))

(defn simple-audio [media]
  (str/lower-case (:audio media)))

(defn simple-video [media]
  (str/upper-case (:video media)))

(defn adv-audio [media]
  (str/lower-case (str/replace (:audio media) #"(.)" "$1$1")))

(defn adv-video [media]
  (loop [result ""
         fns  (cycle [str/upper-case str/lower-case])
         chars (seq (str/upper-case (:video media)))]
    (if (empty? chars)
      result
      (recur
        (str result ((first fns) (first chars)))
        (rest fns)
        (rest chars)))))