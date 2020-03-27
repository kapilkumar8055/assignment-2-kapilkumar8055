package problem4.myqueue;
// to create queue to store pre - order successor

public class MyQueue {
    private Node front;
    private Node temp;
    private Node end;
    private int size;

    public MyQueue() {
        front = null;
        end = null;
        temp = null;
        size = 0;
    }

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

    public Node getEnd() {
        return end;
    }

    public void setEnd(Node end) {
        this.end = end;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
