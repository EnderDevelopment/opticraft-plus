package com.example.qolimprovements;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod("qol_improvements")
public class QoLImprovements {
    public QoLImprovements(IEventBus eventBus) {
        eventBus.addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // Setup code
    }
}