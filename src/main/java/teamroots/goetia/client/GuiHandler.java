package teamroots.goetia.client;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import teamroots.goetia.lib.EnumIDs;

/**
 * Created by TeamRoots on 5.8.2016.
 */
public class GuiHandler implements IGuiHandler
{
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (EnumIDs.values()[ID])
        {
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (EnumIDs.values()[ID])
        {

        }
        return null;
    }
}
