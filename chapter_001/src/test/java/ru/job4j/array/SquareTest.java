package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * @author Pavel (ottotiger@mail.ru)
 * @version 1
 * @since 20.12.2017
 */
public class SquareTest {
   @Test
   public void checkingAnArrayFilledWithANumberInDegree() {
        Square  = new Square();
        int[] array = new int[5];
           for (int i = 0; i < rst.length; i++) {
              rst[i] = Math.pow(rst[i], 2);
		   }
		assertThat(rst, is(array[0] = 1, array[1] = 2, array[2] = 4, array[3] = 9, array[4] = 16)); 
        
    }
}