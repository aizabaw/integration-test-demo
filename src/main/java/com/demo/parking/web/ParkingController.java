package com.demo.parking.web;

import com.demo.parking.model.Car;
import com.demo.parking.model.ParkingLot;
import com.demo.parking.service.ParkingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ParkingController {

    private final ParkingService parkingService;

    @PostMapping("/park")
    public String parkCar(Car car, ParkingLot parkingLot) {
        return parkingService.parkCar(car, parkingLot);
    }

}
