import org.example.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of a number for True Positive", 120, calculator.calculate_factorial(5), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 24, calculator.calculate_factorial(4), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 2, calculator.calculate_factorial(2), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 6, calculator.calculate_factorial(3), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 720, calculator.calculate_factorial(6), DELTA);

    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial of a number for False Positive", 120, calculator.calculate_factorial(6), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 24, calculator.calculate_factorial(3), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 4, calculator.calculate_factorial(2), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 20, calculator.calculate_factorial(4), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 240, calculator.calculate_factorial(5), DELTA);

    }

    @Test
    public void sqrootTruePositive(){
        assertEquals("Finding square root for True Positive", 2, calculator.calculate_sqroot(4), DELTA);
        assertEquals("Finding square root for True Positive", 1, calculator.calculate_sqroot(1), DELTA);
        assertEquals("Finding square root for True Positive", 3, calculator.calculate_sqroot(9), DELTA);
        assertEquals("Finding square root for True Positive", 4, calculator.calculate_sqroot(16), DELTA);
        assertEquals("Finding square root for True Positive", 5, calculator.calculate_sqroot(25), DELTA);

    }

    @Test
    public void sqrootFalsePositive(){
        assertNotEquals("Finding square root for False Positive", 1, calculator.calculate_sqroot(3), DELTA);
        assertNotEquals("Finding square root for False Positive", 0, calculator.calculate_sqroot(4), DELTA);
        assertNotEquals("Finding square root for False Positive", 7, calculator.calculate_sqroot(9), DELTA);
        assertNotEquals("Finding square root for False Positive", 9, calculator.calculate_sqroot(16), DELTA);
        assertNotEquals("Finding square root for False Positive", 6, calculator.calculate_sqroot(25), DELTA);


    }

    @Test
    public void powerTruePositive(){
        assertEquals("Finding power for True Positive", 8, calculator.calculate_power(2, 3), DELTA);
        assertEquals("Finding power for True Positive", 64, calculator.calculate_power(4, 3), DELTA);
        assertEquals("Finding power for True Positive", 1, calculator.calculate_power(1, 3), DELTA);
        assertEquals("Finding power for True Positive", 27, calculator.calculate_power(3, 3), DELTA);

    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding power for False Positive", 6, calculator.calculate_power(2, 2), DELTA);
        assertNotEquals("Finding power for False Positive", -7.3, calculator.calculate_power(2, 3), DELTA);
        assertNotEquals("Finding power for False Positive", 3, calculator.calculate_power(1, 3), DELTA);
        assertNotEquals("Finding power for False Positive", 29, calculator.calculate_power(3, 3), DELTA);

    }

    @Test
    public void logTruePositive(){
        assertEquals("Finding natural log for True Positive", 0, calculator.calculate_naturalLog(1), DELTA);
        assertEquals("Finding natural log for True Positive", 0, calculator.calculate_naturalLog(1), DELTA);
    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("Finding natural log for False Positive", 6, calculator.calculate_naturalLog(2.4), DELTA);
        assertNotEquals("Finding natural log for False Positive", 7.3, calculator.calculate_naturalLog(2.1), DELTA);
        assertNotEquals("Finding natural log for False Positive", 1.3, calculator.calculate_naturalLog(2), DELTA);
        assertNotEquals("Finding natural log for False Positive", 7, calculator.calculate_naturalLog(2.9), DELTA);

    }




}