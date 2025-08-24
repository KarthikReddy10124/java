// public class Methods{
//     public static void getArea(int a,int b){
//         System.out.println(a*b);
//         return;
//     }
//     public static void main(String[] args){
//         getArea(3, 4);
//     }
// }

// public class Methods{
//     public static Double evenOrOdd(int a){
//         // a = 6;
//         if (a%2==0){
//             System.out.println("the give number is even");
//         }
//         else{
//             System.out.println("the give number is odd");
            
//         }
//         return a;
//     }
//     public static void main(String[] args){
//         evenOrOdd(5);
//     }
// }

// public class Methods{
//     public static void main(String[] args){
//             int a = evenOrOdd(234);
//             if(a==0){
//                 System.out.println(" is even");
//             }
//             else{
//                 System.out.println(" is odd");
//             }
//     }
//         //0called method
//         public static int evenOrOdd(int a){
            
//                 return a%2;
//             }
//         }

import java.util.Scanner;

public class Methods{
    public static void main (String []args){
        Scanner sc =new Scanner (System.in);
        int num = sc.nextInt();
        if (num % 2 ==0){
            System.out.println ("even");
        }else{
        System.out.println("odd");
}}
}