package lesson7;


import java.util.Scanner;

public class Homework {

    public String maxWord(String text) {
        String maxW = null;
        int big = 0;

        for (String str : text.split("[^\\w]+")) {
            if (big < str.length()) {
                big = str.length();
                maxW = str;
            }
        }
        return maxW;
    }

    public StringBuilder secondWord(String text) {
        String secW = null;
        String [] str = text.split("[^\\w]+");
        StringBuilder sb = new StringBuilder(str[1]);
        sb.reverse();
        return sb;
    }

    public int numLetters(String text){
        int count = 0;

        for (String str : text.split("[^\\w]+")) {
            count += str.length();
        }
        return count;

    }

    public void convert(String text){
        StringBuilder sb = new StringBuilder();
        for (String str: text.split("[^\\w]+")) {
            sb.append(str + " ");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Homework homework = new Homework();

        //1
        System.out.println("Enter in the console sentence of five words");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println("longest word " + homework.maxWord(text));
        System.out.println("the number of its letters: " + homework.numLetters(text));
        System.out.println("second word in reverse order " + homework.secondWord(text));

        //2

        System.out.println("Enter a sentence that contains the words between more than one space");
        Scanner sc2 = new Scanner(System.in);
        String text2 = sc.nextLine();
        homework.convert(text2);


    }
}


