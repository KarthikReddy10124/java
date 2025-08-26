import java.util.Scanner;
public class JustifyTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first side: ");
        int a = scanner.nextInt();
        System.out.print("Enter second side: ");
        int b = scanner.nextInt();
        System.out.print("Enter third side: ");
        int c = scanner.nextInt();
        // if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("Valid triangle");
                if (a == b && b == c) {
                    System.out.println("Equilateral triangle");
                } else if (a == b || b == c || a == c) {
                    System.out.println("Isosceles triangle");
                } else if(a != b && b != c && a != c) {
                    System.out.println("Scalene triangle");
                }
                
        // scanner.close();
    }           else {
                System.out.println("Invalid triangle");
            }
        
}}