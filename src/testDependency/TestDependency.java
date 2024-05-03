package testDependency;

import org.testng.annotations.Test;

public class TestDependency {
	static String trackingNumber = null;

	@Test(priority = 1)
	public void CreateShipment() {
		System.out.println(5 / 0);
		System.out.println("createShipment");
		trackingNumber = "ABC12YH";
	}

	@Test(priority = 2, dependsOnMethods = "createShipment")
	public void TrackShipment() throws Exception {
		if (trackingNumber != null)
			System.out.println("TrackShipment");
		else {
			throw new Exception("Invalid tracking number");
		}
	}

	@Test(priority = 3, dependsOnMethods = "createShipment")
	public void CancelShipment() {
		if (trackingNumber != null)
			System.out.println("CancleShipment");
		else {
			System.out.println("Invalid tracking number");
		}
	}
}
