import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.mavenhomework.Calc;

public class CalcTest {

    @ParameterizedTest
    @CsvSource({
            "3,10000,3000,20000",
            "2,100000,60000,150000"
    })
    public void firstTest(int expected, int income, int expenses, int threshold) {
        Calc relax = new Calc();
        int actual = relax.calculation(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
