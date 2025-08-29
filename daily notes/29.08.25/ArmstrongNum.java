import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=n.nextInt();
        int originalNum=num;
        int sum=0;
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        num=originalNum;
        while(num>0){
            int digit=num%10;
            sum+=Math.pow(digit,count);
            num=num/10;
        }
        if(originalNum==sum){
            System.out.println(originalNum+" is an Armstrong number");
        }
        else{
            System.out.println(originalNum+" is not an Armstrong number");
        }
    }
}
