package T01Q2;

/**
 * This is an interface for a collection of objects each of which is a bid for
 * installing an air conditioning unit
 */

public interface BidCollectionInterface {
    /**
     * Adds a bid to this collection.
     * precondition: none
     * postcondition: the bid was added at the end of the collection.
     * @param toAdd The bid to add
     */
    public void add(BidInterface toAdd);

    /**
     * Returns the bid in this collection with the best yearly cost.
     * precondition: the collection is not empty
     * postcondition: the bid with the lowest yearly cost was retured
     * @param averageHours Average hours of operation per year
     * @param energyCost Cost in dollars per kilowatt hour
     * @return A bid with the lowest yearly cost
     */
    public BidInterface bestYearlyCost(double averageHours, double energyCost);

    /**
     * Returns the bid in this collection with the best initial cost.
     * The initial cost will be defined as the unit cost plus the installation cost.
     * precondition: The collection is not empty
     * postcondition: The bid with the lowest initial cost was returned
     * @return A bid with the lowest initial cost.
     */
    public BidInterface bestInitialCost();

    /**
     * Clears all of the items from this collection.
     * precondition: none
     * postcondition: The collection is empty
     */
    public void clear();

    /**
     * Gets the number of items in this collection.
     * precondition: none
     * postcondition: The collection is unchanged
     */
    public int getLength();

    /**
     * Sees whether this collection is empty.
     * precondition: none
     * postcondition: The collection is unchanged
     * @return True if there are no items in the bid collection, otherwise false
     */
    public boolean isEmpty();


} //end BidCollectionInterface
