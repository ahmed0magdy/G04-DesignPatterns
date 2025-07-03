package Creational.FactoryMethod.Calendar;

import java.util.Date;

public class Scheduler {
    private Calendar calendar = new Calendar();

    public void schedule(Event event) {
        var today = new Date();
        calendar.addEvent(event, today);
    }
}
