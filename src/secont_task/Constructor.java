package secont_task;

public class Constructor {

  private String name;
  private int age;
  private String job;

  private String email;

  Constructor (String name, int age){
       name = "Diana";
       age = 25;
  }

  Constructor(String name, int age , String job, String email){
    this(name, age);
    this.job = job;
    this.email = email;
  }

}
