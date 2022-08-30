package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {
    /**
     - The old rules for "deluxe" do not apply.
     - A number is "deluxe" if it fulfils at least one of the following:
     - is divisible by 3 AND contains a 3
     - is divisible by 5 AND contains a 5
     - We should still say "fake deluxe" if the "deluxe" number is odd
     - A number can be "fizz", "buzz" and "deluxe" at the same time. If this happens then write "fizz buzz deluxe"
     - All the previous rules for "fizz" and "buzz" are still valid
     */
    public String fizzBuzz(Integer number) {

        if(isDeluxe(number) && number % 2 == 0 && number % 3 == 0 && number % 5 == 0){
            return "fizz buzz deluxe";
        } else if (isDeluxe(number) && number % 2 == 1 && number % 3 == 0 && number % 5 == 0) {
            return "fizz buzz fake deluxe";
        } else if (isDeluxe(number) && number % 2 == 0 && number % 3 == 0) {
            return "fizz deluxe";
        } else if (isDeluxe(number) && number % 2 == 1 && number % 3 == 0) {
            return "fizz fake deluxe";
        } else if (isDeluxe(number) && number % 2 == 0 && number % 5 == 0) {
            return "buzz deluxe";
        } else if (isDeluxe(number) && number % 2 == 1 && number % 5 == 0) {
            return "buzz fake deluxe";
        } else if ((number % 3 == 0 || hasNumber(number, 3)) && (number % 5 == 0 || hasNumber(number, 5))) {
            return "fizz buzz";
        } else if (isDeluxe(number) && number % 2 == 0) {
            return "deluxe";
        } else if (isDeluxe(number) &&  number % 2 == 1) {
            return "fake deluxe";
        } else if (number % 3 == 0 || hasNumber(number, 3)) {
            return "fizz";
        } else if (number % 5  == 0 || hasNumber(number, 5)) {
            return "buzz";
        } else{
            return number.toString();
        }

        /**
        if ((number % 3 == 0 || hasNumber(number, 3)) && (number % 5 == 0 || hasNumber(number, 5)) &&
            hasIdenticalDigits(number) && number > 10 && number % 2 == 0){
            return "fizz buzz deluxe";
        } else if ((number % 3 == 0 || hasNumber(number, 3)) && (number % 5 == 0 || hasNumber(number, 5)) &&
                hasIdenticalDigits(number) && number > 10 && number % 2 == 1) {
            return "fizz buzz fake deluxe";
        } else if ((number % 3 == 0 || hasNumber(number, 3)) &&
                hasIdenticalDigits(number) && number > 10 && number % 2 == 0){
            return "fizz deluxe";
        } else if ((number % 3 == 0 || hasNumber(number, 3)) &&
                hasIdenticalDigits(number) && number > 10 && number % 2 == 1) {
            return "fizz fake deluxe";
        } else if ((number % 5 == 0 || hasNumber(number, 5)) &&
                hasIdenticalDigits(number) && number > 10 && number % 2 == 1) {
            return "buzz fake deluxe";
        } else if ((number % 5 == 0 || hasNumber(number, 5)) &&
                hasIdenticalDigits(number) && number > 10 && number % 2 == 0) {
            return "buzz deluxe";
        } else if ((number % 3 == 0 || hasNumber(number, 3)) && (number % 5 == 0 || hasNumber(number, 5))) {
            return "fizz buzz";
        } else if (hasIdenticalDigits(number) && number > 10 && number % 2 == 0) {
            return "deluxe";
        } else if (hasIdenticalDigits(number) && number > 10 && number % 2 == 1) {
            return "fake deluxe";
        } else if (number % 3 == 0 || hasNumber(number, 3)) {
            return "fizz";
        } else if (number % 5  == 0 || hasNumber(number, 5)) {
            return "buzz";
        } else{
            return number.toString();
        }
        */
    }

    public Boolean hasNumber(Integer num, Integer digit){
        while(num > 0){
            if(num % 10 == digit){
                return true;
            }
            num = num / 10;
        }
        return false;
    }

    public Boolean isDeluxe(Integer num){
        if((num % 3 == 0 && hasNumber(num, 3)) || (num % 5 == 0 && hasNumber(num, 5))){
            return true;
        } else{
            return false;
        }
    }

    public Boolean hasIdenticalDigits(Integer num){
        Integer digit = num % 10;
        Integer check = 0;
        Integer numOfDigits = 0;
        while(num > 0){
            if(num % 10 == digit){
                check += 1;
            }
            numOfDigits += 1;
            num = num / 10;
        }
        if(numOfDigits == check){
            return true;
        } else{
            return false;
        }
    }
}



