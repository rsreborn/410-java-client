/* Class27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class27
{
    public static float[][] aFloatArrayArray492 = new float[2][8];
    public static int anInt493;
    public int[][][] anIntArrayArrayArray494 = new int[2][2][4];
    public int[][][] anIntArrayArrayArray495 = new int[2][2][4];
    public static float aFloat496;
    public static int[][] anIntArrayArray497 = new int[2][8];
    public int[] anIntArray498;
    public int[] anIntArray499 = new int[2];
    
    public static void method602() {
	aFloatArrayArray492 = null;
	anIntArrayArray497 = null;
    }
    
    public float method603(int arg0, int arg1, float arg2) {
	float f
	    = ((float) anIntArrayArrayArray494[arg0][0][arg1]
	       + arg2 * (float) (anIntArrayArrayArray494[arg0][1][arg1]
				 - anIntArrayArrayArray494[arg0][0][arg1]));
	f *= 1.2207031E-4F;
	return method605(f);
    }
    
    public void method604(Buffer arg0, Class16 arg1) {
	int i = arg0.readUByte();
	anIntArray499[0] = i >> 4;
	anIntArray499[1] = i & 0xf;
	if (i != 0) {
	    anIntArray498[0] = arg0.readUShortBE();
	    anIntArray498[1] = arg0.readUShortBE();
	    int i_0_ = arg0.readUByte();
	    for (int i_1_ = 0; i_1_ < 2; i_1_++) {
		for (int i_2_ = 0; i_2_ < anIntArray499[i_1_]; i_2_++) {
		    anIntArrayArrayArray494[i_1_][0][i_2_]
			= arg0.readUShortBE();
		    anIntArrayArrayArray495[i_1_][0][i_2_]
			= arg0.readUShortBE();
		}
	    }
	    for (int i_3_ = 0; i_3_ < 2; i_3_++) {
		for (int i_4_ = 0; i_4_ < anIntArray499[i_3_]; i_4_++) {
		    if ((i_0_ & 1 << i_3_ * 4 << i_4_) != 0) {
			anIntArrayArrayArray494[i_3_][1][i_4_]
			    = arg0.readUShortBE();
			anIntArrayArrayArray495[i_3_][1][i_4_]
			    = arg0.readUShortBE();
		    } else {
			anIntArrayArrayArray494[i_3_][1][i_4_]
			    = anIntArrayArrayArray494[i_3_][0][i_4_];
			anIntArrayArrayArray495[i_3_][1][i_4_]
			    = anIntArrayArrayArray495[i_3_][0][i_4_];
		    }
		}
	    }
	    if (i_0_ != 0 || anIntArray498[1] != anIntArray498[0])
		arg1.method559(arg0);
	} else
	    anIntArray498[0] = anIntArray498[1] = 0;
    }
    
    public static float method605(float arg0) {
	float f = 32.703197F * (float) Math.pow(2.0, (double) arg0);
	return f * 3.1415927F / 11025.0F;
    }
    
    public float method606(int arg0, int arg1, float arg2) {
	float f
	    = ((float) anIntArrayArrayArray495[arg0][0][arg1]
	       + arg2 * (float) (anIntArrayArrayArray495[arg0][1][arg1]
				 - anIntArrayArrayArray495[arg0][0][arg1]));
	f *= 0.0015258789F;
	return 1.0F - (float) Math.pow(10.0, (double) (-f / 20.0F));
    }
    
    public int method607(int arg0, float arg1) {
	if (arg0 == 0) {
	    float f = ((float) anIntArray498[0]
		       + (float) (anIntArray498[1] - anIntArray498[0]) * arg1);
	    f *= 0.0030517578F;
	    aFloat496 = (float) Math.pow(0.1, (double) (f / 20.0F));
	    anInt493 = (int) (aFloat496 * 65536.0F);
	}
	if (anIntArray499[arg0] == 0)
	    return 0;
	float f = method606(arg0, 0, arg1);
	aFloatArrayArray492[arg0][0]
	    = -2.0F * f * (float) Math.cos((double) method603(arg0, 0, arg1));
	aFloatArrayArray492[arg0][1] = f * f;
	for (int i = 1; i < anIntArray499[arg0]; i++) {
	    f = method606(arg0, i, arg1);
	    float f_5_
		= (-2.0F * f
		   * (float) Math.cos((double) method603(arg0, i, arg1)));
	    float f_6_ = f * f;
	    aFloatArrayArray492[arg0][i * 2 + 1]
		= aFloatArrayArray492[arg0][i * 2 - 1] * f_6_;
	    aFloatArrayArray492[arg0][i * 2]
		= (aFloatArrayArray492[arg0][i * 2 - 1] * f_5_
		   + aFloatArrayArray492[arg0][i * 2 - 2] * f_6_);
	    for (int i_7_ = i * 2 - 1; i_7_ >= 2; i_7_--)
		aFloatArrayArray492[arg0][i_7_]
		    += (aFloatArrayArray492[arg0][i_7_ - 1] * f_5_
			+ aFloatArrayArray492[arg0][i_7_ - 2] * f_6_);
	    aFloatArrayArray492[arg0][1]
		+= aFloatArrayArray492[arg0][0] * f_5_ + f_6_;
	    aFloatArrayArray492[arg0][0] += f_5_;
	}
	if (arg0 == 0) {
	    for (int i = 0; i < anIntArray499[0] * 2; i++)
		aFloatArrayArray492[0][i] *= aFloat496;
	}
	for (int i = 0; i < anIntArray499[arg0] * 2; i++)
	    anIntArrayArray497[arg0][i]
		= (int) (aFloatArrayArray492[arg0][i] * 65536.0F);
	return anIntArray499[arg0] * 2;
    }
    
    public Class27() {
	anIntArray498 = new int[2];
    }
}
