//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StrategyMain {
    public static void main(String[] args) {
        Vehicle sportyVehicle = new SportyVehicle();
        Vehicle passengerVehicle = new PassengerVehicle();
        Vehicle offRoadVehicle = new OffRoadVehicle();
        sportyVehicle.drive();
        passengerVehicle.drive();
        offRoadVehicle.drive();
    }
}