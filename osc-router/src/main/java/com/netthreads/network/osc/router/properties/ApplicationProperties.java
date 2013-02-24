package com.netthreads.network.osc.router.properties;

import com.google.inject.ImplementedBy;

@ImplementedBy(ApplicationPropertiesImpl.class)
public interface ApplicationProperties
{
	public static final int DEFAULT_PORT = 9000;
	
	/**
	 * Load from local storage.
	 * 
	 * @return True if successful.
	 */
	public boolean load();
	
	/**
	 * Server port.
	 * 
	 * @return The port.
	 */
	public int getPort();
	
	/**
	 * Set server port.
	 * 
	 * @param port
	 */
	public void setPort(int port);
}
