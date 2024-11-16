// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class custom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart head;
	private final ModelPart right_leg;
	private final ModelPart left_leg;
	private final ModelPart right_arm;
	private final ModelPart left_arm;
	private final ModelPart body;

	public custom_model(ModelPart root) {
		this.head = root.getChild("head");
		this.right_leg = root.getChild("right_leg");
		this.left_leg = root.getChild("left_leg");
		this.right_arm = root.getChild("right_arm");
		this.left_arm = root.getChild("left_arm");
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(96, 45).addBox(-4.0F, -2.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(90, 84).addBox(-4.0F, -3.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(54, 87).addBox(-4.0F, -4.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(27, 83).addBox(-4.0F, -5.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(54, 79).addBox(-4.0F, -6.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(76, 32).addBox(-4.0F, -7.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(73, 5).addBox(-4.0F, -8.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(70, 24).addBox(-4.0F, -9.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(94, 24).addBox(0.0F, -2.0F, -4.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(36, 92).addBox(0.0F, -3.0F, -4.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(72, 89).addBox(0.0F, -4.0F, -3.6F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(85, 29).addBox(0.0F, -5.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(82, 8).addBox(0.0F, -6.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(45, 78).addBox(0.0F, -7.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(18, 74).addBox(0.0F, -8.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(58, 71).addBox(0.0F, -9.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(45, 94).addBox(-2.0F, -2.0F, -4.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(90, 76).addBox(-2.0F, -3.0F, -4.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(45, 86).addBox(-2.0F, -4.0F, -3.6F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(81, 82).addBox(-2.0F, -5.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(78, 60).addBox(-2.0F, -6.0F, -3.8F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 75).addBox(-2.0F, -7.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(100, 99).addBox(-2.0F, -8.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(99, 92).addBox(-2.0F, -9.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(90, 92).addBox(2.0F, -2.0F, -4.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(91, 1).addBox(2.0F, -3.0F, -4.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(88, 16).addBox(2.0F, -4.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(36, 84).addBox(2.0F, -5.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(72, 81).addBox(2.0F, -6.0F, -3.8F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(76, 73).addBox(2.0F, -7.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(101, 32).addBox(2.0F, -8.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(35, 100).addBox(2.0F, -9.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(54, 95).addBox(-3.0F, -2.0F, -4.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(81, 90).addBox(-3.0F, -3.0F, -4.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(87, 48).addBox(-3.0F, -4.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 83).addBox(-3.0F, -5.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(79, 21).addBox(-3.0F, -6.0F, -3.8F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(27, 75).addBox(-3.0F, -7.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(8, 101).addBox(-3.0F, -8.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(100, 0).addBox(-3.0F, -9.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(9, 93).addBox(1.0F, -2.0F, -4.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(27, 91).addBox(1.0F, -3.0F, -4.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(63, 88).addBox(1.0F, -4.0F, -3.6F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(9, 85).addBox(1.0F, -5.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(82, 0).addBox(1.0F, -6.0F, -3.8F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(9, 77).addBox(1.0F, -7.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(43, 102).addBox(1.0F, -8.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(88, 100).addBox(1.0F, -9.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(94, 64).addBox(-1.0F, -2.0F, -4.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(18, 90).addBox(-1.0F, -3.0F, -4.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(85, 68).addBox(-1.0F, -4.0F, -3.6F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(18, 82).addBox(-1.0F, -5.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(78, 52).addBox(-1.0F, -6.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(74, 44).addBox(-1.0F, -7.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(67, 72).addBox(-1.0F, -8.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(69, 64).addBox(-1.0F, -9.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(92, 37).addBox(3.0F, -2.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 91).addBox(3.0F, -3.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(87, 56).addBox(3.0F, -4.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(83, 40).addBox(3.0F, -5.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(63, 80).addBox(3.0F, -6.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(36, 76).addBox(3.0F, -7.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(73, 13).addBox(3.0F, -8.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(49, 70).addBox(3.0F, -9.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(58, 53).addBox(-4.0F, -9.0F, 3.0F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(43, 34).addBox(-4.5F, -10.0F, 3.6F, 9.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(48, 0).addBox(-3.0F, -1.0F, -2.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(99, 84).addBox(3.5F, -2.0F, -2.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(72, 98).addBox(-4.5F, -2.0F, -2.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(80, 99).addBox(3.5F, -3.0F, -2.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 99).addBox(-4.5F, -3.0F, -2.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(106, 115).addBox(3.5F, -4.0F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(114, 77).addBox(-4.5F, -4.0F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(115, 92).addBox(3.5F, -5.0F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(85, 114).addBox(-4.5F, -5.0F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(47, 115).addBox(3.5F, -6.0F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(35, 115).addBox(-4.5F, -6.0F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(47, 1).addBox(3.5F, -7.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(39, 39).addBox(-4.5F, -7.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(69, 55).addBox(3.5F, -8.0F, -3.2F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(9, 69).addBox(-4.5F, -8.0F, -3.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(20, 45).addBox(3.5F, -8.0F, -4.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 39).addBox(-2.0F, -8.0F, -4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(36, 38).addBox(-1.0F, -8.0F, -4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 21).addBox(-1.0F, -9.0F, -4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 51).addBox(-4.5F, -9.0F, -4.2F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 19).addBox(3.0F, -9.0F, -4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(40, 52).addBox(-1.0F, -10.0F, -4.3F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(51, 44).addBox(-4.5F, -10.0F, -4.3F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(20, 48).addBox(3.0F, -10.0F, -4.3F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(3, 38).addBox(0.0F, -8.0F, -4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 19).addBox(0.0F, -9.0F, -4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 21).addBox(-4.0F, -9.0F, -4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(10, 43).addBox(3.5F, -9.0F, -4.2F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(10, 52).addBox(0.0F, -10.0F, -4.3F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(30, 51).addBox(-4.0F, -10.0F, -4.3F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(48, 18).addBox(3.5F, -10.0F, -4.3F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 37).addBox(1.0F, -8.0F, -4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(19, 98).addBox(1.0F, -9.0F, -3.8F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(40, 68).addBox(1.0F, -9.9F, -3.8F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(97, 10).addBox(-3.0F, -9.0F, -3.8F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 67).addBox(-3.0F, -9.9F, -3.8F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(36, 36).addBox(-2.0F, -7.0F, -4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(31, 18).addBox(-3.0F, -7.0F, -4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(3, 40).addBox(-4.5F, -8.0F, -4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(44, 18).addBox(3.0F, -8.0F, -4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(39, 35).addBox(-3.0F, -8.0F, -4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(44, 2).addBox(2.0F, -8.0F, -4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(64, 97).addBox(2.0F, -9.0F, -3.8F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(31, 67).addBox(2.0F, -9.9F, -3.8F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(96, 56).addBox(-2.0F, -9.0F, -3.8F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(22, 66).addBox(-2.0F, -9.9F, -3.8F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(39, 37).addBox(-4.0F, -8.0F, -4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(44, 0).addBox(2.0F, -7.0F, -4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 43).addBox(1.0F, -7.0F, -4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(3, 42).addBox(0.0F, -7.0F, -4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 41).addBox(0.0F, -6.0F, -4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(21, 41).addBox(-1.0F, -7.0F, -4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(36, 34).addBox(-1.0F, -6.0F, -4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(99, 72).addBox(3.5F, -7.0F, -2.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(27, 99).addBox(-4.5F, -7.0F, -2.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(32, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(44, 11).addBox(-2.5F, 12.0F, -3.5F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(58, 18).addBox(-2.5F, 11.0F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(48, 27).addBox(-2.5F, 9.0F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(63, 34).addBox(-2.5F, 8.0F, -2.2F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 11.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(32, 17).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(37, 44).addBox(-2.5F, 12.0F, -3.5F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(23, 60).addBox(-2.5F, 11.0F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(60, 6).addBox(-2.5F, 9.0F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(65, 0).addBox(-2.5F, 8.0F, -2.2F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 11.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(103, 63).addBox(-0.5F, 1.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(104, 53).addBox(-1.0F, 1.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(105, 7).addBox(-0.5F, 0.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(64, 104).addBox(-1.0F, 0.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(108, 0).addBox(-4.5F, 0.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(104, 107).addBox(-4.0F, 0.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(108, 97).addBox(-4.0F, 1.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(7, 108).addBox(-4.5F, 1.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(85, 107).addBox(-4.5F, -1.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(107, 91).addBox(-4.0F, -1.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(91, 9).addBox(-3.0F, -1.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(57, 103).addBox(-2.0F, -1.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(105, 40).addBox(-1.0F, -1.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(17, 105).addBox(-0.5F, -1.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(105, 46).addBox(-1.0F, -2.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(71, 105).addBox(-0.5F, -2.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 106).addBox(-0.5F, -3.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(106, 13).addBox(-1.0F, -3.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(24, 106).addBox(-2.0F, -3.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(97, 17).addBox(-3.0F, -2.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(103, 23).addBox(-2.0F, -2.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(78, 106).addBox(-3.0F, -3.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(31, 107).addBox(-4.0F, -3.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(107, 69).addBox(-4.0F, -2.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(107, 79).addBox(-4.5F, -2.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(97, 106).addBox(-4.5F, -3.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 19).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 0.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(16, 19).addBox(0.0F, -2.0F, -2.0F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(114, 71).addBox(0.0F, -3.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(109, 29).addBox(-0.5F, -3.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(113, 12).addBox(0.0F, -2.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(38, 109).addBox(-0.5F, -2.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(71, 112).addBox(0.0F, 0.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(110, 19).addBox(-0.5F, 0.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 112).addBox(0.0F, 1.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(57, 110).addBox(-0.5F, 1.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(112, 6).addBox(0.0F, -1.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(50, 109).addBox(-0.5F, -1.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(7, 114).addBox(2.0F, -3.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(78, 113).addBox(2.0F, -2.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(112, 35).addBox(2.0F, -1.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(99, 113).addBox(3.0F, -3.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(110, 59).addBox(3.5F, -3.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(113, 85).addBox(3.0F, -2.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(14, 111).addBox(3.5F, -2.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(92, 112).addBox(3.0F, 0.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(64, 111).addBox(3.5F, 0.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(111, 109).addBox(3.0F, 1.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(111, 103).addBox(3.5F, 1.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(61, 45).addBox(-0.5F, 7.0F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(61, 39).addBox(-0.5F, 8.0F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(38, 61).addBox(-0.5F, 9.0F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 61).addBox(-0.5F, 10.0F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(112, 41).addBox(3.0F, -1.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(111, 52).addBox(3.5F, -1.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(114, 65).addBox(1.0F, -3.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(28, 113).addBox(1.0F, -2.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(21, 112).addBox(1.0F, -1.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -13.0F, -3.0F, 10.0F, 13.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 37).addBox(-5.2F, -12.0F, -3.5F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(25, 34).addBox(3.2F, -12.0F, -3.5F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(11, 41).addBox(-2.0F, -12.0F, -3.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(26, 4).addBox(-1.0F, -11.0F, -3.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(26, 2).addBox(-2.0F, -10.0F, -3.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(26, 0).addBox(-2.0F, -9.0F, -3.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(60, 15).addBox(-4.5F, -3.0F, -3.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(11, 39).addBox(-4.5F, -1.0F, -3.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(60, 13).addBox(-4.5F, -3.0F, 2.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(11, 37).addBox(-4.5F, -1.0F, 2.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(60, 63).addBox(4.5F, -3.0F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(13, 61).addBox(4.5F, -1.0F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(51, 62).addBox(-5.5F, -3.0F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(61, 26).addBox(-5.5F, -1.0F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(12, 21).addBox(-1.0F, -8.0F, -3.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 19).addBox(-1.0F, -7.0F, -3.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 4).addBox(-1.0F, -6.0F, -3.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 2).addBox(-1.0F, -5.0F, -3.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -4.0F, -3.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 11.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}