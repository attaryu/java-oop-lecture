import encapsulation.versi2.vehicle;

public class TestVehicleV2 {
    public static void main(String[] args) {
        System.out.println("Creating a vehicle with a 10,000kg maximum load.");
        vehicle vehicle = new vehicle(10000.0);

        System.out.println("Add box #1 (500kg) : " + vehicle.addBox(500.0));
        System.out.println("Add box #2 (250kg) : " + vehicle.addBox(250.0));
        System.out.println("Add box #3 (5000kg) : " + vehicle.addBox(5000.0));
        System.out.println("Add box #4 (4000kg) : " + vehicle.addBox(4000.0));
        System.out.println("Add box #5 (300kg) : " + vehicle.addBox(300.0));

        System.out.println("Vehicle load is " + vehicle.getLoad() + " kg");

    }
}
