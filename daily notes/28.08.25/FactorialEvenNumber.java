
import java.util.Scanner;
public class FactorialEvenNumber {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=n.nextInt();
        int factorial=1;
        // System.out.println("The factorial of the given number is ");
        for (int i=2;i<=num;i+=2){
            // int fact= num*i;
            factorial=factorial*i;
            n.close();
            
            }
            System.out.println("The factorial of "+num+" is "+factorial);
        
    }}