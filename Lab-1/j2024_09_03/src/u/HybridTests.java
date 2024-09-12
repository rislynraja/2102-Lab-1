package u;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import c.Hybrid;

public class HybridTests {

	Hybrid hybrid;

	@Before
	public void setUp() throws Exception {
		hybrid  = new Hybrid();
    }

	@Test
	public void mpgTest() { // tests calcGasMPG

        double miles = 11;
        double gallons = 1.2;
        double expectedMPG = miles / gallons;

		hybrid.setMilesfromGas(miles);
        hybrid.setGallonsfromGas(gallons);

        double actualMPG = hybrid.calcGasMPG();

		assertTrue(actualMPG == expectedMPG);

	}

	@Test
	public void mpgETest() { // tests calcMPGe

		double miles = 100;
		double kWh = 33.7;

		double mpg_e = 33.7;

		double expected_mpge = (miles/kWh) * mpg_e;

		hybrid.setElectricMiles(miles);
		hybrid.setTotalkWh(kWh);

		double actual_mpge = hybrid.calcMPGe();

		assertTrue(actual_mpge == expected_mpge);

	}

}