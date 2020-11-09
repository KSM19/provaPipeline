package com.illimity.test;

import com.illimity.rts.commonconfiglib.init.ApplicationInitHook;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * illimity Microservice!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = {
        "com.illimity.test",
        "com.illimity.rts.jwt.auth",
        "com.illimity.rts.commonconfiglib"
})
public class Application {
    public static void main(String[] args) {
        //System.setProperty("log4j2.isThreadContextMapInheritable", "true");
        SpringApplication application = new SpringApplication(Application.class);
        ApplicationInitHook.addInitHooks(application);
        application.run(args);
    }
}