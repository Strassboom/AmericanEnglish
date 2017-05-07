import static org.junit.Assert.*;

import org.junit.Test;

public class AmericanLongTest{
	private String one;
	@Test public void ones(){
		try{
			String one = AmericanLong.one(11);
			assertEquals("2", one);
		}
		catch(Exception e){
			e.getMessage();
		}
	}
}