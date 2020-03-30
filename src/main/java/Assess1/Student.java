package Assess1;

import java.util.Arrays;

public class Student {

    // Fields
    private String firstName;
    private String lastName;
    private Double[] scores;

    //Default Constructor
    public Student(){}
    // Constructor
    public Student(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter and Setter Methods
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Double[] getScores() {
        return scores;
    }
    public void setScores(Double[] scores) {
        this.scores = scores;
    }

    // To String Method
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", scores=" + Arrays.toString(scores) +
                '}';
    }

    //  Method to print exam scores
//    public String scoreArr(double[] scores){
//        return firstName + "\'s score are " + (Arrays.toString(scores));
//    }
    // Method to calculate total scores
    public String getTotalScores(double [] scores){
        int sum = 0;
        for(int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
        return firstName + "\'s total score is: " + sum;
    }

    // Method to calculate average
    public String calculateAverageGrade(double [] scores){
        int sum = 0;
        int avg;
        for(int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
        avg = sum / scores.length;
        return firstName + "\'s average score is: " + avg;
    }

}
