package n0devx.vanish_iceout.Commands;

import n0devx.vanish_iceout.VanishManager;
import n0devx.vanish_iceout.Vanish_ICEOUT;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.checkerframework.checker.units.qual.C;

public class VanishCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        VanishManager vanishManager = Vanish_ICEOUT.getInstace().getVanishManager();
        if (args.length == 1) {
            Player player = Bukkit.getPlayer(args[0]);
            if (player == null) {
                sender.sendMessage(ChatColor.RED + "Spieler wurde TESSTTT nicht gefunden");
                return true;
            }
            if (vanishManager.isVanished(player)){
                vanishManager.setVanished(player, false);
                sender.sendMessage("§8[§3ICEOUT§8] §aDer Spieler ist jetzt nicht mehr im Vanish");
            }else {
                vanishManager.setVanished(player, true);
                sender.sendMessage("§8[§3ICEOUT§8] §aDer Spieler ist jetzt im Vanish");
            }

            return true;

        }else if (sender instanceof Player){
            Player player = (Player) sender;

            if (vanishManager.isVanished(player)){
                vanishManager.setVanished(player, false);
                sender.sendMessage("§8[§3ICEOUT§8] §aDu bist jetzt nicht mehr im Vanish");
            }else {
                vanishManager.setVanished(player, true);
                sender.sendMessage("§8[§3ICEOUT§8] §aDu bist jetzt im Vanish");
            }
            return true;

        }
        return false;
    }
}
