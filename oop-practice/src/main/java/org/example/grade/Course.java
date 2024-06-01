package org.example.grade;

public class Course {
    private String subject;
    private int credit;
    private String grade;

    public Course(String subject, int credit, String grade) {
        this.subject = subject;
        this.credit = credit;
        this.grade = grade;
    }

    public int getCredit() {
        return credit;
    }

    public double getGradeToNumber(){
        return Double.parseDouble(grade);
    }
}
