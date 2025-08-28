// import java.util.Scanner;
// public class Looping3 {
//     public static void main(String[] args){
//         Scanner n=new Scanner(System.in);
//         System.out.println("Enter a number");
//         int num=n.nextInt();
//         int sum=0;
//         for (int i=0;i<=num;i++){
//             if (i%2==0){
//                 sum=sum+i;
//                 System.out.println(sum);

//             }
            
            
//             n.close();
//         }
//         System.out.println("The sum of n natural numbers is "+sum);
//     }}



import java.util.Scanner;
public class Looping3 {
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=n.nextInt();
        int sum=0;
        for (int i=0;i<=num;i+=2){
            
                sum=sum+i;
                System.out.println(sum);

            }
            
            
            n.close();
        }    }