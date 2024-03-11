package MacronutrientMeals;
import MacronutrientMeals.ProteinFactory.*;
import MacronutrientMeals.FatFactory.*;
import MacronutrientMeals.CarbFactory.*;



public class Meal {
    private Protein protein;

    private Carb carb;
    private Fat fat;

    public Meal(Protein protein, Carb carb, Fat fat) {
        this.protein = protein;
        this.carb = carb;
        this.fat = fat;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "protein=" + protein +
                ", carb='" + carb + '\'' +
                ", fat='" + fat + '\'' +
                '}';
    }
}
