
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        Random randomNumber = new Random();

        while (this.numbers.size() < 7) {
            int randomLotteryNumber = randomNumber.nextInt(40) + 1;
            if (!containsNumber(randomLotteryNumber)) {
                this.numbers.add(randomLotteryNumber);
            }
        }

        /*
        for (int i = 0; i < 7; i++) {
            while (true) {
                int randomLotteryNumber = randomNumber.nextInt(40) + 1;
                if (!containsNumber(randomLotteryNumber)) {
                    this.numbers.add(randomLotteryNumber);
                    break;
                }
            }
        }
        */

    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        return numbers.contains(number);
    }
}

/* from mooc
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        Random random = new Random();

        while (this.numbers.size() < 7) {
            int newNumber = random.nextInt(40) + 1;
            boolean numberWasAlreadyDrawn = this.containsNumber(newNumber);

            // Only add the new number if it was not already drawn
            if (!numberWasAlreadyDrawn) {
                this.numbers.add(newNumber);
            }
        }
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        return this.numbers.contains(number);
    }
}
 */

