package com.ey.testmanaj.transport;



import com.google.api.client.http.javanet.NetHttpTransport;

/**
 * The type Transport.
 */
public class Transport {
	
	private static NetHttpTransport instance;
	
	public Transport() {
		
	}

	/**
	 * Gets http transport instance.
	 *
	 * @return The http transport instance
	 */
	public static NetHttpTransport getInstance() {
		if(instance == null) {
			synchronized (Transport.class) {
				if(instance == null) {
					instance = new NetHttpTransport();
				}
			}
		}
		return instance;
	}
	
}
