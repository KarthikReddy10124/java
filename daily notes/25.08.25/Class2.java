public class Class2 extends Class1 {
    @Override
    void method3() {
        System.out.println("class1");
    }

    @Override
    public void method1() {
        System.out.println("Interface2");
    }

    @Override
    public void method2() {
        System.out.println("interface1");
    }

    public static void main(String[] args) {
        Class2 i = new Class2();
        i.method1();
        i.method2();
        i.method3();
    }
    
}
