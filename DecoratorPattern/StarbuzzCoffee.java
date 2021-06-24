package designpatternExample.DecoratorPattern;

public class StarbuzzCoffee {
    public static void main(String[] argv){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " : " + beverage.cost() + "원");

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " : " + beverage2.cost() + "원");
    }
}
