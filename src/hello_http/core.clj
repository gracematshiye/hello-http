(ns hello-http.core
	(:require [ring.adapter.jetty :as jetty]))

(defn handler [request]
	{:status 200
	:headers {"Content-Type" "text/plain"}
	:body "Hello World, HTTP"})

(defn -main []
  (jetty/run-jetty handler {:port 3000}))
