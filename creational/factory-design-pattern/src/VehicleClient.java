public class VehicleClient {
    private Vehicle vehicle;

    public VehicleClient(int type) {
        if (type == 2) {
            vehicle = new TwoWheeler();
        } else if (type == 4) {
            vehicle = new FourWheeler();
        } else {
            vehicle = null;
        }
    }

    public void cleanup() {
        if (vehicle != null) {
            vehicle = null;
        }
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}