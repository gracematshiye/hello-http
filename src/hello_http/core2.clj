(ns hello-http.core2)

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello Ring! Am I reloadable?"})