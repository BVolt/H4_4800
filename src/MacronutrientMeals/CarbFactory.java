package MacronutrientMeals;

import java.util.List;
import java.util.Random;

public class CarbFactory {
    private static CarbFactory factory = null;

    private CarbFactory(){};

    public static CarbFactory getInstance(){
        if(factory == null)
            factory = new CarbFactory();
        return factory;
    }
    public enum Carb {
        Cheese, Bread, Lentils, Pistachio
    }

    public Carb createCarb(Customer.DietPlan dietPlan) {
        List<Carb> availableChoices = switch (dietPlan) {
            case Customer.DietPlan.Paleo -> List.of(Carb.Pistachio);
            case Customer.DietPlan.Vegan -> List.of(Carb.Bread, Carb.Lentils, Carb.Pistachio);
            case Customer.DietPlan.NutAllergy -> List.of(Carb.Cheese, Carb.Bread, Carb.Lentils);
            default -> List.of(Carb.values());
        };
        return getRandomElement(availableChoices);
    }

    private Carb getRandomElement(List<Carb> carbs) {
        Random random = new Random();
        return carbs.get(random.nextInt(carbs.size()));
    }
}
