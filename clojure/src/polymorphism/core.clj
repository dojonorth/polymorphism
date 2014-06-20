(ns polymorphism.core
  (:require [polymorphism.decode :refer :all]
            [polymorphism.licence :refer :all]))

(defmulti decode-audio :type)
(defmulti decode-video :type)

(defmethod decode-audio :simple [media]
  (simple-audio media))
(defmethod decode-video :simple [media]
  (simple-video media))

(defmethod decode-audio :advanced-video [media]
  (simple-audio media))
(defmethod decode-video :advanced-video [media]
  (adv-video media))

(defmethod decode-audio :advanced-audio [media]
  (adv-audio media))
(defmethod decode-video :advanced-audio [media]
  (simple-video media))

(defmethod decode-audio :advanced-both [media]
  (adv-audio media))
(defmethod decode-video :advanced-both [media]
  (adv-video media))

(defn create
  "Create a media object"
  [type audio video]
  {
    :type type,
    :audio audio,
    :video video
   })

