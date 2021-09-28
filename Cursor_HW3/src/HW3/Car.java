package HW3;

public class Car {

    public static void main(String[] args) {
        Vehicle myCar = new Vehicle (false, 0);

        myCar.getCarInfo ();
        myCar.start ();
        myCar.setCurrentSpeed (130);
        myCar.getCarInfo ();
        myCar.setCruiseControl(true);
        myCar.getCarInfo();
        myCar.setEngineStatus (false);
        myCar.getCarInfo ();
        myCar.stop ();
        myCar.getCarInfo ();
    }

    static class Vehicle {
        private boolean engineStatus = false;
        private double currentSpeed = 0;
        private boolean cruiseControl = false;

        public Vehicle (boolean engineStatus, double currentSpeed) {
            this.engineStatus = engineStatus;
            this.currentSpeed = currentSpeed;
        }

        public void stop () {
            currentSpeed = 0;
            engineStatus = false;
            System.out.println ("Car is stopped");
        }

        public void start () {
            currentSpeed = 0;
            engineStatus = true;
            System.out.println ("Engine started");
        }


        public void setEngineStatus (boolean engineStatus) {
            this.engineStatus = engineStatus;
        }

        public void setCurrentSpeed (double currentSpeed) {
            this.currentSpeed = currentSpeed;
        }
        public void setCruiseControl(boolean cruiseControl) {
            engineStatus = true;
            if (currentSpeed >=40 && currentSpeed<=120){
            System.out.println("Cruise control online");}
            else System.out.println("speed must be over 39 kmh and below 120kmh" +"\n"+ "Cruise control offline");
        }

        public void getCarInfo () {
            System.out.println ("Engine status: " + engineStatus + " with speed " + currentSpeed);
        }
    }
}

