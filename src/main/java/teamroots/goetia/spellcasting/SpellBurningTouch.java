package teamroots.goetia.spellcasting;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import teamroots.goetia.lib.LibMain;

public class SpellBurningTouch extends CastSpell{

	public SpellBurningTouch() {
		super("burningTouch", 30, new int[]{1,6,3,4}, new ItemStack(Items.BLAZE_POWDER));
	}
	
	@Override
	public void doEffect(EntityPlayer caster){
		caster.getEntityData().setInteger(LibMain.LibNBT.burning_touch_tag, 600);
	}
}
