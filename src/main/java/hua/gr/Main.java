package hua.gr;

public class Main {
    public static void main(String[] args) {

        if(args.length>0)
        {
            if (args[0]=="-list")
            {
                for (Integer recipes=1; recipes<=args.length-1;recipes++) //recipes=1 so we ignore the first "-list" arg
                {
                    System.out.println("Passed2");
                }
            }
            else if (args[0]!="-list" && args.length>1){
                throw new IllegalArgumentException("No valid syntax, add -list for more than 1 recipes");
            }
            else{
                System.out.println("Passed");
            }
        }
        else
        {
            throw new IllegalArgumentException("You did not provide any recipe!");
        }



    
}
}