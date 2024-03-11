package PizzaChains;

import java.util.ArrayList;

public class Pizza {
    private final String pizzaChain;
    private final Size size;
    private final ArrayList<Topping> toppings;

    private Pizza(String pizzaChain, Size size, ArrayList<Topping> toppings) {
        this.pizzaChain = pizzaChain;
        this.size = size;
        this.toppings = toppings;
    }

    public void eat(){
        System.out.println(
                "Pizza Chain = " + pizzaChain + '\n' +
                "Size = " + size + '\n' +
                "Toppings = " + ((toppings != null) ? toppings : "None") + '\n'
        );
    }

    public static class Builder {

        private String pizzaChain;
        private Size size;
        private ArrayList<Topping> toppings;

        public Builder setPizzaChain(String pizzaChain) {
            this.pizzaChain = pizzaChain;
            return this;
        }

        public Builder setSize(Size size) {
            this.size = size;
            return this;
        }

        public Builder addTopping(Topping topping) {
            if(this.toppings == null)
                this.toppings = new ArrayList<>();
            this.toppings.add(topping);
            return this;
        }

        public Pizza createPizza() throws IllegalStateException{
            if(size == null)
                throw new IllegalStateException("Pizza Size is required");
            return new Pizza(pizzaChain, size, toppings);
        }

    }

    public enum Size{
        Small,
        Medium,
        Large
    }

    public enum Topping{
        Pepperoni,
        Sausage,
        Mushrooms,
        Bacon,
        Onions,
        ExtraCheese,
        Peppers,
        Chicken,
        Olives,
        Spinach,
        TomatoBasil,
        Beef,
        Ham,
        Pesto,
        SpicyPork,
        HamPineapple
    }
}
