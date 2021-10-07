import components.Cpu;
import components.Disk;
import components.Ram;

public class Server extends ComputerImpl{
    public Server(String maker, String model, Cpu cpu, Ram ram, Disk disk) {
        super(maker, model, cpu, ram, disk);
    }
}
