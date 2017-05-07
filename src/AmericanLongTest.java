import static org.junit.Assert.*;

import org.junit.Test;

public class AmericanLongTest{
	private String zero;
	private String one;
	private String ten;
	private String teen;
	@Test public void zero(){
		try{
			zero = AmericanLong.one(0);
			assertEquals("zero", zero);
		}
		catch(Exception e){
			e.getMessage();
		}
	}
	@Test public void ones(){
		try{
			one = AmericanLong.one(2);
			assertEquals("two", one);
		}
		catch(Exception e){
			e.getMessage();
		}
	}
	@Test public void ten(){
		try{
			ten = AmericanLong.one(10);
			assertEquals("ten", ten);
		}
		catch(Exception e){
			e.getMessage();
		}
	}
}