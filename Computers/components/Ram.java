package components;

public class Ram extends Component{
    public int memory;
    public double rate;
    public Ram(String make, int memory, double rate){
        super(make);
        this.memory = memory;
        this.rate = rate;
    }
}
