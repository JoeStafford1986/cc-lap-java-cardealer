import Enums.FuelType;
import org.junit.Before;
import org.junit.Test;

public class CarTest {
    private StandardCar standardCar;

    @Before
    public void before() {
        Engine engine = new Engine(1600, FuelType.PETROL);
        standardCar = new StandardCar("Ford", "Capri", 2000, "Pea Green/Rust Colourations", 4, engine);
    }
}