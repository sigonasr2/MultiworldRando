package sig;

import java.util.ArrayList;
import java.util.List;

public class MultiRando {
	private static int bitwiseCounter=0;
	final static long NULL = 0;
	final static long INTERMEDIATE_HARD = DefineBitwiseConstant();
	final static long INTERMEDIATE = DefineBitwiseConstant();
	final static long SPEED1 = DefineBitwiseConstant();
	final static long AIR_DASH = DefineBitwiseConstant();
	final static long AIR_JUMP = DefineBitwiseConstant();
	final static long EXPLOSIVES_ENEMY = DefineBitwiseConstant();
	final static long SLIDING_POWDER = DefineBitwiseConstant();
	final static long PROLOGUE_TRIGGER = DefineBitwiseConstant();
	final static long EXPLOSIVES = DefineBitwiseConstant();
	final static long HAMMER_ROLL_ZIP = DefineBitwiseConstant();
	final static long ADVANCED_VHARD = DefineBitwiseConstant();
	final static long SLIDE_ZIP = DefineBitwiseConstant();
	final static long AMULET_FOOD = DefineBitwiseConstant();
	final static long WHIRL_BONK = DefineBitwiseConstant();
	final static long RABI_SLIPPERS = DefineBitwiseConstant();
	final static long BUNNY_STRIKE = DefineBitwiseConstant();
	final static long DARKNESS = DefineBitwiseConstant();
	final static long WALL_JUMP_LV2 = DefineBitwiseConstant();
	final static long WHIRL_BONK_CANCEL = DefineBitwiseConstant();
	final static long HAMMER_ROLL = DefineBitwiseConstant();
	final static long ADVANCED_STUPID = DefineBitwiseConstant();
	final static long DOWNDRILL_SEMISOLID_CLIP = DefineBitwiseConstant();
	final static long HARD = DefineBitwiseConstant();
	final static long SLIDE_JUMP_BUNSTRIKE_CANCEL = DefineBitwiseConstant();
	final static long BUNNY_AMULET = DefineBitwiseConstant();
	final static long IMPOSSIBLE = DefineBitwiseConstant();
	final static long CARROT_SHOOTER = DefineBitwiseConstant();
	final static long CARROT_BOMB = DefineBitwiseConstant();
	final static long BACKTRACK_1 = DefineBitwiseConstant();
	final static long ADVANCED_HARD = DefineBitwiseConstant();
	final static long SPEED5 = DefineBitwiseConstant();
	final static long KOTRI_1 = DefineBitwiseConstant();
	final static long COCOA_1 = DefineBitwiseConstant();
	final static long CHAPTER_1 = DefineBitwiseConstant();
	final static long WALL_JUMP = DefineBitwiseConstant();
	final static long AIR_DASH_LV3 = DefineBitwiseConstant();
	final static long SLIDE_JUMP_BUNSTRIKE = DefineBitwiseConstant();
	final static long INTERMEDIATE_VERYHARD = DefineBitwiseConstant();
	final static long TM_PANDORA = DefineBitwiseConstant();
	final static long HALLOWEEN = DefineBitwiseConstant();
	final static long BOOST = DefineBitwiseConstant();
	final static long BOOST_MANY = DefineBitwiseConstant();
	final static long EIGHT_TILE_WALLJUMP = DefineBitwiseConstant();
	final static long TM_CHOCOLATE = DefineBitwiseConstant();
	final static long WATER_ORB = DefineBitwiseConstant();
	final static long ADVANCED = DefineBitwiseConstant();
	final static long BUNNY_AMULET_LV2 = DefineBitwiseConstant();
	final static long TWO_AMULET_FOOD = DefineBitwiseConstant();
	final static long UNDERWATER = DefineBitwiseConstant();
	final static long SPEED3 = DefineBitwiseConstant();
	final static long PIKO_HAMMER_LEVELED = DefineBitwiseConstant();
	final static long BACKTRACK_3 = DefineBitwiseConstant();

	private static long DefineBitwiseConstant() {/*System.out.println("Restrictions reach a bit-wise value of "+Long.toBinaryString((long)Math.pow(2,i)));*/return (long)Math.pow(2,bitwiseCounter++);}
	public static List<Node> STARTING_FOREST = new ArrayList<Node>();

	private static void createStartingForest() {
		Node nn = null;
		Node EF = new Node(null,NULL,null,NULL,null,NULL,null,NULL);
		List<Node> n = STARTING_FOREST =  List.of(
			nn,nn,nn,nn,nn,nn,nn,nn,nn,nn,nn,nn,
			EF,nn,nn,nn,nn,nn,nn,nn,nn,nn,nn,nn
		);

	}
	public static void main(String[] args) {
	}
	
}
