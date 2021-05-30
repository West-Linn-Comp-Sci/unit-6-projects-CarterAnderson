public abstract class Employee {
    private String name;
    private int age;
    private double hoursWorked;
    private boolean atWork;
    public static final double BASE_WAGE = 10.00;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        hoursWorked = 0;
        atWork = false;

    }

    public Employee() {
        name = "";
        age = 0;
        hoursWorked = 0;
        atWork = false;
    }

    public void startWork(double hours) {
        atWork = true;
        logHoursWorked(hours);
    }

    public void leaveWork() {
        atWork = false;
    }

    public double computeWage() {
        return (hoursWorked * (BASE_WAGE));
    }

    public void logHoursWorked(double hours) {
        hoursWorked += hours;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getHoursWorked(double hoursWorked) {
        return hoursWorked;
    }

    public boolean getAtWork() {
        return atWork;
    }

}
