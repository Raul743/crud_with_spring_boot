public class Patient extends Person {
  String registration;
  String healthInsurance;

  Patient(
    String registration,
    String healthInsuranceString, 
    String name,
    int age, 
    String docuemnt
    ) {
    this.registration = registration;
    this.healthInsurance = healthInsurance;
  }
  public void printOut(){
    System.out.println("registration:" + this.registration);
    System.out.println("healthInsurance:" + this.healthInsurance);
  }

}
