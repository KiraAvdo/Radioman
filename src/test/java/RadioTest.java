import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void NextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void NextVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.next();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);

    }
}
