// queue implementation using linked list

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public static void main(String[] args) {

        // create a queue
        Queue<String> queue = new LinkedList<String>();

        // add elements to the queue
        queue.offer("one");
        queue.offer("two");
        queue.offer("three");

        // poll
        queue.poll();

        // print the queue
        System.out.println("Queue: " + queue);

        // peek
        System.out.println("Peek: " + queue.peek());

        // contains
        System.out.println("Contains: " + queue.contains("one"));
        System.out.println("Contains: " + queue.contains("two"));

    }
}