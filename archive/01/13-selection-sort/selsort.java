public class selsort {
    public static void main(String[] args) {
        int array[] = { 3, 4, 1, 2 };
        selectionSort(array);
        for (int i : array) {
            System.out.print(i);
        }
    }

    public static void selectionSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
}
