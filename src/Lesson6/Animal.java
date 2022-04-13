package Lesson6;

public abstract class Animal {
    static int counterAnimals;
    protected String name;
    protected int distanceRun;
    protected int distanceSwim;

    public Animal(String name, int distanceRun, int distanceSwim) {
        this.name = name;
        this.distanceRun = distanceRun;
        this.distanceSwim = distanceSwim;
        counterAnimals++;
    }

    public abstract boolean run(int distance);


    public abstract boolean swim(int distance);

}
