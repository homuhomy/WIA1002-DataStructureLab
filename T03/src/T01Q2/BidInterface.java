package T01Q2;

/**
 * This is an interface for a single bid for installing an ac unit
 */

public interface BidInterface {
    /**
     * Returns the name of the company making this bid.
     * precondition: none
     * postcondition: the name was returned
     * @return The name of the company making the bid
     */
    public String getCompanyName();

    /**
     * Returns the description of the air conditioner that this bid is for.
     * precondition: none
     * postcondition: the description was returned
     * @return the description of the AC unit
     */
    public double getDescription();

    /**
     * Returns the capacity of this bid's AC in tons (1 ton = 12,000 BTU).
     * precondition: none
     * postcondition: the performance was returned
     * @return the cooling capacity of the AC unit in tons
     */
    public double getCapacity();

    /**
     * Returns the seasonal efficiency of this bid's AC (SEER).
     * precondition: none
     * postcondition: the performance was returned
     * @return the efficiency of the AC unit
     */
    public double getSEER();

    /**
     * Returns the cost of this bid's AC.
     * precondition: none
     * postcondition: the AC cost was returned
     *  @return the cost of the unit in dollars
     */
    public double getUnitCost();

    /**
     * Returns the cost of installing this bid's AC.
     * precondition: none
     * postcondition: the installation was returned
     * @return the installation cost in dollars
     */
    public double getInstallationCost();

    /**
     * Returns the yearly cost of operating this bid's AC.
     * precondition: none
     * postcondition: the yearly cost was returned
     * @param hoursOperated Average number of hours the unit operate per year
     * @param energyCost Cost in dollars per kilowatt hour
     * @return the cost for the year in dollars,
     * cost = 12 * tons *energyCOst *hoursOperated / SEER
     */
    public double getYearlyCost();

} //end BidInterface
