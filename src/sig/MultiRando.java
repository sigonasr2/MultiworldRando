package sig;

import java.util.ArrayList;
import java.util.List;

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

	private static long DefineBitwiseConstant() {/*System.out.println("Restrictions reach a bit-wise value of "+Long.toBinaryString((long)Math.pow(2,i)));*/return (long)Math.pow(2,bitwiseCounter++);}

	private static void createNodes() {
		Node[] SW = new Node[22];
		Node[] WC = new Node[23];
		Node[] IC = new Node[20];
		Node[] NT = new Node[23];
		Node[] EH = new Node[25];
		Node[] RRT = new Node[1];
		Node[] P = new Node[1];
		Node[] SA = new Node[2];
		Node[] SI = new Node[1];
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
	}
	private static void InitializeNodes(Node[]...sF) {
		for (int i=0;i<sF.length;i++) {
			for (int j=0;j<sF[i].length;j++) {
				sF[i][j]=new Node();
			}
		}
	}

	public static void main(String[] args) {
		createNodes();
	}
	
}
