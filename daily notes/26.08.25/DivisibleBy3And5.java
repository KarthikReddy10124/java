import java.util.Scanner;
public class DivisibleBy3And5 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        if(n%3==0 && n%5==0) {
            System.out.println("Divisible by both 3 and 5");
        } else {
            System.out.println("Not Divisible by both 3 and 5");
        }
    }
}
