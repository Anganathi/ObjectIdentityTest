import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test

    public void objectEqualsTest(){
        Car car1 = new Car("Mercedez Benz G Wagon", 2019, 1000000);
        Car car2 = car1;
        Car car3 = new Car("Porche Cayenne", 2018, 1500000);
        boolean result = car1.objectIdentical(car2);

        Assert.assertSame(true, result);
    }

}