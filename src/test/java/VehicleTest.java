import Enums.FuelType;
import Enums.WheelType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {
    private StandardCar standardCar;
    private Engine engine;

    @Before
    public void before() {
        engine = new Engine(1600, FuelType.PETROL);
        standardCar = new StandardCar("Ford", "Capri", 2000, "Pea Green", 4, engine);
    }

    @Test
    public void hasMake() {
        assertEquals("Ford", standardCar.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Capri", standardCar.getModel());
    }

    @Test
    public void hasPrice() {
        assertEquals(2000, standardCar.getPrice());
    }

    @Test
    public void hasColour() {
        assertEquals("Pea Green", standardCar.getColour());
    }

    @Test
    public void hasSeatCount() {
        assertEquals(4, standardCar.getSeatCount());
    }

    @Test
    public void canGetEngine() {
        assertEquals(engine, standardCar.getEngine());
    }

    @Test
    public void canGetWheelType() {
        assertEquals(WheelType.STANDARD, standardCar.getWheelType());
    }

    @Test
    public void canGetWheelCount() {
        assertEquals(4, standardCar.getWheelCount());
    }
}