(defproject aku "0.1.0-SNAPSHOT"
  :description "Online Test System"
  :url "http://tripent.net/"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [lib-noir "0.8.0"]
                 [ring/ring-core "1.2.1"]
                 [http-kit "2.1.17"]
                 [compojure "1.1.6"]
                 [selmer "0.5.9"]
                 [environ "0.4.0"]]

  :repl-options {:init-ns aku.repl}
  :plugins [[lein-environ "0.4.0"]]
  :main aku.core
  :min-lein-version "2.0.0")
