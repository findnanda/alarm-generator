package kata.alarm;

public class Alarm implements IAlarm {
	private static final double LOW_THRESHOLD = 17;
	private static final double HIGH_THRESHOLD = 21;

	private ISensor sensor;
	private boolean alarmOn = false;
	private long alarmCount = 0;

	//Dependency Injection via constructor to reduce the tight coupling and follow open/closed principle 
	// which the code was violating.
	public Alarm(ISensor sensor) {
		this.sensor = sensor;
	}

	public void check() {
		double sensorValue = sensor.readValue();

		if (sensorValue < LOW_THRESHOLD || HIGH_THRESHOLD < sensorValue) {
			alarmOn = true;
			alarmCount += 1;
		} else {
			alarmOn = false;
		}
	}

	public boolean isAlarmOn() {
		return alarmOn;
	}
}
