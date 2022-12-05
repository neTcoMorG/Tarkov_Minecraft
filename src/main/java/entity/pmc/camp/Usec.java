package entity.pmc.camp;

import entity.pmc.AccountType;
import entity.pmc.skill.Skill;
import entity.pmc.container.Container;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.util.List;

public class Usec extends DefaultPmc {
    public Usec(Player player, Container container, Inventory stash, List<Skill> skills, AccountType type) {
        super(player, container, stash, skills, type);
    }
}
