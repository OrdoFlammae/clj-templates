(ns clj.new.clj-lib
  "Generate a library project."
  (:require [clj.new.templates
             :refer [renderer project-data project-name ->files]]))

(defn clj-lib
  "A general project template for libraries.

Accepts a group id in the project name: `clj -A:new lib foo.bar/baz`"
  [name & args]
  (let [render (renderer "clj-lib")
        data   (merge {:description "FIXME: my new library."}
                      (project-data name))]
    (println "Generating a project called"
             (project-name name)
             "based on the 'clj-lib' template.")
    (println "The lib template is intended for library projects, not applications.")
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
