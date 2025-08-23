// public class B extends A{
//     static void getB(){
//         getA();
//         System.out.println("Member of class B");
//     }
// }



public class B extends A{
    static void getB(){
        getA();
        System.out.println("Member of class B");
    }
    public static void main(String[] args) {
        // getA();
        getB();
    }
}
