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

    public int getSize(MyQueue q) {
        q.temp = q.front;
        while (q.temp != null) {
            ++size;
            q.temp = q.temp.getNext();
        }
        q.temp = q.front;
        return size;
    }

    public void enqueue(Node node) {

        if (front == null) {
            temp = front = end = node;
        } else {
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            end = node;
            temp.setNext(node);
            temp = front;
        }
    }

    public void print(MyQueue queue) {
        while (queue.temp != null) {
            System.out.print(queue.temp.getTreeNode().getData() + ",");
            queue.temp = queue.temp.getNext();
        }
        queue.temp = queue.front;
    }

    public void printTheSuccessor(int data) {
        temp = front;
        while (temp.getTreeNode().getData() != data && temp != null) {
            temp = temp.getNext();
        }
        try {
            assert temp != null;
            System.out.println(temp.getNext().getTreeNode().getData());
        } catch (Exception exception) {
            System.out.println("Pre-order Successor is not found");
        }
    }
}
