/*
 *  Created by IntelliJ IDEA.
 *  User: Kapil kumar
 *  Date: 23-Mar-20
 *  Time: 7:25 PM
 */
package problem3.myqueue;

import problem3.node.Node;

public class MyPriorityQueue {
    private Node front;
    private Node rear;

    public MyPriorityQueue() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void insert(int data, int priority) {
        Node node = new Node(data, priority);
        if (isEmpty() || node.getPriority() < front.getPriority()) {
            node.setNext(front);
            front = node;
        } else {
            Node temp = front;
            while (temp.getNext() != null && temp.getNext().getPriority() <= node.getPriority()) {
                temp = temp.getNext();
            }
            node.setNext(temp.getNext());
            temp.setNext(node);
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("underflow");
        } else {
            Node temp = front;
            while (temp != null) {
                System.out.println("Data " + temp.getData() + "Priority " + temp.getPriority());
                temp = temp.getNext();
            }
        }
    }
}
