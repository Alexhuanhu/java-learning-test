/**
 * Created by Alexhu on 2017/7/27.
 */
public class ToStringTest {

    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.setColor("红色");
        apple.setWeight(5.68);

        System.out.println(apple.toString());
    }
}

class Apple {
    private String color;
    private double weight;

    public Apple() {
    }

    public Apple(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
