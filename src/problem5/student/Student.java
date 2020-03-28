package problem5.student;

import java.util.Scanner;

// to store student information and properties
public class Student {
    private String studentName;
    private int studentRollNo;
    private int backlog;
    private int appearingCount;
    private Scanner scanner;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentRollNo() {
        return studentRollNo;
    }

    public void setStudentRollNo(int studentRollNo) {
        this.studentRollNo = studentRollNo;
    }

    public int getBacklog() {
        return backlog;
    }

    public void setBacklog(int backlog) {
        this.backlog = backlog;
    }

    public int getAppearingCount() {
        return appearingCount;
    }

    public void setAppearingCount(int appearingCount) {
        this.appearingCount = appearingCount;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentRollNo=" + studentRollNo +
                ", backlog=" + backlog +
                ", appearingCount=" + appearingCount +
                '}';
    }
}
