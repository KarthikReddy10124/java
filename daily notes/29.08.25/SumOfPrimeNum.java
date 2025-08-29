import java.util.Scanner;
public class SumOfPrimeNum {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=n.nextInt();
        int sum=0;
        for(int i=0;i<num;i++){
            if(isPrime(i))
                sum+=i;
            }
            System.out.println(sum);
        }
        public static boolean isPrime(int num){
            for(int i=2;i<num;i++){
                if(num%i==0)
                    return false;
                }
            
            return true;
        }
    }
