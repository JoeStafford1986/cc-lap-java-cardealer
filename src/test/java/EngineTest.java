import Enums.FuelType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {
    private Engine engine;

    @Before
    public void before() {
        engine = new Engine(2500, FuelType.DIESEL);
    }

    @Test
    public void hasSize() {
        assertEquals(2500, engine.getSize());
    }

    @Test
    public void hasFuelType() {
        assertEquals(FuelType.DIESEL, engine.getFuelType());
    }
}
