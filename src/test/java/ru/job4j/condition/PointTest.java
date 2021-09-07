package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20Then2() {
        int x1 = 0, y1 = 0, x2 = 2, y2 = 0;
        double expected = 2;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when34to810Then7() {
        int x1 = 3, y1 = 4, x2 = 8, y2 = 10;
        double expected = 7.81;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when42to76Then5() {
        int x1 = 4, y1 = 2, x2 = 7, y2 = 6;
        double expected = 5;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when98to00Then12()  {
        int x1 = 9, y1 = 8, x2 = 0, y2 = 0;
        double expected = 12.04;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl, 0.01);
    }

}