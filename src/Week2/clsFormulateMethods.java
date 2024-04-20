package Week2;

public class clsFormulateMethods {

	public static void main(String[] args) 
	{
		startUp();

		cruiseNorth();
		cruiseNortheast();
		accelerate();

		safetyCheck();

		cruiseNortheast();

		safetyCheck();

		cruiseNorthwest();

		boatTraffic();

		cruiseNorthwest();

		safetyCheck();
		boatTraffic();

		cruiseNorth();
		cruiseNortheast();
		decelerate();

		safetyCheck();
		shutDown();
	}

	public static void cruiseNorth() {
		System.out.println("Cruise North");
	}

	public static void cruiseNortheast() {
		System.out.println("Cruise Northeast");
	}

	public static void cruiseNorthwest() {
		System.out.println("Cruise Northwest");
	}

	public static void safetyCheck(){
		System.out.println("Check Starboard");
		System.out.println("Check Port");
		System.out.println("Check speed");
		System.out.println("Check fuel level");
		System.out.println("Check temperature level");
		System.out.println("Check for debris in water");
	}

	public static void startUp(){
		System.out.println("Start engine");
		System.out.println("Untie from buoy");
		System.out.println("Move into forward gear");
	}

	public static void shutDown(){
		System.out.println("Secure boat to buoy");
		System.out.println("Turn off motor");
		System.out.println("Turn off electrical");
		System.out.println("Lock boat motor");
	}

	public static void boatTraffic(){
		System.out.println("Check VHF channel 16");
		System.out.println("Check for navigational lights");
		System.out.println("Listen for fog horns");
	}

	public static void accelerate() {
		System.out.println("Accelerate");
	}

	public static void decelerate() {
		System.out.println("Decelerate");
	}

}
