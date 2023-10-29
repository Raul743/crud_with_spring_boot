public class Patient extends Person {
  String registration;
  String healthInsurance;

  Patient(
    String registration,
    String healthInsurance, 
    String name,
    int age, 
    String docuemnt
    ) {
      
    super(name, age, docuemnt);
    this.registration = registration;
    this.healthInsurance = healthInsurance;
  }
  public void printOut(){
    super.printOut();
    System.out.println("registration:" + this.registration);
    System.out.println("healthInsurance:" + this.healthInsurance);
  }

}
