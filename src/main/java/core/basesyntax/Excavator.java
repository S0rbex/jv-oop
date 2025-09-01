package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Started копати");
    }

    @Override
    public void stopWork() {
        System.out.println("Stopped копати");
    }
}
