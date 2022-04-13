package ten;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        GetPower power = new GetPower();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        double base = input.nextDouble();

        System.out.print("Enter exponent: ");
        double exponent = input.nextDouble();

        input.close();

        if (exponent > 0){
            System.out.println(power.power(base, exponent));
        }
    }
}
