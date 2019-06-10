import sofia.micro.*;

// -------------------------------------------------------------------------
/**
 *  Tests wall ant class
 *
 *  @author Andrew Perry (andrewperry)
 *  @version 2018.11.20
 */
public class WallAntTest extends TestCase
{
    //~ Fields ................................................................

    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * Creates a new WallAntTest test object.
     */
    public WallAntTest()
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
     * test constructor
     */
    public void testWallAnt()
    {
        WallAnt tom = new WallAnt();
        assertEquals(tom.getHealth(), 4);
        assertEquals(tom.getFoodCost(), 4);
    }

    /**
     * tests act when health doesnt equal 0
     */
    public void testactfalse()
    {
        WallAnt tom = new WallAnt();
        Colony yes = new Colony();
        yes.add(tom, 1, 3);
        tom.injure(3);
        tom.act();
        assertEquals(tom.getHealth(), 1);
    }
}
