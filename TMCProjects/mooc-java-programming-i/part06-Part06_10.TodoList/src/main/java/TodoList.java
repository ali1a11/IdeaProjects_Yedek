import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> listTODO;


    public TodoList() {
        this.listTODO = new ArrayList<>();
    }

    public void add(String task){
        this.listTODO.add(task);
    }

    public void print(){
        for (int i = 0; i < listTODO.size(); i++) {
            System.out.println((i+1) + ": " + listTODO.get(i));
        }

    }

    public void remove(int number){
        /*
        if (index < 0 || index >= this.tasks.size()) {
            return;
         */
        this.listTODO.remove(number - 1);
    }


}
