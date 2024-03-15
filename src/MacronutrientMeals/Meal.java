package MacronutrientMeals;
import MacronutrientMeals.ProteinFactory.*;
import MacronutrientMeals.FatFactory.*;
import MacronutrientMeals.CarbFactory.*;



public class Meal {
    private final Protein protein;

    private final Carb carb;
    private final Fat fat;

    private Meal(Protein protein, Carb carb, Fat fat) {
        this.protein = protein;
        this.carb = carb;
        this.fat = fat;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "protein=" + protein +
                ", carb=" + carb +
                ", fat=" + fat +
                '}';
    }

    public static class Builder{
        private Protein protein;

        private Carb carb;
        private Fat fat;

        public Builder setProtein(Protein protein) {
            this.protein = protein;
            return this;
        }

        public Builder setCarb(Carb carb) {
            this.carb = carb;
            return this;
        }

        public Builder setFat(Fat fat) {
            this.fat = fat;
            return this;
        }

        public Meal createMeal(){
            return new Meal(this.protein, this.carb, this.fat);
        }
    }

}
