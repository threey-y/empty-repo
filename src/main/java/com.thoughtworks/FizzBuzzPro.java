package com.thoughtworks;

public class FizzBuzzPro {
    public String printnum(int number){
        if (number % 3 == 0)
            return "Fizz";
        return String.valueOf(number);
    }
}
