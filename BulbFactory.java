package khan2;

public class BulbFactory {

	public static Bulb getComputer(BulbAbstractFactory factory){
		return factory.createBulb();
	}
}