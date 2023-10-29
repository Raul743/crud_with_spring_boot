public class Patient {
  String registration;
  String healthInsurance;

  Patient(String registration, String healthInsurance) {
    this.registration = registration;
    this.healthInsurance = healthInsurance;
  }
  public void printOut(){
    System.out.println("registration:" + this.registration);
    System.out.println("healthInsurance:" + this.healthInsurance);
  }

}
