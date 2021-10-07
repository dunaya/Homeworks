import components.*;

public class Netbook extends PortableComputer{
    public Netbook(String maker, String model, Cpu cpu, Ram ram, Disk disk, Monitor monitor, Keyboard keyboard) {
        super(maker, model, cpu, ram, disk, monitor, keyboard);
    }
}
