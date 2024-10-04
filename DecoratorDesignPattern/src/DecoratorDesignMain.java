public class DecoratorDesignMain {
    
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
