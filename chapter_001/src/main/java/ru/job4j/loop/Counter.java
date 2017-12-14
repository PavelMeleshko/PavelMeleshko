package ru.job4j.loop;

/**
 * @author Pavel Meleshko (ottotiger@mail.ru)
 * @version 1
 * @since 13.12.2017
 */
public class Counter {
   public int add(int start, int finish) {
   int add = 0;
   for (int index = 0; index <= 100; index++) {
      if (index % 2 == 0) {
      add += index;
      } 
   }   
      return add;
   }
}