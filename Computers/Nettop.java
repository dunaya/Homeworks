import components.Cpu;
import components.Disk;
import components.Ram;

public class Nettop extends ComputerImpl{
    public Nettop(String maker, String model, Cpu cpu, Ram ram, Disk disk) {
        super(maker, model, cpu, ram, disk);
    }
}
