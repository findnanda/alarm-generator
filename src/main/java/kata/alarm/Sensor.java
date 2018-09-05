package kata.alarm;

public class Sensor implements ISensor {
	// method to mimic random return value from remote service
	public double readValue() {
		return 30 * Math.random();
	}
}
