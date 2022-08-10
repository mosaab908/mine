package Assignment;

public class Fruit extends Food {
    private String quality;

    public Fruit() {
    }

    @Override
    public void change(int a) {
        int c = 2;
        System.out.println("your total plus fruit's tax " + (a + c));
    }

    public Fruit(String taste, int price, int size, String quality) {
        super(taste, price, size);
        this.quality = quality;
    }

}
