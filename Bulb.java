package khan2;
 
public abstract class Bulb {
     
    public abstract String getEnergyUsage();
    public abstract String getColorTemp();
     
    @Override
    public String toString(){
        return "EnergyUsage= "+this.getEnergyUsage()+", ColorTemp="+this.getColorTemp();
    }
}