package components;

public class VideoCard extends Component{
    public int memory;
    public VideoCard(String make, int memory){
        super(make);
        this.memory = memory;
    }
}
