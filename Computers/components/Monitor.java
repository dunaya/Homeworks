package components;

public class Monitor extends Component{
    String type;
    public Monitor(String make, String type){
        super(make);
        this.type = type;
    }
}
