(ns polymorphism.licence)

(defmulti needs-licence? :type)

(defmethod needs-licence? :simple [media]
  (if (> (count (:video media)) 4)
    true
    false))

(defmethod needs-licence? :default [media]
  true)