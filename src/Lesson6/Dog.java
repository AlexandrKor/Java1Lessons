package Lesson6;

public class Dog extends Animal {
    static int counterDogs;

    public Dog(String name, int distanceRun, int distanceSwim) {
        super(name, distanceRun, distanceSwim);
        counterDogs++;
        System.out.println(name);
    }

    @Override
    public boolean run(int distance) {
        if (distance < distanceRun) {
            System.out.println("Собака, по кличке " + name + " пробежала " + distance + " метров.");
            return false;
        }
        System.out.println("Собака, по кличке " + name + ", не смогла пробежать " + distance + " метров.");
        return false;
    }

    @Override
    public boolean swim(int distance) {
        if (distance < distanceSwim) {
            System.out.println("Собака, по кличке " + name + ", проплыла " + distance + " метров.");
            return true;
        }
        System.out.println("Собака, по кличке " + name + ", не смогла проплыть " + distance + " метров.");
        return false;
    }

}

