package net.luthcraft.correio.api.player;

import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import net.luthcraft.correio.api.item.Item;

public interface MailPlayer {
	
	/**
	 * Add item to player.
	 * 
	 * @param stack	{@link org.bukkit.inventory.ItemStack} Item object.
	 * @param sender sender of the item
	 * @return item created
	 */
	public Item addItem(ItemStack stack, String sender);
	
	/**
	 * Add item to player.
	 * 
	 * @param item	{@link net.luthcraft.correio.api.item.Item}
	 * @return item created
	 */
	public Item addItem(Item item);
	
	/**
	 * Remove item from player.
	 * 
	 * @param id	id from item
	 * @return success from remove
	 */
	public boolean removeItem(int id);
	
	/**
	 * Remove item from player.
	 * 
	 * @param item	item from remove item
	 * @return success from remove
	 */
	public boolean removeItem(Item item);
	
	/**
	 * Get item from player.
	 * 
	 * @param id	id from item
	 * @return the item from id
	 */
	public Item getItem(int id);
	
	/**
	 * Check if the player's gifts are locked.
	 * 
	 * @return if is blocked
	 */
	public boolean isBlock();
	
	/**
	 * Blocks the player's gifts.
	 * 
	 * @return returns true
	 */
	public boolean block();
	
	/**
	 * Unlocks the player's gifts.
	 * 
	 * @return returns false
	 */
	public boolean unblock();
	
	/**
	 * @return the player uuid
	 */
	public UUID getUuid();
	
	/**
	 * @return the player name
	 */
	public String getName();
	
	/**
	 * @return the player object.
	 */
	public Player getPlayer();
		
}
