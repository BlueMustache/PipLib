package com.yates.pipboylib;

import java.io.UnsupportedEncodingException;

public class DataUpdate {

	public static void parse(int length, byte[] payload){
		if (length == 6){
			String py = Utils.toHexString(payload);
			if(py == "0 f 0 0 0 0"){
				System.out.println("Un-Pause!");
			}
			if(py == "0 f 0 0 0 1"){
				System.out.println("Pause!");
			}
			System.out.println(py);
		}
	}
	
}
