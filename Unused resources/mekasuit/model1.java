// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class model extends ModelBase {
	private final ModelRenderer solar_helmet;
	private final ModelRenderer solar_helmet_head_visor_right_back_r1;
	private final ModelRenderer override_solar_helmet_helmet_head_visor_right_r1;
	private final ModelRenderer override_solar_helmet_helmet_head_center3_r1;
	private final ModelRenderer solar_helmet_head_center_front_r1;
	private final ModelRenderer override_solar_helmet_helmet_head_center1_r1;

	public model() {
		textureWidth = 32;
		textureHeight = 32;

		solar_helmet = new ModelRenderer(this);
		solar_helmet.setRotationPoint(0.0F, -3.0F, 1.0F);
		solar_helmet.cubeList.add(new ModelBox(solar_helmet, 0, 16, -0.995F, -5.0F, -4.0F, 2, 1, 5, 0.0F, false));
		solar_helmet.cubeList.add(new ModelBox(solar_helmet, 11, 9, 3.01F, -5.0F, -4.5F, 1, 1, 7, 0.0F, false));
		solar_helmet.cubeList.add(new ModelBox(solar_helmet, 11, 1, -4.0F, -5.0F, -4.5F, 1, 1, 7, 0.0F, false));
		solar_helmet.cubeList.add(new ModelBox(solar_helmet, 11, 9, -2.0F, -0.5F, 1.5F, 1, 1, 1, 0.0F, false));
		solar_helmet.cubeList.add(new ModelBox(solar_helmet, 11, 4, 1.0F, -0.5F, 1.5F, 1, 1, 1, 0.0F, false));
		solar_helmet.cubeList.add(new ModelBox(solar_helmet, 3, 3, 3.01F, -4.0F, 1.5F, 1, 3, 1, 0.0F, false));
		solar_helmet.cubeList.add(new ModelBox(solar_helmet, 0, 0, -4.0F, -4.0F, 1.5F, 1, 3, 1, 0.0F, false));
		solar_helmet.cubeList.add(new ModelBox(solar_helmet, 0, 8, -3.0F, -4.5F, -5.0F, 2, 1, 7, 0.0F, false));
		solar_helmet.cubeList.add(new ModelBox(solar_helmet, 0, 0, 1.0F, -4.5F, -5.0F, 2, 1, 7, 0.0F, false));

		solar_helmet_head_visor_right_back_r1 = new ModelRenderer(this);
		solar_helmet_head_visor_right_back_r1.setRotationPoint(-2.005F, -3.5168F, 2.5324F);
		solar_helmet.addChild(solar_helmet_head_visor_right_back_r1);
		setRotationAngle(solar_helmet_head_visor_right_back_r1, -0.6109F, 0.0F, 0.0F);
		solar_helmet_head_visor_right_back_r1.cubeList.add(new ModelBox(solar_helmet_head_visor_right_back_r1, 16, 17, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));
		solar_helmet_head_visor_right_back_r1.cubeList.add(new ModelBox(solar_helmet_head_visor_right_back_r1, 20, 0, 3.01F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		override_solar_helmet_helmet_head_visor_right_r1 = new ModelRenderer(this);
		override_solar_helmet_helmet_head_visor_right_r1.setRotationPoint(-2.005F, -3.8355F, -5.2418F);
		solar_helmet.addChild(override_solar_helmet_helmet_head_visor_right_r1);
		setRotationAngle(override_solar_helmet_helmet_head_visor_right_r1, 0.4363F, 0.0F, 0.0F);
		override_solar_helmet_helmet_head_visor_right_r1.cubeList.add(new ModelBox(override_solar_helmet_helmet_head_visor_right_r1, 0, 8, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));
		override_solar_helmet_helmet_head_visor_right_r1.cubeList.add(new ModelBox(override_solar_helmet_helmet_head_visor_right_r1, 0, 10, 3.01F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		override_solar_helmet_helmet_head_center3_r1 = new ModelRenderer(this);
		override_solar_helmet_helmet_head_center3_r1.setRotationPoint(0.0F, -3.8735F, 1.7371F);
		solar_helmet.addChild(override_solar_helmet_helmet_head_center3_r1);
		setRotationAngle(override_solar_helmet_helmet_head_center3_r1, -0.6109F, 0.0F, 0.0F);
		override_solar_helmet_helmet_head_center3_r1.cubeList.add(new ModelBox(override_solar_helmet_helmet_head_center3_r1, 9, 17, -1.0F, -0.5F, -1.25F, 2, 1, 3, 0.0F, false));

		solar_helmet_head_center_front_r1 = new ModelRenderer(this);
		solar_helmet_head_center_front_r1.setRotationPoint(0.0F, -3.873F, -4.8447F);
		solar_helmet.addChild(solar_helmet_head_center_front_r1);
		setRotationAngle(solar_helmet_head_center_front_r1, 0.8727F, 0.0F, 0.0F);
		solar_helmet_head_center_front_r1.cubeList.add(new ModelBox(solar_helmet_head_center_front_r1, 11, 0, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		override_solar_helmet_helmet_head_center1_r1 = new ModelRenderer(this);
		override_solar_helmet_helmet_head_center1_r1.setRotationPoint(0.0F, -4.3355F, -4.2418F);
		solar_helmet.addChild(override_solar_helmet_helmet_head_center1_r1);
		setRotationAngle(override_solar_helmet_helmet_head_center1_r1, 0.4363F, 0.0F, 0.0F);
		override_solar_helmet_helmet_head_center1_r1.cubeList.add(new ModelBox(override_solar_helmet_helmet_head_center1_r1, 11, 2, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		solar_helmet.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}