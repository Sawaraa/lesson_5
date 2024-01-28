package first_task;

public class Cat implements Pet{

  private String type = "Я кіт ";

  public Cat() {
  }

  public Cat(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }

  @Override
  public void voice(){}
}
