public class MushroomTopping extends ToppingDecorator {
    BasePizza pizza;

    public MushroomTopping(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    /**
     * Calculates the total cost of the pizza including an additional charge.
     *
     * This method retrieves the cost of the pizza and adds a fixed charge of 35.
     *
     * @return the total cost of the pizza including the additional charge.
     * @throws NullPointerException if the pizza object is null.
     */
    public int cost() {
        
        return pizza.cost() + 35;
        
    }
}
