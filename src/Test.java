import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        ///Scanner scanner = new Scanner(System.in);
        String[] std = new String[5];
        std[0] = "95;Rafat";
        std[1] = "40;Mostafa";
        std[2] = "85;Laith";
        std[3] = "55;Osama";
        std[4] = "75;Moath";

        Arrays.sort(std);

        for(int i=std.length-1; i>=0;--i)
            System.out.println(std[i]);
    }

}
