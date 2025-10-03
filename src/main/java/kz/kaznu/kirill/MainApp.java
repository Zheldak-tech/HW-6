package kz.kaznu.kirill;

public class MainApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Alpha", 15, 2, 200);
        Cat cat = new Cat("Geronimo", 20, 0, 150);
        Horse horse = new Horse("Hamilton", 60, 10, 2300);
        dog.run(20);
        dog.swim(5);
        cat.run(9);
        cat.swim(999);
        horse.run(1);
        horse.swim(1);
        dog.info();
        cat.info();
        horse.info();
    }
}
