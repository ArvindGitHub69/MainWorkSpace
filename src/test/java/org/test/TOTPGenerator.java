package org.test;

import org.jboss.aerogear.security.otp.Totp;

public class TOTPGenerator {

	public static String get2FA(String key) {
		Totp totp = new Totp(key);
		return totp.now();
	}
	
	public static void main(String[] args) {
		
		System.out.println(get2FA("ajya mg25 ouch 2xce"));
		
		
		
	}
}
