import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTestFlexible {
    @Test
    public void StationFlexible() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(15);

        int expected = 15;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationFlexible2() {
        Radio radio = new Radio(1);
        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}
