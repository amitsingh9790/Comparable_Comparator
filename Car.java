package ComparatorDemo;

public class Car {
    int power;
    int speed;
    String name;

    public Car(int power, int speed, String name) {
        this.power = power;
        this.speed = speed;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" + "power=" + power + ", speed=" + speed + ", name='" + name + '\'' + '}';
    }
}