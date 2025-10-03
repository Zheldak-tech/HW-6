package kz.kaznu.kirill;

public class MainApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Alpha", 15, 2, 200);
        dog.run(200);
        dog.swim(500);
        dog.info();
        Cat cat = new Cat("Geronimo", 20, 0, 150);
        cat.run(900);
        cat.swim(999);
        cat.info();
        Horse horse = new Horse("Hamilton", 60, 10, 2300);
        horse.run(100);
        horse.swim(100);
        horse.info();
    }
}
