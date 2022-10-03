import Animals.FelisSilvestris;

public class Main {
    public static void main(String[] args) {
        FelisSilvestris barsik = new FelisSilvestris("Barsik", "red");
        FelisSilvestris snizhok = new FelisSilvestris("Snizhok", "white");
        FelisSilvestris sharik = new FelisSilvestris("Sharik");
        FelisSilvestris kitty = new FelisSilvestris("");
        FelisSilvestris puppy = new FelisSilvestris(null);
        barsik.sayHello();
        snizhok.sayHello();
        sharik.sayHello();
        kitty.sayHello();
        puppy.sayHello();
        kitty.changeName("Kitty");
        kitty.setColor("black");
        kitty.sayHello();
        System.out.println(barsik.getName() + ": My color is " + barsik.getColor());
    }
}