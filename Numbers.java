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
    // to check whether the number is negative or positive

    public static void negOrPos(int number) {

        if (number > 0) {
            System.out.println(number + ":" + "number is positive");
        } else {
            System.out.println(number + ":" + "number is negative");
        }
    }

    // to calculate sum of Ap series

    public static double sumOfAp(int n, float a, float d) {

        double sum = (n / 2.0) * (2.0 * a + (n - 1) * d);
        return sum;
    }

    // calculate sum of GP series
    public static double SumofGP(double a, double r, int n) {
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += a;
            a = a * r;
        }
        return sum;
    }

    // greatest of two numbers

    public static int greatestOfTwoNum(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;

    }

    // greatest of three number
    public static int greatestOfThreeNum(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        if (b > a && b > c) {
            return b;
        }
        return c;
    }

    // reverse the dif=gits of two numbers
    public static int reverseDigits(int Num) {
        int newNum = 0;

        while (Num > 0) {
            int lastDigit = Num % 10;

            newNum = (newNum * 10) + lastDigit;

            Num = Num / 10;
        }
        return newNum;

    }

    // largest and smallest digit in numbers

    public static int largestVSsmallest(int num) {

        int duplicate = num;
        int reverse = 0;
        int currNum = 0; // to find largest digit initialize it by 0
        // int currNum = num % 10; //to find smallest initialize with num%10;

        // largest
        while (num > 0) {
            int lastDigit = num % 10;
            // largest
            // currNum = Math.max(currNum, lastDigit);
            // smallest
            currNum = Math.min(currNum, lastDigit);

            reverse = (num * 10) + lastDigit;

            num = num / 10;

        }
        return currNum;
    }

    // Problem Statement: Given an integer N. Print the Fibonacci series up to the
    // Nth term.

    public static void fibonacci(int num) {

        int fib[] = new int[num + 1];

        fib[0] = 0;
        fib[1] = 1;

        // fibonacci series is sequence of sum of its previous two numbers
        for (int i = 2; i <= num; i++) {

            fib[i] = fib[i - 1] + fib[i - 2];
        }

        // printing the series
        for (int i = 0; i <= num; i++) {
            System.out.print(fib[i] + " ");
        }

    }

    public static int fact(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;

        }
        return factorial;

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
        // int number = 16;
        // System.out.println(isOddEven(number));

        // boolean result = isOddEven(number);
        // if (result == true) {
        // System.out.println(number + "number is even");
        // } else {
        // System.out.println("number is odd");
        // }

        // 8
        // int number = -2;
        // negOrPos(number);

        // 9
        // int n = 4;
        // float a = 2;
        // float d = 2;
        // System.out.println(sumOfAp(n, a, d));

        // 10
        // double a = 3; // first term
        // double r = 5; // common ratio
        // int n = 2; // numbers of terms

        // 11
        // int a = 5;
        // int b = 3;
        // System.out.println(greatestOfTwoNum(a, b));

        // 12
        // int a = 3;
        // int b = 1;
        // int c = 6;
        // System.out.println(greatestOfThreeNum(a, b, c));

        // 13
        // leap year -skipped

        // 14
        // int Num = 472;
        // System.out.println(reverseDigits(Num));

        // 15
        // int num = 2746;
        // System.out.println(largestVSsmallest(num));

        // 16
        // int num = 5;
        // fibonacci(num);

        // 17
        int num = 5;
        System.out.println(fact(num));

    }
}