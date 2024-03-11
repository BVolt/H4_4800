package MacronutrientMeals;

import java.util.List;
import java.util.Random;

public class FatFactory {
    private static FatFactory factory = null;

    private FatFactory(){};

    public static FatFactory getInstance(){
        if(factory == null)
            factory = new FatFactory();
        return factory;
    }
    public enum Fat {
        Avocado, SourCream, Tuna, Peanuts
    }

    public Fat createFat(Customer.DietPlan dietPlan) {
        List<Fat> availableChoices = switch (dietPlan) {
            case Customer.DietPlan.Paleo -> List.of(Fat.Avocado, Fat.Tuna, Fat.Peanuts);
            case Customer.DietPlan.Vegan -> List.of(Fat.Peanuts, Fat.Avocado);
            case Customer.DietPlan.NutAllergy -> List.of(Fat.Avocado, Fat.SourCream, Fat.Tuna);
            default -> List.of(Fat.values());
        };
        return getRandomElement(availableChoices);
    }

    private Fat getRandomElement(List<Fat> fats) {
        Random random = new Random();
        return fats.get(random.nextInt(fats.size()));
    }
}
