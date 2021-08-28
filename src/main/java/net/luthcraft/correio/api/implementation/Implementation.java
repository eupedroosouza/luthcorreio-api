package net.luthcraft.correio.api.implementation;

import java.util.UUID;

import org.bukkit.entity.Player;

import net.luthcraft.correio.api.player.MailPlayer;

public abstract class Implementation {
	
	private static Implementation implementation;
	
	public Implementation() {
		implementation = this;
	}
	
	public abstract MailPlayer getMailPlayer(UUID uuid);
	public abstract MailPlayer getMailPlayer(String name);
	public abstract MailPlayer getMailPlayer(Player player);

	public static Implementation getImplementation() {
		return implementation;
	}

}
