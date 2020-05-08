(ns clj.new.clj-app
  "Generate a basic application project."
  (:require [clj.new.templates
             :refer [renderer project-data project-name ->files]]))

(defn clj-app
  "An application project template."
  [name & args]
  (let [render (renderer "clj-app")
        data   (merge {:description "FIXME: my new application."}
                      (project-data name))]
    (println "Generating a project called"
             (project-name name)
             "based on the 'clj-app' template.")
    (->files data
             ["deps.edn" (render "deps.edn" data)]
             ["README.md" (render "README.md" data)]
             ["doc/intro.md" (render "intro.md" data)]
             [".gitignore" (render "gitignore" data)]
             ["src/{{nested-dirs}}.clj" (render "core.clj" data)]
             ["test/{{nested-dirs}}_test.clj" (render "test.clj" data)]
             ["LICENSE" (render "LICENSE" data)]
             ["CHANGELOG.md" (render "CHANGELOG.md" data)]
             ["pom.xml" (render "pom.xml" data)]
             ["resources/.keep" ""])))
