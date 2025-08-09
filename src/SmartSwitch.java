import java.util.ArrayList;

public class SmartSwitch extends SmartDevice{

    //private attributes
    private ArrayList<SmartBulb> smartBulbs;

    //constructor
    public SmartSwitch(String _ipAddress, boolean _status) {
        super(_ipAddress, _status);
        this.smartBulbs = new ArrayList<SmartBulb>();
    }


    //getters and setters


    //Other methods
    public void turnOn() {
        this.status = true;
        System.out.println("The SmartSwitch at "+ this.ipAddress +" was turned ON successfully");
    }

    public void turnOff() {
        this.status = false;
        System.out.println("The SmartSwitch at "+ this.ipAddress +" was turned OFF successfully");
    }


    public void addBulb(SmartBulb _smartBulb) {
        this.smartBulbs.add(_smartBulb);
    }

    public ArrayList<SmartBulb> getBulbs(){
        return this.smartBulbs;
    }

    public void turnAllOn(String colour) {
        this.status = true;
        for (SmartBulb smartbulb : smartBulbs
        ) {
            smartbulb.turnOn();
        }
    }

    public void turnAllOff() {
        this.status = true;
        for (SmartDevice smartbulb : smartBulbs
        ) {
            smartbulb.turnOff();
        }
    }

    public double getTotalConsumptionToday() {
        double totalConsumption = 0;
        totalConsumption += super.getConsumptionToday();
        for (SmartDevice smartbulb : smartBulbs
        ) {
            totalConsumption += smartbulb.getConsumptionToday();
        }
        return totalConsumption;
    }

    public void display() {
        System.out.println("SmartSwitch  at " + this.getIpAddress() + " is on: " + this.getStatus() + " Today's consumption: " + super.getConsumptionToday());
        int i = 0;
        for (SmartBulb smartBulb : this.getBulbs()) {
            i++;
            System.out.println("Bulb " + i + " at " + smartBulb.getIpAddress() + " is on: " + smartBulb.getStatus() + ". Colour:" + smartBulb.getColour() + ". Today's consumption: " + smartBulb.getConsumptionToday());
        }
    }


}
