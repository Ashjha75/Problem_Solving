package Data_Structure.basicsDS.learnArray;

public class learnArray {

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int[] arr2 = {0, 1, 0, 3, 12};
        int maxNumber = findMaxNumber(arr);
        System.out.println("Max number in the array is: " + maxNumber);

        int secondLargest = findSecondLargestNumber(arr);
        System.out.println("Second largest number in the array is: " + secondLargest);

        boolean isSortedAndRotated = isSortedAndRotated(arr);
        System.out.println("Array is sorted and rotated: " + isSortedAndRotated);

        int k = 3;
        rotateArray(arr, k);
        System.out.println("Array after rotating by " + k + " steps: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }

        moveZerosToEnd(arr2);
        System.out.println("\nArray after moving zeros to the end: ");
        for (int element : arr2) {
            System.out.print(element + " ");
        }


    }

    // Find the maximum number in the array
    public static int findMaxNumber(int[] arr) {
        int maxNumber = arr[0]; // Initialize maxNumber with the first element
        for (int element : arr) {
            if (element > maxNumber) {
                maxNumber = element; // Update maxNumber if the current element is greater
            }
        }
        return maxNumber;
    }

    // Find the second largest number in the array without sorting
    public static int findSecondLargestNumber(int[] arr) {
        int largest = arr[0]; // Initialize largest with the first element
        int secondLargest = -1; // Initialize secondLargest with -1

        for (int element : arr) {
            if (element > largest) {
                secondLargest = largest; // Update secondLargest before updating largest
                largest = element; // Update largest with the current element
            } else if (element < largest && element > secondLargest) {
                secondLargest = element; // Update secondLargest if the current element is between largest and secondLargest
            }
        }
        return secondLargest;
    }

    // Check if the array is sorted and rotated
    public static boolean isSortedAndRotated(int[] arr) {
        int count = 0; // Initialize count to keep track of order violations
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[(i + 1) % arr.length]) {
                count++; // Increment count if the current element is greater than the next element (considering circular array)
            }
        }
        return count <= 1; // Return true if there is at most one order violation
    }

    // Rotate the array to the right by k steps
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k is greater than the length of the array
        reverseArray(arr, 0, n - 1); // Reverse the entire array
        reverseArray(arr, 0, k - 1); // Reverse the first k elements
        reverseArray(arr, k, n - 1); // Reverse the remaining elements
    }

    // Reverse the elements of the array between start and end indices
    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start]; // Swap the elements at start and end
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Move all zeros in the array to the end while maintaining the order of non-zero elements
    public static void moveZerosToEnd(int[] arr) {
        int n = arr.length; // Get the length of the array
        int count = 0; // Initialize count to keep track of the position for non-zero elements

        // Loop through each element in the array
        for (int i = 0; i < n; i++) {
            // If the current element is not zero
            if (arr[i] != 0) {
                // Swap the current element with the element at the 'count' index
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                // Increment the count to the next position
                count++;
            }
        }
    }

    //        Union of 2 arrays
    public static void unionOfArrays(int[] arr1, int[] arr2) {


    }
}