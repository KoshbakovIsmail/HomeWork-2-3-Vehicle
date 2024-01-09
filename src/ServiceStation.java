public class ServiceStation {
    public void checVehicle(VehicleInterface vehicle) {
        vehicle.infoService();
        vehicle.updateTybe();
        vehicle.checkEngine();
        vehicle.checkTrailer();
    }
}
