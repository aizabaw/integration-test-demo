package com.demo.parking.common.utils;

public abstract class ReferenceNumberGenerator {

    public enum ReferenceType {
        PARKING, BAGGAGE;
    }

    public static String generateReferenceNumber(ReferenceType refType) {

        String refPrefix;
        if (refType == ReferenceType.PARKING) {
            refPrefix = "PAR";
        } else if (refType == ReferenceType.BAGGAGE) {
            refPrefix = "BAG";
        } else {
            refPrefix = "SRV";
        }

        return refPrefix + System.currentTimeMillis();
    }
}
