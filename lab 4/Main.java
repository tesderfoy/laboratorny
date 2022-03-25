package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++){
            array[i] = input.nextInt();
        }
        int min = array [0];
        double sum = 0;
        for(int i = 0; i < array.length;i++){
            sum += array[i];
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
            min = array[i];
        }
        }
        double sr;
        sr = sum/ array.length;
        System.out.print("Ответ: ");
        System.out.println(min + sr);


    }
    }
