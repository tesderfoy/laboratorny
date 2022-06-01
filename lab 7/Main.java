package com.company;


abstract class Animal{
    String name;
    String food;
    String location;
    public abstract void makeNoise();
    public abstract void makeSleep();
    public abstract void makeEat();
   
}
class Dog extends Animal{
     String location  = "палате номер 1";
     String food = "кость";
     String name;

    public Dog(String name) {
        this.name = name;
    }
    @Override
    public void makeNoise() {
        System.out.println(name + " рычит");
    }

    @Override
    public void makeSleep() {
        System.out.println(name +" спит в " + location);

    }
    @Override
    public void makeEat() {
        System.out.println(name + " ест " + food);

    }

    public String getLocation(){
        return location;
    }
    public  String getFood(){
        return food;
    }
    public String getName(){
        return name;
    }
}
class Cat extends Animal{
    String location = "палате номер 3";
    String food = "рыбу";
    String name;
    public Cat(String name){
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " мяукает ");
    }

    @Override
    public void makeSleep() {
        System.out.println(name + " спит");
    }

    @Override
    public void makeEat() {
        System.out.println( name + " ест " + food);

    }
    public String getLocation(){
        return location;
    }
    public  String getFood(){
        return food;
    }
    public String getName(){
        return name;
    }
}
class Horse extends Animal{

    String location = "палате номер 7";
    String food = "яблоко";
    String name;
    public Horse(String name){
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " фыркает");
    }

    @Override
    public void makeSleep() {
        System.out.println(name + " спит");
    }

    @Override
    public void makeEat() {
        System.out.println( name + " ест " + food);

    }
    public String getLocation(){
        return location;
    }
    public  String getFood(){
        return food;
    }
    public String getName(){
        return name;
    }
}

public class Main {
    public static class Docter {
          void treatAnimal(Animal animal){
            System.out.println(animal.getName() + " находится в " + animal.getLocation() + " и ест " + animal.getFood());
        }
    }
    public static void main(String[] args) {
        Dog Luc = new Dog("Люцифер");
        Luc.makeEat();
        Luc.makeSleep();
        Docter Procter = new Docter();
        Procter.treatAnimal(Luc);
        Horse hrs = new Horse("Молния");
        Procter.treatAnimal(hrs);
        Cat ct = new Cat("Маркиза");
        Procter.treatAnimal(ct);




    }
}

