package com.thoughtworks;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void should_return_100_when_price_is_100() {
        //given
        Goods goods = new Goods(100,"MacBook");
        Calculator calculator = new Calculator();
        int saleNumber = 100;

        //when
        int actual = calculator.calculate(goods);

        //then
        Assert.assertEquals(actual, saleNumber);
    }
}
