import sofia.micro.*;

// -------------------------------------------------------------------------
/**
 *  Tests the colony class
 *
 *  @author Andrew Perry (andrewperry)
 *  @version 2018.11.20
 */
public class ColonyTest extends TestCase
{
    //~ Fields ................................................................

    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * Creates a new ColonyTest test object.
     */
    public ColonyTest()
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
     * test add food
     */
    public void testaddFood()
    {
        Colony newer = new Colony();
        newer.addFood(3);
        assertEquals(newer.getFood(), 13);

    }

    /**
     * test consume food
     */
    public void testconsumeFood()
    {
        Colony newer = new Colony();
        newer.consumeFood(3);
        assertEquals(newer.getFood(), 7);   
    }

    /**
     * test on touchdown
     */
    public void testonTouchDown()
    {
        Colony colony = new Colony();
        // Simulate "clicking" the harvester ant control at the top of screen
        colony.setSelectedActor(HarvesterAnt.class);

        // Now test onTouchDown() on the colony somewhere
        colony.onTouchDown(2, 2);

        // The remainder of your test goes here
        assertEquals(colony.getObjects(HarvesterAnt.class).size(), 1);
    }

    /**
     * test on touchdown out of bounds for
     * x <= 1
     */
    public void testonTouchDownOutBounds()
    {
        Colony colony = new Colony();
        // Simulate "clicking" the harvester ant control at the top of screen
        colony.setSelectedActor(HarvesterAnt.class);

        // Now test onTouchDown() on the colony somewhere
        colony.onTouchDown(0, 6);

        // The remainder of your test goes here
        assertEquals(colony.getObjects(HarvesterAnt.class).size(), 0);
    }

    /**
     * test on touchdown out of bounds
     * x >= 8
     */
    public void testonTouchDownOutBoundsFalseX2()
    {
        Colony colony = new Colony();
        // Simulate "clicking" the harvester ant control at the top of screen
        colony.setSelectedActor(HarvesterAnt.class);

        // Now test onTouchDown() on the colony somewhere
        colony.onTouchDown(9, 4);

        // The remainder of your test goes here
        assertEquals(colony.getObjects(HarvesterAnt.class).size(), 0);
    }

    /**
     * test on touchdown out of bounds
     * y >= 1
     */
    public void testonTouchDownOutBoundsFalseY1()
    {
        Colony colony = new Colony();
        // Simulate "clicking" the harvester ant control at the top of screen
        colony.setSelectedActor(HarvesterAnt.class);

        // Now test onTouchDown() on the colony somewhere
        colony.onTouchDown(0, 5);

        // The remainder of your test goes here
        assertEquals(colony.getObjects(HarvesterAnt.class).size(), 0);
    }

    /**
     * test on touchdown out of bounds
     * y <= 5
     */
    public void testonTouchDownOutBoundsFalseY2()
    {
        Colony colony = new Colony();
        // Simulate "clicking" the harvester ant control at the top of screen
        colony.setSelectedActor(HarvesterAnt.class);

        // Now test onTouchDown() on the colony somewhere
        colony.onTouchDown(6, 5);

        // The remainder of your test goes here
        assertEquals(colony.getObjects(HarvesterAnt.class).size(), 1);
    }        

    /**
     * tests touchdown when food isnt enough
     */
    public void testonTouchDownBrokeBoy()
    {
        Colony colony = new Colony();
        colony.consumeFood(10);
        // Simulate "clicking" the harvester ant control at the top of screen
        colony.setSelectedActor(HarvesterAnt.class);

        // Now test onTouchDown() on the colony somewhere
        colony.onTouchDown(0, 6);

        // The remainder of your test goes here
        assertEquals(colony.getObjects(HarvesterAnt.class).size(), 0);
    }
    /**
     * tests touchdown when food is enough
     */
    public void testonTouchDownRichBoy()
    {
        Colony colony = new Colony();
        // Simulate "clicking" the harvester ant control at the top of screen
        colony.setSelectedActor(HarvesterAnt.class);

        // Now test onTouchDown() on the colony somewhere
        colony.onTouchDown(1, 5);

        // The remainder of your test goes here
        assertEquals(colony.getObjects(HarvesterAnt.class).size(), 1);
    }    
    /**
     * tests touchdown when food isnt enough and in bounds
     */
    public void testonTouchDownBrokeBoyBounds()
    {
        Colony colony = new Colony();
        colony.consumeFood(10);
        // Simulate "clicking" the harvester ant control at the top of screen
        colony.setSelectedActor(HarvesterAnt.class);

        // Now test onTouchDown() on the colony somewhere
        colony.onTouchDown(2, 5);

        // The remainder of your test goes here
        assertEquals(colony.getObjects(HarvesterAnt.class).size(), 0);
    }    
}
