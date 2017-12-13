package ru.job4j.loop;

/**
 * @author Pavel Mekeshko (ottotiger@mail.ru)
 * @version 1
 * @since 14.12.2017
 */
public class Factorial {
   public int calc(int n) {
     int result = 1; 
      for (int  i = 1; i <= n; i++) {
         result *= i;
      if (n == 0) {
         result = 1;
      }
	  }
   return result;
   }
} 