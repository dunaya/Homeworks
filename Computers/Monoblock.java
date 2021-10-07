import components.Cpu;
import components.Disk;
import components.Monitor;
import components.Ram;

public class Monoblock extends ComputerImpl{
    private Monitor monitor;
    public Monoblock(String maker, String model, Cpu cpu, Ram ram, Disk disk, Monitor monitor) {
        super(maker, model, cpu, ram, disk);
        this.monitor = monitor;
    }
    @Override
    public String toString(){
        return "maker: " + this.maker + ";" + " model: " + this.model + ";" + " cpu maker: " + this.cpu.make + ";" + " cpu cores: " + this.cpu.cores + ";" + " cpu rate: " + this.cpu.rate + ";" + " ram maker: " + this.ram.make + " ram memory: " + this.ram.memory + " ram rate: " + this.ram.rate + ";" + " disk maker: " + this.disk.make + ";" + " disk type: " + this.disk.type + ";" + " disk size: " + this.disk.size + ";" + " monitor: " + this.monitor;
    }
}
