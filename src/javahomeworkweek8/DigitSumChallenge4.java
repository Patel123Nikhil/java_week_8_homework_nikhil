package javahomeworkweek8;
/*Digit Sum Challenge
        Write a method with the name sumDigits that has one int parameter called number.
        If the parameter is >= 10 then the method should process the number and return sum of all digits,
        otherwise return -1 to indicate an invalid value.
        The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
        negative numbers, so also return -1 for negative numbers.*/


public class DigitSumChallenge4 {

    public static void main(String[] args) {
        // Should return 8 => 1 + 2 + 5 = 8
        System.out.println("Sum of 125 is = " + sumDigits(125));
        // Should return -1
        System.out.println("Sum of -3 is = " + sumDigits(-3));
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sumDigits = 0;
        // Convert number to string
        String numberToString = Integer.toString(number);
        // Map through all char of the string
        for(char c : numberToString.toCharArray()) {
            // Convert the char to number again
            sumDigits += Integer.parseInt(String.valueOf(c));
        }
        return sumDigits;
    }



}
