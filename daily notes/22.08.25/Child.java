// public class Child extends Parent {
// public static void main(String[] args) {
//         System.out.println(a);
//     }}



public class Child extends Parent {
    static{
        System.out.println("Child class is loaded");
    }
    static void respect(){
        System.out.println("Respect Parents");
    }
}
