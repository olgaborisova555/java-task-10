import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаемданные:
        long amount = 10000_60;
        boolean registered = true;
        long expected = 500;

        // вызываемцелевойметод:
        long actual = service.calculate(amount, registered);
        // производим проверку (сравниваем ожидаемый и фактический):
        // если true — то PASS// если false — то FAIL
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаемданные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // вызываемцелевойметод:
        long actual = service.calculate(amount, registered);
        // производим проверку (сравниваем ожидаемый и фактический):
        // если true — то PASS// если false — то FAIL
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаемданные:
        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;

        // вызываемцелевойметод:
        long actual = service.calculate(amount, registered);
        // производим проверку (сравниваем ожидаемый и фактический):
        // если true — то PASS// если false — то FAIL
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаемданные:
        long amount = 10000_60;
        boolean registered = false;
        long expected = 500;

        // вызываемцелевойметод:
        long actual = service.calculate(amount, registered);
        // производим проверку (сравниваем ожидаемый и фактический):
        // если true — то PASS// если false — то FAIL
        assertEquals(expected, actual);
    }
}