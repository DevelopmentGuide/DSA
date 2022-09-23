// queue implementation using priority list

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public static void main(String[] args) {

        // create a queue
        Queue<Double> queue = new LinkedList<>();

        // add elements to the queue
        queue.offer(3.1);
        queue.offer(4.6);
        queue.offer(3.5);

        // print the queue
        System.out.println("Queue: ");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        // create a priority queue
        Queue<Double> newQueue = new PriorityQueue<>(Collections.reverseOrder());

        // add elements to the newQueue
        newQueue.offer(3.1);
        newQueue.offer(4.6);
        newQueue.offer(3.5);

        // print the newQueue
        System.out.println("Priority Queue: ");
        while (!newQueue.isEmpty()) {
            System.out.println(newQueue.poll());
        }
    }
}