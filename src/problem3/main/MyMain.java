/*
 *  Created by IntelliJ IDEA.
 *  User: Kapil Kumar
 *  Date: 23-Mar-20
 *  Time: 8:18 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue myPriorityQueue = new MyPriorityQueue();
        myPriorityQueue.insert(100, 1);
        myPriorityQueue.insert(200, 3);
        myPriorityQueue.insert(500, 6);
        myPriorityQueue.insert(400, 4);
        myPriorityQueue.display();
    }
}
