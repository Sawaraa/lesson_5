package first_task;

public class Main {

  public static void main(String[] args) {

    voice( () -> System.out.println("Я корова - мууууу"));
    voice( () -> System.out.println("Я кіт - мяв"));
    voice( () -> System.out.println("Я кіт - мяв"));

  }

  public static void voice(Pet pet){
    pet.voice();
  }


}