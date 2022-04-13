package Lesson6;

public class Cat extends Animal {
    static int counterCats;

    public Cat(String name, int distanceRun, int distanceSwim) {
        super(name, distanceRun, distanceSwim);
        counterCats++;
    }

    @Override
    public boolean run(int distance) {
        if (distance < this.distanceRun) {
            System.out.println("Кошка, по кличке " + name + ", пробежал " + distance + " метров.");
            return true;
        }
        System.out.println("Кошка, по кличке " + name + ", не смогла пробежать " + distance + " метров.");
        return false;
    }

    @Override
    public boolean swim(int distance) {
        return false;
    }


}

