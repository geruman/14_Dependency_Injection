package com.geruman.injection;

public class SpaceShipWithoutInjection implements SpaceShipInterface {
	private Engine engine;
	private Pilot pilot;
	public SpaceShipWithoutInjection() {
		pilot = new Pilot("Ramon");
		engine = new FTLEngine();
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
