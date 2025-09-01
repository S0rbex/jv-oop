package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("The excavator's hydraulic arm extends with mechanical precision,"
                + " its bucket poised to bite deep into the earth and scoop away tons of soil.");
    }

    @Override
    public void stopWork() {
        System.out.println("The excavator's arm retracts one final time, "
                + "settling into rest position as the day's digging operations draw to a close.");
    }
}
