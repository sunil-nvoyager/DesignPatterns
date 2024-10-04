public class MushroomTopping extends ToppingDecorator {
    BasePizza pizza;

    public MushroomTopping(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + 35;
    }
}
