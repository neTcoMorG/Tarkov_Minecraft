package entity.pmc.camp;

import entity.pmc.AccountType;
import entity.pmc.skill.Skill;
import entity.pmc.container.Container;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public interface Pmc {

    AccountType getType();
    void setType(AccountType type);
    Double      getHealth();
    void        setHealth(Double value);
    ItemStack   getCurrentWeapon();
    Container getContainer();
    void setContainer(Container container);
    List<Skill> getSkills();
    void        setSpeed(Float value);
    Float       getSpeed();
    String      getName();
}
