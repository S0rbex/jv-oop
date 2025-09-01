package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("The truck's engine rumbles to life as the driver engages the gears,"
                + " ready to haul its heavy cargo across distances with steady determination.");
    }

    @Override
    public void stopWork() {
        System.out.println("The truck comes to a final stop, "
                + "its cargo safely delivered and its mission complete until "
                + "the next journey begins.");
    }
}
