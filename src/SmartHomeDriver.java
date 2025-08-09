public class SmartHomeDriver {
    public static void main(String[] args) {

        System.out.println("Welcome to the Smart Home System"); //commit 1

        SmartSwitch smartSwitch = new SmartSwitch();
        smartSwitch.turnOn();

        smartSwitch.addBulb(new SmartBulb(true, "red"));
        smartSwitch.addBulb(new SmartBulb(false, "yellow"));

        smartSwitch.display();

        smartSwitch.turnAllOff();
        smartSwitch.turnAllOn("blue");

        smartSwitch.display();
    }
}
