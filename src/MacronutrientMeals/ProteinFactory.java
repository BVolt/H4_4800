package MacronutrientMeals;
import java.util.List;
import java.util.Random;

public class ProteinFactory {

    private static ProteinFactory factory = null;

    private ProteinFactory(){};

    public static ProteinFactory getInstance(){
        if(factory == null)
            factory = new ProteinFactory();
        return factory;
    }
    public enum Protein {
        Fish, Chicken, Beef, Tofu;
    }

    public Protein createProtein(Customer.DietPlan dietPlan) {
        List<Protein> availableChoices = switch (dietPlan) {
            case Customer.DietPlan.Paleo -> List.of(Protein.Fish, Protein.Chicken, Protein.Beef);
            case Customer.DietPlan.Vegan -> List.of(Protein.Tofu);
            default -> List.of(Protein.values());
        };
        return getRandomElement(availableChoices);
    }

    private Protein getRandomElement(List<Protein> proteins) {
        Random random = new Random();
        return proteins.get(random.nextInt(proteins.size()));
    }
}
