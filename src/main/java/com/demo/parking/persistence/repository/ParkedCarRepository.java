package com.demo.parking.persistence.repository;

import com.demo.parking.persistence.entity.ParkedCarEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParkedCarRepository extends MongoRepository<ParkedCarEntity, Integer> {
}
