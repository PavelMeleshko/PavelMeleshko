package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * @author Pavel (ottotiger@mail.ru)
 * @version 1
 * @since 20.12.2017
 */
public class SquareTest {
    @Test
    public void checkingAnArrayFilledWithANumberInDegree() {
        Square sqr = new Square();
        int[] rst = sqr.calculate(3);
        int[] expect = {1, 4, 9};
        assertThat(rst, is(expect));

    }
}