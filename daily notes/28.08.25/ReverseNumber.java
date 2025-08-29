// import java.util.Scanner;
// public class ReverseNumber {
//     public static void main(String[] args) {
//         Scanner n=new Scanner(System.in);
//         System.out.println("Enter a number");
//         int num=n.nextInt();
//         int reverse=0;
//         while(num>0){
//             int digit=num%10;
//             reverse=reverse*10+digit;
//             num=num/10;
//         }
//         System.out.println("The reverse of the given number is "+reverse);
//         n.close();
//     }
// }



// public static void main(String[] args) {
//         int num = 12345;
//         int count = 0;
//         while (num > 0) {
//             num = num / 10;
//             count++;
//         }
//         System.out.println("The number of digits is " + count);
//     }


import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=n.nextInt();
        int reverse=0;
        while(num>0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }
        System.out.println("The reverse of the given number is "+reverse);
        n.close();
    }
}
