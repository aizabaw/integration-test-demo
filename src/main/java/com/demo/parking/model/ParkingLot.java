package com.demo.parking.model;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class ParkingLot {

    private Integer parkingLotId;
    private List<ParkedCar> parkedCars = new ArrayList();

}
