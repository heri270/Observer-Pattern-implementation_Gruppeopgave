/**
 * Created by henriettebarchager on 15/02/2016.
 */
public class ElectronicDeviceTest {

    public static void main(String[] args) {

        ElectronicDevice electronicDevice = new ElectronicDevice();

        DiodeLight diodeLight = new DiodeLight(electronicDevice);

        PowerUsage powerUsage = new PowerUsage(electronicDevice);

        electronicDevice.setState("off");


    }
}
