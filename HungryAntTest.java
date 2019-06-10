import sofia.micro.*;

// -------------------------------------------------------------------------
/**
 *  Eats and digests bees
 *
 *  @author Andrew Perry (andrewperry)
 *  @version 2018.11.20
 */
public class HungryAntTest extends TestCase
{
    //~ Fields ................................................................

    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * Creates a new HungryAntTest test object.
     */
    public HungryAntTest()
    {
        // The constructor is usually empty in unit tests, since it runs
        // once for the whole class, not once for each test method.
        // Per-test initialization should be placed in setUp() instead.
    }

    //~ Methods ...............................................................
    // ----------------------------------------------------------
    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    public void setUp()
    {
        /*# Insert your own setup code here */
    }

    // ----------------------------------------------------------
    /*# Insert your own test methods here */

    /**
     * tests constructor
     */

    public void testHungryAnt()
    {
        HungryAnt tom = new HungryAnt();
        assertEquals(1, tom.getHealth());
        assertEquals(5, tom.getFoodCost());

    }


    /**
     * tests act when bee there
     */
    public void testactDigest()
    {
        Colony yest = new Colony();
        HungryAnt tom = new HungryAnt();
        yest.add(tom, 1, 1);
        Bee buzz = new Bee();
        yest.add(buzz, 1, 1);
        tom.act();
        assertEquals(yest.getObjects(Bee.class).size(), 0);
        assertTrue(tom.digesting());

    }

    /**
     * test when 240 turns and not digesting
     */
    public void testactDigest240()
    {
        Colony yest = new Colony();
        HungryAnt tom = new HungryAnt();
        yest.add(tom, 1, 1);
        Bee buzz = new Bee();
        yest.add(buzz, 1, 1);
        tom.act();

        run(yest, 240);
        assertFalse(tom.digesting());
    }

    /**
     * test when not 240 turns and not digesting
     */
    public void testactDigestNot240()
    {
        Colony yest = new Colony();
        HungryAnt tom = new HungryAnt();
        yest.add(tom, 1, 1);
        Bee buzz = new Bee();
        yest.add(buzz, 1, 1);
        tom.act();

        run(yest, 100);
        assertTrue(tom.digesting());
    }

    /**
     * test when not 240 turns and digesting
     */
    public void testactDigestNot240FULL()
    {
        Colony yest = new Colony();
        HungryAnt tom = new HungryAnt();
        yest.add(tom, 1, 1);
        Bee buzz = new Bee();
        yest.add(buzz, 1, 1);
        run(yest, 240);
        tom.fullStomach();
        tom.act();
        assertTrue(tom.digesting());
    }

    /**
     * test when not 240 turns and digesting
     */
    public void testactDigestNot240FULLnull()
    {
        Colony yest = new Colony();
        HungryAnt tom = new HungryAnt();
        yest.add(tom, 1, 1);
        run(yest, 240);
        tom.fullStomach();
        tom.act();
        assertTrue(tom.digesting());
    }    

    /**
     * tests full stomach
     */
    public void testfullStomach()
    {
        Colony yest = new Colony();
        HungryAnt tom = new HungryAnt();
        yest.add(tom, 1, 1);
        tom.fullStomach();
        assertTrue(tom.digesting());

    }
}
