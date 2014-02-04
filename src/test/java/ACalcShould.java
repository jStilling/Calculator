import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by jstilling on 03.02.14.
 */
public class ACalcShould {

    private Calc calculator;

    @Before
    public void init(){
        calculator = new Calc(1*2*3*4*5);
    }


    @Test
    public void HasValueInMemory() throws Exception{
        assertEquals(120, calculator.getMemory());
    }

    @Test
    public void testOptions(){
        calculator.add(5, 13);
        assertEquals(18, calculator.getMemory());
        calculator.sub(5 , 8);
        assertEquals(-3, calculator.getMemory());
        calculator.addToMemory(15);
        assertEquals(12, calculator.getMemory());
    }

    @Test
    public void testMoreOptions(){
        calculator.div(90,9);
        assertEquals(10,calculator.getMemory());
        assertEquals(180, calculator.mult(9, calculator.mult(calculator.getMemory(), calculator.sub(20, 18)))); // 9*10*(20-18)
    }
}
