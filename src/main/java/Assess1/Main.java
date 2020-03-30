package Assess1;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Create an Array of scores
        Double[] scores = {45.0, 55.0, 65.0};

        //Create a student Object
        Student stud1 = new Student("Mike", "Jones", scores);

        //Print the student Object
        System.out.println(stud1.toString());

        //Print exam scores
        System.out.println(Arrays.toString(scores));
        //Calculate average of grades
        System.out.println(stud1.getTotalScores(scores));
        //Calculate average of grades
        System.out.println(stud1.calculateAverageGrade(scores));
    }

//    OUTPUT in Main
//
//    Student{firstName='Mike', lastName='Jones', scores=[69.0, 78.0, 88.0]}
//    Mike's scores are :[69.0, 78.0, 88.0]
//    Mike's total score is :235.0
//    Mike's average score is :78.33333333333333

}
