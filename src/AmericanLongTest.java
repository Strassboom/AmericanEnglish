import static org.junit.Assert.*;

import org.junit.Test;

public class AmericanLongTest{
	private String one;
	@Test public void ones(){
		try{
			String one = AmericanLong.one(2);
			assertEquals("two", one);
		}
		catch(Exception e){
			e.getMessage();
		}
	}
}