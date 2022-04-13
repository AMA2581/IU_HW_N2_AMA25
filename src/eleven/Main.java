package eleven;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        StrReq strCheck = new StrReq();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string to check: ");
        String str = input.nextLine();

        input.close();

        if (strCheck.reverse(str)){
            System.out.println("string met the requirement");
        }

        else{
            System.out.println("string didn't met the requirement");
        }
    }
}
