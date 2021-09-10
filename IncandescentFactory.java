package khan2;
public class IncandescentFactory implements BulbAbstractFactory {

	private String energyusage;
	private String colortemp;
	
	public IncandescentFactory(String energyusage, String colortemp){
		this.energyusage=energyusage;
		this.colortemp=colortemp;
    }
	@Override
	public Bulb createBulb() {
		return new Incandescent(energyusage, colortemp);
	}

}