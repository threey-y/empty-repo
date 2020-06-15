package com.thoughtworks;

import org.junit.Test;

public class FizzBuzzTest {
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

    //should_return_fizz_when_given_3
    @Test
    public void should_return_fizz_when_given_3(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(3);

        //then
        assert result.equals("Fizz");
    }

    @Test
    public void should_return_buzz_when_given_5(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(5);

        //then
        assert result.equals("Buzz");
    }

    @Test
    public void should_return_whizz_when_given_7(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(7);

        //then
        assert result.equals("Whizz");
    }

    @Test
    public void should_return_fizzbuzz_when_given_15(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(15);

        //then
        assert result.equals("FizzBuzz");
    }

}
