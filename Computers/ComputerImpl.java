import components.Cpu;
import components.Disk;
import components.Ram;

public abstract class ComputerImpl implements Computer
{
    String maker;
    String model;
    Cpu cpu;
    Ram ram;
    Disk disk;
    public ComputerImpl(String maker, String model, Cpu cpu, Ram ram, Disk disk){
        this.maker = maker;
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
        this.disk = disk;
    }
    //так мы избавляемся от дублирующего кода
    //в дальнейшем, все что нам нужно - переопределить метод toString
    public String turnOn() {
        return "Turn on "+getClass().getSimpleName()+" "+toString();
    }

    public String turnOff() {
        return "Turn off "+getClass().getSimpleName()+" "+toString();
    }

    public String connect() {
        return "Connect to internet "+getClass().getSimpleName()+" "+toString();
    }
    @Override
    public String toString(){
        return "maker: " + this.maker + ";" + " model: " + this.model + ";" + " cpu maker: " + this.cpu.make + ";" + " cpu cores: " + this.cpu.cores + ";" + " cpu rate: " + this.cpu.rate + ";" + " ram maker: " + this.ram.make + " ram memory: " + this.ram.memory + " ram rate: " + this.ram.rate + ";" + " disk maker: " + this.disk.make + " disk type: " + this.disk.type + ";" + " disk size: "  + this.disk.size;
    }
}
