public class AmericanLong{
	private static String[] ones = {"ty","one","two","three","four","five","six","seven","eight","nine"};
	private String[] teens = {"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	private String[] tens = {"ten","twenty","thirty"};
	public static String one(int a){
		String b = null;
		if(a < 10){
			if(a != 0){
				//String number = ones[a];
				b = ones[a];
			}
			else{
				b = "zero";
			}
		}
		return b;
	}
}