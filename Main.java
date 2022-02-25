package com.company;

public class Main {

    public static void main(String[] args) {
	int[] mas = {1, 5, 7, 8, 9, 2, 3,};
    int min = mas [0];
    double sum = 0;

    for(int i = 0; i < mas.length;i++){
       sum += mas[i];
        }
        for (int num : mas) {
            if (num < min) {
                min = num;
            }
        }
        double sr;
        sr = sum/ mas.length;
        System.out.println(min + sr);


    }
    }
