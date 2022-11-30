package javalinvue;

import io.javalin.Javalin;
import io.javalin.vue.VueComponent;

public class Main {

    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.vue.vueAppName = "app";
            config.staticFiles.enableWebjars();
        }).start(7000);

        app.get("/", new VueComponent("hello-world"));
    }
}
