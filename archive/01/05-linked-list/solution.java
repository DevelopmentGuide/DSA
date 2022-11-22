import java.util.LinkedList;

class LinkedLists {
    public static void main(String[] args) {
        // linked list
        LinkedList<Integer> list = new LinkedList<>();
        list.push(1);
        list.push(2);
        list.push(4);

        // print the list
        System.out.println("Linked List: ");
        System.out.println(list);
        System.out.println(list.indexOf(2));
    }
}