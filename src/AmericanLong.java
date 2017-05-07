public class AmericanLong{
	private static String[] ones = {"ty","one","two","three","four","five","six","seven","eight","nine"};
	private static String[] teens = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	private static String[] tens = {"ten","twen","thir","four","fif","six","seven","eigh","nine"};
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
		else if(a >= 10 && a < 20){
			b = teens[a - 10];
		}
		return b;
	}
}