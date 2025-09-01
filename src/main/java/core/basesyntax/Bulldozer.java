package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("The bulldozer roars to life, "
                + "its massive blade positioned and ready to push through earth and debris "
                + "with relentless mechanical force.");
    }

    @Override
    public void stopWork() {
        System.out.println("The bulldozer's engine winds down to silence,"
                + " leaving behind a transformed landscape of leveled "
                + "ground and cleared pathways.");
    }
}
