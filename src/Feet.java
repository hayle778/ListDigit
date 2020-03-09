//Write a program in Java to display n terms of natural numbers and their sum.//
import java.util.Scanner;

public class Feet {
public static void main(String[]add) {

        int u;

        Scanner input = new Scanner(System.in);
        System.out.println("Input number: ");
        u = input.nextInt();

        // when we say+
       int sum = 0;
        int i;
       // i = 1,2,3,4,5,6;

        for (i = 0; i <= u; i++) {
            System.out.println("" + i);
           sum+= i;
        }
        System.out.println("Adding those numbers: "  + sum  );
        System.out.println("The number that I add: " + i  );
    }
}

