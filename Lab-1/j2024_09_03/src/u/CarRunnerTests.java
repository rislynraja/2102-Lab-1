package u;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import c.CarRunner;

public class CarRunnerTests {
    CarRunner carrunner;

    @Before
	public void setUp() throws Exception {
		carrunner  = new CarRunner();
    }

    @Test
	public void mpgTest() { // tests calcGasMPG

        double miles = 11;
        double gallons = 1.2;
        double expectedMPG = miles / gallons;

		carrunner.setMilesfromGas(miles);
        carrunner.setGallonsfromGas(gallons);

        double actualMPG = carrunner.calcGasMPG();

		assertTrue(actualMPG == expectedMPG);

	}
}