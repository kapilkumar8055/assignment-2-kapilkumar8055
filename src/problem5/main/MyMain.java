package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.node.Node;
import problem5.student.Student;

import java.util.Scanner;

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
        System.out.println("Enter student name for removing");
        Scanner scanner = new Scanner(System.in);
        myCircularQueue.remove(scanner.next());

    }
}
