
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    //

    public boolean equals(Object object) {
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }

        if (object == this) {
            return true;
        }

        LicensePlate compared = (LicensePlate) object;

        return this.liNumber.equals(compared.liNumber) && this.country.equals(compared.country);
    }

    public int hashCode() {
        return Objects.hash(liNumber, country);
    }


}

    /*
    public int hashCode() {
        return Objects.hash(liNumber, country);
    }
*/


    /* from mooc
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.day;
        hash = 19 * hash + this.month;
        hash = 19 * hash + this.year;
        return hash;
    }

*/
