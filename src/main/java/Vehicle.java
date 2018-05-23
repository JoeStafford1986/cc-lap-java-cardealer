import Enums.WheelType;

public abstract class Vehicle {
    private String make;
    private String model;
    private int price;
    private String colour;
    private int seatCount;
    private Engine engine;
    private WheelType wheelType;
    private int wheelCount;

    Vehicle(String make, String model, int price, String colour, int seatCount, Engine engine, WheelType wheelType, int wheelCount) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.colour = colour;
        this.seatCount = seatCount;
        this.engine = engine;
        this.wheelType = wheelType;
        this.wheelCount = wheelCount;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getPrice() {
        return this.price;
    }

    public String getColour() {
        return this.colour;
    }

    public int getSeatCount() {
        return this.seatCount;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public WheelType getWheelType() {
        return this.wheelType;
    }

    public int getWheelCount() {
        return this.wheelCount;
    }
}
