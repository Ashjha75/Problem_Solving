package Data_Structure.basicsDS.learnArray;

public class learnArray {

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int maxNumber = findMaxNumber(arr);
        System.out.println("Max number in the array is: " + maxNumber);

        int secondLargest = findSecondLargestNumber(arr);
        System.out.println("Second largest number in the array is: " + secondLargest);

        boolean isSortedAndRotated = isSortedAndRotated(arr);
        System.out.println("Array is sorted and rotated: " + isSortedAndRotated);
    }

    //    find max number optimal solutions
    public static int findMaxNumber(int[] arr) {
        int maxNumber = arr[0];
        for (int element : arr) {
            if (element > maxNumber) {
                maxNumber = element;
            }
        }
        return maxNumber;
    }

    //    find second largest or smallest number in the array without sorting
    public static int findSecondLargestNumber(int[] arr) {
        int largest = arr[0];
        int secondLargest = -1;

        for (int element : arr) {
            if (element > largest) {
                secondLargest = largest;
                largest = element;
            } else if (element < largest && element > secondLargest) {
                secondLargest = element;
            }
        }
        return secondLargest;
    }

    //    check array is sorted and rotated
    public static boolean isSortedAndRotated(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[(i + 1) % arr.length]) {
                count++;
            }
        }
        return count <= 1;
    }
}