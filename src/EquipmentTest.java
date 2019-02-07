public class EquipmentTest {
	 /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Equipment equip = new Equipment();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    // TODO: test full constructor, getters, and toString
    	public void fullConstructorTest() throws AssertException
    	{
    		Animal full = new Animal("brown", "dog", 1.0, 1.0);
    		Assert.assertEquals("brown", full.getColor());
    		Assert.assertEquals("dog", full.getName());
    		Assert.assertEquals(1.0, full.getWeight());
    		Assert.assertEquals(1.0, full.getHeight());
    	}
}