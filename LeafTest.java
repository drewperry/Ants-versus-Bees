import sofia.micro.*;

// -------------------------------------------------------------------------
/**
 *  tests leaf class
 *
 *  @author Andrew Perry (andrewperry)
 *  @version 2018.11.20
 */
public class LeafTest extends TestCase
{
    //~ Fields ................................................................

    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * Creates a new LeafTest test object.
     */
    public LeafTest()
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
    public void testLeaf()
    {
        Leaf sped = new Leaf();
        assertEquals(sped, sped);
    }

    /**
     * tests act when in bounds and bee = null
     */
    public void testact()
    {
        Leaf green = new Leaf();
        Colony tom = new Colony();
        tom.add(green, 1, 5);

        green.act();
        assertEquals( (double) green.getGridX(), 1.025, 0.025);
    }

    /**
     * tests act when on bee
     */
    public void testactonbee()
    {
        Leaf green = new Leaf();
        Colony tom = new Colony();
        Bee buzzz = new Bee();
        tom.add(green, 3, 4);
        tom.add(buzzz, 3, 4);
        green.act();
        assertEquals(tom.getObjects(Leaf.class).size(), 0);

    }

    /**
     * tests when x > 9
     */
    public void testactwhen9()
    {
        Leaf green = new Leaf();
        Colony tom = new Colony();
        tom.add(green, 9, 4);

        green.act();
        assertEquals(tom.getObjects(Leaf.class).size(), 0);
    }
}
