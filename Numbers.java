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

    public static void main(String argsp[]) {

        // 1
        // int number = 1331;
        // System.out.println(palindrom(number));

        // 2
        int min = 10;
        int max = 50;
        palindromInRange(min, max);

    }
}