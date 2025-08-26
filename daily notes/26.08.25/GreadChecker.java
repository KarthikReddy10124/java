import java.util.Scanner;
public class GreadChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int a = scanner.nextInt();
        if (a > 85 && a <= 100) {
            System.out.println("Grade A");
        } else if (a >= 65 && a < 85) {
            System.out.println("Grade B");
        } else if (a >= 50 && a < 65) {
            System.out.println("Grade C");
        } else if (a >= 50 && a < 33) {
            System.out.println("Grade D");
        } else if( a >= 0 && a < 33) {
            System.out.println("Grade E");
        }
        else {
            System.out.println("Invalid input");
        }
        scanner.close();
    }
}
