package com.company.creational.factory.abstractFactory;

public class TeaFactory implements IHotDrinkFactory{
    @Override
    public IHotDrink prepare(int amount) {
        System.out.println(" put a tea bag, boil some water and add "
                +amount+
                " ml of boiled water and enjoy!");
        return new Tea();
    }
}
