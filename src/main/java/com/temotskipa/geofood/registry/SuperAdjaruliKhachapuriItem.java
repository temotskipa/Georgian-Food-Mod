package com.temotskipa.geofood.registry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SuperAdjaruliKhachapuriItem extends Item {
    public SuperAdjaruliKhachapuriItem(Settings settings) {
        super(settings);
    }
    
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
