package MacronutrientMeals;
import MacronutrientMeals.ProteinFactory.*;
import MacronutrientMeals.FatFactory.*;
import MacronutrientMeals.CarbFactory.*;

public class MacronutrientFactory {
    public static MacronutrientFactory factory = null;

    private MacronutrientFactory(){};

    public static MacronutrientFactory getInstance(){
        if(factory == null)
            factory = new MacronutrientFactory();
        return factory;
    }

    public Meal createMeal(Customer.DietPlan dietPlan) {
        ProteinFactory proteinFactory = ProteinFactory.getInstance();
        CarbFactory carbFactory = CarbFactory.getInstance();
        FatFactory fatFactory = FatFactory.getInstance();

        Protein protein = proteinFactory.createProtein(dietPlan);
        Carb carb = carbFactory.createCarb(dietPlan);
        Fat fat = fatFactory.createFat(dietPlan);

        return new Meal.Builder()
                .setProtein(protein)
                .setCarb(carb)
                .setFat(fat)
                .createMeal();
    }

}
