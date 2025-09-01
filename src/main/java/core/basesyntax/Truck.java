package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Started рухатись");
    }

    @Override
    public void stopWork() {
        System.out.println("Stopped рухатись");
    }
}
