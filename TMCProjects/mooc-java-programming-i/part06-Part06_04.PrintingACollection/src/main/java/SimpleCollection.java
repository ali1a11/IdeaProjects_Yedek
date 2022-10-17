
import java.text.MessageFormat;
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    //
    public String toString() {
        if (elements.isEmpty()) {
            return MessageFormat.format("The collection {0} is empty.", this.name);
        }

        StringBuilder elementStrings = new StringBuilder();
        String elementSingularOrPlural = (this.elements.size() == 1) ? "element" : "elements";
        String message = MessageFormat.format("The collection {0} has {1} {2}:\n", this.name, this.elements.size(), elementSingularOrPlural);

        for (String element : elements) {
            elementStrings.append(element);

            if (elements.size() > 1) {
                elementStrings.append("\n");
            }
        }

        return message + elementStrings;
    }

    /*
        public String toString() {
        if(this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        if(this.elements.size() == 1) {
            return "The collection " + this.name + " has 1 element:\n" + this.elements.get(0);
        }

        String printedSet = "";
        for (String element : elements) {
            printedSet += "\n" + element;
        }

        return "The collection " + this.name + " has " + this.elements.size() + " elements:" + printedSet;
    }
     */


    //


}
