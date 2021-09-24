import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
        Car myCar = new Car();
        Scanner condition = new Scanner(System.in);

        System.out.println("Enter speed");
        int CurrentSpeed = condition.nextInt();
        myCar.Start();



}
 static class Vehicle {
     private boolean EngineStatus = false;
     private double CurrentSpeed = 0;

     public void Start() {
         EngineStatus = true;
             System.out.println("Engine online");
     }
     public void Stop(){
        EngineStatus = false;
         System.out.println("Engine offline");
     }
 }

     public void Drive(int Speed) {
         if (Speed > 0 && EngineStatus = true)
             System.out.println("Car driving with " + Speed + " kilometers per hour ");
         else {
             System.out.println("Engine offline");
         }
     }
 }
