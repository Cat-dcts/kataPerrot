package fr.unilim.iut.kataparrot;

public class NorwegianBlueParrot extends Parrot{
	
	private static final double MAX_SPEED = 24.0;
	protected double voltage;
	protected boolean isNailed;
	
	public NorwegianBlueParrot(double voltage, boolean isNailed) {
		super();
		this.voltage = voltage;
	}
	
	@Override
	public double getSpeed() {
		return (isNailed) ? 0 : getBaseSpeed(voltage);
	}

	private double getBaseSpeed(double voltage) {
		return Math.min(MAX_SPEED, voltage * BASE_SPEED);
	}
}
