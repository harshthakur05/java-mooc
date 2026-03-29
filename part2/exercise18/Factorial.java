package part2.exercise18;

import java.util.Scanner;

public class Factorial {
    

    public class FactorialProgram {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Give a number: ");
            int n = Integer.parseInt(sc.nextLine());

            long factorial = 1;

            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            System.out.println("Factorial: " + factorial);

            sc.close();
        }
    }
        
    
}
