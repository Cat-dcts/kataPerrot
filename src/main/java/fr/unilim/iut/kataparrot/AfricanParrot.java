package fr.unilim.iut.kataparrot;

public class AfricanParrot extends Parrot{
	private static final double LOAD_FACTOR = 9.0;
	private int numberOfCoconuts = 0;
	
	public AfricanParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
		super(ParrotTypeEnum.AFRICAN, voltage, isNailed);
		this.numberOfCoconuts = numberOfCoconuts;
	}

	@Override
	public double getSpeed() {
		return Math.max(0, getBaseSpeed() - LOAD_FACTOR * numberOfCoconuts);
	}
}
