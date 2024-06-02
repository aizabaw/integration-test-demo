package com.demo.parking.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ParkedCar {

    private Car car;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;

}
