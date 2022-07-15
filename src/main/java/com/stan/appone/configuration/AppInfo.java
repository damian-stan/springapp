package com.stan.appone.configuration;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
@ConfigurationProperties(prefix = "my.app.info")
public class AppInfo {

    private String author;
    private int created;
    private String describe;

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void listener(){
        System.out.println("Listener AppInfo: Author: "+ author+ ", Created: "+created);
    }

}
