public class Cardriver {
    Engine e =  createEngine();
    void gethp(){
        System.out.println(e.hp);
    }
    public static Engine createEngine() {
        return new Engine();
    }
}
