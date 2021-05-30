public class Convertible extends Car implements Comparable {
    protected boolean isRoofDown;

    public Convertible(boolean isRoofDown, int numSeats, double speed) {
        super(speed, numSeats);
        this.isRoofDown = isRoofDown;
    }

    public Convertible(boolean isRoofDown) {
        this(isRoofDown, 5, 120);
    }

    @Override
    public void putDownSeats() {
        numSeats++;
    }

    @Override
    public void putUpSeats() {
        numSeats--;
    }

    @Override
    public boolean equals(Object object2) {
        if(!(object2 instanceof Convertible)) return false;
        Convertible convertible = (Convertible) object2;
        if (convertible.numSeats != numSeats) return false;
        if (convertible.isRoofDown != isRoofDown) return false;
        if (convertible.speed != speed) return false;
        return true;
    }

    @Override
    public int compareTo(Object o) {
        if(!(o instanceof Convertible)) return 0;
        Convertible convertible = (Convertible) o;
        if(convertible.equals(this)) return 0;
        if(convertible.numSeats < numSeats) return -1;
        return 1;
    }

    @Override
    public String toString() {
        return super.toString() + "\nIs Roof Down: " + isRoofDown;
    }
}
