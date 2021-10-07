package components;

public class Disk extends Component{
    public String type;
    public int size;
    public Disk(String maker, String type, int size) {
        super(maker);
        this.type = type;
        this.size = size;
    }
}
