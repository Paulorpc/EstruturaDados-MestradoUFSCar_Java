package com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex3;


public class Cesar {
	
	public static final int alphasize = 26;
	public static final char[] alpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 
										'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 
										'U', 'V', 'W', 'X', 'Y', 'Z'};
	
	protected char[] encrypt = new char[alphasize];
	protected char[] decrypt = new char[alphasize];
	
	public Cesar() {
		for (int i=0; i<alphasize; i++)
			encrypt[i] = alpha[ (i+3) % alphasize ];
		
		for (int i=0; i<alphasize; i++)
			decrypt[ encrypt[i] - 'A' ] = alpha[i];
	}

	
	public String encrypt(String secret) {
		char[] mess = secret.toCharArray();
			
		for (int i=0; i<mess.length; i++)
			if (Character.isUpperCase(mess[i]))
				mess[i] = encrypt[mess[i] - 'A'];
		
		return new String(mess);
	}
	
	
	public String decrypt(String secret) {
		char[] mess = secret.toCharArray();

		for (int i=0; i<mess.length; i++)
			if (Character.isUpperCase(mess[i]))
				mess[i] = decrypt[mess[i] - 'A'];
		
		return new String(mess);
	}

}
