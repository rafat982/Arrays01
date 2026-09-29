import java.util.Scanner;

public class AssignGrades {

    static int  numberOfStudents = 0;
    static int[] studentScore = null;
    static int bestScore;

    public static void readStudentScore(){
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();

        System.out.println("Enter the number of students: ");
        numberOfStudents = scanner.nextInt();

        studentScore = new int[numberOfStudents];
        System.out.println("Enter " + numberOfStudents + " scores: ");
        for (int i=0; i<studentScore.length; ++i)
            studentScore[i] = scanner.nextInt();
    }

    public static void getBestScore(){
        bestScore = studentScore[0];
        for (int i=1; i<studentScore.length; ++i)
            if(studentScore[i] > bestScore)
                bestScore = studentScore[i];
    }

    public static void printStudentGrade(){
        for (int i=0; i<studentScore.length; ++i)
            System.out.println("Student "+ i +" score is "+ studentScore[i] +" and grade is "+);
    }

    public static void main(String[] args) {

    }

}
