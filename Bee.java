import sofia.micro.*;

//-------------------------------------------------------------------------
/**
 *  Creates a bee to attack a colony
 *
 *  @author Andrew Perry (andrewperry)
 *  @version 2018.11.12
 */
public class Bee extends Actor
{
    //~ Fields ................................................................
    private int health;
    private int turns;

    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * Creates a new Bee object.
     */
    public Bee()
    {
        /*# Do any work to initialize your class here. */
        super();
        health = 3;
        turns = 0;
        turn(-180);
    }

    //~ Methods ...............................................................
    /**
     * returns bee health
     * @return int bee health
     */
    public int getHealth()
    {
        return this.health;
    }

    /**
     * injures the bee and removes
     * if health is zero
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
     * how the bee will interact
     * strings ant every 40 turns
     */    
    @Override
    public void act()
    {
        super.act();
        if (this.getOneIntersectingObject(Ants.class) == null)
        {
            this.move(0.0125);
        }
        else
        {
            turns++;
            if (turns == 40)
            {
                this.getOneIntersectingObject(Ants.class).injure(1);
                turns = 0;
            }
        }

        QueensChamber buzz = this.getOneIntersectingObject(QueensChamber.class);
        if (buzz != null)
        {
            ((Colony)getWorld()).lose();
        }
    }
}
