import sofia.micro.*;

// -------------------------------------------------------------------------
/**
 *  Tests the method of the bee class
 *
 *  @author Andrew Perry (andrewperry)
 *  @version 2018.11.20
 */
public class BeeTest extends TestCase
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new BeeTest test object.
     */
    public BeeTest()
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
    public void testBee()
    {
        Bee buzz = new Bee();
        assertEquals(buzz.getHealth(), 3);
    }
    
    /**
     * tests injure
     */
    public void testinjure()
    {
        Bee buzz = new Bee();
        buzz.injure(1);
        assertEquals(buzz.getHealth(), 2);
    }
    
    /**
     * test getHealth
     */
    public void testgetHealth()
    {
        Bee buzz = new Bee();
        assertEquals(buzz.getHealth(), 3);
    }
    
    /**
     * tests act
     */
    public void testact()
    {
        Bee buzz = new Bee();
        Colony tester = new Colony();
        tester.add(buzz, 1, 1);
        assertEquals(buzz.getGridX(), 1);
    }
    /**
     * tests act when on an ant
     */
    public void testactant()
    {
        Bee buzz = new Bee();
        HarvesterAnt todd = new HarvesterAnt();
        Colony tester = new Colony();
        tester.add(buzz, 1, 1);
        tester.add(todd, 1, 1);
        run(tester, 39);
        buzz.act();
        assertEquals(buzz.getGridX(), 1);
    }
    
    /**
     * test on ant when not 40
     */
    public void testactantNot40()
    {
        Bee buzz = new Bee();
        HarvesterAnt todd = new HarvesterAnt();
        Colony tester = new Colony();
        tester.add(buzz, 1, 1);
        tester.add(todd, 1, 1);
        run(tester, 39);
        assertEquals(buzz.getGridX(), 1);
    }
    
    /**
     * test act when bee wins
     */
    public void testactloss()
    {
        Bee buzz = new Bee();
        Colony tester = new Colony();
        tester.add(buzz, 0, 3);
        
        buzz.act();
        assertNotNull(buzz.getIntersectingObjects(QueensChamber.class));
    }
}
