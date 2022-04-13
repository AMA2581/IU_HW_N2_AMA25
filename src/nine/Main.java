package nine;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        NumberPrint numPrint = new NumberPrint();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        input.close();

        if (n > 0){
            
            for(int i = 0; i < n; i++) {
                System.out.println(numPrint.numPrint());
            }
        }

        else{
            System.out.println("INVALID!!!");
        }
    }
}
