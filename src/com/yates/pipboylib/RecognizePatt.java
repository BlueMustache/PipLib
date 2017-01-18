package com.yates.pipboylib;

public class RecognizePatt {
	public static void parse(int messageType, int messageLength, byte[] messagePayload){
		if(messageType == MessageType.KEEP_ALIVE){
		}
		if(messageType == MessageType.CONNECTION){
			System.out.println("Received JSON Preamble: " + new String(messagePayload));
		}
		if(messageType == MessageType.CONNECTION_REFUSED){
			System.out.println("Refused connection!");
		}
		if(messageType == MessageType.DATA_UPDATE){
			DataUpdate.parse(messageLength, messagePayload);
		}
	}
}
