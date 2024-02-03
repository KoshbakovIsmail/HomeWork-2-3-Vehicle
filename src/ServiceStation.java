public class ServiceStation {
    public void checVehicle(VehicleInterface vehicle) {
        vehicle.infoService();
        vehicle.updateTyre();
        vehicle.checkEngine();
        vehicle.checkTrailer();
    }
}