import sofia.micro.*;

// -------------------------------------------------------------------------
/**
 *  Tests thrower ant
 *
 *  @author Andrew Perry (andrewperry)
 *  @version 2018.11.20
 */
public class ThrowerAntTest extends TestCase
{
    //~ Fields ................................................................

    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * Creates a new ThrowerAntTest test object.
     */
    public ThrowerAntTest()
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
    public void testThrowerAnt()
    {
        ThrowerAnt tom = new ThrowerAnt();
        assertEquals(tom.getFoodCost(), 4);
        assertEquals(tom.getHealth(), 1);
    }


    /**
     * when it reaches 120 turns
     */
    public void testactwhen120()
    {  
        ThrowerAnt tom = new ThrowerAnt();
        Colony yes = new Colony();   
        yes.add(tom, 1, 1);

        run(yes, 121);
        assertEquals(yes.getObjects(Leaf.class).size(), 1);
    }

}   
