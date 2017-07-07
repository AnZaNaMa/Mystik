package com.anzanama.mystik;

import com.anzanama.mystik.misc.Const;
import com.anzanama.mystik.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Const.MODID, name = Const.MODNAME, version = Const.VERSION)
public class Mystik {

    @SidedProxy(clientSide = Const.PROXY_CLIENT, serverSide = Const.PROXY_SERVER)
    public CommonProxy proxy = new CommonProxy();

    @Mod.Instance
    public Mystik instance = new Mystik();

    public void preInit(FMLPreInitializationEvent e) {

    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }

}
