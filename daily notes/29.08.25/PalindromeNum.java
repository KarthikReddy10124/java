import java.util.Scanner;
public class PalindromeNum {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=n.nextInt();
        int originalNum=num;
        int reverse=0;
        while(num>0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }
        if(originalNum==reverse){
            System.out.println(originalNum+" is a palindrome number");
        }
        else{
            System.out.println(originalNum+" is not a palindrome number");
        }
        n.close();
    }
}
