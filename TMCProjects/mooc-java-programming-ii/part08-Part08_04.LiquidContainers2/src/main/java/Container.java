public class Container {
    private int amount;

    public Container() {
        this.amount = amount;
    }

    public int contains(){
        return this.amount;
    }

    public void add(int amount){
        if(amount>0 && (amount + this.amount<=100)){
            this.amount +=amount;
        } else if (amount + this.amount>100){
            this.amount = 100;
        }

    }

    public void remove(int amount){
        if(amount>0 && (this.amount - amount >= 0)){
            this.amount -=amount;
        } else if (this.amount - amount < 0){
            this.amount = 0;
        }
    }

    public String toString(){
        return this.amount + "/100";
    }

}

/* from mooc
public class Container {

    private int contains;

    public Container() {
        this.contains = 0;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }

        this.contains = this.contains + amount;
        if (this.contains > 100) {
            this.contains = 100;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }

        this.contains = this.contains - amount;
        if (this.contains < 0) {
            this.contains = 0;
        }
    }

    public int contains() {
        return this.contains;
    }

    @Override
    public String toString() {
        return "" + this.contains + "/100";
    }
}

 */

