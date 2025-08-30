import java.util.Scanner;
public class FactorsOfAGivenNum {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=n.nextInt();
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        System.out.println("The number of factors of "+num+" is "+count);
        n.close();
    }
}