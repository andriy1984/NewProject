package Lesson6.Tasck1;

import java.util.Scanner;

public class Rectangle {
    public int squareRectangle(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new ArithmeticException();
        }
        return a * b;
    }


    public static void main(String[] args) {
        Rectangle rct = new Rectangle();
        Scanner scn= new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(rct.squareRectangle(a,b));
    }
}