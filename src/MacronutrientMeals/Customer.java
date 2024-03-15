package MacronutrientMeals;

public class Customer {
    private String name;
    private DietPlan dietPlan;
    private Meal meal;

    public enum DietPlan{
        NoRestriction, Paleo, Vegan, NutAllergy
    }

    private Customer(String name, DietPlan dietPlan) {
        this.name = name;
        this.dietPlan = dietPlan;
    }

    public void generateMeal(){
        MacronutrientFactory macronutrientFactory = MacronutrientFactory.getInstance();
        this.meal = macronutrientFactory.createMeal(this.dietPlan);
    }

    public void displayMeal(){
        System.out.println(this.name + ", " + this.dietPlan);
        System.out.println(this.meal);
    }

    public static class Builder{
        private String name;
        private DietPlan dietPlan;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDietPlan(DietPlan dietPlan) {
            this.dietPlan = dietPlan;
            return this;
        }

        public Customer createCustomer(){
            return new Customer(this.name, this.dietPlan);
        }
    }
}

