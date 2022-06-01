package com.company;
interface Product{
    String infoName();
    int infoPrice();
    String infoRating();
}
interface User{
    String infoEmail();
    String infoPassword();
}
class Chipseki implements Product{
    String name = "Lays";
    int price = 140;
    String rating = "9 из 10";
    @Override
    public String infoName() {
        return name;
    }

    @Override
    public int infoPrice() {
        return price;
    }

    @Override
    public String infoRating() {
        return rating;
    }
}
class Crackers implements Product {

    String name = "Кириешки";
    int price = 40;
    String rating = "8 из 10";

    @Override
    public String infoName() {
        return name;
    }

    @Override
    public int infoPrice() {
        return price;
    }

    @Override
    public String infoRating() {
        return rating;
    }
}
class Cookie implements Product {
    String name = "Любятово";
    int price = 90;
    String rating = "10 из 10";

    @Override
    public String infoName() {
        return name;
    }

    @Override
    public int infoPrice() {
        return price;
    }

    @Override
    public String infoRating() {
        return rating;
    }

}

class Man implements User {
    String email = "Georgy.43@gmail.com";
    String pass = "we****r";
    @Override
    public String infoEmail() {
        return email;
    }

    @Override
    public String infoPassword() {
        return pass;
    }
}
class Woman implements User{
    String email = "Irenfire.2@gmail.com";
    String pass = "22*****e";

    @Override
    public String infoEmail() {
        return email;
    }
    @Override
    public String infoPassword() {
        return pass;
    }
}
class Children implements User{
    String email = "BabijonTagirovich@gmail.com";
    String pass = "l2*****H";
    @Override
    public String infoEmail() {
        return email;
    }
    @Override
    public String infoPassword() {
        return pass;
    }
    }

class United implements User, Product{
    void Un1(User user, Product product){
        System.out.println("Пользователь : " + user.infoEmail() + " купил товар " +product.infoName());
        System.out.println("рейтинг товара: "+ product.infoRating());
        System.out.println("цена товара: " + product.infoPrice());
        System.out.println();
    }
    @Override
    public String infoName() {
        return null;
    }
    @Override
    public int infoPrice() {
        return Integer.parseInt(null);
    }
    @Override
    public String infoRating() {
        return null;
    }
    @Override
    public String infoEmail() {
        return null;
    }
    @Override
    public String infoPassword() {
        return null;
    }
}
public class Main {

    public static void main(String[] args) {
        Chipseki lays = new Chipseki();
        Crackers kir = new Crackers();
        Cookie lub = new Cookie();
        Man Jon = new Man();
        System.out.println(Jon.infoPassword());
        United un = new United();
        un.Un1(Jon, lays);
    }
}
