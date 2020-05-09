(ns clj.new.codingame
  (:require [clj.new.templates :refer [renderer project-data ->files]]))

(defn codingame
  "Generate a template repository for a codingame solution."
  [name]
  (let [render (renderer "codingame")
        data   (project-data name)]
    (println "Generating fresh codingame project.")
    (->files data
             ["deps.edn" (render "deps.edn" data)]
             ["README.md" (render "README.md" data)]
             [".gitignore" (render "gitignore" data)]
             ["src/Player.clj" (render "Player.clj" data)]
             ["LICENSE" (render "LICENSE" data)]
             ["pom.xml" (render "pom.xml" data)])))
