package _part2_5_composition.before;

public class Car {

    private Engine engine;
    private Transmission transmission;

    public void moveTo(String destination) {
        engine.start();
        engine.rev();
        transmission.shiftTo(3);
        transmission.engage();
    }
}
