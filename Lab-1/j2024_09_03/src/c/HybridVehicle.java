package c;

public class HybridVehicle implements ElectricInterface, GasolineInterface {

    private double gasMPG;
    private double MpgE;
    private double miles;
    private double gallons;
    private double kWh;

    private final double MPG_E = 33.7;

    public double electricCost;
    public double gasCost;

    @Override
    public void setCostPerkWh(double cost) {
        this.electricCost = this.kWh * 0.24;
    }

    @Override
    public void setCostPerGallon(double cost) {
        this.gasCost = this.gallons * 3.50;
    }

    @Override
    public double calcMPGe() {
        MpgE = (miles/kWh) * MPG_E;
        return  MpgE;
    }

    @Override
    public void setElectricMiles(double totalElectricMiles) {
        miles =  totalElectricMiles;
    }

    @Override
    public void setTotalkWh(double totalkWh) {
        kWh = totalkWh;
    }

    @Override
    public double calcGasMPG() {
        gasMPG = miles/gallons;
        return gasMPG;
    }

    @Override
    public void setMilesfromGas(double miles) {
        this.miles = miles;
    }

    @Override
    public void setGallonsfromGas(double gallons) {
        this.gallons = gallons;
    }

    
}