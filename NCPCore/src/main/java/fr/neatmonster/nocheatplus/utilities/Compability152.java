package fr.neatmonster.nocheatplus.utilities;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.lang.reflect.Method;
import java.util.Collection;

public class Compability152 {
    public static Player[] getOnlinePlayersUsingReflection() {
        try {
            // Retrieve the getOnlinePlayers method from Bukkit
            Method method = Bukkit.class.getMethod("getOnlinePlayers");
            Object result = method.invoke(null);

            return (Player[]) result;
        } catch (Exception e) {
            throw new RuntimeException("Error calling getOnlinePlayers using reflection", e);
        }
    }
}
