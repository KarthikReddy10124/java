import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = s.nextInt();
        switch(a%2) {
            case 0:System.out.println("Even");
            break;
            case 1:System.out.println("odd");
            break;
            default:System.out.println("Invalid");
        }
    }
}
