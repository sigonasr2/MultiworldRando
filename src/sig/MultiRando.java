package sig;

import java.util.Arrays;

public class MultiRando {
	private static int bitwiseCounter=0;
	final static Long NULL = 0l;
	final static Long INTERMEDIATE_HARD = DefineBitwiseConstant();
	final static Long INTERMEDIATE = DefineBitwiseConstant();
	final static Long SPEED1 = DefineBitwiseConstant();
	final static Long AIR_DASH = DefineBitwiseConstant();
	final static Long AIR_JUMP = DefineBitwiseConstant();
	final static Long EXPLOSIVES_ENEMY = DefineBitwiseConstant();
	final static Long SLIDING_POWDER = DefineBitwiseConstant();
	final static Long PROLOGUE_TRIGGER = DefineBitwiseConstant();
	final static Long EXPLOSIVES = DefineBitwiseConstant();
	final static Long HAMMER_ROLL_ZIP = DefineBitwiseConstant();
	final static Long ADVANCED_VERYHARD = DefineBitwiseConstant();
	final static Long SLIDE_ZIP = DefineBitwiseConstant();
	final static Long AMULET_FOOD = DefineBitwiseConstant();
	final static Long WHIRL_BONK = DefineBitwiseConstant();
	final static Long RABI_SLIPPERS = DefineBitwiseConstant();
	final static Long BUNNY_STRIKE = DefineBitwiseConstant();
	final static Long DARKNESS = DefineBitwiseConstant();
	final static Long WALL_JUMP_LV2 = DefineBitwiseConstant();
	final static Long WHIRL_BONK_CANCEL = DefineBitwiseConstant();
	final static Long HAMMER_ROLL = DefineBitwiseConstant();
	final static Long ADVANCED_STUPID = DefineBitwiseConstant();
	final static Long DOWNDRILL_SEMISOLID_CLIP = DefineBitwiseConstant();
	final static Long HARD = DefineBitwiseConstant();
	final static Long SLIDE_JUMP_BUNSTRIKE_CANCEL = DefineBitwiseConstant();
	final static Long BUNNY_AMULET = DefineBitwiseConstant();
	final static Long IMPOSSIBLE = DefineBitwiseConstant();
	final static Long CARROT_SHOOTER = DefineBitwiseConstant();
	final static Long CARROT_BOMB = DefineBitwiseConstant();
	final static Long BACKTRACK_1 = DefineBitwiseConstant();
	final static Long ADVANCED_HARD = DefineBitwiseConstant();
	final static Long SPEED5 = DefineBitwiseConstant();
	final static Long KOTRI_1 = DefineBitwiseConstant();
	final static Long COCOA_1 = DefineBitwiseConstant();
	final static Long CHAPTER_1 = DefineBitwiseConstant();
	final static Long WALL_JUMP = DefineBitwiseConstant();
	final static Long AIR_DASH_LV3 = DefineBitwiseConstant();
	final static Long SLIDE_JUMP_BUNSTRIKE = DefineBitwiseConstant();
	final static Long INTERMEDIATE_VERYHARD = DefineBitwiseConstant();
	final static Long TM_PANDORA = DefineBitwiseConstant();
	final static Long HALLOWEEN = DefineBitwiseConstant();
	final static Long BOOST = DefineBitwiseConstant();
	final static Long BOOST_MANY = DefineBitwiseConstant();
	final static Long EIGHT_TILE_WALLJUMP = DefineBitwiseConstant();
	final static Long TM_CHOCOLATE = DefineBitwiseConstant();
	final static Long WATER_ORB = DefineBitwiseConstant();
	final static Long ADVANCED = DefineBitwiseConstant();
	final static Long BUNNY_AMULET_LV2 = DefineBitwiseConstant();
	final static Long TWO_AMULET_FOOD = DefineBitwiseConstant();
	final static Long UNDERWATER = DefineBitwiseConstant();
	final static Long SPEED3 = DefineBitwiseConstant();
	final static Long PIKO_HAMMER_LEVELED = DefineBitwiseConstant();
	final static Long BACKTRACK_3 = DefineBitwiseConstant();
	final static Long ONE_WAY = DefineBitwiseConstant(); //This constant will never be available to the player, so setting this will effectively make a node only one-way, since whatever this is used on will be inaccessible.

	static Node[] SW = new Node[22];
	static Node[] WC = new Node[23];
	static Node[] IC = new Node[20];
	static Node[] NT = new Node[23];
	static Node[] EH = new Node[25];
	static Node[] RRT = new Node[1];
	static Node[] P = new Node[1];
	static Node[] SA = new Node[2];
	static Node[] SI = new Node[1];


	private static long DefineBitwiseConstant() {/*System.out.println("Restrictions reach a bit-wise value of "+Long.toBinaryString((long)Math.pow(2,i)));*/return (long)Math.pow(2,bitwiseCounter++);}

	private static void createNodes() {
		InitializeNodes(SW,WC,IC,NT,EH,RRT,P,SA,SI);
		SW[0].add(SW[1],NULL);
		SW[0].add(SW[7],NULL);
		SW[1].add(SW[2],
			new Long[]{INTERMEDIATE_HARD,SPEED1|INTERMEDIATE,AIR_DASH,AIR_JUMP},
			NULL);
		SW[2].add(SW[5],
			new Long[]{EXPLOSIVES_ENEMY|SLIDING_POWDER|PROLOGUE_TRIGGER},
			new Long[]{
				DARKNESS|EXPLOSIVES|SLIDING_POWDER|PROLOGUE_TRIGGER,
				DARKNESS|EXPLOSIVES|HAMMER_ROLL_ZIP|PROLOGUE_TRIGGER,
				DARKNESS|ADVANCED_VERYHARD|EXPLOSIVES_ENEMY|SLIDE_ZIP});
		SW[2].add(SW[6],
			new Long[]{EXPLOSIVES_ENEMY},
			new Long[]{
				EXPLOSIVES_ENEMY|ADVANCED_VERYHARD,
				EXPLOSIVES_ENEMY|INTERMEDIATE_HARD|AMULET_FOOD,
				EXPLOSIVES_ENEMY|WHIRL_BONK,
				EXPLOSIVES_ENEMY|RABI_SLIPPERS,
				EXPLOSIVES_ENEMY|BUNNY_STRIKE,
				EXPLOSIVES_ENEMY|AIR_JUMP,
				EXPLOSIVES_ENEMY|AIR_DASH,
				SLIDE_ZIP|ADVANCED_VERYHARD,
				SLIDE_ZIP|INTERMEDIATE_HARD|AMULET_FOOD,
				SLIDE_ZIP|WHIRL_BONK,
				SLIDE_ZIP|RABI_SLIPPERS,
				SLIDE_ZIP|BUNNY_STRIKE,
				SLIDE_ZIP|AIR_JUMP,
				SLIDE_ZIP|AIR_DASH,
			}
		);
		SW[5].add(SW[6],
			new Long[]{
				DARKNESS|EXPLOSIVES|SLIDING_POWDER|PROLOGUE_TRIGGER,
				DARKNESS|EXPLOSIVES|HAMMER_ROLL_ZIP|PROLOGUE_TRIGGER,
				ADVANCED_VERYHARD|SLIDE_ZIP
			},
			new Long[]{
				EXPLOSIVES_ENEMY|SLIDING_POWDER|PROLOGUE_TRIGGER|ADVANCED_VERYHARD,
				EXPLOSIVES_ENEMY|SLIDING_POWDER|PROLOGUE_TRIGGER|INTERMEDIATE_HARD|AMULET_FOOD,
				EXPLOSIVES_ENEMY|SLIDING_POWDER|PROLOGUE_TRIGGER|INTERMEDIATE_HARD|RABI_SLIPPERS,
				EXPLOSIVES_ENEMY|SLIDING_POWDER|PROLOGUE_TRIGGER|WHIRL_BONK,
				EXPLOSIVES_ENEMY|SLIDING_POWDER|PROLOGUE_TRIGGER|BUNNY_STRIKE,
				EXPLOSIVES_ENEMY|SLIDING_POWDER|PROLOGUE_TRIGGER|AIR_JUMP,
				EXPLOSIVES_ENEMY|SLIDING_POWDER|PROLOGUE_TRIGGER|AIR_DASH,
			}
		);
		SW[1].add(SW[6],
			new Long[]{
				WALL_JUMP_LV2|AIR_JUMP,
				WALL_JUMP_LV2|WHIRL_BONK_CANCEL,
				ADVANCED_VERYHARD|HAMMER_ROLL|AIR_JUMP,
				ADVANCED_VERYHARD|HAMMER_ROLL|WALL_JUMP_LV2|AIR_DASH
			},
			NULL
		);
		SW[8].add(SW[5],
			new Long[]{
				EXPLOSIVES_ENEMY|SLIDING_POWDER|PROLOGUE_TRIGGER,
				EXPLOSIVES_ENEMY|HAMMER_ROLL_ZIP|PROLOGUE_TRIGGER,
				ADVANCED_VERYHARD|SLIDE_ZIP
			},
			new Long[]{
				DARKNESS|EXPLOSIVES|SLIDING_POWDER|PROLOGUE_TRIGGER
			}
		);
		SW[8].add(SW[0],
			new Long[]{NULL},
			new Long[]{
				RABI_SLIPPERS|SLIDING_POWDER,
				RABI_SLIPPERS|HAMMER_ROLL_ZIP,
				AIR_JUMP|SLIDING_POWDER,
				AIR_JUMP|HAMMER_ROLL_ZIP,
				ADVANCED_STUPID|SLIDING_POWDER,
				BUNNY_STRIKE|SLIDING_POWDER,
				BUNNY_STRIKE|HAMMER_ROLL_ZIP,
				AIR_DASH|SLIDING_POWDER,
				AIR_DASH|HAMMER_ROLL_ZIP,
				WHIRL_BONK|SLIDING_POWDER,
				WHIRL_BONK|HAMMER_ROLL_ZIP,
			}
		);
		SW[1].add(SW[3],PROLOGUE_TRIGGER);
		SW[0].add(SW[4],
			new Long[]{SLIDE_ZIP},
			new Long[]{ONE_WAY}
		);
		SW[1].add(SW[4],
			new Long[]{DOWNDRILL_SEMISOLID_CLIP},
			NULL
		);
		SW[0].add(SW[12],
			new Long[]{INTERMEDIATE|AIR_JUMP|RABI_SLIPPERS,
				INTERMEDIATE|AIR_JUMP|HARD|WALL_JUMP,
				INTERMEDIATE|WHIRL_BONK_CANCEL,
				INTERMEDIATE|SLIDE_JUMP_BUNSTRIKE_CANCEL|AIR_JUMP,
				INTERMEDIATE|SLIDE_JUMP_BUNSTRIKE_CANCEL|WALL_JUMP_LV2|AIR_DASH,
				INTERMEDIATE|SLIDE_JUMP_BUNSTRIKE_CANCEL|WALL_JUMP_LV2|ADVANCED_STUPID,
				INTERMEDIATE|ADVANCED_HARD|HAMMER_ROLL|AIR_JUMP,
				INTERMEDIATE|ADVANCED_HARD|HAMMER_ROLL|WALL_JUMP_LV2,
				ADVANCED_STUPID|SLIDING_POWDER|BUNNY_AMULET|WALL_JUMP_LV2,
				ADVANCED_STUPID|SLIDE_ZIP|AIR_JUMP,
				ADVANCED_STUPID|SLIDE_ZIP|BUNNY_AMULET|WALL_JUMP_LV2,
				ADVANCED_STUPID|WHIRL_BONK|AIR_JUMP},
			NULL
		);
		SW[0].add(SW[9],NULL);
		SW[11].add(SW[12],
			new Long[]{EXPLOSIVES_ENEMY},
			new Long[]{DARKNESS|CARROT_SHOOTER,
			DARKNESS|CARROT_BOMB|BACKTRACK_1});
		SW[11].add(SW[0],IMPOSSIBLE);
		SW[8].add(SW[10],
			new Long[]{DARKNESS|PROLOGUE_TRIGGER|SLIDING_POWDER},
			new Long[]{PROLOGUE_TRIGGER|SLIDING_POWDER,
				PROLOGUE_TRIGGER|HAMMER_ROLL_ZIP});
		SW[9].add(SW[10],
			new Long[]{INTERMEDIATE|DARKNESS|AIR_JUMP,
				INTERMEDIATE|DARKNESS|WALL_JUMP_LV2|RABI_SLIPPERS,
				INTERMEDIATE|DARKNESS|WALL_JUMP_LV2|INTERMEDIATE_HARD|SLIDING_POWDER,
				INTERMEDIATE|DARKNESS|WALL_JUMP_LV2|ADVANCED_HARD|SPEED1,
				INTERMEDIATE|DARKNESS|WALL_JUMP_LV2|AIR_DASH,
				INTERMEDIATE|DARKNESS|WALL_JUMP_LV2|ADVANCED_VERYHARD,
				INTERMEDIATE|DARKNESS|WHIRL_BONK_CANCEL,
				INTERMEDIATE|DARKNESS|SLIDE_JUMP_BUNSTRIKE_CANCEL,
				INTERMEDIATE|DARKNESS|ADVANCED_VERYHARD|SLIDING_POWDER,
				INTERMEDIATE|DARKNESS|ADVANCED_VERYHARD|WHIRL_BONK,
				INTERMEDIATE|DARKNESS|ADVANCED_STUPID|SPEED5},
			NULL);
		SW[9].add(SW[11],
			new Long[]{DARKNESS|PROLOGUE_TRIGGER},
			PROLOGUE_TRIGGER);
		SW[10].add(SW[11],
			new Long[]{DARKNESS|DOWNDRILL_SEMISOLID_CLIP},
			NULL);
	}
	private static void InitializeNodes(Node[]...sF) {
		for (int i=0;i<sF.length;i++) {
			for (int j=0;j<sF[i].length;j++) {
				sF[i][j]=new Node(j);
			}
		}
	}

	public static void main(String[] args) {
		createNodes();
		System.out.println(Arrays.toString(SW));
	}
	
}
