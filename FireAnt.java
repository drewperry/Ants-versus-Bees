import sofia.micro.*;

//-------------------------------------------------------------------------
/**
 *  FIreAnt explodes when it dies
 *  and injures bees around it
 *  @author Andrew Perry (andrewperry)
 *  @version 2018.11.20
 */
public class FireAnt extends Ants
{
    //~ Fields ................................................................

    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * Creates a new FireAnt object.
     */
    public FireAnt()
    {
        /*# Do any work to initialize your class here. */
        super(1, 4);
    }

    //~ Methods ...............................................................
    /**
     * injures neighboring cell by 3 units
     */
    public void explode()
    {
        int targetX = this.getGridX();
        int targetY = this.getGridY();
        int minX = Math.max(targetX - 1, 0);
        int maxX = Math.min(targetX + 1, this.getWorld().getWidth() - 1);
        int minY = Math.max(targetY - 1, 0);
        int maxY = Math.min(targetY + 1, this.getWorld().getHeight() - 1);
        for (int x = minX; x <= maxX; x++)
        {
            for (int y = minY; y <= maxY; y++)
            {

                Bee buzz = this.getWorld().getOneObjectAt(x, y, Bee.class);
                if (buzz != null)
                {
                    buzz.injure(3);
                }

            }
        }
    }

    /**
     * overrides injure to explode then remove
     * @param n is amount to injure
     */
    public void injure(int n)
    {
        explode();
        super.injure(n);
    }
}

