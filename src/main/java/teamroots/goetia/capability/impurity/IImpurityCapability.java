package teamroots.goetia.capability.impurity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;

/**
 * Created by TeamRoots on 5.8.2016.
 */
public interface IImpurityCapability
{
    float getImputity();
    float getMaxImpurity();
    void setImpurity(EntityPlayer player,float  impurity);
    void setMaxImpurity(float maxImpurity);
    NBTTagCompound saveData();
    void loadNBTData(NBTTagCompound tagCompound);
    void dataChanged(EntityPlayer player);
}
