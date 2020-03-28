package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.node.Node;
import problem5.student.Student;

//executable class
public class MyMain {
    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue();
        Node node;
        for (int i = 1; i < 10; i++) {
            node = new Node(new Student());
            myCircularQueue.enqueue(node);
        }
        myCircularQueue.printQueue();
    }
}
