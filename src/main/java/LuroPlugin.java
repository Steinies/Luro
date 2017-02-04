/**
 * Created by Stefan on 04.02.2017.
 */

import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;

@Plugin(id = "luro_plugin", name = "Luro Plugin", version = "1.0")
public class LuroPlugin {
    @Listener
    public void onServerStart(GameStartedServerEvent event) {
        // Hey! The server has started!
        // Try instantiating your logger in here.
        // (There's a guide for that)
    }
}

