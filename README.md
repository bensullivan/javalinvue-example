To reproduce error:

* From project root: `./gradlew clean check distTar`
* `cp build/distributions/javalinvue-example.tar /tmp`
* cd /tmp
* tar xvf javalinvue-example.tar
* cd javalinvue-example/bin
* ./javalinvue-example
* /opt/ngrok http 7000

Hit ngrok endpoint and the hello world component will fail to be served.
