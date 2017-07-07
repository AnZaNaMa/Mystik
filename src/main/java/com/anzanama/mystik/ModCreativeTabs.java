package com.anzanama.mystik;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModCreativeTabs {
    public CreativeTabs tabItems = new CreativeTabs("mystik_items") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Items.POTATO);
        }
    };

    public CreativeTabs tabBlocks = new CreativeTabs("mystik_blocks") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Blocks.DIRT);
        }
    };
}
