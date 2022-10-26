package com.nt.generator;

import java.util.UUID;

public class IdGenerator {
	
	public static String generatedId() {
		return UUID.randomUUID().toString().replace("-","").substring(0, 10);
	}
	
}
