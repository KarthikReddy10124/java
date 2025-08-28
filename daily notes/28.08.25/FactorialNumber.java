// public class FactorialNumber {
//     public static void main(String[] args) {
//         int num = 5;
//         int fact = 1;
//         for (int i = 1; i <= num; i++) {
//             fact = fact * i;
//         }
//         System.out.println("The factorial of " + num + " is " + fact);
//     }
    
// }



import java.util.Scanner;
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=n.nextInt();
        int factorial=1;
        // System.out.println("The factorial of the given number is ");
        for (int i=1;i<=num;i++){
            // int fact= num*i;
            factorial=factorial*i;
            n.close();
            
            }
            System.out.println("The factorial of "+num+" is "+factorial);
        
    }
    
}
