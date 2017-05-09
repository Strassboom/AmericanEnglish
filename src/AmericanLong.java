public class AmericanLong{
	private static String[] ones = {"","one","two","three","four","five","six","seven","eight","nine"};
	private static String[] teens = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	private static String[] tens = {"", "ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	public static String one(int a){
		String b = null;
		if(a < 10){
			if(a != 0){
				b = ones[a];
				return b;
			}
			else{
				b = "zero";
				return b;
			}
		}
		else{
			if(a < 20){
				b = teens[a - 10];
				return b;
			}
			else{
				if(a < 100){
					String aSplittable = Integer.toString(a);
					int cTensPlace = Character.getNumericValue(aSplittable.charAt(0));
					int cOnesPlace = Character.getNumericValue(aSplittable.charAt(1));
					b = tens[cTensPlace];
					if(cOnesPlace > 0){
						b = b + " " + ones[cOnesPlace];
					}
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
							b = b + " " + tens[cTensPlace];
						}
						if(cOnesPlace != 0){
							b = b +  " " + ones[cOnesPlace];
						}
						return b;
					}
					else{
						if(a < 10000){                                                                         
							String aSplittable = Integer.toString(a);
							int cThousandsPlace = Character.getNumericValue(aSplittable.charAt(0));
							int cHundredsPlace = Character.getNumericValue(aSplittable.charAt(1));
							int cTensPlace = Character.getNumericValue(aSplittable.charAt(2));
							int cOnesPlace = Character.getNumericValue(aSplittable.charAt(3));
							b = ones[cThousandsPlace] + " thousand";
							if(cHundredsPlace != 0){
								b = b + " " + ones[cHundredsPlace] + " hundred";
							}
							if(cTensPlace != 0){
								b = b + " " + tens[cTensPlace];
							}
							if(cOnesPlace != 0){
								b = b +  " " + ones[cOnesPlace];
							}
							//System.out.println(b);
							return b;
						}
						else{
							if(a < 100000){                                                                         
								String aSplittable = Integer.toString(a);
								int cTenThousandsPlace = Character.getNumericValue(aSplittable.charAt(0));
								int cThousandsPlace = Character.getNumericValue(aSplittable.charAt(1));
								if(cTenThousandsPlace > 1){
									b = tens[cTenThousandsPlace] + " " + ones[cThousandsPlace];
								}
								else if(cTenThousandsPlace == 1){
									b = teens[cTenThousandsPlace];
								}
								int cHundredsPlace = Character.getNumericValue(aSplittable.charAt(2));
								int cTensPlace = Character.getNumericValue(aSplittable.charAt(3));
								int cOnesPlace = Character.getNumericValue(aSplittable.charAt(4));
								b = b + " thousand";
								if(cHundredsPlace != 0){
									b = b + " " + ones[cHundredsPlace] + " hundred";
								}
								if(cTensPlace != 0){
									b = b + " " + tens[cTensPlace];
								}
								if(cOnesPlace != 0){
									b = b +  " " + ones[cOnesPlace];
								}
								//System.out.println(b);
								return b;
							}
							else{
								if(a < 1000000){                                                                         
									String aSplittable = Integer.toString(a);
									int cHundredThousandsPlace = Character.getNumericValue(aSplittable.charAt(0));
									int cTenThousandsPlace = Character.getNumericValue(aSplittable.charAt(1));
									int cThousandsPlace = Character.getNumericValue(aSplittable.charAt(2));
									int cHundredsPlace = Character.getNumericValue(aSplittable.charAt(3));
									int cTensPlace = Character.getNumericValue(aSplittable.charAt(4));
									int cOnesPlace = Character.getNumericValue(aSplittable.charAt(5));
									b = ones[cHundredThousandsPlace] + " hundred";
									if(cTenThousandsPlace > 1 || cTenThousandsPlace == 0){
										b = b + " " + tens[cTenThousandsPlace] + " " + ones[cThousandsPlace];
									}
									else if(cTenThousandsPlace == 1){
										b = b + " " + teens[cTenThousandsPlace];
									}
									if(cHundredThousandsPlace > 0 || cTenThousandsPlace > 0 || cThousandsPlace > 0){
										b = b + " thousand";
									}
									if(cHundredsPlace != 0){
										b = b + " " + ones[cHundredsPlace] + " hundred";
									}
									if(cTensPlace != 0){
										b = b + " " + tens[cTensPlace];
									}
									if(cOnesPlace != 0){
										b = b +  " " + ones[cOnesPlace];
									}
									//System.out.println(b);
									return b;
								}
								else{
									if(a < 10000000){                                                                         
										String aSplittable = Integer.toString(a);
										int cMillionsPlace = Character.getNumericValue(aSplittable.charAt(0));
										int cHundredThousandsPlace = Character.getNumericValue(aSplittable.charAt(1));
										int cTenThousandsPlace = Character.getNumericValue(aSplittable.charAt(2));
										int cThousandsPlace = Character.getNumericValue(aSplittable.charAt(3));
										int cHundredsPlace = Character.getNumericValue(aSplittable.charAt(4));
										int cTensPlace = Character.getNumericValue(aSplittable.charAt(5));
										int cOnesPlace = Character.getNumericValue(aSplittable.charAt(6));
										b = ones[cMillionsPlace] + " million";
										if(cHundredThousandsPlace != 0){
											b = b + " " + ones[cHundredThousandsPlace] + " hundred";
										}
										if(cTenThousandsPlace > 1 || cTenThousandsPlace == 0){
											b = b + " " + tens[cTenThousandsPlace] + " " + ones[cThousandsPlace];
										}
										else if(cTenThousandsPlace == 1){
											b = b + " " + teens[cTenThousandsPlace];
										}
										if(cHundredThousandsPlace > 0 || cTenThousandsPlace > 0 || cThousandsPlace > 0){
											b = b + " thousand";
										}
										if(cHundredsPlace != 0){
											b = b + " " + ones[cHundredsPlace] + " hundred";
										}
										if(cTensPlace != 0){
											b = b + " " + tens[cTensPlace];
										}
										if(cOnesPlace != 0){
											b = b +  " " + ones[cOnesPlace];
										}
										//System.out.println(b);
										return b;
									}
									/**
									else{
										if(a < 100000000){                                                                         
											String aSplittable = Integer.toString(a);
											int cTenMillionsPlace = Character.getNumericValue(aSplittable.charAt(0));
											int cMillionsPlace = Character.getNumericValue(aSplittable.charAt(1));
											int cHundredThousandsPlace = Character.getNumericValue(aSplittable.charAt(2));
											int cTenThousandsPlace = Character.getNumericValue(aSplittable.charAt(3));
											int cThousandsPlace = Character.getNumericValue(aSplittable.charAt(4));
											int cHundredsPlace = Character.getNumericValue(aSplittable.charAt(5));
											int cTensPlace = Character.getNumericValue(aSplittable.charAt(6));
											int cOnesPlace = Character.getNumericValue(aSplittable.charAt(7));
											if(cTenMillionsPlace > 1 || cMillionsPlace == 0){
												b = tens[cTenMillionsPlace] + " " + ones[cMillionsPlace];
											}
											else if(cMillionsPlace == 1){
												b = teens[cTenMillionsPlace];
											}
											b = b + " million";
											if(cHundredThousandsPlace != 0){
												b = b + " " + ones[cHundredThousandsPlace] + " hundred";
											}
											if(cTenThousandsPlace > 1 || cTenThousandsPlace == 0){
												b = b + " " + tens[cTenThousandsPlace] + " " + ones[cThousandsPlace];
											}
											else if(cTenThousandsPlace == 1){
												b = b + " " + teens[cTenThousandsPlace];
											}
											if(cHundredThousandsPlace > 0 || cTenThousandsPlace > 0 || cThousandsPlace > 0){
												b = b + " thousand";
											}
											if(cHundredsPlace != 0){
												b = b + " " + ones[cHundredsPlace] + " hundred";
											}
											if(cTensPlace != 0){
												b = b + " " + tens[cTensPlace];
											}
											if(cOnesPlace != 0){
												b = b +  " " + ones[cOnesPlace];
											}
											//System.out.println(b);
											return b;
										}
										else{
											if(a < 1000000000){                                                                         
												String aSplittable = Integer.toString(a);
												int cHundredMillionsPlace = Character.getNumericValue(aSplittable.charAt(0));
												int cTenMillionsPlace = Character.getNumericValue(aSplittable.charAt(1));
												int cMillionsPlace = Character.getNumericValue(aSplittable.charAt(2));
												int cHundredThousandsPlace = Character.getNumericValue(aSplittable.charAt(3));
												int cTenThousandsPlace = Character.getNumericValue(aSplittable.charAt(4));
												int cThousandsPlace = Character.getNumericValue(aSplittable.charAt(5));
												int cHundredsPlace = Character.getNumericValue(aSplittable.charAt(6));
												int cTensPlace = Character.getNumericValue(aSplittable.charAt(7));
												int cOnesPlace = Character.getNumericValue(aSplittable.charAt(8));
												b = ones[cHundredMillionsPlace] + " hundred";
												if(cTenMillionsPlace > 1 || cMillionsPlace == 0){
													b = b + " " + tens[cTenMillionsPlace] + " " + ones[cMillionsPlace];
												}
												else if(cMillionsPlace == 1){
													b = b + " " + teens[cTenMillionsPlace];
												}
												b = b + " million";
												if(cHundredThousandsPlace != 0){
													b = b + " " + ones[cHundredThousandsPlace] + " hundred";
												}
												if(cTenThousandsPlace > 1 || cTenThousandsPlace == 0){
													b = b + " " + tens[cTenThousandsPlace] + " " + ones[cThousandsPlace];
												}
												else if(cTenThousandsPlace == 1){
													b = b + " " + teens[cTenThousandsPlace];
												}
												if(cHundredThousandsPlace > 0 || cTenThousandsPlace > 0 || cThousandsPlace > 0){
													b = b + " thousand";
												}
												if(cHundredsPlace != 0){
													b = b + " " + ones[cHundredsPlace] + " hundred";
												}
												if(cTensPlace != 0){
													b = b + " " + tens[cTensPlace];
												}
												if(cOnesPlace != 0){
													b = b +  " " + ones[cOnesPlace];
												}
												//System.out.println(b);
												return b;
											}
											else{
												if(a <= 2147483647){                                                                         
													String aSplittable = Integer.toString(a);
													int cBillionsPlace = Character.getNumericValue(aSplittable.charAt(0));
													int cHundredMillionsPlace = Character.getNumericValue(aSplittable.charAt(1));
													int cTenMillionsPlace = Character.getNumericValue(aSplittable.charAt(2));
													int cMillionsPlace = Character.getNumericValue(aSplittable.charAt(3));
													int cHundredThousandsPlace = Character.getNumericValue(aSplittable.charAt(4));
													int cTenThousandsPlace = Character.getNumericValue(aSplittable.charAt(5));
													int cThousandsPlace = Character.getNumericValue(aSplittable.charAt(6));
													int cHundredsPlace = Character.getNumericValue(aSplittable.charAt(7));
													int cTensPlace = Character.getNumericValue(aSplittable.charAt(8));
													int cOnesPlace = Character.getNumericValue(aSplittable.charAt(9));
													b = ones[cBillionsPlace] + " billion";
													if(cHundredMillionsPlace != 0){
														b = b + " " + ones[cHundredMillionsPlace] + " hundred";
													}
													if(cTenMillionsPlace > 1 || cMillionsPlace == 0){
														b = b + " " + tens[cTenMillionsPlace] + " " + ones[cMillionsPlace];
													}
													else if(cMillionsPlace == 1){
														b = b + " " + teens[cTenMillionsPlace];
													}
													if(cHundredMillionsPlace > 0 || cTenMillionsPlace > 0 || cMillionsPlace > 0){
														b = b + " million";
													}
													if(cHundredThousandsPlace != 0){
														b = b + " " + ones[cHundredThousandsPlace] + " hundred";
													}
													if(cTenThousandsPlace > 1 || cTenThousandsPlace == 0){
														b = b + " " + tens[cTenThousandsPlace] + " " + ones[cThousandsPlace];
													}
													else if(cTenThousandsPlace == 1){
														b = b + " " + teens[cTenThousandsPlace];
													}
													if(cHundredThousandsPlace > 0 || cTenThousandsPlace > 0 || cThousandsPlace > 0){
														b = b + " thousand";
													}
													if(cHundredsPlace != 0){
														b = b + " " + ones[cHundredsPlace] + " hundred";
													}
													if(cTensPlace != 0){
														b = b + " " + tens[cTensPlace];
													}
													if(cOnesPlace != 0){
														b = b +  " " + ones[cOnesPlace];
													}
													//System.out.println(b);
													System.out.println(b);
													return b;
												}
											}
										}
									}
									*/
								}
							}
						}
					}
					return b;
				}
			}
		}
	}
}