package org.order;

import java.util.Random;

public class Password {
	
	public String generator() {

		String letters="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
		
		Random rn=new Random();
		
		int no=15;
		char[] password=new char[no];
		
		for (int i = 0; i < no; i++) {
			password[i]=letters.charAt(rn.nextInt(letters.length()));
			
		}
		String pass = new String(password);
		return pass;
		

	}

	public static void main(String[] args) {
		Password p=new Password();
	
		System.out.println(p.generator());
	}

}
