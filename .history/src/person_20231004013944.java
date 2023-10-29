public class Person {

  String name;
  int age;
  String document;

  Person(String name, int age, String docuemnt){
    this.name = name;
    this.age = age;
    this.document = docuemnt;
  }

  public void printOut(){
    System.out.println("name:" + this.name);
  }
  
}
