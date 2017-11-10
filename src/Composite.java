import java.util.ArrayList;
import java.util.ListIterator;

public class Composite extends Component {

    ArrayList<Component> list;
    

    public Composite(String n) {
        System.out.println("Composite con..");
        name = n;
        list = new ArrayList<Component>();
    }

    void addComponent(Component c) {
        list.add(c);
    }

    void op() {
        ListIterator<Component> iterator = list.listIterator();
        while (iterator.hasNext()) {
            Component c = iterator.next();
            c.op();
        }
        System.out.println(name);
    }
}
