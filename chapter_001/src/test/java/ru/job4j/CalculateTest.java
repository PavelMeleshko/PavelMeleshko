package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Pavel (ottotiger@mail.ru)
* @version 1
* @since 29.11.2017
*/

public class CalculateTest {
/**
* Test echo.
*/  
@Test
public void whenTakeNameThenTreeEchoPlusName(){

    String input ="Pavel Meleshko";
    String expect ="Echo, echo, echo : Pavel Meleshko";
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
}
}