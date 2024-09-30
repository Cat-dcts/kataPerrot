package fr.unilim.iut.kataparrot;

public class Parrot {

	private static final double BASE_SPEED = 12.0;

	private ParrotTypeEnum type;
	
	protected double voltage;
	protected boolean isNailed;

	public Parrot(ParrotTypeEnum _type, double voltage, boolean isNailed) {
		this.type = _type;
		this.voltage = voltage;
		this.isNailed = isNailed;
	}

	public double getSpeed() {
		switch (type) {
		case EUROPEAN:
			throw new RuntimeException("Should be unreachable");
		case AFRICAN:
			throw new RuntimeException("Should be unreachable");
		case NORWEGIAN_BLUE:
			throw new RuntimeException("Should be unreachable");
		}
		throw new RuntimeException("Should be unreachable");
	}

	protected double getBaseSpeed() {
		return BASE_SPEED;
	}

}
