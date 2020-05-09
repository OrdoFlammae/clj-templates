(ns Player
  (:require [clojure.pprint :as pp]))

(defn output
  [msg]
  (println msg)
  (flush))

(defn debug
  [msg]
  (binding [*out* *err*]
    (pp/pprint msg)
    (flush)))

(defn -main
  [& _])
