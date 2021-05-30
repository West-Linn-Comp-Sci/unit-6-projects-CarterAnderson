public class Vehicle {

    protected double speed;

    protected Vehicle(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    protected void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getBoostVal() {
        return 1.25;
    }

    public void enableBoost() {
        speed *= getBoostVal();
    }

    public void disableBoost() {
        speed *= (1 / getBoostVal());
    }

    @Override
    public String toString() {
        return "Speed: " + speed + "mph";
    }

}
