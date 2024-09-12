package c;

public interface ElectricInterface {

    double calcMPGe();
    void setElectricMiles(double totalElectricMiles);
    void setTotalkWh(double totalkWh);

    default double getCostPerkWh() {
        return 4.5;
    };

    void setCostPerkWh(double cost);

}