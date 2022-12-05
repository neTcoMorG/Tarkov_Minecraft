package entity.pmc.camp;

import entity.pmc.AccountType;
import entity.pmc.skill.Skill;
import entity.pmc.container.Container;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class DefaultPmc implements Pmc {

    protected Player player;
    protected Container container;
    protected Inventory stash;
    protected List<Skill> skills;
    protected AccountType type;
    public DefaultPmc(Player player, Container container, Inventory stash, List<Skill> skills, AccountType type) {
        this.player = player;
        this.container = container;
        this.stash = stash;
        this.skills = skills;
        this.type = type;
    }

    @Override
    public void setType(AccountType type) {
        this.type = type;
    }

    @Override
    public AccountType getType() {
        return type;
    }

    @Override
    public Double getHealth() {
        return player.getHealth();
    }

    @Override
    public void setHealth(Double value) {
        player.setHealth(value);
    }

    @Override
    public ItemStack getCurrentWeapon() {
        return player.getItemInHand();
    }

    @Override
    public void setContainer(Container container) {
        this.container = container;
    }

    @Override
    public Container getContainer() {
        return container;
    }

    @Override
    public List<Skill> getSkills() {
        return skills;
    }

    @Override
    public void setSpeed(Float value) {
        player.setWalkSpeed(value);
    }

    @Override
    public Float getSpeed() {
        return player.getWalkSpeed();
    }

    @Override
    public String getName() {
        return player.getName();
    }
}
