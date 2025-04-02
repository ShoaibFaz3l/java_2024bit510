package practical.pkg12;
public class MainTest {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.startEngine();

        Vehicle bike = new Bike();
        bike.startEngine();

        Vehicle transport = new Transport();
        transport.startEngine();
    }
}
