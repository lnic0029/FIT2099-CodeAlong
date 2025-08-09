public class SmartBulb {

    //private attribute
    private boolean status;
    private String colour;
    private double consumptionToday; //in Watts

    //constructor
    public SmartBulb() {
    }

    //constructor overloading
    public SmartBulb(boolean _status, String _colour) {
        this.status = _status;
        this.colour = _colour;
    }

    //getters and setters
    public boolean getStatus() {
        return status;
    }

    public String getColour() {
        return colour;
    }

    public double getConsumptionToday() {
        return consumptionToday;
    }

    public void turnOn() {
        this.status = true;
    }

    public void turnOff() {
        this.status = false;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setConsumptionToday(double consumptionToday) {
        this.consumptionToday = consumptionToday;
    }




}
