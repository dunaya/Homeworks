import components.*;

public class Laptop extends PortableComputer{
    public Laptop(String maker, String model, Cpu cpu, Ram ram, Disk disk, Monitor monitor, Keyboard keyboard) {
        super(maker, model, cpu, ram, disk, monitor, keyboard);
    }
}
