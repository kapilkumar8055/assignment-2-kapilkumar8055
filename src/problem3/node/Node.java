/*
 *  Created by IntelliJ IDEA.
 *  User: Kapil Kumar
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.node;

public class Node {
    private int data;
    private Node next;
    private int priority;

    public Node(int data, int priority) {
        this.data = data;
        this.priority = priority;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
