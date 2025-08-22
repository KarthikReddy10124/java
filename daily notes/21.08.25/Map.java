// public class Map {
//     int a;
// }
public class Map {
    int a;//non static variable
    //no argument constructor
    Map(){

        System.out.println("no args constructor called");
    }
    Map(int a){
        System.out.println("paramitarised constructor called with value: " + a);

    }
    public static void main(String[] args) {
        //step 2 creating object 
        Map m = new Map();
        Map m1 = new Map(10);
    }
}
