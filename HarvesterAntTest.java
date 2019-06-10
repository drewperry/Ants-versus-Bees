import sofia.micro.*;

// -------------------------------------------------------------------------
/**
 *  Tests harvester ant class
 *
 *  @author Andrew Perry (andrewperry)
 *  @version 2018.11.20
 **/
public class HarvesterAntTest extends TestCase
{
    //~ Fields ................................................................

    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * Creates a new HarvesterAntTest test object.
     */
    public HarvesterAntTest()
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
     * tests getHealth()
     */
    public void testgetHealth()
    {
        HarvesterAnt tom = new HarvesterAnt();
        assertEquals(1, tom.getHealth());
    }

    /**
     * tests constuctor
     */
    public void testHarvesterAnt()
    {
        HarvesterAnt tom = new HarvesterAnt();
        assertEquals(2, tom.getFoodCost());
        assertEquals(1, tom.getHealth());
    }

    /**
     * tests act
     */
    public void testact()
    {
        Colony newer = new Colony();
        HarvesterAnt todd = new HarvesterAnt();
        newer.add(todd, 1, 4);
        run(newer, 42);
        assertEquals(newer.getFood(), 11);
    }

}
