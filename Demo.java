public class Demo {
    public static void main(String[] args) {
        GoldFish g = new GoldFish();
        Fish f = new GoldFish();
        System.out.println(Fish.fins);
        System.out.println( g.fins );
        System.out.println( g.swim() );
        System.out.println( f.swim() );
        System.out.println( g.color );
        System.out.println( f.color );
       // System.out.println( f.pairedFins );
        System.out.println( g.pairedFins );
    }
}