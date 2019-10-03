package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    @Bean
    public Actor actorSoumen() {
        Actor actor = new Actor("Soumen Kaity","Male",22);
        return actor;
    }

    @Bean
    public Actor actorSourodeep() {
        Actor actor = new Actor("Sourodeep Kaity","Male",15);
        return actor;
    }

    @Bean
    public Actor actorSambit() {
        Actor actor = new Actor("Sambit Sharma","Male",30);
        return actor;
    }

    @Bean
    public Movie movie(){
        Movie movie = new Movie(actorSambit());
        return movie;
    }

    @Bean({"moviea","movieb"})
    @Scope("singleton")
    public Movie movieSingleton() {
        Movie movie = new Movie(actorSoumen());
        return movie;
    }

    @Bean({"movieA","movieB"})
    @Scope("prototype")
    public Movie moviePrototype() {
        Movie movie = new Movie(actorSourodeep());
        return movie;
    }
}
