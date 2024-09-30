package fr.unilim.iut.kataparrot;

public class NorwegianBlueParrot extends Parrot{
	
	private static final double MAX_SPEED = 24.0;

	public NorwegianBlueParrot(double voltage, boolean isNailed) {
		super(ParrotTypeEnum.NORWEGIAN_BLUE, isNailed);
		this.voltage = voltage;
	}
	
	@Override
	public double getSpeed() {
		return (isNailed) ? 0 : getBaseSpeed(voltage);
	}

	private double getBaseSpeed(double voltage) {
		return Math.min(MAX_SPEED, voltage * getBaseSpeed());
	}
}
