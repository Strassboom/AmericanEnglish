import static org.junit.Assert.*;

import org.junit.Test;

public class AmericanLongTest{
	private String one;
	@Test public void zero(){
		try{
			String zero = AmericanLong.one(0);
			assertEquals("zero", zero);
		}
		catch(Exception e){
			e.getMessage();
		}
	}
	@Test public void ones(){
		try{
			String one = AmericanLong.one(2);
			assertEquals("two", one);
		}
		catch(Exception e){
			e.getMessage();
		}
	}
	@Test public void ten(){
		try{
			String ten = AmericanLong.one(10);
			assertEquals("ten", ten);
		}
		catch(Exception e){
			e.getMessage();
		}
	}
}