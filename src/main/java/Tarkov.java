import handler.PlayerInitListener;
import org.bukkit.plugin.java.JavaPlugin;

public class Tarkov extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(PlayerInitListener.INSTANCE, this);
    }

    @Override
    public void onDisable() {

    }
}
