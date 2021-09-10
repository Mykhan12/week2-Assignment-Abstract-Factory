package khan2;
public class Fluorescent extends Bulb{
 
    private String energyusage;
    private String colortemp;
     
    public Fluorescent(String energyusage, String colortemp){
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