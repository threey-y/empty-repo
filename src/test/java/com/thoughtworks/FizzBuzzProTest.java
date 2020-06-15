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

    @Test
    public void should_return_fizz_when_given_3(){
        //given
        FizzBuzzPro fizzBuzzPro = new FizzBuzzPro();

        //when
        String result = fizzBuzzPro.printnum(3);

        //then
        assert result.equals("Fizz");
    }

    @Test
    public void should_return_buzz_when_given_5(){
        //given
        FizzBuzzPro fizzBuzzPro = new FizzBuzzPro();

        //when
        String result = fizzBuzzPro.printnum(5);

        //then
        assert result.equals("Buzz");
    }

    @Test
    public void should_return_whizz_when_given_7(){
        //given
        FizzBuzzPro fizzBuzzPro = new FizzBuzzPro();

        //when
        String result = fizzBuzzPro.printnum(7);

        //then
        assert result.equals("Whizz");
    }

    @Test
    public void should_return_fizzbuzz_when_given_15(){
        //given
        FizzBuzzPro fizzBuzzPro = new FizzBuzzPro();

        //when
        String result = fizzBuzzPro.printnum(15);

        //then
        assert result.equals("FizzBuzz");
    }


}
