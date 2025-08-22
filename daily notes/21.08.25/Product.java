public class Product {
    private int price;
    // get method for price
    public int getPrice(){
        return price;
    }
    //setter method for price
    public void setPrice(int b) {
        if (b>0){
            price = b;
        }
    }
    //parameterised constructor
    Product(int a){
        setPrice(a);
    }
}
