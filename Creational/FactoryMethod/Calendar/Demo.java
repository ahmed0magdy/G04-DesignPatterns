package Creational.FactoryMethod.Calendar;

public class Demo {
    public static void show() {
        var scheduler = new Scheduler();
        scheduler.schedule(new Event());
    }
}
