package ie.atu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class calcultortest {
    Calculator myCalc;


    @Test
    public void tesAdd()
    {
        myCalc = new Calculator();
        assertEquals(40,myCalc.add(20,20));

    }

    @Test
    public void multiplyAdd()
    {
        myCalc = new Calculator();
        assertEquals(80,myCalc.multiply(2,20));

    }

    @Test
    public void testSubtract()
    {
        myCalc = new Calculator();
        assertEquals(10,myCalc.subtract(20,10));

    }

    @Test
    public void testDivide()
    {
        myCalc = new Calculator();
        assertEquals(10,myCalc.divide(20,2));

    }

}
