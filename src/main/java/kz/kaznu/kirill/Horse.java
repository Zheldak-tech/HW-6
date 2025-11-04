package kz.kaznu.kirill;

public class Horse extends Animal{
    public Horse(String name, int speedBeg, int speedH20, int stamina) {
        super(name, speedBeg, speedH20, stamina);

    }
    public int run(int distance) {
        System.out.println(name + " пробежал " + distance + " метров за " + distance/speedBeg + " с");
        for (int i = 0; i < distance; i++) {
            stamina -= 1;
            if (stamina < 0) {
                System.out.println(name + " устал");
                break;
            }
        }
        return distance;
    }

    @Override
    public int swim(int distance) {
        super.swim(distance);
        for (int i = 0; i < stamina; i++) {
            stamina -= 4;
            break;
        }
        return distance;
    }
}