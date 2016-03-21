import java.util.ArrayList;
import java.util.Iterator;

public class Options extends ArrayList<String> {
    private final ArrayList<String> options;

    public Options() {
        this.options = new ArrayList<>();
    }

    public void addOptions(String option){
        options.add(option);
    }

    public Iterator iterator(){
        return options.iterator();
    }

    public boolean contains(String option){
        return options.contains(option);
    }

    public String get(int index){
        return options.get(index);
    }

}
    