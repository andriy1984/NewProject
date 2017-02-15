package lesson5.bird;


public class BirdMain {

    public static void main(String[] args) {
        Bird [] birds = {
                new Eagle("black", false),
                new Swallow("gray", false),
                new Penguin("black white", true),
                new Chicken("white", true)
        };

        for (Bird b:birds
             ) {
            b.fly();
            System.out.println(b);

        }
    }
}
