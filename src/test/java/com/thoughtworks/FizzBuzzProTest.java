package com.thoughtworks;

import org.junit.Test;

public class FizzBuzzProTest {
    //should_return_1_when_given_1
    @Test
    public void should_return_1_when_given_1(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(1);

        //then
        assert result.equals("1");
    }
}
