package teamroots.goetia.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHorns extends ModelBase
{
	ModelRenderer Elem11;//Cube
	ModelRenderer Elem10;//Cube
	ModelRenderer Elem9;//Cube
	ModelRenderer Elem8;//Cube
	ModelRenderer Elem7;//Cube
	ModelRenderer Elem6;//Cube
	ModelRenderer Elem5;//Cube
	ModelRenderer Elem4;//Cube

	public ModelHorns()
	{
		textureWidth = 16;
		textureHeight = 16;

		//Cube
		Elem11 = new ModelRenderer(this, 0, 0);
		Elem11.addBox(0F, 0F, 0F, 1, 1, 1);
		Elem11.setRotationPoint(2F, 20F, -1F);
		Elem11.setTextureSize(16, 16);
		//Elem11.setTextureOffset(7, 1);
		setRotation(Elem11, -0F, -0F, -0F);
		//Cube
		Elem10 = new ModelRenderer(this, 0, 0);
		Elem10.addBox(0F, 0F, 0F, 2, 1, 1);
		Elem10.setRotationPoint(2F, 21F, -1F);
		Elem10.setTextureSize(16, 16);
		setRotation(Elem10, -0F, -0F, -0F);
		//Cube
		Elem9 = new ModelRenderer(this, 0, 0);
		Elem9.addBox(0F, 0F, 0F, 2, 1, 1);
		Elem9.setRotationPoint(2.5F, 22F, -1F);
		Elem9.setTextureSize(16, 16);
		setRotation(Elem9, -0F, -0F, -0F);
		//Cube
		Elem8 = new ModelRenderer(this, 0, 0);
		Elem8.addBox(0F, 0F, 0F, 1, 1, 1);
		Elem8.setRotationPoint(-3F, 20F, -1F);
		Elem8.setTextureSize(16, 3216);
		setRotation(Elem8, -0F, -0F, -0F);
		//Cube
		Elem7 = new ModelRenderer(this, 0, 0);
		Elem7.addBox(0F, 0F, 0F, 2, 1, 1);
		Elem7.setRotationPoint(-4F, 21F, -1F);
		Elem7.setTextureSize(16, 16);
		setRotation(Elem7, -0F, -0F, -0F);
		//Cube
		Elem6 = new ModelRenderer(this, 0, 0);
		Elem6.addBox(0F, 0F, 0F, 2, 1, 1);
		Elem6.setRotationPoint(-4.5F, 22F, -1F);
		Elem6.setTextureSize(16, 16);
		setRotation(Elem6, -0F, -0F, -0F);
		//Cube
		Elem5 = new ModelRenderer(this, 0, 0);
		Elem5.addBox(0F, 0F, 0F, 2, 1, 1);
		Elem5.setRotationPoint(2F, 23F, -1F);
		Elem5.setTextureSize(16, 16);
		setRotation(Elem5, -0F, -0F, -0F);
		//Cube
		Elem4 = new ModelRenderer(this, 0, 0);
		Elem4.addBox(0F, 0F, 0F, 2, 1, 1);
		Elem4.setRotationPoint(-4F, 23F, -1F);
		Elem4.setTextureSize(16, 16);
		setRotation(Elem4, -0F, -0F, -0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		Elem11.render(f5);//Cube
		Elem10.render(f5);//Cube
		Elem9.render(f5);//Cube
		Elem8.render(f5);//Cube
		Elem7.render(f5);//Cube
		Elem6.render(f5);//Cube
		Elem5.render(f5);//Cube
		Elem4.render(f5);//Cube
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
	}

}