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

    public static void main(String argsp[]) {

        // 1
        int number = 1331;
        System.out.println(palindrom(number));

    }
}