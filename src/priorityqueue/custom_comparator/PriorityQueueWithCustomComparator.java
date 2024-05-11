package priorityqueue.custom_comparator;

import java.util.*;

public class PriorityQueueWithCustomComparator {
    public static void main(String[] args) {
        Comparator<Student> comparator = new NoteComparator();
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(comparator);

        List<Student> students = Arrays.asList(
                new Student("Ayoub", 19),
                new Student("Ahmed", 20),
                new Student("Imad", 5),
                new Student("Samir", 11));

        priorityQueue.addAll(students);


        Iterator<Student> iterator = priorityQueue.iterator();

        while(iterator.hasNext()){
            System.out.print(priorityQueue.poll().getName() + " ");
        }

    }
}
