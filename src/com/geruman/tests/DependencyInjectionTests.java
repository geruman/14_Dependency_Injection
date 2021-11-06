package com.geruman.tests;

import org.junit.jupiter.api.Test;

import com.geruman.injection.FTLEngine;
import com.geruman.injection.Pilot;
import com.geruman.injection.RocketFuelEngine;
import com.geruman.injection.SpaceShipWithoutInjection;
import com.geruman.injection.SpaceShipInterface;
import com.geruman.injection.SpaceShipWithInjection;

class DependencyInjectionTests {

	@Test
	void testSpaceShipNoInjection() {
		SpaceShipInterface spaceShip = new SpaceShipWithoutInjection();
		assert spaceShip.getPilot().getName()=="Ramon";
		assert spaceShip.getEngine() instanceof FTLEngine;
	}
	@Test 
	void testSpaceShipWithInjection() {
		SpaceShipInterface spaceShip = new SpaceShipWithInjection(new RocketFuelEngine(),new Pilot("Eduardo"));
		assert spaceShip.getPilot().getName()=="Eduardo";
		assert spaceShip.getEngine() instanceof RocketFuelEngine;
	}

}
