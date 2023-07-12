package pl.starozytny.dropmanager;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class PlayerGetRandomDropEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
	private final Player player;
	private final String drop;
	private boolean cancelled = false;

	/**
	 * Constructor for the PlayerGetDropEvent.
	 *
	 * @param player the player who received the drop
	 * @param drop   the drop the player received
	 */
	public PlayerGetRandomDropEvent(Player player, String drop) {
		this.player = player;
		this.drop = drop;
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
	 * Gets the drop associated with this event.
	 *
	 * @return the drop the player received
	 */
	public String getDrop() {
		return drop;
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
