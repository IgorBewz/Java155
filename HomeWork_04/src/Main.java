import Animals.FelisSilvestris;

public class Main {
    public static void main(String[] args) {
        FelisSilvestris barsik = new FelisSilvestris("Barsik", "red");
        FelisSilvestris snizhok = new FelisSilvestris("Snizhok", "white");
        FelisSilvestris sharik = new FelisSilvestris("Sharik");
        barsik.sayHello();
        snizhok.sayHello();
        sharik.sayHello();
        snizhok.changeName("Snowy");
        System.out.println(barsik.getName() + ": My color is " + barsik.getColor());
    }
}