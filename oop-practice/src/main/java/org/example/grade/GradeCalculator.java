package org.example.grade;

import java.util.List;

public class GradeCalculator {

    private List<Course> courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = courses;
    }

    public double calculateAvgGrade(){
        return this.courses.stream().mapToDouble(
                course -> course.getCredit() * course.getGradeToNumber()
        ).sum();
    }
}
