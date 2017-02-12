import java.util.Arrays;

public class Lesson4Arey {

    private int [] ten = {5, 6, -5, -6, 12, 3, -45, 1, 32, 4};

    //the biggest of these numbers

    public int bigValue(){
        int big = 0;
        for (int i = 0; i <ten.length ; i++) {
            if (ten[i]>big)
                big = ten[i];
        }
        return big;
    }

    // the sum of positive numbers in the array

    public int sumPositive(){
        int sum = 0;
        for (int i = 0; i <ten.length ; i++) {
            if (ten[i]>0)
                sum += ten[i];
        }
        return sum;
    }

    //the amount of negative and positive numbers in the array

    public int positiveAmount(){
        int amount = 0;
        for (int i = 0; i <ten.length ; i++) {
            if (ten[i]>0)
                amount++;
        }
        return amount;
    }

    public int negativeAmount(){
        int amount = 0;
        for (int i = 0; i <ten.length ; i++) {
            if (ten[i]<0)
                amount++;
        }
        return amount;
    }

    //What values there are more: negative or positive

    public String whatValues(){
        if (positiveAmount() > negativeAmount()){
            return "positive";
        }else if (positiveAmount() > negativeAmount()) {
            return "negative";
        }else return "equally";
    }

    public static void main(String[] args) {
        Lesson4Arey larey = new Lesson4Arey();
        System.out.println("array = " + Arrays.toString(larey.ten));
        System.out.println("the biggest of these numbers = [" + larey.bigValue() + "]");
        System.out.println("the sum of positive numbers in the array = [" + larey.sumPositive() + "]");
        System.out.println("the amount of negative = [" + larey.negativeAmount() + "]"
                + " and the amount of positive = [" + larey.positiveAmount() + "]");
        System.out.println("There are more " + larey.whatValues() + " values");
    }

}
