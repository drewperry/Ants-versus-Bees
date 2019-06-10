import sofia.micro.*;

//-------------------------------------------------------------------------
/**
 *  Creates a leaf
 *
 *  @author Andrew Perry (andrewperry)
 *  @version 2018.11.12
 */
public class Leaf extends Actor
{
    //~ Fields ................................................................

    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * Creates a new Leaf object.
     */
    public Leaf()
    {
        super();
    }

    //~ Methods ...............................................................

    /**
     * removes self if passed 9
     * injures bee if it hits one
     */
    public void act()
    {
        if (this.getGridX() < 9)
        {
            move(0.025);
            Bee buzz = this.getOneIntersectingObject(Bee.class);
            if (buzz != null)
            {
                buzz.injure(1);
                this.remove();
            }   
        }
        else
        {
            this.remove();
        }

    }
}
