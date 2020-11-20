package zed.d0c.spareparts.items;

import net.minecraft.item.Item;

public class Coin extends Item {
    private final int value;
    public Coin(int valueIn, Item.Properties builder) {
        super(builder);
        this.value = valueIn;
    }
    public int getValue() {return this.value;}
}
