package lesson5.bird;


public abstract class Bird {


    protected String feather;
    protected boolean layEggs;

    abstract void fly();

    @Override
    public String toString() {
       return " feather " + feather + " layEggs " + (layEggs == true?"yes":"no");
    }
}

