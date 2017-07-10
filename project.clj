(defproject hello-http "0.1.0-SNAPSHOT"
  :description "very basic ring application"
  ; :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-ring "0.8.10"]]
  :ring {:handler hello-http.core2/handler} 
  ;is an instruction to the lein-ring plugin. 
  ;We tell the plugin what handler should be monitored.

  :dependencies [[org.clojure/clojure "1.8.0"]
  				 [ring/ring-core "1.4.0"]
                 [ring/ring-jetty-adapter "1.4.0"]]
  :main hello-http.core)
