package creational.factory.design.pattern;

public class DeviceFactory {

    public Device getDevice(String deviceType){
        if (deviceType == null){
            return  null;
        }
        if(deviceType.equalsIgnoreCase("Apple")){
            return new Apple();
        }
        else if (deviceType.equalsIgnoreCase("Samsung")){
            return new Samsung();
        }
        else if (deviceType.equalsIgnoreCase("Sony")){
            return new Sony();
        }
        return null;
    }
}
