package com.example.qolimprovements.gui;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class OreExcavationScreen extends AbstractContainerScreen<OreExcavationMenu> {
    private static final ResourceLocation TEXTURE = new ResourceLocation("qol_improvements", "textures/gui/ore_excavation.png");

    public OreExcavationScreen(OreExcavationMenu menu, Inventory inventory, Component title) {
        super(menu, inventory, title);
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
        guiGraphics.blit(TEXTURE, leftPos, topPos, 0, 0, imageWidth, imageHeight);
    }
}