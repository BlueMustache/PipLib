package com.yates.pipboylib;

import java.io.IOException;
import java.util.List;

import com.yates.pipboylib.Discovery.DiscoverResponse;

public class ConnectToGame {
	public static void main(String[] args) throws IOException {
		System.out.println("Discovering hosts...");
		List<DiscoverResponse> responses = Discovery.discover();
		System.out.println("Discovery complete");
		System.out.println();
		
		for(DiscoverResponse response : responses) {
			if(response.isBusy()) {
				System.out.println("Skipping busy host: " + response);
			} else {
				System.out.println("Connecting to available host: " + response);
				Session.connect(response.getMachineAddress());
			}
		}
	}
}
