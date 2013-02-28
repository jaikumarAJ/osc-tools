package com.netthreads.network.osc.router.service;

import java.util.Collection;
import java.util.Map;

import com.google.inject.ImplementedBy;
import com.netthreads.network.osc.router.model.OSCItem;

/**
 * Result cache.
 * 
 */
@ImplementedBy(OSCMessageCacheImpl.class)
public interface OSCMessageCache
{
	/**
	 * Synchronised get from map.
	 * 
	 * @param name
	 * 
	 * @return The object or null if none found.
	 */
	public OSCItem get(String name);
	
	/**
	 * Put in cache.
	 * 
	 * @param name
	 *            The key.
	 * 
	 * @param projectResult
	 *            The value.
	 */
	public void put(String name, OSCItem item);
	
	/**
	 * Return current items.
	 * 
	 * @return The items.
	 */
	public Collection<OSCItem> items();
	
	/**
	 * Clear cache.
	 */
	public void clear();
}
