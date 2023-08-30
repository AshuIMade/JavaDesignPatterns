package com.company.creational.factory.abstractFactory;

public class CoffeeFactory implements IHotDrinkFactory{
    @Override
    public IHotDrink prepare(int amount) {
        System.out.println(" grained coffee beans, boil some water and the coffee beans, add "
                +amount+ " ml coffee ad cm and sugar and enjoy!");
        return new Coffee();
    }
}
