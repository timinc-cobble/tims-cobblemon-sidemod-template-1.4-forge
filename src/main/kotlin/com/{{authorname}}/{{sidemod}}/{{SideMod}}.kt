package com.{{authorname}}.{{sidemod}}

import net.minecraftforge.event.server.ServerStartedEvent
import net.minecraftforge.eventbus.api.SubscribeEvent
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventBusSubscriber
import com.{{authorname}}.{{sidemod}}.config.{{SideMod}}Config

@Mod({{SideMod}}.MOD_ID)
object {{SideMod}} {
    const val MOD_ID = "{{side-mod}}"
    private var {{sideMod}}Config: {{SideMod}}Config = {{SideMod}}Config.Builder.load()

    @EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
    object Registration {}
}