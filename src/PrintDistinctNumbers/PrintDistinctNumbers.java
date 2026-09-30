package PrintDistinctNumbers;

import java.util.Scanner;

public class PrintDistinctNumbers {

    static int[] listOfNumbers = new int[10];
    static int distinctIndex = -1;
    static int countOfDistinct = 0;

    public static void readNumbers(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 numbers:");
        int number;
        boolean numberExists;
        for (int numberOfInputs = 1; numberOfInputs<=10; ++numberOfInputs){

            //enter the number
            number = scanner.nextInt();

            //search for the number :
            numberExists = false;
            for(int i = 0; i<countOfDistinct; ++i){
                if(listOfNumbers[i] == number) {
                    numberExists = true;
                    break;
                }
            }

            //if number not exists then save it
            if(!numberExists){
                countOfDistinct++;
                distinctIndex++;
                listOfNumbers[distinctIndex] = number;
            }
        }

    }

    public static void printOutput(){

        System.out.println("The number of distinct numbers is " + countOfDistinct);

        String distinctNumbersString = "";
        for(int i = 0; i<countOfDistinct ; ++i){
            distinctNumbersString = distinctNumbersString + " " + listOfNumbers[i];
        }

        System.out.println("The distinct numbers are: " + distinctNumbersString);

    }

    public static void main(String[] args) {
        readNumbers();
        printOutput();
    }

}
