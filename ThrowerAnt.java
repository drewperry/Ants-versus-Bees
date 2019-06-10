import sofia.micro.*;

//-------------------------------------------------------------------------
/**
 *  Ant that throws a leaf
 *
 *  @author Andrew Perry (andrewperry)
 *  @version 2018.11.20
 */
public class ThrowerAnt extends Ants
{
    //~ Fields ................................................................
    private int turns;

    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * Creates a new ThrowerAnt object.
     */
    public ThrowerAnt()
    {
        super(1, 4);
        turns = 0;
    }

    //~ Methods ...............................................................
    /**
     * creates leaf after 120 turns
     */
    public void act()
    {
        turns++;
        if (turns == 120)
        {
            getWorld().add(new Leaf(), 
                this.getGridX() + 1, this.getGridY());
            turns = 0;
        }

    }

}
