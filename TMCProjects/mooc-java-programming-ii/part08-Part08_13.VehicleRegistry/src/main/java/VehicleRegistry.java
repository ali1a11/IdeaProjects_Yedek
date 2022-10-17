import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> licencePlatesMap = new HashMap<>();

    public boolean add(LicensePlate licensePlate, String owner) {
        if (licencePlatesMap.get(licensePlate) == null) {
            licencePlatesMap.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    /* from mooc
        public boolean add(LicensePlate licensePlate, String owner) {
        if (owners.containsKey(licensePlate)) {
            return false;
        }

        owners.put(licensePlate, owner);

        return true;
    }
     */

    public String get(LicensePlate licensePlate) {

        return licencePlatesMap.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (licencePlatesMap.containsKey(licensePlate)) {
            licencePlatesMap.remove(licensePlate);
            return true;
        }
        return false;
    }
    /* from mooc
     public boolean remove(LicensePlate licensePlate) {
        if (!owners.containsKey(licensePlate)) {
            return false;
        }

        owners.remove(licensePlate);

        return true;
    }
     */

    public void printLicensePlates() {
        for (LicensePlate licensePlate : licencePlatesMap.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>(licencePlatesMap.values());

        Set<String> set = new HashSet<>(owners);
        owners.clear();
        owners.addAll(set);

        for (String owner : owners) {
            System.out.println(owner);
        }
    }
    /* from mooc
        public void printOwners() {
        ArrayList<String> printed = new ArrayList<>();

        for (String owner : owners.values()) {
            if (printed.contains(owner)) {
                continue;
            }

            System.out.println(owner);
            printed.add(owner);
        }
     */


}

/* from mooc

import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> owners;

    public VehicleRegistry() {
        owners = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (owners.containsKey(licensePlate)) {
            return false;
        }

        owners.put(licensePlate, owner);

        return true;
    }

    public String get(LicensePlate licensePlate) {
        return owners.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!owners.containsKey(licensePlate)) {
            return false;
        }

        owners.remove(licensePlate);

        return true;
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate : owners.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        ArrayList<String> printed = new ArrayList<>();

        for (String owner : owners.values()) {
            if (printed.contains(owner)) {
                continue;
            }

            System.out.println(owner);
            printed.add(owner);
        }
    }
}
 */
