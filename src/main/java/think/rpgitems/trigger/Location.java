package think.rpgitems.trigger;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.inventory.ItemStack;
import think.rpgitems.power.PowerLocation;
import think.rpgitems.power.PowerResult;
import think.rpgitems.power.Trigger;

public class Location extends Trigger<Event, PowerLocation, Void, Void> {
    public static final Trigger<Event, PowerLocation, Void, Void> LOCATION = new Location();

    public Location() {
        super(Event.class, PowerLocation.class, Void.class, Void.class, "LOCATION");
    }

    @Override
    public PowerResult<Void> run(PowerLocation power, Player player, ItemStack i, Event event) {
        throw new IllegalStateException();
    }

    @Override
    public PowerResult<Void> run(PowerLocation power, Player player, ItemStack i, Event event, Object data) {
        return power.fire(player, i, (org.bukkit.Location) data);
    }
}
