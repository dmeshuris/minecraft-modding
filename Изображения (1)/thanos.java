// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports


public class custom_model extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_arm;
	private final ModelRenderer body;

	public custom_model() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -2.0F, 0.0F);
		head.setTextureOffset(96, 45).addBox(-4.0F, -2.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(90, 84).addBox(-4.0F, -3.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(54, 87).addBox(-4.0F, -4.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(27, 83).addBox(-4.0F, -5.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(54, 79).addBox(-4.0F, -6.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(76, 32).addBox(-4.0F, -7.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(73, 5).addBox(-4.0F, -8.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(70, 24).addBox(-4.0F, -9.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(94, 24).addBox(0.0F, -2.0F, -4.3F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(36, 92).addBox(0.0F, -3.0F, -4.3F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(72, 89).addBox(0.0F, -4.0F, -3.6F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(85, 29).addBox(0.0F, -5.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(82, 8).addBox(0.0F, -6.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(45, 78).addBox(0.0F, -7.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(18, 74).addBox(0.0F, -8.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(58, 71).addBox(0.0F, -9.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(45, 94).addBox(-2.0F, -2.0F, -4.3F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(90, 76).addBox(-2.0F, -3.0F, -4.3F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(45, 86).addBox(-2.0F, -4.0F, -3.6F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(81, 82).addBox(-2.0F, -5.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(78, 60).addBox(-2.0F, -6.0F, -3.8F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(0, 75).addBox(-2.0F, -7.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(100, 99).addBox(-2.0F, -8.0F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(99, 92).addBox(-2.0F, -9.0F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(90, 92).addBox(2.0F, -2.0F, -4.3F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(91, 1).addBox(2.0F, -3.0F, -4.3F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(88, 16).addBox(2.0F, -4.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(36, 84).addBox(2.0F, -5.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(72, 81).addBox(2.0F, -6.0F, -3.8F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(76, 73).addBox(2.0F, -7.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(101, 32).addBox(2.0F, -8.0F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(35, 100).addBox(2.0F, -9.0F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(54, 95).addBox(-3.0F, -2.0F, -4.3F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(81, 90).addBox(-3.0F, -3.0F, -4.3F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(87, 48).addBox(-3.0F, -4.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(0, 83).addBox(-3.0F, -5.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(79, 21).addBox(-3.0F, -6.0F, -3.8F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(27, 75).addBox(-3.0F, -7.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(8, 101).addBox(-3.0F, -8.0F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(100, 0).addBox(-3.0F, -9.0F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(9, 93).addBox(1.0F, -2.0F, -4.3F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(27, 91).addBox(1.0F, -3.0F, -4.3F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(63, 88).addBox(1.0F, -4.0F, -3.6F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(9, 85).addBox(1.0F, -5.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(82, 0).addBox(1.0F, -6.0F, -3.8F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(9, 77).addBox(1.0F, -7.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(43, 102).addBox(1.0F, -8.0F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(88, 100).addBox(1.0F, -9.0F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(94, 64).addBox(-1.0F, -2.0F, -4.3F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(18, 90).addBox(-1.0F, -3.0F, -4.3F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(85, 68).addBox(-1.0F, -4.0F, -3.6F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(18, 82).addBox(-1.0F, -5.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(78, 52).addBox(-1.0F, -6.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(74, 44).addBox(-1.0F, -7.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(67, 72).addBox(-1.0F, -8.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(69, 64).addBox(-1.0F, -9.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(92, 37).addBox(3.0F, -2.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(0, 91).addBox(3.0F, -3.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(87, 56).addBox(3.0F, -4.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(83, 40).addBox(3.0F, -5.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(63, 80).addBox(3.0F, -6.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(36, 76).addBox(3.0F, -7.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(73, 13).addBox(3.0F, -8.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(49, 70).addBox(3.0F, -9.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(58, 53).addBox(-4.0F, -9.0F, 3.0F, 8.0F, 8.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(43, 34).addBox(-4.5F, -10.0F, 3.6F, 9.0F, 9.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(48, 0).addBox(-3.0F, -1.0F, -2.0F, 6.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(99, 84).addBox(3.5F, -2.0F, -2.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(72, 98).addBox(-4.5F, -2.0F, -2.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(80, 99).addBox(3.5F, -3.0F, -2.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(0, 99).addBox(-4.5F, -3.0F, -2.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(106, 115).addBox(3.5F, -4.0F, -1.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(114, 77).addBox(-4.5F, -4.0F, -1.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(115, 92).addBox(3.5F, -5.0F, -1.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(85, 114).addBox(-4.5F, -5.0F, -1.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(47, 115).addBox(3.5F, -6.0F, -1.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(35, 115).addBox(-4.5F, -6.0F, -1.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(47, 1).addBox(3.5F, -7.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(39, 39).addBox(-4.5F, -7.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(69, 55).addBox(3.5F, -8.0F, -3.2F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(9, 69).addBox(-4.5F, -8.0F, -3.3F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(20, 45).addBox(3.5F, -8.0F, -4.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 39).addBox(-2.0F, -8.0F, -4.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(36, 38).addBox(-1.0F, -8.0F, -4.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(28, 21).addBox(-1.0F, -9.0F, -4.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 51).addBox(-4.5F, -9.0F, -4.2F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 19).addBox(3.0F, -9.0F, -4.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(40, 52).addBox(-1.0F, -10.0F, -4.3F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(51, 44).addBox(-4.5F, -10.0F, -4.3F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(20, 48).addBox(3.0F, -10.0F, -4.3F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(3, 38).addBox(0.0F, -8.0F, -4.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(28, 19).addBox(0.0F, -9.0F, -4.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 21).addBox(-4.0F, -9.0F, -4.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(10, 43).addBox(3.5F, -9.0F, -4.2F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(10, 52).addBox(0.0F, -10.0F, -4.3F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(30, 51).addBox(-4.0F, -10.0F, -4.3F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(48, 18).addBox(3.5F, -10.0F, -4.3F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 37).addBox(1.0F, -8.0F, -4.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(19, 98).addBox(1.0F, -9.0F, -3.8F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(40, 68).addBox(1.0F, -9.9F, -3.8F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(97, 10).addBox(-3.0F, -9.0F, -3.8F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(0, 67).addBox(-3.0F, -9.9F, -3.8F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(36, 36).addBox(-2.0F, -7.0F, -4.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(31, 18).addBox(-3.0F, -7.0F, -4.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(3, 40).addBox(-4.5F, -8.0F, -4.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(44, 18).addBox(3.0F, -8.0F, -4.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(39, 35).addBox(-3.0F, -8.0F, -4.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(44, 2).addBox(2.0F, -8.0F, -4.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(64, 97).addBox(2.0F, -9.0F, -3.8F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(31, 67).addBox(2.0F, -9.9F, -3.8F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(96, 56).addBox(-2.0F, -9.0F, -3.8F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(22, 66).addBox(-2.0F, -9.9F, -3.8F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(39, 37).addBox(-4.0F, -8.0F, -4.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(44, 0).addBox(2.0F, -7.0F, -4.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(20, 43).addBox(1.0F, -7.0F, -4.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(3, 42).addBox(0.0F, -7.0F, -4.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 41).addBox(0.0F, -6.0F, -4.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(21, 41).addBox(-1.0F, -7.0F, -4.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(36, 34).addBox(-1.0F, -6.0F, -4.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(99, 72).addBox(3.5F, -7.0F, -2.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(27, 99).addBox(-4.5F, -7.0F, -2.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.0F, 11.0F, 0.0F);
		right_leg.setTextureOffset(32, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(44, 11).addBox(-2.5F, 12.0F, -3.5F, 5.0F, 1.0F, 6.0F, 0.0F, false);
		right_leg.setTextureOffset(58, 18).addBox(-2.5F, 11.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		right_leg.setTextureOffset(48, 27).addBox(-2.5F, 9.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		right_leg.setTextureOffset(63, 34).addBox(-2.5F, 8.0F, -2.2F, 5.0F, 1.0F, 4.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.0F, 11.0F, 0.0F);
		left_leg.setTextureOffset(32, 17).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(37, 44).addBox(-2.5F, 12.0F, -3.5F, 5.0F, 1.0F, 6.0F, 0.0F, false);
		left_leg.setTextureOffset(23, 60).addBox(-2.5F, 11.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		left_leg.setTextureOffset(60, 6).addBox(-2.5F, 9.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		left_leg.setTextureOffset(65, 0).addBox(-2.5F, 8.0F, -2.2F, 5.0F, 1.0F, 4.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-6.0F, 0.0F, 0.0F);
		right_arm.setTextureOffset(103, 63).addBox(-0.5F, 1.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(104, 53).addBox(-1.0F, 1.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(105, 7).addBox(-0.5F, 0.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(64, 104).addBox(-1.0F, 0.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(108, 0).addBox(-4.5F, 0.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(104, 107).addBox(-4.0F, 0.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(108, 97).addBox(-4.0F, 1.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(7, 108).addBox(-4.5F, 1.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(85, 107).addBox(-4.5F, -1.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(107, 91).addBox(-4.0F, -1.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(91, 9).addBox(-3.0F, -1.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(57, 103).addBox(-2.0F, -1.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(105, 40).addBox(-1.0F, -1.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(17, 105).addBox(-0.5F, -1.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(105, 46).addBox(-1.0F, -2.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(71, 105).addBox(-0.5F, -2.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(0, 106).addBox(-0.5F, -3.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(106, 13).addBox(-1.0F, -3.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(24, 106).addBox(-2.0F, -3.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(97, 17).addBox(-3.0F, -2.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(103, 23).addBox(-2.0F, -2.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(78, 106).addBox(-3.0F, -3.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(31, 107).addBox(-4.0F, -3.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(107, 69).addBox(-4.0F, -2.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(107, 79).addBox(-4.5F, -2.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(97, 106).addBox(-4.5F, -3.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(0, 19).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 14.0F, 4.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(6.0F, 0.0F, 0.0F);
		left_arm.setTextureOffset(16, 19).addBox(0.0F, -2.0F, -2.0F, 4.0F, 14.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(114, 71).addBox(0.0F, -3.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(109, 29).addBox(-0.5F, -3.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(113, 12).addBox(0.0F, -2.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(38, 109).addBox(-0.5F, -2.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(71, 112).addBox(0.0F, 0.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(110, 19).addBox(-0.5F, 0.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(0, 112).addBox(0.0F, 1.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(57, 110).addBox(-0.5F, 1.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(112, 6).addBox(0.0F, -1.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(50, 109).addBox(-0.5F, -1.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(7, 114).addBox(2.0F, -3.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(78, 113).addBox(2.0F, -2.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(112, 35).addBox(2.0F, -1.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(99, 113).addBox(3.0F, -3.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(110, 59).addBox(3.5F, -3.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(113, 85).addBox(3.0F, -2.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(14, 111).addBox(3.5F, -2.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(92, 112).addBox(3.0F, 0.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(64, 111).addBox(3.5F, 0.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(111, 109).addBox(3.0F, 1.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(111, 103).addBox(3.5F, 1.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(61, 45).addBox(-0.5F, 7.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(61, 39).addBox(-0.5F, 8.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(38, 61).addBox(-0.5F, 9.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(0, 61).addBox(-0.5F, 10.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(112, 41).addBox(3.0F, -1.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(111, 52).addBox(3.5F, -1.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(114, 65).addBox(1.0F, -3.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(28, 113).addBox(1.0F, -2.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(21, 112).addBox(1.0F, -1.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 11.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-5.0F, -13.0F, -3.0F, 10.0F, 13.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(0, 37).addBox(-5.2F, -12.0F, -3.5F, 2.0F, 7.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(25, 34).addBox(3.2F, -12.0F, -3.5F, 2.0F, 7.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(11, 41).addBox(-2.0F, -12.0F, -3.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(26, 4).addBox(-1.0F, -11.0F, -3.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(26, 2).addBox(-2.0F, -10.0F, -3.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(26, 0).addBox(-2.0F, -9.0F, -3.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(60, 15).addBox(-4.5F, -3.0F, -3.5F, 9.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(11, 39).addBox(-4.5F, -1.0F, -3.5F, 9.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(60, 13).addBox(-4.5F, -3.0F, 2.5F, 9.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(11, 37).addBox(-4.5F, -1.0F, 2.5F, 9.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(60, 63).addBox(4.5F, -3.0F, -3.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(13, 61).addBox(4.5F, -1.0F, -3.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(51, 62).addBox(-5.5F, -3.0F, -3.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(61, 26).addBox(-5.5F, -1.0F, -3.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(12, 21).addBox(-1.0F, -8.0F, -3.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(12, 19).addBox(-1.0F, -7.0F, -3.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 4).addBox(-1.0F, -6.0F, -3.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 2).addBox(-1.0F, -5.0F, -3.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, -3.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}