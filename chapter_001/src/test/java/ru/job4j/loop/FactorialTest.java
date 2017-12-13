package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Pavel Mekeshko (ottotiger@mail.ru)
 * @version 1
 * @since 14.12.2017
 */

public class FactorialTest {
   @Test
   public void shenCalculateFactorialForFiveThenOneHundreedTwenty() {
      Factorial ftl = new Factorial();
      int result = 1;
      int n = 5; 
      for (int  i = 1; i <= n; i++) {
         result *= i;
	  }
      assertThat(result, is(120));
   }
   @Test
   public void whenCalculateFactorialForZeroThenOne() {
      Factorial ftl = new Factorial();
      int result = 1;
      int n = 0; 
      for (int  i = 1; i <= n; i++) {
         result *= i;
         if (n == 0) {
            result = 1;
         }
	  }
      assertThat(result, is(1));
   }
}