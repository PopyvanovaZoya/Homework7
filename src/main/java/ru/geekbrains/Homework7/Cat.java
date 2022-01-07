package ru.geekbrains.Homework7;

public class Cat {
    public String name;
    private int appetite;
    private boolean isHungry = true;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (plate.checkFood(this.appetite)){
        plate.decreaseFood(appetite);
        System.out.println(this.name + " ест " + this.appetite);
        isHungry = false;
    }
        else {
            System.out.println("Закончилась еда");
            plate.putFood();
        }
    }
    public boolean isCatHungry(){
        return isHungry;
    }
}
