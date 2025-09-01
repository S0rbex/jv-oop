package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Started зносити все живе");
    }

    @Override
    public void stopWork() {
        System.out.println("Stopped зносити все живе");
    }
}
