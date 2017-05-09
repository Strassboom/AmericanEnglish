import static org.junit.Assert.*;

import org.junit.Test;

public class AmericanLongTest{
	private String zero;
	private String one;
	private String teen;
	private String tens;
	private String hundreds;
	private String thousands;
	private String tenthousands;
	private String hundredthousands;
	private String millions;
	private String tenmillions;
	private String hundredmillions;
	private String billions;
	private String tenbillions;
	private String hundredbillions;
	private String trillions;
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
			tens = AmericanLong.one(95);
			assertEquals("ninety five", tens);
		}
		catch(Exception e){
			e.getMessage();
		}
	}
	@Test public void hundreds(){
		try{
		hundreds = AmericanLong.one(247);
		assertEquals("two hundred forty seven", hundreds);
		}
		catch(Exception e){
			e.getMessage();
		}
	}
	@Test public void thousands(){
		try{
			thousands = AmericanLong.one(3690);
			assertEquals("three thousand six hundred ninety", thousands);
			//System.out.print(thousands);
		}
		catch(Exception e){
			e.getMessage();
		}
	}
	/**
	@Test public void tenthousands(){
		try{
			tenthousands = AmericanLong.one(27176);
			assertEquals("twenty seven thousand one hundred seventy six", tenthousands);
			//System.out.print(tenthousands);
		}
		catch(Exception e){
			e.getMessage();
		}
	}
	@Test public void hundredthousands(){
		try{
			hundredthousands = AmericanLong.one(985621);
			assertEquals("nine hundred eighty five thousand six hundred twenty one", hundredthousands);
			//System.out.print(hundredthousands);
		}
		catch(Exception e){
			e.getMessage();
		}
	}
	@Test public void millions(){
		try{
			millions = AmericanLong.one(8234102);
			assertEquals("eight million two hundred thirty four thousand one hundred two", millions);
		}
		catch(Exception e){
			e.getMessage();
		}
	}
	@Test public void tenmillions(){
		try{
			tenmillions = AmericanLong.one(36029145);
			assertEquals("thirty six million twenty nine thousand one hundred forty five", tenmillions);
		}
		catch(Exception e){
			e.getMessage();
		}
	}
	@Test public void hundredmillions(){
		try{
			hundredmillions = AmericanLong.one(187465190);
			assertEquals("one hundred eighty seven million four hundred sixty five thousand one hundred ninety", hundredmillions);
		}
		catch(Exception e){
			e.getMessage();
		}
	}
	@Test public void billions(){
		try{
			billions = AmericanLong.one(2147483647);
			assertEquals("two billion one hundred forty seven million four hundred eighty three thousand six hundred forty seven", billions);
			System.out.print(billions);
		}
		catch(Exception e){
			e.getMessage();
		}
	}
	*/
}