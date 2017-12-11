package ru.job4j.max;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Pavel Meleshko (ottotiger@mail.ru)
 * @version 1
 * @sinse 11.12.2017
 */
public class MaxTest {

   @Test
   public void whenFirstLessSecond() {
      Max maxim = new Max();
      int result = maxim.max(1, 2);
      assertThat(result, is(2));
   }
}
