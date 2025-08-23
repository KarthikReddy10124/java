public class Demo {
    public static void main(String[] args) {
        add();
        add(10);
        add('A');
        add(10,20);

    }
    public static void add() {// no. of FA = 0
        System.out.println("add () method called");
    }
    public static void add(int a) {// no. of FA = 1, type=int
        System.out.println(a+" is passed");
    }
    public static void add(char a) {// no. of FA = 1, type= char
        System.out.println(a+" is passed");
    }
    public static void add(int a, int b) {// no. of FA = 2
        System.out.println(a+b);
    }
}
