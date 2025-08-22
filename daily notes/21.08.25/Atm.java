public class Atm {
    private int money;

    public int withdraw(int pin){
        if(pin==1234){
            return money;
        }
        return 0;
    }
    Atm (int i){
        money =i;

    }
    public static void main(String[] args) {
        Atm a = new Atm(1000);
        int amount = a.withdraw(1234);
        System.out.println("Amount available: " + amount);
    }
}
