package net.luthcraft.correio.api;

import java.util.UUID;

import org.bukkit.entity.Player;

import net.luthcraft.correio.api.implementation.Implementation;
import net.luthcraft.correio.api.player.MailPlayer;

public class MailAPI{
	
	/**
	 * Get the player's handle with its UUID.
	 * 
	 * @param uuid	Uuid of player.
	 * @return The MailPlayer from uuid of player.
	 */
	public MailPlayer getMailPlayer(UUID uuid) {
		return Implementation.getImplementation().getMailPlayer(uuid);
	}
	
	/**
	 * Get the player's handle with its UUID.
	 * 
	 * @param name	Name of player.
	 * @return The MailPlayer from uuid of player.
	 */
	public MailPlayer getMailPlayer(String name) {
		return Implementation.getImplementation().getMailPlayer(name);
	}
	
	/**
	 * Get the player's handle with its UUID.
	 * 
	 * @param player	{@link org.bukkit.entity.Player}.
	 * @return The MailPlayer from uuid of player.
	 */
	public MailPlayer getMailPlayer(Player player) {
		return Implementation.getImplementation().getMailPlayer(player);
	}

}
