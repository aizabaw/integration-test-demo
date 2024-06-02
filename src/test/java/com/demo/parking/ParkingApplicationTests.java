package com.demo.parking;

import com.demo.parking.config.ParkingDBConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = ParkingDBConfig.class)
class ParkingApplicationTests {

	@Test
	void contextLoads() {
	}

}
