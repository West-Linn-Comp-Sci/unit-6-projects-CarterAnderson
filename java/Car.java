public class Car extends Vehicle implements Comparable {

    protected int numSeats;

    public Car(double speed, int numSeats) {
        super(speed);
        this.numSeats = numSeats;
    }

    public int getNumSeats() {
        return numSeats;
    }

    protected void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    @Override
    public double getBoostVal() {
        return 1.5;
    }

    public void putDownSeats() {
        numSeats /= 2;
    }

    public void putUpSeats() {
        numSeats *= 2;
    }

    @Override
    public boolean equals(Object object2) {
        if(!(object2 instanceof Car)) return false;
        Car car2 = (Car) object2;
        if (car2.numSeats != numSeats) return false;
        if (car2.speed != speed) return false;
        return true;
    }

    @Override
    public int compareTo(Object o) {
        if(!(o instanceof Car)) return 0;
        Car car2 = (Car) o;
        if(car2.equals(this)) return 0;
        if(car2.speed < speed) return -1;
        return 1;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSeats: " + numSeats;
    }
}