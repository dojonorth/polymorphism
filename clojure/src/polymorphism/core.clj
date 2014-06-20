(ns polymorphism.core
  (:require [polymorphism.decode :refer :all]
            [polymorphism.licence :refer :all]))

(defmulti decode-audio :audio-type)

(defmethod decode-audio :simple [media]
  (simple-audio media))
(defmethod decode-audio :advanced [media]
  (adv-audio media))

(defmulti decode-video :video-type)

(defmethod decode-video :simple [media]
  (simple-video media))
(defmethod decode-video :advanced [media]
  (adv-video media))

(def audio-map
  {:simple :simple
   :advanced-video :simple
   :advanced-audio :advanced
   :advanced-both :advanced})

(def video-map
  {:simple :simple
   :advanced-audio :simple
   :advanced-video :advanced
   :advanced-both :advanced})

(defn create
  "Create a media object"
  [type audio video]
  {
    :type type
    :audio-type (type audio-map)
    :video-type (type video-map)
    :audio audio
    :video video
    })
