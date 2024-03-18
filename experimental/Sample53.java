
package Project7;
import java.util.*;
public class Sample53 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int bc[]={12,44,55,16,52};
        System.out.print("Element to Find: ");
        int a=input.nextInt();
        
        
        for(int i=0;i<=bc.length-1;i++){
            if(a==bc[i]){
            System.out.printf("Element found at %d\n",i);
            }
            
        }
        
    }
}
