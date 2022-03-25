package com.company;


import java.util.Scanner;

class Match {
    double x;
    double y;
    double z;
    Match (double x, double y){
        if((y+1)==0){
            System.out.println("Введите другие числа");
        }
        else {
            z = (x+y)/(y+1);
            System.out.println(z);
        }
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        Match ope = new Match(num1, num2);


    }
}
