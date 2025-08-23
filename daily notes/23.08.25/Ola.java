import java.util.Scanner;
public class Ola {
    public static void main(String[] args) {
        System.out.println("Enter 1 for Mini");
        System.out.println("Enter 2 for Sedan");
        System.out.println("Enter 3 for Premium");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println("Enter distance in km");
        double distance = sc.nextDouble();
        Cab c;
        if(input==1){
            c = new Mini(distance);
        }
        else if(input==2){
            c = new Sedan(distance);
        }
        else if(input==3){
            c = new Premium(distance);
        }else{
            System.out.println("Invalid input");
        }

    }
}
