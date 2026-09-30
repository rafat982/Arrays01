package CountOccurenceOfNumbers;

import java.util.Scanner;

public class CountOccurenceOfNumbers {

    public static int[] listOfNumbers;

    public static void readNumbers(){
        Scanner scanner = new Scanner(System.in);
        listOfNumbers = new int[100];
        int number;

        System.out.println("Enter the integers between 1 and 100: ");
        while(true){
            number = scanner.nextInt();
            if(number == 0)
                break;
            listOfNumbers[number]++;
        }
    }

    public static void printNumbers(){
        for(int i = 0; i<listOfNumbers.length; ++i)
            if(listOfNumbers[i] > 0)
               System.out.println(i + " occures " + listOfNumbers[i] + (listOfNumbers[i] == 1 ? " time" : " times"));
    }

    public static void main(String[] args) {
        readNumbers();
        printNumbers();
    }


}
