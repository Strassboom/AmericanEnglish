public class AmericanLong{
	private static String[] ones = {"ty","one","two","three","four","five","six","seven","eight","nine"};
	private static String[] teens = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	private static String[] tens = {"ty", "ten","twen","thir","for","fif","six","seven","eigh","nine"};
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
				if(a < 100){
					String aSplittable = Integer.toString(a);
					int cTensPlace = Character.getNumericValue(aSplittable.charAt(0));
					int cOnesPlace = Character.getNumericValue(aSplittable.charAt(1));
					if(cOnesPlace > 0){
						b = tens[cTensPlace] + tens[0] + " " + ones[cOnesPlace];
					}
					else{
						b = tens[cTensPlace] + tens[0];
					}
					System.out.println(b);
					return b;
				}
				else{
					if(a < 1000){
						String aSplittable = Integer.toString(a);
						int cHundredsPlace = Character.getNumericValue(aSplittable.charAt(0));
						int cTensPlace = Character.getNumericValue(aSplittable.charAt(1));
						int cOnesPlace = Character.getNumericValue(aSplittable.charAt(2));
						b = ones[cHundredsPlace] + " hundred";
						if(cTensPlace != 0){
							b = b + " " + tens[cTensPlace] + ones[0];
						}
						if(cOnesPlace != 0){
							b = b +  " " + ones[cOnesPlace];
						}
					
					}
					System.out.println(b);
					return b;
				}
			}
		}
	}
}