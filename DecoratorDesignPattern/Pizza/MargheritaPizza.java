public class MargheritaPizza extends BasePizza {
    @Override
    /**
     * Calculates the cost associated with a certain operation.
     *
     * @return the cost as an integer value. In this implementation, it always returns 100.
     * @throws IllegalStateException if the cost cannot be determined due to an invalid state.
     */
    public int cost() {
        
        return 100;
        
    }
}
