package first_task;

public class Main {

  public static void main(String[] args) {

    Cat cat = new Cat();
    print (() -> System.out.println(cat.getType() + "Мяу"));

    Dog dog = new Dog();
    print(() -> System.out.println(dog.getType() + "Гаууу-Гаууу"));

    Cow cow = new Cow();
    print(() -> System.out.println(cow.getType() + "Мууу-Мууу"));
  }

  public static void print(Pet animal){
    animal.voice();
  }


}