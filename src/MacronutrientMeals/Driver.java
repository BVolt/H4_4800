package MacronutrientMeals;
import MacronutrientMeals.Customer.*;

import java.util.*;

public class Driver {
    public static void main(String[] args) {
        MacronutrientFactory macronutrientFactory = MacronutrientFactory.getInstance();

        Customer customer1 = new Customer();
        customer1.setName("Poopie");
        customer1.setDietPlan(DietPlan.Vegan);
        Meal meal1 = macronutrientFactory.createMeal(customer1.getDietPlan());
        System.out.println(meal1);


    }


}

