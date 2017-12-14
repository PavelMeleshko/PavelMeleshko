package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @authot Pavel Meleshko (ottotiger@mail.ru)
 * @version 1
 * @since 14.12.2017
 */
public class BoardTest {
   @Test
   public void whenPaintBoardWithWidthThreeAndHeaightThreeThenStrfingWithThreeColsAndThreeRows() {
      Board board = new Board();
      String result = board.paint(3, 3);
      final String line = System.getProperty("line.separator");
      String expected = String.format("x x%s x %sx x%s", line, line, line);
      assertThat(result, is(expected));
   }
   @Test
   public void whenPainBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows() {
      Board board = new Board();
      String result = board.paint(5, 4);
      final String line = System.getProperty("line.separator");
      String expected = String.format("x x x%s x x %sx x x%s x x %s", line, line, line, line, line);
      assertThat(result, is(expected));
 
}
}