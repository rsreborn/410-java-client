/* Class11_Sub10_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11_Sub10_Sub16 extends Class11_Sub10
{
    public static Class40 aClass40_2425;
    public static int anInt2426;
    public static int anInt2427;
    public static Class31 aClass31_2428
	= Class64.method992("Enter your username (V password)3", 255);
    public byte aByte2429;
    public static int anInt2430 = -1;
    public Class55_Sub1 aClass55_Sub1_2431;
    public int anInt2432;
    public static int anInt2433;
    public static Class37 aClass37_2434;
    public static Class40 aClass40_2435;
    public static Class55 aClass55_2436;
    public static Class31 aClass31_2437;
    public static Class31 aClass31_2438;
    public static Class45 aClass45_2439;
    
    public static void method488(int arg0, int arg1, boolean arg2, int arg3,
				 int arg4, int arg5, int arg6) {
	try {
	    anInt2426++;
	    int i = 0x7ff & 2048 + -arg1;
	    int i_0_ = 0;
	    int i_1_ = 0x7ff & 2048 + -arg4;
	    int i_2_ = 0;
	    if (arg2 != true)
		method489(-40);
	    int i_3_ = arg6;
	    if (i_1_ != 0) {
		int i_4_ = Class11_Sub10_Sub4_Sub4.anIntArray2632[i_1_];
		int i_5_ = Class11_Sub10_Sub4_Sub4.anIntArray2654[i_1_];
		int i_6_ = -(i_3_ * i_4_) + i_5_ * i_2_ >> -1168028720;
		i_3_ = i_5_ * i_3_ + i_2_ * i_4_ >> 527627696;
		i_2_ = i_6_;
	    }
	    if ((i ^ 0xffffffff) != -1) {
		int i_7_ = Class11_Sub10_Sub4_Sub4.anIntArray2632[i];
		int i_8_ = Class11_Sub10_Sub4_Sub4.anIntArray2654[i];
		int i_9_ = i_8_ * i_0_ + i_3_ * i_7_ >> -379612400;
		i_3_ = i_3_ * i_8_ + -(i_0_ * i_7_) >> -661251760;
		i_0_ = i_9_;
	    }
	    Class11_Sub8.anInt1628 = arg4;
	    Class42.anInt761 = -i_2_ + arg5;
	    Class15_Sub1.anInt1748 = arg0 - i_3_;
	    Class15_Sub2.anInt1764 = -i_0_ + arg3;
	    Class8.anInt180 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("i.A(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + arg3 + ',' + arg4 + ',' + arg5
				     + ',' + arg6 + ')'));
	}
    }
    
    public static void method489(int arg0) {
	aClass31_2438 = null;
	aClass31_2437 = null;
	aClass45_2439 = null;
	aClass37_2434 = null;
	aClass55_2436 = null;
	aClass40_2425 = null;
	aClass40_2435 = null;
	aClass31_2428 = null;
	if (arg0 != -5361)
	    method489(-54);
    }
    
    public static Class11_Sub10_Sub6 method490(int arg0, int arg1) {
	try {
	    int i = -117 / ((10 - arg0) / 57);
	    Class11_Sub10_Sub6 class11_sub10_sub6
		= ((Class11_Sub10_Sub6)
		   Class23.aClass40_419.method735((long) arg1, (byte) -92));
	    anInt2427++;
	    if (class11_sub10_sub6 != null)
		return class11_sub10_sub6;
	    class11_sub10_sub6
		= Class11_Sub5_Sub1.method204(false,
					      (Class11_Sub10_Sub15
					       .aClass55_2362),
					      32214, Class47.aClass55_882,
					      arg1);
	    if (class11_sub10_sub6 != null)
		Class23.aClass40_419.method742(-123, (long) arg1,
					       class11_sub10_sub6);
	    return class11_sub10_sub6;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "i.B(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method491(int arg0) {
	int i = 256;
	for (int i_10_ = 10; i_10_ < 117; i_10_++) {
	    int i_11_ = (int) (100.0 * Math.random());
	    if ((i_11_ ^ 0xffffffff) > -51)
		Class58.anIntArray1227[i_10_ - -(i + -2 << -1586542105)] = 255;
	}
	for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > -101; i_12_++) {
	    int i_13_ = (int) (Math.random() * 128.0) + 128;
	    int i_14_ = (int) (124.0 * Math.random()) - -2;
	    int i_15_ = i_14_ - -(i_13_ << 216450535);
	    Class58.anIntArray1227[i_15_] = 192;
	}
	for (int i_16_ = 1; i_16_ < i - 1; i_16_++) {
	    for (int i_17_ = 1; i_17_ < 127; i_17_++) {
		int i_18_ = i_17_ + (i_16_ << -810646233);
		Class1.anIntArray72[i_18_]
		    = (Class58.anIntArray1227[128 + i_18_]
		       + (Class58.anIntArray1227[1 + i_18_]
			  + Class58.anIntArray1227[i_18_ + -1]
			  - -Class58.anIntArray1227[i_18_ - 128])) / 4;
	    }
	}
	if (arg0 < 41)
	    method491(-38);
	Class23.anInt425 += 128;
	if (Class15_Sub1.anIntArray1734.length < Class23.anInt425) {
	    Class23.anInt425 -= Class15_Sub1.anIntArray1734.length;
	    int i_19_ = (int) (12.0 * Math.random());
	    Class11_Sub10_Sub11.method379(true,
					  (Class11_Sub10_Sub4
					   .aClass11_Sub10_Sub13_Sub3Array2038
					   [i_19_]));
	}
	anInt2433++;
	for (int i_20_ = 1; (i_20_ ^ 0xffffffff) > (i - 1 ^ 0xffffffff);
	     i_20_++) {
	    for (int i_21_ = 1; i_21_ < 127; i_21_++) {
		int i_22_ = i_21_ + (i_20_ << -632915737);
		int i_23_ = (-((Class15_Sub1.anIntArray1734
				[(-1 + Class15_Sub1.anIntArray1734.length
				  & i_22_ - -Class23.anInt425)])
			       / 5)
			     + Class1.anIntArray72[128 + i_22_]);
		if (i_23_ < 0)
		    i_23_ = 0;
		Class58.anIntArray1227[i_22_] = i_23_;
	    }
	}
	for (int i_24_ = 0; i_24_ < i + -1; i_24_++)
	    Class11_Sub10_Sub14.anIntArray2309[i_24_]
		= Class11_Sub10_Sub14.anIntArray2309[1 + i_24_];
	Class11_Sub10_Sub14.anIntArray2309[-1 + i]
	    = (int) (16.0 * Math.sin((double) Class61.anInt1283 / 14.0)
		     + Math.sin((double) Class61.anInt1283 / 15.0) * 14.0
		     + 12.0 * Math.sin((double) Class61.anInt1283 / 16.0));
	if ((Class11_Sub10_Sub6.anInt2138 ^ 0xffffffff) < -1)
	    Class11_Sub10_Sub6.anInt2138 -= 4;
	if ((Class11_Sub10_Sub4.anInt2032 ^ 0xffffffff) < -1)
	    Class11_Sub10_Sub4.anInt2032 -= 4;
	if (Class11_Sub10_Sub6.anInt2138 == 0
	    && (Class11_Sub10_Sub4.anInt2032 ^ 0xffffffff) == -1) {
	    int i_25_ = (int) (2000.0 * Math.random());
	    if ((i_25_ ^ 0xffffffff) == -1)
		Class11_Sub10_Sub6.anInt2138 = 1024;
	    if (i_25_ == 1)
		Class11_Sub10_Sub4.anInt2032 = 1024;
	}
    }
    
    static {
	aClass40_2425 = new Class40(10);
	aClass40_2435 = new Class40(64);
	aClass31_2437 = Class64.method992(")3", 255);
	aClass31_2438 = Class64.method992("compass", 255);
    }
}
