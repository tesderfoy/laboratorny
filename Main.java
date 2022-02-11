package com.company;

public class Main {

    public static void main(String[] args) {
        int s;
        for (int i = 1; i<= 10;i++){
            for (int j = 1; j<=10; j++){
                s = i * j;
                System.out.printf("%d*%d=%d \n", i, j, s);
            }
        }
    }
}
