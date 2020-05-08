(ns clj.new.clj-template
  (:require [clj.new.templates
             :refer [renderer project-data project-name ->files]]))

(defn clj-template
  "A meta-template for 'clj new' templates."
  [name & args]
  (let [render (renderer "clj-template")
        data   (merge {:description "FIXME: my new template."}
                      (project-data name))]
    (println "Generating a project called"
             (project-name name)
             "that is a clj-new template")
    (->files data
             ["deps.edn" (render "deps.edn" data)]
             ["README.md" (render "README.md" data)]
             [".gitignore" (render "gitignore" data)]
             ["src/clj/new/{{sanitized}}.clj" (render "temp.clj" data)]
             ["resources/clj/new/{{sanitized}}/foo.clj" (render "foo.clj")]
             ["resources/clj/new/{{sanitized}}/deps.edn" (render "deps.edn" data)]
             ["LICENSE" (render "LICENSE" data)]
             ["CHANGELOG.md" (render "CHANGELOG.md" data)]
             ["pom.xml" (render "pom.xml" data)])))
