package kata.alarm;

public class Alarm implements IAlarm
{
    private final double lowThreshold = 17;
    private final double highThreshold = 21;

    private Sensor sensor = new Sensor();
    private boolean alarmOn = false;
    private long alarmCount = 0;

    public void check()
    {
        double sensorValue = sensor.readValue();

        if (sensorValue < lowThreshold || highThreshold < sensorValue)
        {
            alarmOn = true;
            alarmCount += 1;
        } else {
            alarmOn = false;
        }
    }

    public boolean isAlarmOn()
    {
        return alarmOn; 
    }
}
