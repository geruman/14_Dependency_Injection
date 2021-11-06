package com.geruman.injection;

public class SpaceShipWithInjection implements SpaceShipInterface {
	private Engine engine;
	private Pilot pilot;
	public SpaceShipWithInjection(Engine engine,Pilot pilot) {
		this.pilot = pilot;
		this.engine = engine;
	}
	@Override
	public Engine getEngine() {
		return engine;
	}

	@Override
	public Pilot getPilot() {
		return pilot;
	}
	
	

}
