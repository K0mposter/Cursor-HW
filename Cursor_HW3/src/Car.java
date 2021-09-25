
public class Car {
    public static void main(String[] args) {
        Vehicle myCar = new Vehicle();

        System.out.println("status= " +myCar.engineStatus);
        System.out.println("speed= " + myCar.currentSpeed);
        System.out.println("............................");
        myCar.Start();
        System.out.println("status= " +myCar.engineStatus);
        System.out.println("speed= " + myCar.currentSpeed);

}
  class Vehicle {
     private boolean engineStatus = false;
     private double currentSpeed = 0;

     public Vehicle() {
     }

     public Vehicle(boolean engineStatus, double currentSpeed) {
         this.engineStatus = engineStatus;
         this.currentSpeed = currentSpeed;
     }

     public void ChangeSpeed(double currentSpeed){
         this.currentSpeed = currentSpeed;
     }
     public void Stop(){
         currentSpeed =0;
         engineStatus = false;
     }
     public void Start(){
         currentSpeed =0;
         engineStatus = true;
     }

     public boolean isEngineStatus() {
         return engineStatus;
     }

     public void setEngineStatus(boolean engineStatus) {
         this.engineStatus = engineStatus;
     }

     public double getCurrentSpeed() {
         return currentSpeed;
     }

     public void setCurrentSpeed(double currentSpeed) {
         this.currentSpeed = currentSpeed;
     }
 }
 }
