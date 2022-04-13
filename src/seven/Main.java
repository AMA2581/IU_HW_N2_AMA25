package seven;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        StrReq checkString = new StrReq();
        Scanner input = new Scanner(System.in);

        String str1;
        String str2;

        System.out.print("Enter a string: ");
        str1 = input.nextLine();

        System.out.print("Enter a string: ");
        str2 = input.nextLine();

        input.close();

        if (checkString.checkStr(str1, str2)){
            System.out.print("Strings have same characters");
        }
        else{
            System.out.print("Strings have different characters");
        }
    }
    
}
