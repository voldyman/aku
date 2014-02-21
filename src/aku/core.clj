(ns aku.core
  (:require [aku.handler :refer [app]]
            [org.httpkit.server :refer [run-server]]
            [environ.core :refer [env]]
            [ring.middleware.reload :as reload])
  (:gen-class))

(defn in-dev?
  []
  (if-not (env :production)
    (do
      (println "In Dev mode")
      true)
    (do
      (println "In Production mode")
      false)))

(defn get-port
  "Get the port from the env
  or returns the default "
  [& {:keys [or]
      :or {or 3000}}]
  (if (env :port)
    (read-string (env :port))
    or)) ; return the optional port

(defn -main
  [& args]
  (if (in-dev?) (reload/wrap-reload app))
  (let [port (get-port :or 3000)]
    (println (str "Server starting at http://localhost:" port))
    (run-server app {:port port
                     :thread 5})))
