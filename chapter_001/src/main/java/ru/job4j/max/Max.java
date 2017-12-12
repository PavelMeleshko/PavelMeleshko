package ru.job4j.max;
import java.util.Arrays;
/**
 * @author Pavel Meleshko (ottotiger@mail.ru)
 * @version 1
 * @since 11.12.2017
 */
public class Max {
   public int max(int first, int second) {
      return first > second ? first : second;
   }
   public int max(int first, int second, int third) {
      int[] array = {first, second, third};
      Arrays.sort(array);
      int value = array[2];
      return value;
   }
}