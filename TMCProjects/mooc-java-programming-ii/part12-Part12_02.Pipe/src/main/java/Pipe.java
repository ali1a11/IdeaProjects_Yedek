import java.util.ArrayList;

public class Pipe <T>{
    private T element;
    private ArrayList<T> list;

    public Pipe() {
        this.element = element;
        this.list = new ArrayList<>();
    }
    public void putIntoPipe(T value){
        this.list.add(value);
    }

    public T takeFromPipe(){
        T temp = null;
        if(this.list.isEmpty()){
            temp = null;
            } else {
            temp = list.get(0);
            list.remove(0);
        }
        return temp;
    }

    public boolean isInPipe(){
        if(this.list.isEmpty()){
            return false;
        } else {
            return true;
        }
    }

}


/* from mooc
import java.util.ArrayList;

public class Pipe<T> {

    private ArrayList<T> values;

    public Pipe() {
        this.values = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.values.add(value);
    }

    public boolean isInPipe() {
        return !this.values.isEmpty();
    }

    public T takeFromPipe() {
        if (this.values.isEmpty()) {
            return null;
        }

        T previouslyInPipe = this.values.get(0);
        this.values.remove(0);

        return previouslyInPipe;
    }
}
 */