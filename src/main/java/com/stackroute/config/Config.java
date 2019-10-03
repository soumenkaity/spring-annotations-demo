package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Actor actor() {
        Actor actor = new Actor();
        actor.setAge(22);
        actor.setGender("Male");
        actor.setName("Soumen Kaity");
        return actor;
    }

    @Bean
    public Movie movie() {
        Movie movie =new Movie(actor());
        return movie;
    }
}
