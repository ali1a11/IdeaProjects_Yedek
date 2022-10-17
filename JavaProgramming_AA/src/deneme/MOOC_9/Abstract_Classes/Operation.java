package deneme.MOOC_9.Abstract_Classes;

import java.util.Scanner;

public abstract class Operation {

    private String name;

    public Operation(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void execute(Scanner scanner);
}
