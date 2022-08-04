public class Game {
    String name;
    String console;
    int release;
    int rate;
    String type;


    public Game(String name,String console,int release,int rate, String type ) {
        this.name = name;
        this.console = console;
        this.release = release;
        this.rate = rate;
        this.type = type;
    }
    public Game(String name,String console,int release, String type ) {
        this.name = name;
        this.console = console;
        this.release = release;
        this.type = type;
    }
    public Game(String name,String console,int release ) {
        this.name = name;
        this.console = console;
        this.release = release;
    }


   public void getconsole(){
       System.out.println(this.name + " is playable in " + this.console);
   }
   public String gameType(){
        String x=this.type;
        if(x == null){
            x="N/A";
        }
       return "The game's type is " + x;
   }
   public void releaseYear(){
       System.out.println("The release date for " + this.name + " => " + this.release);
   }

    @Override
    public String toString(){
        return "The game is " + name + "\nWork on " + console + "\nRelease date: " + release;
    }
}
