package com.thoughtworks;

public class FizzBuzzPro {
    public String result="";
    public String printnum(int number){
        if (isContain3(number))
            return "Fizz";
        if ((number % 3 == 0)||(number % 5 == 0)||(number % 7 == 0)){
            isDividedBy3(number);
            isDividedBy5(number);
            isDividedBy7(number);
            return result;
        }
//            return "FizzBuzzWhizz";
//        if ((number % 5 == 0)&&(number % 7 == 0))
//            return "BuzzWhizz";
//        if ((number % 3 == 0)&&(number % 7 == 0))
//            return "FizzWhizz";
//        if ((number % 3 == 0)&&(number % 5 == 0)){
//            isDividedBy3(number);
//            isDividedBy5(number);
//            return result;
//        }
//
//        if (number % 3 == 0)
//            return isDividedBy3(number);
//        if (number % 5 == 0)
//            return isDividedBy5(number);
//        if (number % 7 == 0)
//            return isDividedBy7(number);
        return String.valueOf(number);
    }

    private String isDividedBy3(int number){
        if (number % 3 == 0){
            result += "Fizz";
        }
        return result;
    }

    private String isDividedBy5(int number){
        if (number % 5 == 0){
            result += "Buzz";
        }
        return result;
    }

    private String isDividedBy7(int number){
        if (number % 7 == 0){
            result += "Whizz";
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
