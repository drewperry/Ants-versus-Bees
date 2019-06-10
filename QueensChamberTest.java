import sofia.micro.*;

// -------------------------------------------------------------------------
/**
 *  tests Queens chamber class
 *
 *  @author Andrew Perry (andrewperry)
 *  @version 2018.11.20
 */
public class QueensChamberTest extends TestCase
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new QueensChamberTest test object.
     */
    public QueensChamberTest()
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
    public void testQueensChamber()
    {
        QueensChamber tanya = new QueensChamber();
        Colony newer = new Colony();
        newer.add(tanya, 1, 1);
        assertEquals(tanya.getGridX(), 1);
    }
}
