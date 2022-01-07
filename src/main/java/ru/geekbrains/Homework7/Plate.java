package ru.geekbrains.Homework7;

public class Plate {
    private int food;
    private int volume;

    public Plate(int userFood, int userVolume) {

        this.volume = userVolume;

        if (userFood <= userVolume){
            this.food = userFood;
    }
        else {
            System.out.println("Миска слишком маленькая");
        }
    }

    public void decreaseFood(int n) {
            food -= n;
    }

    public boolean checkFood (int n){
        return n <= food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void putFood(){
        this.food += (this.volume - this.food);
        System.out.println("Миску наполнили снова");
        info();
    }
}
