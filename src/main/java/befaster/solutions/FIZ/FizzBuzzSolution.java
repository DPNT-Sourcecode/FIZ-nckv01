package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {
    /**
     - If a "deluxe" number is odd, we should call him "fake deluxe"
     - A number cannot be both "deluxe" and "fake deluxe" at the same time
     - All the previous rules are still valid
     */
    public String fizzBuzz(Integer number) {
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


