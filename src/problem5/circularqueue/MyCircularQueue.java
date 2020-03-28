package problem5.circularqueue;

import problem5.node.Node;

//to implement circular queue
public class MyCircularQueue {
    private Node front;
    private Node temp;
    private Node end;

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getTemp() {
        return temp;
    }

    public void setTemp(Node temp) {
        this.temp = temp;
    }

    public MyCircularQueue() {
        temp = null;
        end = null;
        front = null;
    }

    public void printQueue() {
        temp = front;
        try {
            do {
                System.out.println(temp.getStudent().toString());
                temp = temp.getNext();
            }
            while (temp != front && temp != null);
        } catch (Exception ignored) {
        }
    }
    public void enqueue(Node node) {
        if (front == null) {
            temp = front = node;
            return;
        }
        if (temp.getNext() == null) {
            temp.setNext(node);
            node.setNext(temp);
            end = node;
            return;
        }
        node.setNext(temp.getNext());
        temp.setNext(node);
    }
    public void processing(String name) {
        temp = front;
        if (temp.getStudent().getStudentName().equals(name)) {
            System.out.println(temp.getStudent().toString());
            System.out.println(temp.getStudent().getBacklog() - temp.getStudent().getAppearingCount());
        }
        while (!temp.getStudent().getStudentName().equals(name)) {
            temp = temp.getNext();
            if (temp == front)
                return;
        }
        System.out.println(temp.getStudent().toString());
        System.out.println(temp.getStudent().getBacklog() - temp.getStudent().getAppearingCount());
    }

    public void remove(String name) {
        temp = front;
        if (temp.getStudent().getStudentName().equals(name) && temp.getStudent().getBacklog() == 0) {
            temp = front = front.getNext();
        }
        while (!temp.getNext().getStudent().getStudentName().equals(name)) {
            temp = temp.getNext();
            if (temp == front)
                return;
        }
        if (temp.getStudent().getBacklog() == 0) {
            temp.setNext(temp.getNext().getNext());
        }
    }
}
