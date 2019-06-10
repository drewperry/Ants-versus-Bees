import sofia.micro.*;

//-------------------------------------------------------------------------
/**
 *  Ants eats and digests bees
 *
 *  @author Andrew Perry (andrewperry)
 *  @version 2018.11.20
 */
public class HungryAnt extends Ants
{
    //~ Fields ................................................................
    private int turns;
    private boolean digesting;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new HungryAnt object.
     */
    public HungryAnt()
    {
        super(1, 5);
        digesting = false;
    }

    /**
     * checks if digesting
     * @return if bee is still being digested
     */
    public boolean digesting()
    {
        return this.digesting;
    }

    /**
     * sets digesting
     */
    public void fullStomach()
    {
        digesting = true;
    }

    //~ Methods ...............................................................
    /**
     * Eats bee and digests
     */
    @Override
    public void act()
    {
        super.act();
        if (this.getOneIntersectingObject(Bee.class) != null && !digesting)
        {
            this.getOneIntersectingObject(Bee.class).remove();
            digesting = true;
        }
        if (digesting)
        {
            turns++;
            if (turns >= 240)
            {
                digesting = false;
                turns = 0;
            }
        }

    }
}
