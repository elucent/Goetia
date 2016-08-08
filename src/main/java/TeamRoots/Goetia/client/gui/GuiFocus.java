package teamroots.goetia.client.gui;

import java.util.ArrayList;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.VertexBuffer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import teamroots.goetia.capability.impurity.ImpurityProvider;
import teamroots.goetia.capability.impurity.KnowledgeProvider;
import teamroots.goetia.common.items.ItemSymbolIcon;
import teamroots.goetia.common.network.ChalkUpdateMessage;
import teamroots.goetia.common.network.GoetiaPacketHandler;
import teamroots.goetia.common.symbol.SymbolManager;
import teamroots.goetia.registry.MainRegistry;
import teamroots.goetia.spellcasting.SpellRegistry;

public class GuiFocus extends GuiScreen{
	EntityPlayer player = null;
	float ticksOpen = 0;
	public GuiFocus(EntityPlayer player){
		this.player = player;
	}
	
	@Override
	public boolean doesGuiPauseGame(){
		return false;
	}
	
	public void drawQuad(VertexBuffer vertexbuffer, float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4, int minU, int minV, int maxU, int maxV){
        float f = 0.00390625F;
        float f1 = 0.00390625F;
        vertexbuffer.pos((double)(x4 + 0.0F), (double)(y4 + 0.0F), (double)this.zLevel).tex((double)((float)(minU + 0) * f), (double)((float)(minV + maxV) * f1)).endVertex();
        vertexbuffer.pos((double)(x3 + 0.0F), (double)(y3 + 0.0F), (double)this.zLevel).tex((double)((float)(minU + maxU) * f), (double)((float)(minV + maxV) * f1)).endVertex();
        vertexbuffer.pos((double)(x2 + 0.0F), (double)(y2 + 0.0F), (double)this.zLevel).tex((double)((float)(minU + maxU) * f), (double)((float)(minV + 0) * f1)).endVertex();
        vertexbuffer.pos((double)(x1 + 0.0F), (double)(y1 + 0.0F), (double)this.zLevel).tex((double)((float)(minU + 0) * f), (double)((float)(minV + 0) * f1)).endVertex();
    }
	
	public void drawColoredQuad(VertexBuffer vertexbuffer, float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4, int minU, int minV, int maxU, int maxV, 
			float r1, float g1, float b1, float a1, float r2, float g2, float b2, float a2, float r3, float g3, float b3, float a3, float r4, float g4, float b4, float a4){
        float f = 0.00390625F;
        float f1 = 0.00390625F;
        vertexbuffer.pos((double)(x4 + 0.0F), (double)(y4 + 0.0F), (double)this.zLevel).tex((double)((float)(minU + 0) * f), (double)((float)(minV + maxV) * f1)).color(r4, g4, b4, a4).endVertex();
        vertexbuffer.pos((double)(x3 + 0.0F), (double)(y3 + 0.0F), (double)this.zLevel).tex((double)((float)(minU + maxU) * f), (double)((float)(minV + maxV) * f1)).color(r3, g3, b3, a3).endVertex();
        vertexbuffer.pos((double)(x2 + 0.0F), (double)(y2 + 0.0F), (double)this.zLevel).tex((double)((float)(minU + maxU) * f), (double)((float)(minV + 0) * f1)).color(r2, g2, b2, a2).endVertex();
        vertexbuffer.pos((double)(x1 + 0.0F), (double)(y1 + 0.0F), (double)this.zLevel).tex((double)((float)(minU + 0) * f), (double)((float)(minV + 0) * f1)).color(r1, g1, b1, a1).endVertex();
    }
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks){
		RenderHelper.disableStandardItemLighting();
		RenderHelper.enableGUIStandardItemLighting();
		String selected = "null";
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("goetia:textures/gui/guiSlot.png"));
		String text = I18n.format("goetia.tooltip.impurity") + player.getCapability(ImpurityProvider.impurityCapability, null).getImpurity();
		this.fontRendererObj.drawString(text, (int)width/2-this.fontRendererObj.getStringWidth(text)/2, (int)height/2-this.fontRendererObj.FONT_HEIGHT/2, 0xFF4444);
		RenderHelper.enableStandardItemLighting();
	}
}
