package com.demo.parking.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.demo.parking.persistence.repository")
public class ParkingDBConfig {

    @Bean
    public MongoClient mongoClient() {
        ConnectionString connStr = new ConnectionString("mongodb://localhost:27017/parking");
        MongoClientSettings clientSettings = MongoClientSettings.builder()
                .applyConnectionString(connStr)
                .build();

        return MongoClients.create(clientSettings);
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongoClient(), "parking");
    }

}
