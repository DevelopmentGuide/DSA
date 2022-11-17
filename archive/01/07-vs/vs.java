import java.util.ArrayList;
import java.util.LinkedList;

class vs {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long duration;

        for (int i = 0; i < 100000; i++) {
            list1.add(i);
            list2.add(i);
        }

        startTime = System.nanoTime();
        list1.get(0);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList: " + duration);

        startTime = System.nanoTime();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList: " + duration);
    }
}
