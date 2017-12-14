package ru.job4j.loop;

/**
 * @author Pavel Mekeshko (ottotiger@mail.ru)
 * @version 1
 * @since 14.12.2017
 */
public class Board {
   public String paint(int width, int height) {
      StringBuilder screen = new StringBuilder();
      String ln = System.lineSeparator();
      for (int i = 0; i < height; i++) {
         if (i % 2 == 0) { 
            for (int j = 0; j < width; j++) {
               if (j % 2 == 0) {
                  screen.append("x");
               } else {
                  screen.append(" ");
               }
            }
		 } else {
            for (int u = 0; u < width; u++) {
               if (u % 2 == 0) {
                  screen.append(" ");
               } else {
                  screen.append("x");
               }
            }
         }
		 screen.append(ln);
		 }
	  return screen.toString();
	  }
   }
