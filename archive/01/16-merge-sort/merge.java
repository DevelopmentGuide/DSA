public class merge {
    public static void main(String[] args) {
        int array[] = { 4, 2, 3, 1 };

        mergeSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1)
            return;

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0, j = 0;

        for (; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
            mergeSort(leftArray);
            mergeSort(rightArray);
            merge(leftArray, rightArray, array);
        }
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;

        int i = 0, l = 0, r = 0;

        while (l < leftSize && r < rightSize) {
            if (leftArray[i] < rightArray[r]) {
                array[i] = leftArray[i];
                i++;
            } else {
                array[i] = rightArray[r];
                r++;
            }
        }
        while (l < leftSize) {
            array[i] = leftArray[i];
            i++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            r++;
        }
    }
}
