package kz.kaznu.kirill;

public class Animal {
    protected static String name;
    protected static int speedBeg;
    protected static int speedH20;
    protected static int stamina;

    public Animal(String name, int speedBeg, int speedH20, int stamina) {
        this.name = name;
        this.speedBeg = speedBeg;
        this.speedH20 = speedH20;
        this.stamina = stamina;
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
    public int swim(int distance) {
        System.out.println(name + " проплыл " + distance + " метров за " + distance/speedBeg + " с");
        return distance;
    }
    public void info(){
        System.out.println("Это животное: " + name + ", выносливость: " + stamina);
    }
}
