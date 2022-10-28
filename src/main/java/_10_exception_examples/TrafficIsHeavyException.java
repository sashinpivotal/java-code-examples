package _10_exception_examples;

public class TrafficIsHeavyException extends RuntimeException {
    public TrafficIsHeavyException(String message) {
        super(message);
    }
}
