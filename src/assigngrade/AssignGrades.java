package assigngrade;

import java.util.Scanner;

public class AssignGrades {

    static int[] studentScore = null;
    static char[] grades = {'A', 'B', 'C', 'D', 'F'};
    static int bestScore = 0;

    public static void readStudentScore(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        studentScore = new int[numberOfStudents];
        System.out.println("Enter " + numberOfStudents + " scores: ");
        for (int i=0; i<studentScore.length; ++i) {
            studentScore[i] = scanner.nextInt();

            if(studentScore[i] > bestScore)
                bestScore = studentScore[i];
        }
    }

    public static char getGradeByScore(int score){
        return grades[ Math.min((bestScore-score-1) / 10, studentScore.length-1) ] ;
    }

    public static void printStudentGrade(){
        for (int i=0; i<studentScore.length; ++i)
            System.out.println("Student "+ i +" score is "+ studentScore[i] +" and grade is "+ getGradeByScore(studentScore[i]));
    }

    public static void main(String[] args) {
        readStudentScore();
        printStudentGrade();
    }

}
