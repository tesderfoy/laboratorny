package com.company;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args){
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++){
            mas[i] = (int)(Math.random() * 100);
        }
        System.out.println("Изначальный массив:");
        for (int i: mas){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Пересобранный массив:");

        quickSort(mas, 0, 3);
        for (int ma : mas) {
            System.out.print(ma + " ");
        }

    }
    private static void quickSort(int[] mas, int l, int r){
        if(l >= r) return;
        int pi = partition(mas, l, r);
        quickSort(mas, l, pi-1);
        quickSort(mas, pi+1, r);

    }
    private  static  int partition(int[] mas, int l, int r){
        int pivot = mas[r];
        int ptr = l - 1;

        for(int i = l; i < r; i++){
            if(mas[i] < pivot){
                ptr++;
                swap(ptr, i, mas);
            }
        }
        swap(ptr + 1, r, mas);
        return ptr+1;


    }

    private static void swap(int ptr, int i, int[] mas) {
        int temp = mas[ptr];
        mas[ptr] = mas[i];
        mas[i] = temp;
    }

}
