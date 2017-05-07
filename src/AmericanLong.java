public class AmericanLong{
	private static String[] ones = {"ty","one","two","three","four","five","six","seven","eight","nine"};
	private static String[] teens = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	private static String[] tens = {"ty", "ten","twen","thir","four","fif","six","seven","eigh","nine"};
	public static String one(int a){
		String b = null;
		if(a < 10){
			if(a != 0){
				//String number = ones[a];
				b = ones[a];
				System.out.println(b);
				return b;
			}
			else{
				b = "zero";
				System.out.println(b);
				return b;
			}
		}
		else{
			if(a < 20){
				b = teens[a - 10];
				System.out.println(b);
				return b;
			}
			else{
				int c = a/10 * 10;
				if(a-c > 0){
					b = tens[a/10] + tens[0] + " " + ones[a - c];
				}
				else{
					b = tens[a/10] + tens[0];
				}
				System.out.println(b);
				return b;
			}
		}
	}
}