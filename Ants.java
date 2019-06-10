import sofia.micro.*;

//-------------------------------------------------------------------------
/**
 *  Basic class for all Ants
 *
 *  @author Andrew Perry (andrewperry)
 *  @version 2018.11.20
 */
public class Ants extends Actor
{
    //~ Fields ................................................................
    /**
     * the health
     */
    protected  int health;
    /**
     * the food cost
     */
    protected  int foodCost;

    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * Creates a new Ants object.
     * @param h is health
     * @param f is foodCost
     */
    public Ants(int h, int f)
    {
        super();
        health = h;
        foodCost = f;
    }

    //~ Methods ...............................................................
    /**
     * returns health of Ant
     * @return returns an int of the health
     */
    public int getHealth()
    {
        return this.health;   
    }

    /**
     * reduces health by n amount
     * @param n is the amount to be injured
     */
    public void injure(int n)
    {
        this.health = this.health - n;
        if (this.getHealth() <= 0)
        {
            this.remove();
        }
        
    }

    /**
     * returns the cost of this ant
     * @return the foodCost
     */
    public int getFoodCost()
    {
        return this.foodCost;
    }

}
