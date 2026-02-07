package com.josev001.workshop_mongo;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WorkshopMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkshopMongoApplication.class, args);
	}

	@Bean
	public MongoClientSettings mongoClientSettings() {
		return MongoClientSettings.builder()
				.applyConnectionString(new ConnectionString("mongodb://localhost:27017/workshop_mongo"))
				.build();
	}

}
