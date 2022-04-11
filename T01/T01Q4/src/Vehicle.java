public abstract class Vehicle {
    private double maxSpeed;
    protected double currentSpeed;

    public Vehicle(double maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public abstract void accelerate();

    public double getCurrentSpeed(double currentSpeed){
        return currentSpeed;
    }

    public double getMaxSpeed(double maxSpeed){
        return this.maxSpeed;
    }

    public void pedalToTheMetal(){
        while(currentSpeed < maxSpeed){
            accelerate();
        }
    }
}
