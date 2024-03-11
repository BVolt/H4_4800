package MacronutrientMeals;

public class Customer {
    private String name;
    private DietPlan dietPlan;

    public enum DietPlan{
        NoRestriction,
        Paleo,
        Vegan,
        NutAllergy
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DietPlan getDietPlan() {
        return dietPlan;
    }

    public void setDietPlan(DietPlan dietPlan) {
        this.dietPlan = dietPlan;
    }
}

