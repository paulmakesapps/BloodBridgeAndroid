package GenericCharacter;

/**
 * Created by Paul on 6/4/2017.
 */
public class EnemySheet {

    public static GenericCharacter[] enemy_0 = new GenericCharacter[5];

    /**
     * ~~~~~Type List~~~~~
     * Night Creature       >> NC
     * Day Creature         >> DC
     * Vampire              >> V
     * Large Night Creature >>LNC
     * Large Day Creature   >>LDC
     * Human                >>H
     * Zombie               >>Z
     * Air Creature         >>AC
     * Underground Creature >>UC
     * Goblin Humanoid      >>GH
     */

    //public Character(String name, String type, String description, int atk, String imgName, int def, int dmg, int level)

    public static GenericCharacter bat_0 = new GenericCharacter("Bat", "NC", "Vicious Black Bat", "bat_zero_img", 7, 13, 1, 0,3);
    public static GenericCharacter rat_0 = new GenericCharacter("Rat", "UC", "Vicious Grey Rat", "rat_zero_img", 7, 13, 1, 0,3);
    public static GenericCharacter wolf_0 = new GenericCharacter("Wolf", "DC", "Young Wolf", "wolf_zero_img", 8, 15, 1, 0,7);
    public static GenericCharacter zombie_0 = new GenericCharacter("Zombie", "Z", "Slow Moving Zombie", "zombie_zero_img", 6, 12, 1, 0,6);
    public static GenericCharacter goblin_0 = new GenericCharacter("Goblin", "GH", "Vicious Black Bat", "goblin_zero_img", 7, 15, 1, 0,5);

    public EnemySheet() {
        //initialize
        enemy_0[0] = bat_0;
        enemy_0[1] = rat_0;
        enemy_0[2] = wolf_0;
        enemy_0[3] = zombie_0;
        enemy_0[4] = goblin_0;

    }
}
