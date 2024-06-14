package Week8;

import org.junit.Test;
import static org.junit.Assert.*;

public class tempUnitTest {
    private Temperature temperature = new Temperature();

    @Test
    public void testToCelsius() {
        // test Fahrenheit to Celsius
        assertEquals(0.0, temperature.toCelsius(32.0), 0.0001);  // 32°F = 0°C
        assertEquals(100.0, temperature.toCelsius(212.0), 0.0001);  // 212°F = 100°C
        assertEquals(-40.0, temperature.toCelsius(-40.0), 0.0001);  // -40°F = -40°C
        assertEquals(37.7778, temperature.toCelsius(100.0), 0.0001);  // 100°F = 37.7778°C
    }

    @Test
    public void testToFahrenheit() {
        // test Celsius to Fahrenheit
        assertEquals(32.0, temperature.toFahrenheit(0.0), 0.0001);  // 0°C = 32°F
        assertEquals(212.0, temperature.toFahrenheit(100.0), 0.0001);  // 100°C = 212°F
        assertEquals(-40.0, temperature.toFahrenheit(-40.0), 0.0001);  // -40°C = -40°F
        assertEquals(212.0, temperature.toFahrenheit(100.0), 0.0001);  // 100°C = 212°F
    }

}
