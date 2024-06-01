package org.example;

import org.example.grade.Course;
import org.example.grade.GradeCalculator;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GradeCalculateTest {


    @Test
    void calculateGradeTest() {
        List<Course> courses = List.of(
                new Course("oop", 3, "A+"),
                new Course("test", 3, "A+")
                );

        GradeCalculator gradeCalculator = new GradeCalculator(courses);
        double gradeResult = gradeCalculator.calculateAvgGrade();
        assertThat(gradeResult).isEqualTo(4.5);

    }
}
