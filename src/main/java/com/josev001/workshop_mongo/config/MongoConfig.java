package com.josev001.workshop_mongo.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfig {

    @Bean
    public MongoClient mongoClient() {
        // Aqui você força a URI que você quer
        return MongoClients.create("mongodb://localhost:27017/workshop_mongo");
    }

    @Bean
    public MongoTemplate mongoTemplate() {
        // Isso força o Spring a usar o banco workshop_mongo
        return new MongoTemplate(mongoClient(), "workshop_mongo");
    }
}