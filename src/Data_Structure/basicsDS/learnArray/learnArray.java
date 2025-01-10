package Data_Structure.basicsDS.learnArray;

public class learnArray {

    public static void main(String[] args) {
        int[] arr = {21, 42, 0, 21, 1, 3, 12, 6, 2};
        int maxNumber = arr[0];

        for (int element : arr) {
            if (element > maxNumber) {
                maxNumber = element;
            }
        }
        System.out.println("Max number in the array is: " + maxNumber);

    }
}
