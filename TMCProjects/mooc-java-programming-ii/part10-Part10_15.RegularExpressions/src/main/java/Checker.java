

public class Checker {

    public boolean isDayOfWeek(String string) {

        // (mon, tue, wed, thu, fri, sat, sun)
        return string.matches("mon|tue|wed|thu|fri|sat|sun");

    }

    public boolean allVowels(String string){
        // a, e, i, o, and u.
        return string.matches("(a|e|i|o|u)*");
    }

    public boolean timeOfDay(String string){
        //NB. In this exercise we use the 24-hour clock. So the acceptable values are between 00:00:00 and 23:59:59.

        return string.matches("(([0-1])([0-9])|2[0-3]):[0-5][0-9]:[0-5][0-9]");

    }
}

/* from mooc
public class Checker {

    public boolean isDayOfWeek(String string) {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }

    public boolean allVowels(String string) {
        return string.matches("[aeiou]*");
    }

    public boolean timeOfDay(String string) {
        return string.matches("([01][0123456789]|2[0123]):[012345][0123456789]:[012345][0123456789]");
    }
}
 */