package com.yates.pipboylib;

public class Utils {

	public static String toHexString(byte[] messagePayload){
		String pystr = "";
		for(byte b : messagePayload) {
			pystr = pystr + (Integer.toHexString(0xFF&b)) + " ";
		}
		return pystr.trim();
	}
	
}
