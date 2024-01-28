package first_task;

public class Dog implements Pet{

  public String type = "Я пес ";

  public String getType() {
    return type;
  }

  @Override
  public void voice(){}
}
