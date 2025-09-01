package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[3];

        // Додаємо об'єкти конкретних підкласів до масиву
        machines[0] = new Truck();
        machines[1] = new Bulldozer();
        machines[2] = new Excavator();

        // Виконуємо цикл для кожного об'єкта в масиві
        for (Machine machine : machines) {
            System.out.println("--- Нова машина ---");
            machine.doWork(); // Викликаємо абстрактний метод
            machine.stopWork(); // Викликаємо абстрактний метод
            System.out.println();
        }
    }

}
