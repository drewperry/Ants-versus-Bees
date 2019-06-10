import sofia.micro.*;

// -------------------------------------------------------------------------
/**
 *  Tests hive class
 *
 *  @author Andrew Perry (andrewperry)
 *  @version 2018.11.20
 */
public class HiveTest extends TestCase
{
    //~ Fields ................................................................

    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * Creates a new HiveTest test object.
     */
    public HiveTest()
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
     * test getBees()
     */
    public void testgetBees()
    {
        Colony newer = new Colony();
        Hive tedd = new Hive();
        newer.add(tedd, 1, 1);
        assertEquals(tedd.getBees(), 30);
    }

    /**
     * test act
     */
    public void testact()
    {
        Colony newer = new Colony();
        Hive tedd = new Hive();
        newer.add(tedd, 1, 1);
        tedd.act();
        assertEquals(newer.getObjects(Bee.class).size(), 0);
    }

    /**
     * test set bees
     */
    public void setBees()
    {
        Colony newer = new Colony();
        Hive tedd = new Hive();
        newer.add(tedd, 1, 1);

        tedd.setBees(20);

        assertSame(tedd.getBees(), 20);
    }

    /**
     * test act when 400 turns
     */
    public void testactWhen400()
    {
        Colony newer = new Colony();
        Hive tedd = new Hive();
        newer.add(tedd, 1, 1);
        run(newer, 399);
        tedd.act();
        assertEquals(newer.getObjects(Bee.class).size(), 1);
    }

    /**
     * test act when a bee is still there
     */
    public void testactMiddle()
    {
        Colony newer = new Colony();
        Hive tedd = new Hive();
        newer.add(tedd, 1, 1);
        newer.add(new Bee(), 1, 1);
        tedd.act();
        assertEquals(30, tedd.getBees());

    }

    /**
     * test act when no bees
     */
    public void testactNoBees()
    {
        Colony newer = new Colony();
        Hive tedd = new Hive();
        newer.add(tedd, 1, 1);
        tedd.setBees(0);
        run(newer, 399);
        tedd.act();
        assertEquals(0, tedd.getBees());        

    }

    /**
     * test act when both conditions satisfied
     */
    public void testactBothTrue()
    {
        Colony newer = new Colony();
        Hive tedd = new Hive();
        newer.add(tedd, 1, 1);
        tedd.setBees(2);
        run(newer, 399);
        tedd.act();
        assertEquals(1, tedd.getBees());        

    }
}
