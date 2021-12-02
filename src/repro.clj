(ns repro
  (:require [clojure.java.io :as io]
            [clojure.tools.build.api :as b]))

(defn executable?
  [path]
  (let [file (io/file path)]
    (.canExecute file)))

(defn exec!
  [& _]
  (let [src-path "resources/bin/script"
        dest-path "temp/bin/script"
        src-executable? (executable? src-path)]
    (println (format "%s executable?: %s" src-path src-executable?))
    (println "Copying folder resources/ to temp/")
    (b/copy-dir {:src-dirs ["resources"]
                 :target-dir "temp"})
    (let [dest-executable? (executable? dest-path)]
      (println (format "%s executable?: %s" dest-path dest-executable?))
      (when (false? dest-executable?)
        (System/exit 1)))))



