public class FarmhousePizza extends BasePizza{
    @Override
    /**
     * Calculates the cost associated with a specific operation.
     *
     * @return the cost as an integer value. In this implementation, it always returns 200.
     * @throws IllegalStateException if the cost cannot be determined due to an invalid state.
     */
    public int cost() {
        
        return 200;
        
    }
}
