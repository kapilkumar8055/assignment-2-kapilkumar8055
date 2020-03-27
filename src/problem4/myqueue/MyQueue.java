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
}
