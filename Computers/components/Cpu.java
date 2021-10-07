package components;

public class Cpu extends Component{
    public int cores;
    public double rate;
    private Cpu cpu;

    public Cpu(String make,int cores, double rate){
        super(make);
        this.cores = cores;
        this.rate = rate;
    }
    public Cpu getCPU(){
        return this.cpu;
    }
}
