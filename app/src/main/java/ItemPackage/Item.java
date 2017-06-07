package ItemPackage;

/**
 * Created by Paul on 6/3/2017.
 */
public class Item {
    //Basics >> name-type-modifier-description-image file


    public String name, type, description, imgName;
    public int itemModValue;

    public Item(String name, String type, String imgName, String description, int itemModValue) {
        this.name = name;
        this.type = type;
        this.imgName = imgName;
        this.description = description;
        this.itemModValue = itemModValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getItemModValue() {
        return itemModValue;
    }

    public void setItemModValue(int itemModValue) {
        this.itemModValue = itemModValue;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }
}
