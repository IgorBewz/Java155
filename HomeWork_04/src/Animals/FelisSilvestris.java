package Animals;

public class FelisSilvestris {
    private String name = "unknown";
    private String color = "unknown";
    //Constructor with NAME argument
    public FelisSilvestris(String name) {
        if (name != null && !name.equals("")) {
            this.name = name;
        } else {
            System.out.println("You didn't enter a name.");
        }
    }

    //Constructor with NAME and COLOR argument
    public FelisSilvestris(String name, String color) {
        if (name != null && !name.equals("")) {
            this.name = name;
        } else {
            System.out.println("You didn't enter a name.");
        }
        if (name != null && !color.equals("")) {
            this.color = color;
        } else {
            System.out.println("You didn't enter a color.");
        }
    }
    public String getName() {
        return this.name;
    }
    //Getter for COLOR field
    public String getColor() {
        return this.color;
    }

    //Method for change NAME field
    public void changeName(String name) {
        if (name != null && !name.equals("")) {
            String oldName = this.name;
            this.name = name;
            System.out.println(oldName + ": Now my name is " + this.name + ". My color is " + this.color);
        } else {
            System.out.println("You didn't enter a name.");
        }
    }

    //Method for introduce an animal person
    public void sayHello() {
        System.out.println("Hello! My name is " + name + " and my color is " + this.color);
    }
}
