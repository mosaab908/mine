package Assignment;

public class Main {
    public static void main(String[] args) {
        Food beef = new Food();
        Food cheese = new Food();
        Fruit orange = new Fruit();

        orange.change(4);

        cheese.setPrice(3);
        cheese.setSize(2);
        cheese.setTaste("sour and salty");

        System.out.println(cheese.getTaste());

        beef.setSize(15);
        beef.setPrice(5);
        beef.setTaste("salty");


        beef.change(9,6);
    }
}
