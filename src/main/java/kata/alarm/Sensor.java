package kata.alarm;

public class Sensor
{
    // method to mimic random return value from remote service
    public double readValue()
    {
        return 30 * Math.random();
    }
}
