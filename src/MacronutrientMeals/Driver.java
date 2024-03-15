package MacronutrientMeals;
import MacronutrientMeals.Customer.*;

import java.util.*;

public class Driver {
    public static void main(String[] args) {
        /*
        * For Clarity, the abstract factories are used within the customer object
        * in the generateMeal() class method. I chose to implement Customers and meals
        * with the builder pattern as there was no specification in the assignment on
        * how to handle their instantiation. I felt the clarification necessary since
        * my abstract factory utilization is not being present in the main driver.
        * So please follow the logical sequence within the Customer's generateMeal()
        * method to see factory design pattern. It also felt appropriate to make customer
        * diet plan private which necessitated the move of the meal building from main into
        * customer.
        * */

        Customer customer1 = new Customer.Builder()
                .setName("Bob")
                .setDietPlan(DietPlan.Paleo)
                .createCustomer();
        Customer customer2 = new Customer.Builder()
                .setName("George")
                .setDietPlan(DietPlan.NoRestriction)
                .createCustomer();
        Customer customer3 = new Customer.Builder()
                .setName("Jose")
                .setDietPlan(DietPlan.NutAllergy)
                .createCustomer();
        Customer customer4 = new Customer.Builder()
                .setName("Jack")
                .setDietPlan(DietPlan.Vegan)
                .createCustomer();
        Customer customer5 = new Customer.Builder()
                .setName("Goku")
                .setDietPlan(DietPlan.Paleo)
                .createCustomer();
        Customer customer6 = new Customer.Builder()
                .setName("Master Chief")
                .setDietPlan(DietPlan.NutAllergy)
                .createCustomer();

        customer1.generateMeal();
        customer1.displayMeal();

        customer2.generateMeal();
        customer2.displayMeal();

        customer3.generateMeal();
        customer3.displayMeal();

        customer4.generateMeal();
        customer4.displayMeal();

        customer5.generateMeal();
        customer5.displayMeal();

        customer6.generateMeal();
        customer6.displayMeal();
    }
}

