package com.thoughtworks;

public class FizzBuzzPro {
    public String result;
    public String printnum(int number){
        if (isContain3(number))
            return "Fizz";
        if ((number % 3 == 0)&&(number % 5 == 0)&&(number % 7 == 0))
            return "FizzBuzzWhizz";
        if ((number % 5 == 0)&&(number % 7 == 0))
            return "BuzzWhizz";
        if ((number % 3 == 0)&&(number % 7 == 0))
            return "FizzWhizz";
        if ((number % 3 == 0)&&(number % 5 == 0))
            return "FizzBuzz";
        if (number % 3 == 0)
            return isDividedBy3(number);
        if (number % 5 == 0)
            return "Buzz";
        if (number % 7 == 0)
            return "Whizz";
        return String.valueOf(number);
    }

    private String isDividedBy3(int number){
        if (number % 3 == 0){
            result += "Fizz";
        }
        return result;
    }

    private Boolean isContain3(int number) {
        String temp = String.valueOf(number);
        if (temp.contains("3")) {
            return true;
        }
        return false;
    }
}
