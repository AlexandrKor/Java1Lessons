package Lesson6;


public class AnimalsApp {
    public static void main(String[] args) {
        Animal[] array = new Animal[]{
                new Cat("Мурка", 200, 0),
                new Dog("Лада", 500, 20),
                new Cat("Люся", 260, 0),
                new Cat("Маруся", 250, 0),
                new Dog("Альма", 249, 5)
        };
        for (Animal animal : array) {
            animal.run(250);
            animal.swim(5);
        }
        System.out.println("Всего участвовало животных " + Animal.counterAnimals);
        System.out.println(Cat.counterCats + " кошки");
        System.out.println(Dog.counterDogs + " собаки");
    }
}
