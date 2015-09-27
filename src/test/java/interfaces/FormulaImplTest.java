package interfaces;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by kasia on 27/09/2015.
 */
public class FormulaImplTest {

    @Test
    public void test()
    {
        Formula formula = new FormulaImpl();
        assertEquals(4, formula.sqrt(16), 0);
        assertEquals(100, formula.calculate(100), 0);
    }
}
