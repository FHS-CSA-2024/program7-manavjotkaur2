//import stuff here

//Your code here


import java.util.Scanner;
public class Program7{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        double schruteBucks = 0.0;
        double klevins = 0.0;
        double stanleyNickels = 0.0;
        double decimalSB = 0.0;
        
        System.out.println("Enter schrute-bucks: ");
        schruteBucks = myScanner.nextDouble();
        System.out.println("Enter klevins: ");
        klevins = myScanner.nextDouble();
        System.out.println("Enter stanley-nickels: ");
        stanleyNickels = myScanner.nextDouble();
        klevins = klevins/20.0;
        stanleyNickels=stanleyNickels/240;
        decimalSB = (schruteBucks + klevins + stanleyNickels) + 0.005;
        decimalSB = (int)(decimalSB*100);
        decimalSB = (double)(decimalSB/100);
        System.out.println("Decimal schrute-bucks: $" + decimalSB);
    }
}

//Paste console output below:
/*
Enter schrute-bucks: 
7
Enter klevins: 
17
Enter stanley-nickels: 
9
Decimal schrute-bucks: $7.89

*/
