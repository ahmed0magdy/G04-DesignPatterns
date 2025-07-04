package Creational.FactoryMethod.Calendar;

public class ArabianScheduler extends Scheduler {

    @Override
    protected Calendar createCalendar() {
        return new ArabianCalendar();
    }

}
