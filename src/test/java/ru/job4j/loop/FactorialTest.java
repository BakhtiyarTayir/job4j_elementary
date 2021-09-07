package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.loop.Factorial;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
      int number = 5;
      int expected = 120;
      int result = Factorial.calc(number);
      Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int number = 0;
        int expected = 1;
        int result = Factorial.calc(number);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForThreeThenSix() {
        int number = 3;
        int expected = 6;
        int result = Factorial.calc(number);
        Assert.assertEquals(expected, result);
    }
}