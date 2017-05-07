import static org.junit.Assert.*;

import org.junit.Test;

public class AmericanLongTest{
	private String zero;
	private String one;
	private String ten;
	private String teen;
	private String tens;
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
	@Test public void teen(){
		try{
			teen = AmericanLong.one(14);
			assertEquals("fourteen", teen);
		}
		catch(Exception e){
			e.getMessage();
		}
	}
	@Test public void tens(){
		try{
			tens = AmericanLong.one(99);
			assertEquals("ninety nine", tens);
		}
		catch(Exception e){
			e.getMessage();
		}
	}
}