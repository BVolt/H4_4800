package PizzaChains;
import PizzaChains.Pizza.*;


public class Driver {

    public static void main(String[] args) {
        taskOne();
        taskTwo();
    }

    public static void taskOne(){
        divider();

        Pizza p1 = new Pizza.Builder()
                .setPizzaChain("Pizza Hut")
                .setSize(Size.Small)
                .addTopping(Topping.ExtraCheese)
                .addTopping(Topping.Mushrooms)
                .addTopping(Topping.Chicken)
                .createPizza();

        Pizza p2 = new Pizza.Builder()
                .setPizzaChain("Pizza Hut")
                .setSize(Size.Medium)
                .addTopping(Topping.SpicyPork)
                .addTopping(Topping.Sausage)
                .addTopping(Topping.Olives)
                .addTopping(Topping.Ham)
                .addTopping(Topping.TomatoBasil)
                .addTopping(Topping.ExtraCheese)
                .createPizza();

        Pizza p3 = new Pizza.Builder()
                .setPizzaChain("Pizza Hut")
                .setSize(Size.Large)
                .addTopping(Topping.Beef)
                .addTopping(Topping.Spinach)
                .addTopping(Topping.Pesto)
                .addTopping(Topping.Olives)
                .addTopping(Topping.Peppers)
                .addTopping(Topping.Onions)
                .addTopping(Topping.Bacon)
                .addTopping(Topping.Mushrooms)
                .addTopping(Topping.Chicken)
                .createPizza();


        p1.eat();
        p2.eat();
        p3.eat();
    }

    public static void taskTwo(){
        divider();

        Pizza p1 = new Pizza.Builder()
                .setPizzaChain("Pizza Hut")
                .setSize(Size.Large)
                .addTopping(Topping.Pepperoni)
                .addTopping(Topping.Bacon)
                .addTopping(Topping.Chicken)
                .createPizza();

        Pizza p2 = new Pizza.Builder()
                .setPizzaChain("Pizza Hut")
                .setSize(Size.Small)
                .addTopping(Topping.ExtraCheese)
                .addTopping(Topping.HamPineapple)
                .createPizza();

        Pizza p3 = new Pizza.Builder()
                .setPizzaChain("Little Caesars")
                .setSize(Size.Medium)
                .addTopping(Topping.Bacon)
                .addTopping(Topping.Mushrooms)
                .addTopping(Topping.Beef)
                .addTopping(Topping.Olives)
                .addTopping(Topping.Peppers)
                .addTopping(Topping.Onions)
                .addTopping(Topping.Spinach)
                .addTopping(Topping.Pesto)
                .createPizza();

        Pizza p4 = new Pizza.Builder()
                .setPizzaChain("Little Caesars")
                .setSize(Size.Small)
                .addTopping(Topping.Chicken)
                .addTopping(Topping.Ham)
                .addTopping(Topping.TomatoBasil)
                .addTopping(Topping.SpicyPork)
                .addTopping(Topping.Sausage)
                .addTopping(Topping.ExtraCheese)
                .createPizza();

        Pizza p5 = new Pizza.Builder()
                .setPizzaChain("Dominos")
                .setSize(Size.Small)
                .addTopping(Topping.Pepperoni)
                .createPizza();

        Pizza p6 = new Pizza.Builder()
                .setPizzaChain("Dominos")
                .setSize(Size.Large)
                .addTopping(Topping.Bacon)
                .addTopping(Topping.Sausage)
                .addTopping(Topping.Chicken)
                .createPizza();


        p1.eat();
        p2.eat();
        p3.eat();
        p4.eat();
        p5.eat();
        p6.eat();
    }

    public static void divider(){
        System.out.println(new String(new char[100]).replace("\0", "-"));
    }
}
