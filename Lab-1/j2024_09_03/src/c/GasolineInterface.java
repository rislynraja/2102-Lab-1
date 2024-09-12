package c;
public interface GasolineInterface {
    
    double calcGasMPG();
    void setMilesfromGas(double miles);
    void setGallonsfromGas(double gallons);

    default double getCostPerGallon() {
        return 3.3;
    }
    
    void setCostPerGallon(double cost);
}