public class ins {
    public static void main(String[] args) {
        int array[] = { 3, 4, 1, 2 };
        insertionSort(array);
        for (int i : array) {
            System.out.print(i);
        }
    }

    public static void insertionSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > temp) {
                array[j] = array[j - 1];
                j--;
            }
            array[j + 1] = temp;

        }
    }
}
