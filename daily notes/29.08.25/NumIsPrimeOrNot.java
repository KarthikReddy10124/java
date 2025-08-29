import java.util.Scanner;
public class NumIsPrimeOrNot {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=n.nextInt();
        boolean isPrime=true;
        for(int i=1;i<=num;i++){
            if(num%2==0){
                isPrime=false;
                break;
                }
        }
        if(isPrime){
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
    }
    
}
