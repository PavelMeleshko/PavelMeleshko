package ru.job4j.array;
/**
 * @author Pavel Meleshko (ottotiger@mail.ru)
 * @version 1
 * @since 22.12.2017
 */
public class Square {
   public int[] calculate(int bound) {
      int[] rst = new int[bound];
         for (int i = 0; i < rst.length; i++) {
            rst[i] = (int) (Math.pow(rst[i], 2));
		 }
	  return rst;
		 
   }
}