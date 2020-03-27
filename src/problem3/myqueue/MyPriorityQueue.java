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

    }
}
