package GenericCharacter;

import ItemPackage.Item;

/**
 * Created by Paul on 6/3/2017.
 */
public class GenericCharacter {
    /**
   BASICS  >> name-class-atk-defense-dmg-type-description, image name
   SPECIAL >> atk-def-dmg-item  (COULD THIS NOT BE NEEDED?)
   ITEMS   >> item array of 5 items
*/

    //basics
    public String name, type,description, imgName;
    public int atk,def,dmg,level,health;

    //special
   // public int atk_bonus, def_bonus,dmg_bonus;
    //ITEMS
    public Item[] itemBag= new Item[5];

    public GenericCharacter(String name, String type, String description, String imgName,int atk, int def, int dmg,int level,int health) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.atk = atk;
        this.imgName = imgName;
        this.def = def;
        this.dmg = dmg;
        this.level=level;
        this.health=health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Item[] getItemBag() {
        return itemBag;
    }

    public void setItemBag(Item[] itemBag) {
        this.itemBag = itemBag;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
