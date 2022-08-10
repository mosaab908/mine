package Assignment;

public class Food {
    private String taste;
    private int price;
    private int size;

    public Food(){}

    public Food(String taste, int price, int size) {
        this.taste = taste;
        this.price = price;
        this.size = size;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void change(int a){
        this.price=a;
        System.out.println("price is updated to " + a);
    }
    //overload
    public void change(int a, int b){
        this.price=a;
        this.size=b;
        System.out.println("price and size are now updated to "  + a + " and " + b );
    }
}
