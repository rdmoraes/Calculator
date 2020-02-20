package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void init(){
        calculator = new Calculator();
    }

    @Test
    void testArgConstructor(){
        calculator = new Calculator(2, 2);
        assertEquals(4, calculator.getFirstNum()+calculator.getSecondNum());
    }

    @Test
    void testAddMethod(){ assertEquals(2, calculator.add(1,1));}

    @Test
    void testSubMethod(){ assertEquals(0, calculator.subtract(1,1));}

    @Test
    void testMultiplyMethod(){
       assertEquals(4, calculator.multiply(2,2));
    }
    @Test
    void testDivideMethod(){
        assertEquals(4, calculator.divide(8,2));
        assertThrows(IllegalArgumentException.class, ()->{calculator.divide(3,0);});
    }

}
