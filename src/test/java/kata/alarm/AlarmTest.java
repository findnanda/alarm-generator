package kata.alarm;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AlarmTest {

	@Mock
	private ISensor sensor;

	@InjectMocks
	private Alarm alarm;
	
	@Test
	public void testCheckAlarmOff() {
		Mockito.when(sensor.readValue()).thenReturn(18.00);
		alarm.check();
		Mockito.verify(sensor).readValue();
		assertFalse(alarm.isAlarmOn());
	}
	
	@Test
	public void testCheckAlarmOn() {
		Mockito.when(sensor.readValue()).thenReturn(22.00);
		alarm.check();
		Mockito.verify(sensor).readValue();
		assertTrue(alarm.isAlarmOn());
	}
}
