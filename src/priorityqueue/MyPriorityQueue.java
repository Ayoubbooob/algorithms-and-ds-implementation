package priorityqueue;

import java.util.List;
import java.util.PriorityQueue;

public class MyPriorityQueue {

    PriorityQueue<Integer> priorityQueue;
    public MyPriorityQueue(){
        priorityQueue = new PriorityQueue<>();
    }

    public MyPriorityQueue(int capacity){
        priorityQueue = new PriorityQueue<>(capacity);
    }

    public void printMyQueueButEmptiedIt(){
        while(!priorityQueue.isEmpty()){
            System.out.print(priorityQueue.poll() + " ");
        }
        System.out.println();
    }

    public void printMyQueueButNotEmptiedIt(){
        for(Integer item : priorityQueue){
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public void addItemsToProprietyQueue(List<Integer> items){
        priorityQueue.addAll(items);
    }

    public Integer getHeadElement(){
        return priorityQueue.peek();
    }

    public Integer retrieveAndRemoveHeadElement(){
        return priorityQueue.poll();
    }
}
