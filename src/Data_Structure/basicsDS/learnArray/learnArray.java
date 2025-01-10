package Data_Structure.basicsDS.learnArray;

import java.util.Arrays;

public class learnArray {

    public static void main(String[] args) {
        int
        int[] arr = {21, 42, 0, 21, 1, 3, 12, 6, 2};
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
    }
}
