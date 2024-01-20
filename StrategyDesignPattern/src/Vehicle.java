public class Vehicle {
    DriverStrategy driverStrategy;

    Vehicle(DriverStrategy driverStrategy) {
        this.driverStrategy = driverStrategy;
    }

    public void drive() {
        driverStrategy.drive();
    }
}
