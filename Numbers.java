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

    // print power of given num
    public static int power(int x, int n) {

        int pwr = (int) Math.pow(x, n);
        return pwr;
    }
    // Problem Statement: Find all factors of a number or find all distinct divisors
    // of a natural number.

    public static void factors(int n) {

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ,");
            }
        }
    }
    // Problem Statement: Given an integer Print “YES” if it is a strong number else
    // print “NO”.

    public static int Factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // Function to compute sum of factorials
    public static int Strong_No(int num) {
        int sum = 0;

        // Extract all the digits from num
        while (num > 0) {
            int digit = num % 10;
            sum = sum + Factorial(digit);
            num = num / 10;
        }
        return sum;
    }
    // Problem Statement: Given a number, check if it is automorphic or not. A
    // number is called an Automorphic number if and only if its square ends in the
    // same digits as the number itself.

    public static boolean automorphic(int n) {

        int prod = n * n;

        while (n > 0) {
            if (prod % 10 != n % 10) {
                return false;
            }

            prod = prod / 10;
            n = n / 10;
        }
        return true;

    }
    /*
     * /
     * Example 1:
     * Input:N1 = 9, N2 = 12
     * 
     * Output:3
     * Explanation:Factors of 9: 1, 3 and 9
     * Factors of 12: 1, 2, 3, 4, 6, 12
     * Common Factors: 1, 3 out of which 3 is the greatest hence it is the GCD.
     */

    public static int GCD(int n1, int n2) {

        // factors of 9
        int gcd = 1;
        // Iterate from 1 up to
        // the minimum of n1 and n2
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            // Check if i is a common
            // factor of both n1 and n2
            if (n1 % i == 0 && n2 % i == 0) {
                // Update gcd to the
                // current common factor i
                gcd = i;
            }
        }
        return gcd;

    }

    // LCM
    public static void LCM(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        int lcm = (a * b) / gcd;
        System.out.print("The LCM of the two given numbers is " + lcm);

    }

    // check wether the number is harshad number or not
    // Explanation: 3+7+8=18. 378 is divisible by 18. Therefore 378 is a harshad
    // number.
    public static void harshad(int n) {
        int duplicate = n;
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            n = n / 10;
        }
        if (duplicate % sum == 0) {
            System.out.println("number is harshad number");
        } else {
            System.out.println("number is not harshad number");
        }
    }

    // check the number is abudant number or not
    // Explanation: Divisors of 18 are 1,2,3,6,9. 1+2+3+6+9=21, Since 21 is greater
    // than 18, 18 is an abundant number.

    public static void abudant(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        sum -= n;
        if (sum > n) {
            System.out.println("number is abudant number");

        } else {
            System.out.println("number is not abudant number");
        }

    }

    // sum of digits of the number
    public static int sumOfDigitsInRange(int l, int r) {
        int sum = 0;

        for (int i = l; i <= r; i++) {
            sum += i;

        }
        return sum;
    }

    public static int sum(int n) {
        int summ = 0;
        while (n > 0) {
            int ld = n % 10;
            summ += ld;
            n = n / 10;
        }
        return summ;
    }

    // Problem Statement: Find the sum of numbers in the given range.

    // 32
    // Problem Statement: Find permutations in which n people can occupy r seats in
    // a classroom.

    public static void permutations(int n, int r) {

        int nfact = 1;
        for (int i = 1; i <= n; i++) {
            nfact *= i;
        }

        int nmr = n - r;
        int nmrfact = 1;
        for (int i = 1; i <= nmr; i++) {
            nmrfact *= i;
        }

        int result = nfact / nmrfact;
        System.out.println(result);

    }
    // 34
    // Problem Statement: You are given an integer. Your task is to replace all the
    // zeros in the integer with ones.

    // skipped

    // 35
    // find the area of the circle
    public static double areaOfCircle(int r, double pie) {

        // formula pi r square
        int square = r * r;
        double area = pie * square;
        return area;

    }

    // 36
    // find the roots of quadratic equations

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
        // int num = 5;
        // System.out.println(fact(num));

        // 18
        // int x = 2;
        // int n = 5;
        // System.out.println(power(x, n));

        // 19
        // int n = 6;
        // factors(n);

        // 20
        // int number = 145;
        // int answer = Strong_No(number);

        // if (answer == number && number != 0) {

        // System.out.println("YES");
        // } else {
        // System.out.println("NO");
        // }

        // 21
        // int n = 76;
        // System.out.print(automorphic(n));

        // 22
        // int n1 = 9;
        // int n2 = 12;
        // System.out.println(GCD(n1, n2));

        // 23
        // int a = 4;
        // int b = 8;
        // LCM(a, b);

        // 24
        // int n = 379;
        // harshad(n);

        // 28
        // int n = 21;
        // abudant(n);

        // 30
        // int n = 472;
        // System.out.println(sum(n));

        // 31
        // int l = 2;
        // int r = 7;
        // System.out.println(sumOfDigitsInRange(l, r));

        // 32
        // int n = 5;
        // int r = 3;
        // permutations(n, r);

        // 33
        // skipped

        // 34
        // int n = 102003;

        // 35
        // int r = 5;
        // double pie = 3.14;
        // System.out.println(areaOfCircle(r, pie));

    }
}