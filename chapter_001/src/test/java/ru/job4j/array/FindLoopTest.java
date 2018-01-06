package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Pavel Meleshko (ottotiger@mail.ru)
 * @version 1
 * @since 06.01.2018
 */
public class FindLoopTest {
    @Test
    public void MethodFindsAnElement() {
        FindLoop fl = new FindLoop();
        int rst = fl.indexOf(new int[]{1, 2, 3, 4, 5}, 5);
        int expect = 6;
        assertThat(rst, is(expect));

    }

    @Test
    public void MethodDoesNotFindAnElement() {
        FindLoop fl = new FindLoop();
        int rst = fl.indexOf(new int[]{1, 2, 3, 4, 5}, 7);
        int expect = -1;
        assertThat(rst, is(expect));
    }
}