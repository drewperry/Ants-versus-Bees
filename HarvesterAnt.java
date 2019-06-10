import sofia.micro.*;

//-------------------------------------------------------------------------
/**
 *  Harvests 1 food for colony every 40 turns
 *
 *  @author Andrew Perry (andrewperry)
 *  @version 2018.11.20
 */
public class HarvesterAnt extends Ants
{
    //~ Fields ................................................................
    private int turns;

    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * Creates a new HarvesterAnt object.
     */
    public HarvesterAnt()
    {
        super(1, 2);
        turns = 0;
    }

    //~ Methods ...............................................................
    /**
     * harvests food for the colony
     */
    public void act()
    {
        turns++;
        if (turns == 40)
        {
            ((Colony)getWorld()).addFood(1);
            turns = 0;
        }
    }
}
