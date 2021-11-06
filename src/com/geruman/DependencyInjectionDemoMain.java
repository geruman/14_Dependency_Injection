package com.geruman;

import com.geruman.injection.Pilot;
import com.geruman.injection.RocketFuelEngine;
import com.geruman.injection.SpaceShipInterface;
import com.geruman.injection.SpaceShipWithInjection;
import com.geruman.injection.SpaceShipWithoutInjection;

public class DependencyInjectionDemoMain {

	public static void main(String[] args) {
		System.out.println("With Dependency injection we have control over its dependencies");
		SpaceShipInterface spaceShip = new SpaceShipWithInjection(new RocketFuelEngine(),new Pilot("Jaime"));
		System.out.println(spaceShip.getPilot().getName());
		System.out.println(spaceShip.getEngine());
		System.out.println("Without dependency injection the Spaceship has its dependency tightly coupled and modification for diferent engines or pilot becomes cumbersone");
		spaceShip = new SpaceShipWithoutInjection();
		System.out.println(spaceShip.getPilot().getName()+". where does this pilot come from?");
		System.out.println(spaceShip.getEngine()+". What if I need a different engine?");
		
	}
}
