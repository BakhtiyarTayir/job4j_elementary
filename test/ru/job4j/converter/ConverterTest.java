package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = (int) Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        int in = 180;
        int expected = 3;
        int out = (int) Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert3DlrThen180Rbl() {
        int in = 3;
        int expected = 180;
        int out = (int) Converter.dollarToRub(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert3EuroThen210Rbl() {
        int in = 3;
        int expected = 210;
        int out = (int) Converter.euroToRub(in);
        Assert.assertEquals(expected, out);
    }
}