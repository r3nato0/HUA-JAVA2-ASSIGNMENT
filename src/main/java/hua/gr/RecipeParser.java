
package hua.gr;




public class RecipeParser {


    public RecipeParser(String name) {

    }

    // Constructor with variable number of arguments (Varargs) source: https://docs.oracle.com/javase/8/docs/technotes/guides/language/varargs.html
    public RecipeParser(String... args) {

        for (int i = 1; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

}
