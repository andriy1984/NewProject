package lesson5.bird;


public class NonFlyingBird extends Bird {
    @Override
    void fly() {
        System.out.println("I am NON_FLYING_BIRD");
    }
}
