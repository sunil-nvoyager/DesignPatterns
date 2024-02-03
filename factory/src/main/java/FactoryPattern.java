import product_client_impl.NYPizzaStore;
import product_client_impl.PizzaStore;

/**
 * Created by Sunil on 29/04/16.
 */
public class FactoryPattern {
    public static void main(String args[]) {
        PizzaStore pizzaStore =  new NYPizzaStore();
        pizzaStore.orderPizza("cheese");
    }
}