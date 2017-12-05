package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Pavel (ottotiger@mail.ru)
 * @version 1
 * @since 04.12.2017
 */

public class CalculatorTest {
     /**
     * Test echo.
     */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenSub() {
        Calculator calc = new Calculator();
        calc.sub(1D, 1D);
        double result = calc.getResult();
        double expected = 0D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenMul() {
        Calculator calc = new Calculator();
        calc.mul(3D, 3D);
        double result = calc.getResult();
        double expected = 9D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenDiv() {
        Calculator calc = new Calculator();
        calc.div(8D, 2D);
        double result = calc.getResult();
        double expected = 4D;
        assertThat(result, is(expected));
    }
}