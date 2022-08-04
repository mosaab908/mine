public class Main {
    public static void main(String[] args) {
        Game game1=new Game("EldenRing", "PS5",2022,10,"RPG");
        Game game2=new Game("Final Fantasy", "ps5",2023, "RPG" );
        Game game3=new Game("Zelda","Switch",2023);
        Game game4=new Game("Elden Scroll","PC",2023);
        Game game5=new Game("Metal Gear Solid", "ps4",2017, "adventure" );

        game5.getconsole();
        System.out.println(game3.gameType());
        System.out.println(game5.gameType());
        game3.releaseYear();
        System.out.println();
        System.out.println(game3.toString());
    }
}
