package _12_junit_examples;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("before class");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("after class");
    }

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void add_should_add_two_numbers() {
        int addedValue = calculator.add(2, 3);
        Assert.assertEquals(5, addedValue);
    }

    @Test
    public void subtract_should_subtract_a_number_from_the_other() {
        int subtractedValue = calculator.subtract(2, 3);
        Assert.assertEquals(-1, subtractedValue);
    }

    @Test
    public void squareRoot_should_return_square_value_given_valid_argument() {
        double squareRoot = calculator.squareRoot(4.0);
        Assert.assertEquals(2.0, squareRoot, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void _squareRoot_should_throw_IllegalArgumentException_given_invalid_argument() {
        calculator.squareRoot(-3.0);
    }

    @Test
    public void _squareRoot_should_throw_IllegalArgumentException_with_correct_message_given_invalid_argument() {

        try {
            calculator.squareRoot(-4.0);
            fail("it should have thrown IllegalArgumentException but it did not");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("no negative value allowed -4.0", e.getMessage());
        }
    }

    @Test(expected = Exception.class)
    public void _multiplyBy2_should_throw_checked_Exception_given_invalid_argument() throws Exception {
        calculator.multiplyBy2(-3.0);
    }

    @Test
    public void _multiplyBy2_should_throw_checked_Exception_with_correct_exception_message_given_invalid_argument() throws Exception {

        try {
            calculator.multiplyBy2(-5.0);
            fail("Exception should have been thrown with negative argument but it did not");
        } catch (Exception e) {
            Assert.assertEquals("no negative value allowed -5.0", e.getMessage());
        }
    }
}