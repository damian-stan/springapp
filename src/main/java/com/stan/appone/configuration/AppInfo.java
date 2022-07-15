package com.stan.appone.configuration;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

import java.util.List;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "my.app.info")
public class AppInfo {

    private String author;

    private int created;

    private String describe;

    private String[] authors;

    // Spring Expression Language (SpEL) "#{1,2,3,4}" - list of Strings
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @Value("#{'${my.app.info.authors}'.split(',')}")
    private List<String> authorsList;

    @EventListener(ApplicationReadyEvent.class)
    public void listener(){
        System.out.println("Listener AppInfo: Author: "+ author+ ", Created: "+created);
        System.out.println("Listener: "+authors.length+" , "+authorsList.size());
    }

}
