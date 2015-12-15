package org.thallium.event.types;

import net.minecraft.entity.player.EntityPlayerMP;

/**
 * Represents a event that involves with one or multiple players.
 * @author PizzaCrust
 */
public interface PlayerEvent extends Event {
    EntityPlayerMP getPlayer();
}
