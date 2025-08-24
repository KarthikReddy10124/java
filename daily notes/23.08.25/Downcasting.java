public class Downcasting {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Engine();
        Engine e = (Engine)c2; // downcasting
        System.out.println(e.Hp);
    //     Cab c = new Mini(10); // upcasting
    //     Mini m = (Mini)c; // downcasting
    //     System.out.println(m instanceof Cab);
    //     System.out.println(m instanceof Mini);

    }
    // String color="White";
    // String brand="Audi";
    
}
