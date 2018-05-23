import Enums.WheelType;

public class StandardCar extends Vehicle {

    StandardCar(String make, String model, int price, String colour, int seatCount, Engine engine) {
        super(make, model, price, colour, seatCount, engine, WheelType.STANDARD, 4);
    }
}
