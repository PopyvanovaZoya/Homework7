package ru.geekbrains.Homework7;

public class Test {
    public static void main(String[] args) {
        Cat[] arr = new Cat[5];
        Plate plate = new Plate(50, 100);
        arr[0] = new Cat("Рыжик", 30);
        arr[1] = new Cat("Васька", 15);
        arr[2] = new Cat("Шарик", 14);
        arr[3] = new Cat("Мурка", 34);
        arr[4] = new Cat("Котангенс", 3);

        plate.info();

        for (int i = 0; i < arr.length; i++) {
            arr[i].eat(plate);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].isCatHungry())
                System.out.println(arr[i].name + " голоден");
            else
                System.out.println(arr[i].name + " наелся");
        }
    }
}
