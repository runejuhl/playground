#!/usr/bin/env bb
(ns jaml
  (:require [cheshire.core :as json]
            [clj-yaml.core :as yaml]
            [clojure.java.io]))

(print (yaml/generate-string
          (json/parse-stream (clojure.java.io/reader
                              (first *command-line-args*)))
          :dumper-options {:flow-style :block}))
