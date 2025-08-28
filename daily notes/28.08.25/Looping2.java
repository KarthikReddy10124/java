import java.util.Scanner;
public class Looping2 {
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=n.nextInt();
        int sum=0;
        for (int i=1;i<=num;i++){
            sum=sum+i;
            
            n.close();
        }
        System.out.println("The sum of n natural numbers is "+sum);
    }}