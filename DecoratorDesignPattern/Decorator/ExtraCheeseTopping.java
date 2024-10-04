public class ExtraCheeseTopping extends ToppingDecorator {
    BasePizza pizza;
    ExtraCheeseTopping(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    /**
     * Calculates the total cost of the pizza including an additional charge.
     *
     * This method retrieves the cost of the pizza and adds a fixed charge of 25.
     *
     * @return the total cost of the pizza including the additional charge.
     * @throws NullPointerException if the pizza object is null, which would prevent
     *         retrieving its cost.
     */
    public int cost() {
        
        return pizza.cost() + 25;
        
    }
}
