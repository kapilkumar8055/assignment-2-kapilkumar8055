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
}
