package com.stan.appone;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicatioRunner implements CommandLineRunner {

    @Value("${my.app.name}")
    public String nameApp;

    @Value("${my.app.version}")
    public String versionApp;

    @Override
    public void run(String... args) {
        System.out.println("\n*********  START APPLICATION  *********");
        System.out.println("App. name (ver.): "+nameApp +" ("+versionApp+")");
    }
}
