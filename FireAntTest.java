import sofia.micro.*;

// -------------------------------------------------------------------------
/**
 * tests fire ant class
 *
 *  @author Andrew Perry (andrewperry)
 *  @version 2018.11.20
 */
public class FireAntTest extends TestCase
{
    //~ Fields ................................................................

    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * Creates a new FireAntTest test object.
     */
    public FireAntTest()
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
    public void testFireAnt()
    {
        FireAnt frank = new FireAnt();
        assertEquals(frank.getFoodCost(), 4);

    }

    /**
     * tests explode
     */
    public void testExplode()
    {
        Colony tester = new Colony();
        FireAnt fuego = new FireAnt();
        Bee buzz = new Bee();
        tester.add(buzz, 0, 4);
        tester.add(fuego, 0, 5);
        fuego.explode();
        assertEquals(tester.getObjects(Bee.class).size(), 0);

    }

    /**
     * tests act
     */
    public void testact()
    {
        Colony tester = new Colony();
        FireAnt fuego = new FireAnt();
        tester.add(fuego, 1, 1);
        fuego.injure(5);
        fuego.act();
        assertEquals(tester.getObjects(FireAnt.class).size(), 0);
    }

    /**
     * test act when health is over 0
     */
    public void testactAlive()
    {
        Colony tester = new Colony();
        FireAnt fuego = new FireAnt();
        tester.add(fuego, 1, 1);
        fuego.act();
        assertEquals(tester.getObjects(FireAnt.class).size(), 1);
    }
}
