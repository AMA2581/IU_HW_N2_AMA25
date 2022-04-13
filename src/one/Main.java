package one;

import java.util.Scanner;

public class Main {

    private static String email;

    public static void main(String[] args){
        EmailCheck emailCheck = new EmailCheck();
        Scanner Input = new Scanner(System.in);

        System.out.print("enter your email address: ");
        email = Input.nextLine();
        Input.close();

        if(emailCheck.emailCheck(email)){
            System.out.println("Valid :) ");
        }

        else{
            System.out.println("Invalid :( ");
        }

    }
    
}
