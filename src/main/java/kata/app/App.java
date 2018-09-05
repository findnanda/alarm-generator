package kata.app;

import kata.alarm.Alarm;
import kata.alarm.IAlarm;
import kata.alarm.ISensor;
import kata.alarm.Sensor;

public class App {
	public static void main(String[] args) {
		// Class should be open for extension but closed for modification. Earlier the
		// class was violating then principal as changing the sensor type would require
		// changes to the Alarm class. By extracting Sensor interface we promote abstraction
		// which makes the Alarm class open to operate on any type of Sensor without
		// modifying the class. By doing that we followed another SOLID principle
		// which is dependency injection via constructor which removes the tight
		// coupling that existed between the Alarm and Sensor class.
		ISensor sensor = new Sensor();
		IAlarm alarm = new Alarm(sensor);
		for (int i = 0; i < 5; i++) {
			alarm.check();
			System.out.println("Alarm is on is:" + alarm.isAlarmOn());
		}
	}
}
