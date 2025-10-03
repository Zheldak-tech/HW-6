package kz.kaznu.kirill;

public class Cat extends Animal{
    public Cat(String name, int speedBeg, int speedH20, int stamina) {
        super(name, speedBeg, speedH20, stamina);

    }
    public int run(int distance) {
        System.out.println(name + " пробежал" + distance + " метров за " + distance/speedBeg + " с");
        for (int i = 0; i < distance; i++) {
            stamina -= 1;
            if (stamina < 0) {
                System.out.println(name + " устал");
            }
        }
        return distance;
    }

    @Override
    public int swim(int distance) {
        System.out.println("КОТ НЕ УМЕЕТ ПЛАВАТЬ.");;
        return distance;
    }
}
