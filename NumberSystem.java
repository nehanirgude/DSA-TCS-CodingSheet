import java.util.*;

public class NumberSystem {

    // 1
    // method to convert binary to decimal
    public static int binaryToDecimal(int BinNum) {

        int decNum = 0;
        int count = 0;
        while (BinNum > 0) {

            int lastDigit = BinNum % 10;
            decNum = decNum + (int) Math.pow(2, count) * lastDigit;
            BinNum = BinNum / 10;
            count++;

        }
        return decNum;

    }

    public static void main(String args[]) {

        // 1
        int BinNum = 1011;
        System.out.println(binaryToDecimal(BinNum));
    }
}
