import components.Cpu;
import components.Disk;
import components.Ram;
import components.VideoCard;

public class Desktop extends ComputerImpl{
    VideoCard videoCard;
    public Desktop(String maker, String model, Cpu cpu, Ram ram, Disk disk, VideoCard videoCard) {
        super(maker, model, cpu, ram, disk);
        this.videoCard = videoCard;
    }

    @Override
    public String toString(){
        return "maker: " + this.maker + ";" + "model: " + this.model + ";" + " cpu maker: " + this.cpu.make + ";" + " cpu cores: " + this.cpu.cores + ";" + " cpu rate: " + this.cpu.rate + ";" + " ram maker: " + this.ram.make + " ram memory: " + this.ram.memory + " ram rate: " + this.ram.rate + ";" + " disk maker: " + this.disk.make + ";" + " disk type: " + this.disk.type + ";" + " disk size: " + this.disk.size + ";" + "video card maker: " + this.videoCard.make + ";" + " video card memory: " + this.videoCard.memory;
    }
}
