public class linsearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int key = 5;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }
        if (index == 0) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index " + index);
        }
    }
}
