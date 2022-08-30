package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {
    /**
     - A number is "fizz" if it is divisible by 3 or if it has a 3 in it
     - A number is "buzz" if it is divisible by 5 or if it has a 5 in it
     - A number can be both "fizz" and "buzz" at the same time. If this happens then write "fizz buzz"
     */
    public String fizzBuzz(Integer number) {
        if ((number % 3 == 0 || hasNumber(number, 3)) && (number % 5 == 0 || hasNumber(number, 5))){
            return "fizz buzz";
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
}
