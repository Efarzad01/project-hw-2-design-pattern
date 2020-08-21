package Vo_run;

import creational.factory.design.pattern.Device;
import creational.factory.design.pattern.DeviceFactory;

public class DeviceTest {
    public static void main(String[] args) {

        DeviceFactory deviceFactory = new DeviceFactory();

        Device device = deviceFactory.getDevice("Apple");

        device.deviceType();

        Device device1 = deviceFactory.getDevice("Samsung");
        device1.deviceType();
    }
}
