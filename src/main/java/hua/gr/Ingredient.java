package hua.gr;

public class Ingredient {
    private final String name;
    private double quantity;
    private final String unit;

    public Ingredient(String name, double quantity, String unit) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }

    public String getName(){
        return name;
    }

    public double getQuantity(){
        return quantity;
    }

    public String getUnit(){
        return unit;
    }
    
    public void addQuantity(double quantity){
        this.quantity += quantity;
    }

    public String toString(){
        if (unit.isEmpty()){
            return name + " " + quantity;
        }else {
            return name + " " + quantity + " " + unit;
        }
    }

}