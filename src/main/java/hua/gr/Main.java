package hua.gr;

public class Main {
    public static void main(String[] args) {

        if (args.length > 0) {
            if (args[0].equals("-list")) {
                RecipeParser Task = new RecipeParser(args);
                
            } 
            else if (!args[0].equals("-list") && args.length > 1) {
                throw new IllegalArgumentException("No valid syntax, add -list for more than 1 recipes");
            } 
            else {
                RecipeParser Task = new RecipeParser(args[0]);
            }
        } 
        else {
            throw new IllegalArgumentException("You did not provide any recipe!");
        }
    }
}