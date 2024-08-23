package product_client_impl;

/**
 * Concrete Client/Creator
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        
        if (type.equals("cheese")) {
            return new NYCheesePizza();
        } else if (type.equals("greek")) {
            return null;
        }
        return null;
        
    }
}
