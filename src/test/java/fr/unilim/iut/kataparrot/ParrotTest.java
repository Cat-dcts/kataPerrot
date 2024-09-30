package fr.unilim.iut.kataparrot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ParrotTest {

	@Test
	void getSpeedOfEuropeanParrot() {
		Parrot parrot = new EuropeanParrot();
		assertEquals(12.0, parrot.getSpeed(), 0.0);
	}

	@Test
	void getSpeedOfAfricanParrot_With_One_Coconut() {
		Parrot parrot = new AfricanParrot(1);
		assertEquals(3.0, parrot.getSpeed(), 0.0);
	}

	@Test
	void getSpeedOfAfricanParrot_With_Two_Coconuts() {
		Parrot parrot = new AfricanParrot(2);
		assertEquals(0.0, parrot.getSpeed(), 0.0);
	}

	@Test
	void getSpeedOfAfricanParrot_With_No_Coconuts() {
		Parrot parrot = new AfricanParrot(0);
		assertEquals(12.0, parrot.getSpeed(), 0.0);
	}

	@Test
	void getSpeedBlueParrot() {
		Parrot parrot = new BlueParrot();
		assertEquals(0.0, parrot.getSpeed(), 0.0);
	}

	@Test
	void getSpeedNorwegianBlueParrot_not_nailed() {
		Parrot parrot = new NorwegianParrot(1.5);
		assertEquals(18.0, parrot.getSpeed(), 0.0);
	}

	@Test
	void getSpeedNorwegianBlueParrot_not_nailed_high_voltage() {
		Parrot parrot = new NorwegianParrot(4);
		assertEquals(24.0, parrot.getSpeed(), 0.0);
	}
}
