(defproject simple_example "0.1.0-SNAPSHOT"
  :description "A simple example of how to use lein-cljsbuild"
  :url "http://example.com/FIXME"
  :source-paths ["src-clj"]
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.1.3"]
                 [ring/ring-jetty-adapter "1.1.6"]
                 [hiccup "1.0.2"]]
  :plugins [[lein-cljsbuild "0.2.9"]
            [lein-ring "0.7.5"]]
  :cljsbuild {
               :builds [{:source-path "src-cljs"
                         :compiler {:output-to "resources/public/js/main.js"
                                    :optimizations :whitespace
                                    :pretty-print true}}]}
  :ring {:handler example.routes/app}
  :main example.routes
  :profiles {:dev {:dependencies [[ring-mock "0.1.3"]]}})



;(defproject cljsbuild-example-simple "0.2.9"
;  :description "A simple example of how to use lein-cljsbuild"
;  ; Source path for Leiningen 1.x:
;  :source-path "src-clj"
;  ; Source paths for Leiningen 2.x:
;  :source-paths ["src-clj"]
;  :dependencies [[org.clojure/clojure "1.4.0"]
;                 [compojure "1.0.4"]
;                 [hiccup "1.0.2"]]
;  ;:profiles {:dev {:dependencies [[ring/ring-devel "1.0.2"]]}}
;
;  ;:dev-dependencies [[lein-ring "0.7.0"]]
;  :plugins [[lein-cljsbuild "0.2.9"]
;            [lein-ring "0.7.5"]]
;  ;:plugins [[lein-cljsbuild "0.2.9"]]
;  :cljsbuild {
;               :builds [{:source-path "src-cljs"
;                         :compiler {:output-to "resources/public/js/main.js"
;                                    :optimizations :whitespace
;                                    :pretty-print true}}]}
;  :main example.routes
;  :ring {:handler example.routes/app})