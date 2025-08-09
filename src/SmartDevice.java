public class SmartDevice {
    //private attributes
    private String ipAddress;
    private boolean status;
    private double consumptionToday; //inWatts

    public SmartDevice(String _ipAddress, boolean _status) {
        this.ipAddress = _ipAddress;
        this.status = _status;
    }

    public void turnOff() {
        this.status = false;
        System.out.println("The SmartDevice at " + this.ipAddress + " was turned OFF successfully");
    }

    //other methods
    public void turnOn() {
        this.status = true;
        System.out.println("The SmartDevice at " + this.ipAddress + " was turned ON successfully");
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public double getConsumptionToday() {
        return Utils.getRandomConsumption();
    }

    //getters and setters
    public String getIpAddress() {
        return ipAddress;
    }

    public boolean getStatus() {
        return status;
    }
}
