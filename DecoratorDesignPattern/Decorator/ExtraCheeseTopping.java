public class ExtraCheeseTopping extends ToppingDecorator {
    BasePizza pizza;
    ExtraCheeseTopping(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + 25;
    }
}
