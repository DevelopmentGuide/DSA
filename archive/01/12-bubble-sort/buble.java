public class buble {
    public static void main(String[] args) {
        int array[] = { 3, 4, 1, 2 };
        bubbleSort(array);
        for (int i : array) {
            System.out.print(i);
        }
    }

    public static void bubbleSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length; j++) {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }
}
