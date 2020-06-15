package com.thoughtworks;

import org.junit.Test;

public class FizzBuzzProTest {
    //should_return_1_when_given_1
    @Test
    public void should_return_1_when_given_1(){
        //given
        FizzBuzzPro fizzBuzzPro = new FizzBuzzPro();

        //when
        String result = fizzBuzzPro.printnum(1);

        //then
        assert result.equals("1");
    }
}
