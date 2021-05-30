public class InheritanceTest {
    public static void  main (String[] args){
        Vehicle vehicle = new Vehicle(60);
        Car car = new Car(90, 4);
        Convertible convertible = new Convertible(true);
        System.out.println(vehicle);
        System.out.println(car);
        System.out.println(convertible);

        vehicle.enableBoost();
        convertible.putDownSeats();
        car.putDownSeats();

        System.out.println(vehicle);
        System.out.println(car);
        System.out.println(convertible);

        vehicle.disableBoost();
        convertible.putUpSeats();
        car.putUpSeats();

        System.out.println(vehicle);
        System.out.println(car);
        System.out.println(convertible);

    }
}
