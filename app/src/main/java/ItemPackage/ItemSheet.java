package ItemPackage;

/**
 * Created by Paul on 6/3/2017.
 */
public class ItemSheet {
    public static Item[] itemLevel_0= new Item[5];

    /**
    close combat-CC
    ranged-R
    health-h
    defense reduction-D
*/

   // public Item(String name, String type, String imgName, String description, int itemModValue)

    public static Item woodsword_0= new Item("WoodSword","CC","woodsword_zero_img","Simple wooden sword",1);
    public static Item woodbow_0= new Item("WoodBow","R","woodsword_zero_img","Simple wooden bow",1);
    public static Item woodshield_0= new Item("WoodShield","D","woodshield_zero_img","Simple wooden shield",1);
    public static Item healthpotion_0= new Item("HealthPotion","H","healthpotion_zero_img","Health Potion",1);
    public static Item leatherarmor_0= new Item("WoodSword","D","leatherarmor_zero_img","Simple leather armor",1);


    public ItemSheet(){
        itemLevel_0[0]=woodsword_0;
        itemLevel_0[1]=woodbow_0;
        itemLevel_0[2]=woodshield_0;
        itemLevel_0[3]=healthpotion_0;
        itemLevel_0[4]=leatherarmor_0;

    }

}
