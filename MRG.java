

import java.util.*;
public class MRG{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String str1="++ Mind Reading Game in Java ++\n";
        System.out.printf("%n%-1s%n",str1);

        System.out.print("Hit Enter to Continue...");
        input.nextLine();

        String str2= "\nThink of any one or two digit number in your mind,\njust keep it in mind for later use.\n";
        System.out.printf("%-1s",str2);
        
        System.out.print("\nHit Enter to Continue...");
        input.nextLine();
        
        System.out.println("\nNow, Double the number you thought in your mind.");
        System.out.print("\nHit Enter to Continue...");
        input.nextLine();
        
        System.out.println("\nNow add 6 to your number & divide it by 2, \nand name the result N");
        System.out.print("\nHit Enter to Continue...");
        input.nextLine();
        
        String str3="Now from this number N \nsubtract the very initial number \nwhich you thought in your mind, \nyour answer should be 3";        
        System.out.printf("%n%-1s%n%n",str3);
        
        System.out.println("Thank You..\n");
        
        System.out.print("Hit Enter to Exit...");
        input.nextLine();
        
    }
}