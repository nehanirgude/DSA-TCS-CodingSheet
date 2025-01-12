import java.util.*;
import java.util.Arrays;

public class Arrayss {

    // method to print smallest number in array
    // int arr[]={2,5,1,3,0}; output=0

    public static int smallestNum(int arr[]) {
        int minNum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (minNum > arr[i]) {
                minNum = arr[i];
            }
        }
        return minNum;

    }

    // Problem Statement: Given an array, we have to find the largest element in the
    // array.
    public static int largestNum(int arr[]) {

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    // Problem Statement: Given an array, find the second smallest and second
    // largest element in the array. Print ‘-1’ in the event that either of them
    // doesn’t exist.

    public static void secondLargestAndSmallest(int arr[]) {

        Arrays.sort(arr);
        // // brute force
        // System.out.println("second smallest is" + arr[1]);
        // System.out.println("'second largest " + arr[arr.length - 2]);

        // another approach
        int smallest = arr[0];
        int secondSmallest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smallest) {
                secondSmallest = arr[i];
                break;
            }
        }

        // second largest

        int largest = arr[arr.length - 1];
        int secondLargest = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < largest) {
                secondLargest = arr[i];
                break;

            }
        }
        System.out.println(secondLargest + " " + secondSmallest);

    }

    // reverse the arrays

    public static void reverseArr(int arr[]) {

        int n = arr.length;
        int i = 0;
        int j = n - 1;
        int temp = 0;

        while (i > j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
    // Problem statement: Given an array, we have found the number of occurrences of
    // each element in the array.

    public static void numOccurence(int arr[]) {
        // int ten = 0;
        // int five = 0;
        // int fifteen = 0;
        // for (int i = 0; i < arr.length; i++) {

        // if (arr[i] == 10) {
        // ten++;
        // }
        // if (arr[i] == 5) {
        // five++;
        // }
        // if (arr[i] == 15) {
        // fifteen++;
        // }
        // }

        // System.out.println(ten + " " + five + " " + fifteen);

        int n = arr.length;
        int i = 0;
        while (i < n) {

            int element = arr[i];
            int count = 0;
            while (i < n && element == arr[i]) {
                count++;
                i++;
            }
            System.out.println(element + " " + count);
        }

    }

    // Problem Statement: Rearrange the array such that the first half is arranged
    // in increasing order, and the second half is arranged in decreasing order
    public static void rearrangeNum(int arr[]) {

        Arrays.sort(arr);
        int si = 0;
        int ei = arr.length - 1;
        int mid = (si + ei) / 2;

        int temp;

        for (int i = mid + 1; i < arr.length - 1; i++) {
            temp = arr[i];
            arr[i] = arr[ei];
            arr[ei] = temp;
            ei--;
        }

    }
    // Problem Statement: Given an array, we have to find the sum of all the
    // elements in the array.

    public static int arrSum(int arr[]) {

        int sum = 0;
        for (int i = 0; i <= arr.length; i++) {
            sum += i;
        }
        return sum;
    }

    // Problem Statement: Given an array of n size, rotate the array by k elements
    // using the Block Swap Algorithm.
    // Example 1:
    // Input: N = 5, array[] = {1,2,3,4,5} K=2
    // Output: {3,4,5,1,2}
    // Explanation: Rotate the array to right by 2 elements.

    public static void rotateArr(int arr[], int k) {
        int n = arr.length - 1;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k + 1);
        reverse(arr, k, n - 1);

    }

    public static void reverse(int arr[], int si, int ei) {

        while (si <= ei) {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }

    // Problem Statement: Given an array, we have to find the average of all the
    // elements in the array.
    public static int averageOfArr(int arr[]) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int average = sum / n;
        return average;

    }

    // Problem Statement: Given an unsorted array, find the median of the given
    // array.
    public static int median(int arr[]) {

        Arrays.sort(arr);

        int si = 0;
        int ei = arr.length - 1;

        int mid = si + ei / 2;
        return arr[mid];

    }

    // Problem Statement: Given an integer array sorted in non-decreasing order,
    // remove the duplicates in place such that each unique element appears only
    // once. The relative order of the elements should be kept the same.

    public static void removeDuplicate(int arr[]) {

        int writeIdx = 0; // to track position of next unique element

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {

                arr[writeIdx] = arr[i];
                writeIdx++;
            }
        }

        for (int i = 0; i < writeIdx; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String args[]) {

        // 1
        // int arr[] = { 2, 5, 1, 3, 0 };
        // System.out.println(smallestNum(arr));

        // 2
        // int arr[] = { 2, 5, 1, 3, 0 };
        // System.out.println(largestNum(arr));

        // 3
        // int arr[] = { 1, 2, 4, 7, 7, 5 };
        // secondLargestAndSmallest(arr);

        // 4
        // int arr[] = { 5, 4, 3, 2, 1 };
        // reverseArr(arr);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // 5
        // int arr[] = { 10, 5, 10, 15, 10, 5 };
        // numOccurence(arr);

        // 6
        // int arr[] = { 8, 7, 1, 6, 5, 9 };
        // rearrangeNum(arr);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // 7
        // int arr[] = { 1, 2, 3, 4, 5 };
        // System.out.println(arrSum(arr));

        // 8
        // int arr[] = { 1, 2, 3, 4, 5 };
        // int k = 2;
        // rotateArr(arr, k);

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i]);
        // }

        // 9
        // int arr[] = { 1, 2, 3, 4, 5 };
        // System.out.println(averageOfArr(arr));

        // 10
        // int arr[] = { 2, 4, 1, 3, 5 };
        // System.out.println(median(arr));

        // 11
        int arr[] = { 1, 1, 2, 2, 2, 3, 3 };
        removeDuplicate(arr);

    }
}