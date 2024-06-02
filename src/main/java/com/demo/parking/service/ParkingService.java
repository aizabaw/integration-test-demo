package com.demo.parking.service;

import com.demo.parking.common.utils.ReferenceNumberGenerator;
import com.demo.parking.model.Car;
import com.demo.parking.model.ParkingLot;
import com.demo.parking.persistence.entity.ParkedCarEntity;
import com.demo.parking.persistence.repository.ParkedCarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.time.LocalDateTime;

@RequiredArgsConstructor
public class ParkingService {

    private final MongoTemplate mongoTemplate;
    private final PaymentService paymentService;
    private final AuditService auditService;

    public String parkCar(Car car, ParkingLot parkingLot) {
        mongoTemplate.insert(ParkedCarEntity.builder()
                .parkingLotId(parkingLot.getParkingLotId())
                .plateNumber(car.getPlateNumber())
                .checkIn(LocalDateTime.now())
                .build());
        paymentService.pay();
        auditService.log();

        return ReferenceNumberGenerator
                .generateReferenceNumber(ReferenceNumberGenerator.ReferenceType.PARKING);
    }

}
