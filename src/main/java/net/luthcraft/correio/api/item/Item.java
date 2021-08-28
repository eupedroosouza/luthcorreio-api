package net.luthcraft.correio.api.item;

import java.util.Date;

import org.bukkit.inventory.ItemStack;

public interface Item {
	
	/**
	 * Get the item id.
	 * 
	 * @return the item id. 
	 */
	public int getId();
	
	/**
	 * Get the ItemStack of the item.
	 * 
	 * @return the item ItemStack. 
	 */
	public ItemStack getItem();
	
	/**
	 * Get the expiry time of the item.
	 * 
	 * @return the item expiry time. 
	 */
	public long getExpiry();
	
	/**
	 * Get the delivery date of the item.
	 * 
	 * @return the item delivery date. 
	 */
	public Date getDate();
	
	/**
	 * Get whoever sent this item.
	 * 
	 * @return the item whoever sent. 
	 */
	public String getSender();
	
	
}
