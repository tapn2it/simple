(ns example.routes
  (:use compojure.core
        example.views
        [hiccup.middleware :only (wrap-base-url)])
  (:require [compojure.route :as route]
            [compojure.handler :as handler]
            [compojure.response :as response]
            [ring.adapter.jetty :as ring]))

(defroutes main-routes
  (GET "/" [] (index-page))
  (route/resources "/")
  (route/not-found "Page not found"))

(defn start []
  (ring/run-jetty #'main-routes {:port 8080 :join? false}))
