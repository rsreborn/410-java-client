/* Class18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class18
{
    public int[] anIntArray346;
    public static int[] anIntArray347;
    public static int[] anIntArray348;
    public int[] anIntArray349;
    public int[] anIntArray350;
    public int[] anIntArray351;
    public Class11_Sub6 aClass11_Sub6_352 = null;
    public static int[] anIntArray353 = new int[500];
    public boolean aBoolean354 = false;
    public static int[] anIntArray355;
    public int anInt356 = -1;
    
    public static void method565() {
	anIntArray347 = null;
	anIntArray348 = null;
	anIntArray355 = null;
	anIntArray353 = null;
    }
    
    public Class18(byte[] arg0, Class11_Sub6 arg1) {
	aClass11_Sub6_352 = arg1;
	Buffer buffer = new Buffer(arg0);
	Buffer buffer_0_ = new Buffer(arg0);
	buffer.position = 2;
	int i = buffer.readUByte();
	int i_1_ = -1;
	int i_2_ = 0;
	buffer_0_.position = buffer.position + i;
	for (int i_3_ = 0; i_3_ < i; i_3_++) {
	    int i_4_ = buffer.readUByte();
	    if (i_4_ > 0) {
		if (aClass11_Sub6_352.anIntArray1580[i_3_] != 0) {
		    for (int i_5_ = i_3_ - 1; i_5_ > i_1_; i_5_--) {
			if (aClass11_Sub6_352.anIntArray1580[i_5_] == 0) {
			    anIntArray347[i_2_] = i_5_;
			    anIntArray348[i_2_] = 0;
			    anIntArray355[i_2_] = 0;
			    anIntArray353[i_2_] = 0;
			    i_2_++;
			    break;
			}
		    }
		}
		anIntArray347[i_2_] = i_3_;
		int i_6_ = 0;
		if (aClass11_Sub6_352.anIntArray1580[i_3_] == 3)
		    i_6_ = 128;
		if ((i_4_ & 0x1) != 0)
		    anIntArray348[i_2_]
			= buffer_0_.method159((byte) 103);
		else
		    anIntArray348[i_2_] = i_6_;
		if ((i_4_ & 0x2) != 0)
		    anIntArray355[i_2_] = buffer_0_.method159((byte) 30);
		else
		    anIntArray355[i_2_] = i_6_;
		if ((i_4_ & 0x4) != 0)
		    anIntArray353[i_2_] = buffer_0_.method159((byte) 32);
		else
		    anIntArray353[i_2_] = i_6_;
		i_1_ = i_3_;
		i_2_++;
		if (aClass11_Sub6_352.anIntArray1580[i_3_] == 5)
		    aBoolean354 = true;
	    }
	}
	if (buffer_0_.position != arg0.length)
	    throw new RuntimeException();
	anInt356 = i_2_;
	anIntArray346 = new int[i_2_];
	anIntArray351 = new int[i_2_];
	anIntArray350 = new int[i_2_];
	anIntArray349 = new int[i_2_];
	for (int i_7_ = 0; i_7_ < i_2_; i_7_++) {
	    anIntArray346[i_7_] = anIntArray347[i_7_];
	    anIntArray351[i_7_] = anIntArray348[i_7_];
	    anIntArray350[i_7_] = anIntArray355[i_7_];
	    anIntArray349[i_7_] = anIntArray353[i_7_];
	}
    }
    
    static {
	anIntArray348 = new int[500];
	anIntArray355 = new int[500];
	anIntArray347 = new int[500];
    }
}
