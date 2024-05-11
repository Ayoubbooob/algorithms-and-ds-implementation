import priorityqueue.MyPriorityQueue;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyPriorityQueue myPriorityQueue = new MyPriorityQueue();

        List<Integer> items = new ArrayList<>();

        items.add(12);
        items.add(45);
        items.add(10);
        items.add(0);
        items.add(4);
        items.add(5);

        myPriorityQueue.addItemsToProprietyQueue(items);


        myPriorityQueue.printMyQueueButEmptiedIt();

        myPriorityQueue.addItemsToProprietyQueue(items);

        myPriorityQueue.printMyQueueButNotEmptiedIt();

        System.out.println(myPriorityQueue.getHeadElement());
        System.out.println(myPriorityQueue.retrieveAndRemoveHeadElement());

        myPriorityQueue.printMyQueueButEmptiedIt();
    }
}