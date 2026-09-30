package assigngrade;

import java.util.Scanner;

public class AssignGrades {

    static int[] studentScore = null;
    static char[] grades = {'A', 'B', 'C', 'D', 'F'};

    public static void readStudentScore(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        studentScore = new int[numberOfStudents];
        System.out.println("Enter " + numberOfStudents + " scores: ");
        for (int i=0; i<studentScore.length; ++i)
            studentScore[i] = scanner.nextInt();
    }

    public static int getBestScore(){
        int bestScore = studentScore[0];

        for (int i=1; i<studentScore.length; ++i)
            if(studentScore[i] > bestScore)
                bestScore = studentScore[i];

        return bestScore;
    }

    public static char getGradeByScore(int score){
        int bestScore = getBestScore();
        return grades[ Math.min((bestScore-score-1) / 10, 4) ] ;
        /*
        if(score >= bestScore - 10)
            return 'A';
        else if(score >= bestScore - 20)
            return 'B';
        else if(score >= bestScore - 30)
            return 'C';
        else if(score >= bestScore - 40)
            return 'D';
        else
            return 'F';
         */
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
