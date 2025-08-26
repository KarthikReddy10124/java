import java.util.Scanner;
public class VoteingAge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        if(a>=18){
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not Eligible to vote");
        }
    }
}
