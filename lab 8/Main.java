package com.company;

import java.util.Scanner;

class Division{
    public static double getDivision(double x, double y)
  throws DivisionException{
        double z;
        if(y+1 == 0) throw new
     DivisionException("Не работает с этим числом:" + " ", y);
        else {
            z = (x+y)/(y+1);
            }
         return  z;
    }
}
class DivisionException extends Exception{
    private  double number;
    public double getNumber() {return number;}

    public DivisionException(String message, double y) {
        super(message);
        number = y;
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();

        try {
            double z = Division.getDivision(a, b);
            System.out.printf("Ответ: %f",  z);
        } catch (DivisionException ex) {
            System.out.print(ex.getMessage());
            System.out.print(ex.getNumber());
        }
    }
}
