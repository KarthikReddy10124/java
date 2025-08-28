
import java.util.Scanner;
public class NumberReverse {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=n.nextInt();
        System.out.println("The reverse of the given number is ");
        for (int i=num;i>=0;i--){
            System.out.println(i);}
        
    }
    
}
