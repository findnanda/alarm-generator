package kata.app;

import kata.alarm.Alarm;
import kata.alarm.IAlarm;

public class App {
    public static void main(String[] args){
        IAlarm alarm = new Alarm();
        for (int i=0; i<5; i++) {
            alarm.check();
            System.out.println("Alarm is on is:" + alarm.isAlarmOn());
        }
    }
}
