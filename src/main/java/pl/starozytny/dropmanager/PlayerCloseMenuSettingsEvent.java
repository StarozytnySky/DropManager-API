package pl.starozytny.dropmanager;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

/**
 * PlayerCloseMenuSettingsEvent is a custom Bukkit event that is called when a player close settings menu.
 */
public class PlayerCloseMenuSettingsEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
	private final Player player;
	private final Inventory inventory;
	private boolean cancelled = false;

	/**
	 * Constructor for the PlayerGetDropEvent.
	 *
	 * @param player the player who received the drop
	 */
	public PlayerCloseMenuSettingsEvent(Player player, Inventory inventory) {
		this.player = player;
		this.inventory = inventory;
	}

	/**
	 * Gets the player associated with this event.
	 *
	 * @return the player who received the drop
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * Gets the player inventory associated with this event.
	 *
	 * @return the player inventory
	 */
	public Inventory getInventory() {
		return inventory;
	}

	/**
	 * Required method to implement a custom Bukkit event. This method returns the HandlerList for this event.
	 *
	 * @return the HandlerList for this event
	 */
	@NotNull
	@Override
	public HandlerList getHandlers() {
		return null;
	}

	/**
	 * Gets the static HandlerList instance for this event. This method is required by the Bukkit event system.
	 *
	 * @return the static HandlerList instance for this event
	 */
	public static HandlerList getHandlerList() {
		return handlers;
	}


	@Override
	public boolean isCancelled() {
		return cancelled;
	}

	@Override
	public void setCancelled(boolean cancel) {
		this.cancelled = cancel;
	}
}
