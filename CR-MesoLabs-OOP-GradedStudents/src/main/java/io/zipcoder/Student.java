package io.zipcoder;
import java.util.ArrayList;

public class Student {

    //variables
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;
    private int totalExams;

    //Student Constructor
    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.examScores = examScores;
        }
        public String getFirstName(){
            return this.firstName;
        }
        public void setFirstName(String firstName){
            this.firstName = firstName;
        }
        public String getLastName(){
            return this.lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String printTestScores() {
            StringBuilder printTestScores = new StringBuilder();
            printTestScores.append("Exam Scores: \n");
        }
    }

}
