import Enums.WheelType;


public class Truck extends Vehicle {

    Truck(String make, String model, int price, String colour, int seatCount, Engine engine) {
        super(make, model, price, colour, seatCount, engine, WheelType.COMMERCIAL, 6);
    }
}

