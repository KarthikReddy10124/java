// import java.util.Scanner;
// public class Multiplication {
//     public static void main(String[] args) {
//         Scanner n=new Scanner(System.in);
//         System.out.println("Enter a number");
//         int num=n.nextInt();
//         System.out.println("The multiplication table for the given number is ");
//         for (int i=1;i<=10;i++){        
//             System.out.println(num+"x"+i+"= "+(num*i));
//         }n.close();
//     }
    
// }


import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=n.nextInt();
        System.out.println("The multiplication table for the given number is ");
        for (int i=1;i<=10;i++){        
            int sum=num*i;
            System.out.println(num+"x"+i+"= "+sum);
        }n.close();
    }
    
}

