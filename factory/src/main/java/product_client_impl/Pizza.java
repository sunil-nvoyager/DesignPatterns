package product_client_impl;

import java.util.ArrayList;

/**
 * product
 */
abstract class Pizza {
    private String name;
    private String dough;
    private String sauce;
    private ArrayList<String> toppings = new ArrayList<String>();

    void Pizza() {
        
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough " + dough);
        System.out.println("Adding sauce " + sauce);
        System.out.println("Adding toppings ");
        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
        
    }

    protected abstract void prepare();

    protected void bake() {
        
        System.out.println("Bake for 25 minutes at 350");
        
    }

    protected void cut() {
        
        System.out.println("Cutting the pizza into diagonal slices");
        
    }

    protected void box() {
        
        System.out.println("Place pizza in official pizzastore box");
        
    }

    protected String getName() {
        
        return name;
        
    }
}
