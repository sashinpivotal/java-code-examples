package _12_junit_examples;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeAll
    public static void beforeClass() throws Exception {
        System.out.println("before class");
    }

    @AfterAll
    public static void afterClass() throws Exception {
        System.out.println("after class");
    }

    @BeforeEach
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void add_should_add_two_numbers() {
        int addedValue = calculator.add(2, 3);
        Assertions.assertEquals(5, addedValue);
    }

    @Test
    public void subtract_should_subtract_a_number_from_the_other() {
        int subtractedValue = calculator.subtract(2, 3);
        Assertions.assertEquals(-1, subtractedValue);
    }

    @Test
    public void squareRoot_should_return_square_value_given_valid_argument() {
        double squareRoot = calculator.squareRoot(4.0);
        Assertions.assertEquals(2.0, squareRoot, 0.001);
    }

    @Test
    public void _squareRoot_should_throw_IllegalArgumentException_given_invalid_argument() {
        assertThrows(
                IllegalArgumentException.class, () -> {
                    calculator.squareRoot(-3.0);
                });
    }

    @Test
    public void _squareRoot_should_throw_IllegalArgumentException_with_correct_message_given_invalid_argument() {

        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    calculator.squareRoot(-4.0);
                });
        Assertions.assertEquals("no negative value allowed -4.0",
                exception.getMessage());
    }

    @Test
    public void _multiplyBy2_should_throw_IllegalArgumentException_given_invalid_argument() throws Exception {
        assertThrows(
                IllegalArgumentException.class, () -> {
                    calculator.multiplyBy2(-3.0);
                });
    }

    @Test
    public void _multiplyBy2_should_throw_IllegalArgumentException_with_correct_exception_message_given_invalid_argument() throws Exception {

        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    calculator.multiplyBy2(-5.0);
                });
        Assertions.assertEquals("no negative value allowed -5.0",
                exception.getMessage());
    }
}