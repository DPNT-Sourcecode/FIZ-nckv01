package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {
    /**
     - A number is considered to be "deluxe" if it is greater than 10 and all the digits are identical
     - A number can be "fizz", "buzz" and "deluxe" at the same time. If this happens then write "fizz buzz deluxe"
     */
    public String fizzBuzz(Integer number) {
        if ((number % 3 == 0 || hasNumber(number, 3)) && (number % 5 == 0 || hasNumber(number, 5)) &&
            hasIdenticalDigits(number) && number > 10){
            return "fizz buzz deluxe";
        } else if ((number % 3 == 0 || hasNumber(number, 3)) &&
                hasIdenticalDigits(number) && number > 10){
            return "fizz deluxe";
        } else if ((number % 5 == 0 || hasNumber(number, 5)) &&
                hasIdenticalDigits(number) && number > 10) {
            return "buzz deluxe";
        } else if ((number % 3 == 0 || hasNumber(number, 3)) && (number % 5 == 0 || hasNumber(number, 5))) {
            return "fizz buzz";
        } else if (hasIdenticalDigits(number) && number > 10) {
            return "deluxe";
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

