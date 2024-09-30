package fr.unilim.iut.kataparrot;

public class NorwegianParrot extends Parrot{
	
	private static final double MAX_SPEED = 24.0;
	private double voltage;
	
	public NorwegianParrot(double voltage) {
		super();
		this.voltage = voltage;
	}
	
	@Override
	public double getSpeed() {
		return Math.min(MAX_SPEED, voltage * BASE_SPEED);
	}
}
