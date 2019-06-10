import sofia.micro.*;
import sofia.util.Random;
//-------------------------------------------------------------------------
/**
 *  Spawns the bees of the hive
 *
 *  @author Andrew Perry (andrewperry)
 *  @version 2018.11.20
 */
public class Hive extends Actor
{
    //~ Fields ................................................................
    private int bees;
    private int turns;
    private int spawnBee;

    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * Creates a new Hive object.
     */
    public Hive()
    {
        /*# Do any work to initialize your class here. */
        super();
        turns = 0;
        bees = 30;
        spawnBee = 400;
    }

    //~ Methods ...............................................................
    /**
     *@return number of bees in the hive
     * 
     */
    public int getBees()
    {
        return bees;
    }

    /**
     * sets number of bees to be relased
     * @param n is the number in hive
     */
    public void setBees(int n)
    {
        bees = n;
    }

    /**
     * lets out bees and determines if win
     */
    public void act()
    {
        turns = turns + 1;
        int rando = (Random.generator().nextInt(1, 5));
        if (turns >= spawnBee && bees > 0)
        {
            this.getWorld().add(new Bee(), 9, rando);
            bees = bees - 1;
            turns = 0;
            spawnBee = (Random.generator().nextInt(80, 400));
        }
        if (this.getBees() == 0 && 
            ((Colony)getWorld()).getObjects(Bee.class).size() == 0)
        {
            ((Colony)getWorld()).win();
        }

    }

}
