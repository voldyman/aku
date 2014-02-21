(ns aku.routes.home
  (:use compojure.core)
  (:require [aku.views.layout :as layout]
            [aku.util :as util]))

(defn home-page []
  (layout/render
    "home.html" {:content "Test"}))

(defn about-page []
  (layout/render "about.html"))

(defroutes home-routes
  (GET "/" [] (home-page))
  (GET "/about" [] (about-page)))
