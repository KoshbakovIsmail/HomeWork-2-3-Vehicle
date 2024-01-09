
public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Bicycle", 2, 1);
        Bicycle bicycle1 = new Bicycle("Bicycle1", 2, 0);
        Car car = new Car("Car", 4, 2.2);
        Car car1 = new Car("Car1", 4, 2.5);
        Truck truck = new Truck("Truck", 6, 5.7, 1);
        Truck truck1 = new Truck("Truck1", 6, 4.7, 0);
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.checVehicle(bicycle);
        serviceStation.checVehicle(bicycle1);
        serviceStation.checVehicle(car);
        serviceStation.checVehicle(car1);
        serviceStation.checVehicle(truck);
        serviceStation.checVehicle(truck1);
    }
}
