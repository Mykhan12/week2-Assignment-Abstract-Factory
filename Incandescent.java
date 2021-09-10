package khan2;
public class Incandescent extends Bulb {
 
    private String energyusage;
    private String colortemp;
     
    public Incandescent(String energyusage, String colortemp){
        this.energyusage=energyusage;
        this.colortemp=colortemp;
    }
    @Override
    public String getEnergyUsage() {
        return this.energyusage;
    }
 
    @Override
    public String getColorTemp() {
        return this.colortemp;
    }
 
}