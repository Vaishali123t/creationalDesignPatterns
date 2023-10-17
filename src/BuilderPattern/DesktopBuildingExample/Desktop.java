package BuilderPattern.DesktopBuildingExample;

public class Desktop {

    private String monitor;
    private String keyboard;
    private String mouse;
    private String ram;
    private String motherboard;

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public void showSpecs(){
        System.out.println("The configs are: keyboard"+this.keyboard+" mouse: "+this.mouse+" monitor: "+this.monitor+" ram: "+this.ram+" motherboard: "+this.motherboard);
    }

}
