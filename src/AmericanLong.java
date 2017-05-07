public class AmericanLong{
	private String[] ones = {"ty","one","two","three","four","five","six","seven","eight","nine"};
	private String[] teens = {"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	private String[] tens = {"ten","twenty","thirty"};
	public static String one(int a){
		String b = null;
		if(a < 10){
			if(a != 0){
				//String number = ones[a];
				b = String.valueOf(a);
			}
		}
		return b;
	}
}