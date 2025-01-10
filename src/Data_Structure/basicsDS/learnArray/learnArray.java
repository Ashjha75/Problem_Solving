package Data_Structure.basicsDS.learnArray;

public class learnArray {

    public static void main(String[] args) {
        // Array declaration
        int[] arr = new int[5];
        // Array initialization
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        // Accessing elements of an array
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        // Array traversal
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
