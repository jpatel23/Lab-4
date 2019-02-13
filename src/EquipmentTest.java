public class EquipmentTest {
	 /**
     * Test the empty Equipment constructor and the getters
     */
   /* public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Equipment equip = new Equipment(null);

    
        Assert.assertEquals("", equip.getName());
        Assert.assertEquals(0, equip.getCount());
        Assert.assertEquals(0, equip.getTotalWeight());
        Assert.assertEquals(0, equip.getTotalPrice());
        Assert.assertEquals("", equip.getDescription());
    } */

    // TODO: test full constructor, getters, and toString
    	public void fullConstructorTest() throws AssertException
    	{
    		Equipment full = new Equipment("batman/6,4.0,6.6,utility belt");
    		Assert.assertEquals("batman", full.getName());
            Assert.assertEquals(6, full.getCount());
            Assert.assertEquals(4.0, full.getTotalWeight());
            Assert.assertEquals(6.6, full.getTotalPrice());
            Assert.assertEquals("utility belt", full.getDescription());
            
            Assert.assertEquals("Name: batman, Number: 6, Weight: 4.00 lbs, Price: $6.60 - utility belt", full.toString());
  
    	}
}