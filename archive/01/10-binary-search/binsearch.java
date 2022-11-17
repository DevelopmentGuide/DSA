import java.util.Arrays;

public class binsearch {
    public static void main(String[] args) {
        // binary search
        int array[] = new int[100];
        int target = 42;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int index = Arrays.binarySearch(array, target);

        if (index >= 0) {
            System.out.println("Found " + target + " at index " + index);
        } else {
            System.out.println("Could not find " + target);
        }

    }
}
