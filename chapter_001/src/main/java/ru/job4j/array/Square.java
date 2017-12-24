package ru.job4j.array;
/**
 * @author Pavel Meleshko (ottotiger@mail.ru)
 * @version 1
 * @since 22.12.2017
 */
public class Square {
   public int[] calculate(int bound) {
      int[] rst = new int[bound];
         for (int i = 0; i < bound; i++) {
            rst[i] = (int) (Math.pow(i + 1, 2));
		 }
	  return rst;
		 
   }
}