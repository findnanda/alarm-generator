# Refactoring Kata

This code is a simple alarm which uses a remote service to sample a value and then set the alarm on or off depending on the result.
This is existing code which is packaged into a jar and used by other applications.

This kata is to review the Alarm class and to refactor this class to make it unit testable.

As part of this, identify the issues which are causing this test to be difficult to test.
Can you name the SOLID design principle which is being violated?

Class should be open for extension but closed for modification. Earlier the class was violating the principal as changing the sensor type would require changes to the Alarm class. By extracting Sensor interface we promote abstraction which makes the Alarm class open to operate on any type of Sensor without modifying the class. By doing that we followed another SOLID principle which is dependency injection via constructor which removes the tight coupling that existed between the Alarm and Sensor class.
