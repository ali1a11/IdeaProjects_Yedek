public class Hideout <T> {
    private T element;

    public Hideout() {
        this.element = element;
    }

    public void putIntoHideout(T toHide){
        this.element = toHide;
    }

    public T takeFromHideout(){
        if (element== null){
            return null;
        } else {
            T tempelement = element;
            element = null;
            return tempelement;
        }

    }

    public boolean isInHideout(){

        if (this.element != null){
            return true;
        }
        return false;
    }

}
