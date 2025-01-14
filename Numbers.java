import java.util.*;

public class Numbers {

    // check wether a number is palindrom or not
    public static boolean palindrom(int number) {

        int duplicate = number;
        int revNum = 0;
        while (number > 0) {

            // find last digit
            int lastDigit = number % 10;
            // append that in reverse number

            revNum = (revNum * 10) + lastDigit;

            // decrease number or remove last digit

            number = number / 10;

        }

        if (revNum == duplicate) {
            return true;
        }
        return false;

    }
    // 2
    // Problem Statement: Given a range of numbers, find all the palindrome numbers
    // in the range.

    public static void palindromInRange(int min, int max) {

        for (int i = min; i < max; i++) {
            int duplicate = i;
            int number = i;
            int reverse = 0;

            while (number > 0) {

                // last digit
                int lasDigit = number % 10;

                // append lastdigit in reverse num
                reverse = (reverse * 10) + lasDigit;

                // decrese the number
                number = number / 10;

            }
            if (reverse == duplicate) {
                System.out.println(i);
            }
        }

    }

    // check the number is prime or not

    public static boolean isPrime(int n) {
        boolean isprime = true;
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                isprime = false;
            }
        }
        return isprime;
    }

    // 4
    // prime in range
    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(n)) {
                System.out.print(i + "is prime");
            }

        }
        System.out.println();
    }

    // check if the number is armstrog or not
    public static boolean armstrong(int number) {
        int originalNum = number;
        int duplicate = number;
        int count = 0;
        // counting the numbers of digits in number
        while (number > 0) {
            number = number / 10;
            count++;
        }

        // System.out.println(count);
        int newNum = 0;
        int currNum = 0;

        while (duplicate > 0) {
            int lastDigit = duplicate % 10;

            currNum = (int) Math.pow(lastDigit, count);
            newNum += currNum;

            duplicate = duplicate / 10;
        }
        if (newNum == originalNum) {
            return true;
        }
        return false;

    }

    public static boolean isPerfect(int number) {
        int sum = 0;

        for (int i = 1; i < number - 1; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }

        }
        if (sum == number) {
            return true;
        }

        return false;
    }
    // to check the number is odd or even

    public static boolean isOddEven(int number) {

        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String argsp[]) {

        // 1
        // int number = 1331;
        // System.out.println(palindrom(number));

        // 2
        // int min = 10;
        // int max = 50;
        // palindromInRange(min, max);

        // 3
        // int n = 8;
        // System.out.println(isPrime(n));

        // 4
        // int n = 20;
        // primeInRange(n);

        // 5
        // int number = 153;
        // System.out.println(armstrong(number));

        // 6
        // int number = 6;
        // System.out.println(isPerfect(number));

        // 7
        int number = 16;
        // System.out.println(isOddEven(number));

        // boolean result = isOddEven(number);
        // if (result == true) {
        // System.out.println(number + "number is even");
        // } else {
        // System.out.println("number is odd");
        // }

    }
}