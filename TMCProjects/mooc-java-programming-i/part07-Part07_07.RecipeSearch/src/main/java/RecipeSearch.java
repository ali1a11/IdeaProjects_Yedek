
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {

//

        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String file = scanner.nextLine();

        ArrayList<Recipe> recipes = new ArrayList<>();

        recipes = readFromFile(file);

        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            if (input.equalsIgnoreCase("list")) {
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
            }

            if (input.equalsIgnoreCase("find name")) {
                System.out.print("Searched word: ");
                String word = scanner.nextLine();

                for (Recipe recipe : recipes) {
                    if (recipe.getName().contains(word)) {
                        System.out.println(recipe);
                    }
                }
            }

            if (input.equalsIgnoreCase("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxCookingTime = Integer.parseInt(scanner.nextLine());

                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    if (recipe.getCookTime() <= maxCookingTime) {
                        System.out.println(recipe);
                    }
                }
            }

            if (input.equalsIgnoreCase("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();

                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    for (String recipeIngredient : recipe.getIngredients()) {
                        //System.out.println(recipeIngredient);
                        if (ingredient.equalsIgnoreCase(recipeIngredient)) {
                            System.out.println(recipe);
                        }
                    }
                }
            }
        }
    }

    public static ArrayList<Recipe> readFromFile(String fileName) {
        ArrayList<Recipe> recipes = new ArrayList<>();
        ArrayList<String> recipeParts = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (!line.isEmpty()) {
                    recipeParts.add(line);
                } else {
                    assignRecipeParts(recipes, recipeParts);
                }

            }
            if (!recipeParts.isEmpty()) {
                assignRecipeParts(recipes, recipeParts);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return recipes;
    }

    private static void assignRecipeParts(ArrayList<Recipe> recipes, ArrayList<String> recipeParts) {
        String recipeName = "";
        int cookTime = 0;
        recipeName = recipeParts.get(0);
        cookTime = Integer.parseInt(recipeParts.get(1));
        recipeParts.remove(0);
        recipeParts.remove(0);

        recipes.add(new Recipe(recipeName, cookTime, new ArrayList<>(recipeParts))); //why new?
        recipeParts.clear();
    }
}

/* from mooc
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Recipe> recipes = new ArrayList<>();
        System.out.println("File to read:");
        String file = scanner.nextLine();

        try (Scanner fileReader = new Scanner(new File(file))) {

            // read recipes and ingredients
            while (fileReader.hasNextLine()) {
                // read a recipe and create an object to represent it
                String recipeName = fileReader.nextLine();
                int recipeTime = Integer.valueOf(fileReader.nextLine());
                Recipe recipe = new Recipe(recipeName, recipeTime);

                // add recipe to the list
                recipes.add(recipe);

                // add ingredients for the recipe
                while (fileReader.hasNextLine()) {
                    String ingredient = fileReader.nextLine();

                    // ingredients end with an empty line
                    if (ingredient.isEmpty()) {
                        // exit from this while loop
                        // (the outer loop is not exited)
                        break;
                    }

                    recipe.addIngredient(ingredient);
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Commands:\n"
                + "list - lists the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
            }

            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String searchedFor = scanner.nextLine();
                for (Recipe recipe : recipes) {
                    if (recipe.nameContains(searchedFor)) {
                        System.out.println(recipe);
                    }
                }
            }

            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int max = Integer.valueOf(scanner.nextLine());

                for (Recipe recipe : recipes) {
                    if (recipe.cookingTimeAtMost(max)) {
                        System.out.println(recipe);
                    }
                }
            }

            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();

                for (Recipe recipe : recipes) {
                    if (recipe.containsIngredient(ingredient)) {
                        System.out.println(recipe);
                    }
                }
            }
        }
    }
}

 */
