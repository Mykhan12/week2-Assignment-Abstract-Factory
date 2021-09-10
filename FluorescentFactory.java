package khan2;

public class FluorescentFactory implements BulbAbstractFactory {

	private String energyusage;
	private String colortemp;
	
	public FluorescentFactory(String energyusage, String colortemp){
		this.energyusage=energyusage;
		this.colortemp=colortemp;
	}
	@Override
	public Bulb createBulb() {
		return new Fluorescent(energyusage,colortemp);
	}

}