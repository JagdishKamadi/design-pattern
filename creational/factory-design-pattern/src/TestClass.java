public class TestClass {
    public static void main(String[] args) {
        VehicleClient pClient = new VehicleClient(4);
        Vehicle vehicle = pClient.getVehicle();
        if (vehicle != null) {
            vehicle.showSpecification();
        }
        pClient.cleanup();
    }
}
