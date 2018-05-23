import Enums.FuelType;

public class Engine {
    private int size;
    private FuelType fuelType;

    public Engine(int size, FuelType fuelType) {
        this.size = size;
        this.fuelType = fuelType;
    }

    public int getSize() {
        return this.size;
    }

    public FuelType getFuelType() {
        return this.fuelType;
    }
}
