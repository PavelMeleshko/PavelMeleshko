package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Pavel Meleshko (ottotiger@mail.ru)
 * @version  1
 * @sinse 13.12.2017
 */

public class CounterTest {
   @Test
   public void whenSumEvenNumberFromOneToTenThirty() {
      Counter count = new Counter();
      int sum = 0;
      for (int i = 1; i <= 10; i++) {
         if (i % 2 == 0) {
         sum += i;
         }
      }
      assertThat(sum, is(30));
   }
}
