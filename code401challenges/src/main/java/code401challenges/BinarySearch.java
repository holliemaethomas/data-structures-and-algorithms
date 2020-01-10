package code401challenges;

public class BinarySearch {
    public static int binarySearch(int[] arr, int searchNumber) {
        int startingIndex = 0;
        int endIndex = arr.length - 1;
     while (startingIndex <= endIndex) {
         int middleIndex = (startingIndex + endIndex) / 2;
         if (arr[middleIndex] == searchNumber) return middleIndex;
         else if (arr[middleIndex] < searchNumber)  startingIndex = middleIndex + 1;
         else endIndex = middleIndex -1;
     }
     return -1;
    }
}