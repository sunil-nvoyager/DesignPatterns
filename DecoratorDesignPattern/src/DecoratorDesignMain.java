public class DecoratorDesignMain {
    
    /**
     * The main method serves as the entry point for the application.
     * It demonstrates the creation of two different types of pizzas,
     * applying various toppings to each, and then prints the total cost
     * of each pizza to the console.
     *
     * <p>
     * This method creates a Margherita pizza and adds extra cheese and
     * mushroom toppings to it. It also creates a Farmhouse pizza and
     * adds multiple mushroom toppings and extra cheese. Finally, it
     * calculates and displays the cost of both pizzas.
     * </p>
     *
     * @param args Command line arguments passed to the application.
     *              This parameter is not used in this method.
     *
     * @throws NullPointerException if any of the pizza or topping objects
     *                               are not properly initialized.
     * @throws IllegalArgumentException if an invalid topping is applied
     *                                   to a pizza.
     */
    public static void main(String[] args) {
        
        BasePizza pizza1 = new MargheritaPizza();
        pizza1 = new ExtraCheeseTopping(pizza1);
        pizza1 = new MushroomTopping(pizza1);
        pizza1 = new ExtraCheeseTopping(pizza1);

        BasePizza pizza2 = new FarmhousePizza();
        pizza2 = new ExtraCheeseTopping(pizza2);
        pizza2 = new MushroomTopping(pizza2);
        pizza2 = new MushroomTopping(pizza2);

        System.out.println("Cost of pizza 1 is :" + pizza1.cost());
        System.out.println("Cost of pizza 2 is :" + pizza2.cost());
        
    }
}
