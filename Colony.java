import sofia.micro.*;

//-------------------------------------------------------------------------
/**
 *  Colony class is the world for
 *  the bees and ants
 *  @author Andrew Perry (andrewperry)
 *  @version 2018.11.20
 */
public class Colony extends HomeBase
{
    //~ Fields ................................................................
    private static int food;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new Colony object.
     */
    public Colony()
    {
        super();
        food = 10;
        // Add the queen's chamber and hive to the world here
        this.add(new QueensChamber(), 0, 3);
        this.add(new Hive(), 9, 3);
        // Lay out the ant choices the player can click on in the
        // method call commented out below.  As you add ants, you
        // can add them to this list, so you have a playable
        // version of your game to try out, no matter how much
        // you have left to finish.

        setActorChoices(
            HarvesterAnt.class,
            ThrowerAnt.class,
            WallAnt.class,
            FireAnt.class,
            HungryAnt.class);
    }

    //~ Methods ...............................................................
    // ----------------------------------------------------------
    /**
     * Add an ant to the screen when a specific location is clicked.
     * This method is automatically called while the simulation is
     * running, whenever the user clicks on (or taps on) a location
     * in the colony (one that isn't covered by an actor already).
     * 
     * @param x The x-coordinate of the click
     * @param y The y-coordinate of the click
     */
    public void onTouchDown(int x, int y)
    {
        // Complete this method yourself.

        // Only allow ants to be added between (1, 1) - (8, 5),
        // which makes up the playable area of the colony.   You
        // should ignore clicks/taps in locations outside of that
        // range.
        Ants chosenOne = ((Ants) newActorOfSelectedType());
        if ((x >= 1 && x <= 8) && (y >= 1 && y <= 5))
        {
            if (food >= chosenOne.getFoodCost())
            {
                this.add(chosenOne, x, y);
                consumeFood(chosenOne.getFoodCost());
            }
        }
        // call newActorOfSelectedType() to create a new ant of the
        // type that the user selected from the choices shown at
        // the top of the screen, then add it at the location of
        // the screen "touch".

        // Don't forget that adding an ant costs food!
    }

    /**
     * gets the current food in colony
     * @return returns an int of the food in colony
     */
    public int getFood()
    {
        return this.food;
    }

    /**
     * adds food to colony
     * @param n is by what amount
     */
    public void addFood(int n)
    {
        this.food = this.food + n;   
    }

    /**
     * reduces Food of colony
     * @param n is by what amount
     */
    public void consumeFood(int n)
    {
        this.food = this.food - n;    
    }

}
