package org.softwaretechnologies;


// TODO: 09.12.2024 /**
//     Создайте класс SugarCoffee, поддерживающий интерфейс CofeIntrface
//     к стоимости базового напитка добавьте 20.
//     к описанию добавьте " + sugar"
//     */

public class SugarCoffee implements CoffeeInterface{
    private String description =" + sugar";
    private int cost=20;

    public SugarCoffee(CoffeeInterface coffee){
        cost=coffee.getCost()+cost;
        description= coffee.description()+description;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String description() {
        return description;
    }
}
