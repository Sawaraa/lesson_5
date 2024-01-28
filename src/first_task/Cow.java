package first_task;

public class Cow implements Pet{
  public String type = "Я корова ";

  public String getType() {
    return type;
  }

  @Override
  public void voice(){}

}
