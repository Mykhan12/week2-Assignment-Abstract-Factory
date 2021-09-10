package khan2;

public class TestDesignPatterns {

	public static void main(String[] args) {
		testAbstractFactory();
	}

	private static void testAbstractFactory() {
		Bulb Incandescent = khan2.BulbFactory.getComputer(new IncandescentFactory("High","Light White"));
		Bulb Fluorescent = khan2.BulbFactory.getComputer(new FluorescentFactory("Low","Bright White"));
		System.out.println("AbstractFactory PC Config::"+Incandescent);
		System.out.println("AbstractFactory Server Config::"+Fluorescent);
}
}