package priorityqueue.custom_comparator;

import java.util.Comparator;

public class NoteComparator implements Comparator<Student> {

    @Override

    // in descending order
    public int compare(Student o1, Student o2) {
        return o2.getNote() - o1.getNote();
    }
}
