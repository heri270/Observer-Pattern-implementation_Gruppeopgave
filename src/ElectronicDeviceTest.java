/**
 * Created by henriettebarchager on 15/02/2016.
 */
public class ElectronicDeviceTest {

    public static void main(String[] args) {

        ElectronicDevice electronicDevice = new ElectronicDevice();

        DiodeLight diodeLight1 = new DiodeLight(electronicDevice, "on");

        PowerUsage powerUsage = new PowerUsage(electronicDevice, "on");

        electronicDevice.setState("on");


        System.out.println("hej Bob");

    }
}
