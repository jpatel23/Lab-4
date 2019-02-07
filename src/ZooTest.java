public class ZooTest 
{
/**
     * Test the empty Zoo constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Zoo animal = new Zoo(0);

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals(0, animal.getCapacity());
        Assert.assertEquals(0, animal.getAverageWeight());
        Assert.assertEquals(0, animal.getAverageWeight("Red"));
        Assert.assertEquals(0.0, animal.getTotalHeight());
    }

    // TODO: test full constructor, getters, and toString
    	public void fullConstructorTest() throws AssertException
    	{
    		Zoo full = new Zoo(1);
    		Animal one = new Animal("blue", "cat", 1.0, 1.0);
    		Animal two = new Animal("red", "dog", 1.0, 1.0);
    		
    		full.addAnimal(one);
    		full.addAnimal(two);
    		
    		Assert.assertEquals(2, full.getCapacity());
            Assert.assertEquals(1, full.getAverageWeight());
            Assert.assertEquals(1, full.getAverageWeight("red"));
            Assert.assertEquals(2.0, full.getTotalHeight());
            
            Assert.assertEquals("These animals live in the zoo: \ncat, a blue-colored animal. 1.0 pounds, 1.0 inches\ndog, a red-colored animal. 1.0 pounds, 1.0 inches\n", full.toString());
    	}
}