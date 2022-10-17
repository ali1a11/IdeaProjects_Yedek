import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storages;

    public StorageFacility() {
        this.storages = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storages.putIfAbsent(unit, new ArrayList<>());
        storages.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return storages.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        ArrayList<String> items = storages.get(storageUnit);
        items.remove(item);
        if (items.isEmpty()){
            this.storages.remove(storageUnit);
        }

    }

    public ArrayList<String> storageUnits() {

        ArrayList<String> units = new ArrayList<>();

        for (String eachUnit : storages.keySet()) {
            //if(!(storages.get(eachUnit)==null || storages.get(eachUnit).size()==0)){
            if(!(storages.get(eachUnit).size()==0)){
                units.add(eachUnit);
            }


        }

        return units;
    }
}

/* from mooc

import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> unitsAndContents;

    public StorageFacility() {
        this.unitsAndContents = new HashMap();
    }

    public void add(String unit, String item) {
        this.unitsAndContents.putIfAbsent(unit, new ArrayList<>());
        this.unitsAndContents.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.unitsAndContents.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        if (!this.unitsAndContents.containsKey(storageUnit)) {
            return;
        }

        this.unitsAndContents.get(storageUnit).remove(item);

        if (this.unitsAndContents.get(storageUnit).isEmpty()) {
            this.unitsAndContents.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        for (String unit : this.unitsAndContents.keySet()) {
            units.add(unit);
        }

        return units;
    }
}

 */
