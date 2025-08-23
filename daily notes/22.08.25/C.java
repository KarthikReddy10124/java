public class C extends A{
    static void getC(){
        getA();
        
        System.out.println("Member of class C");
    }
    public static void main(String[] args) {
        getC();
    }
}
