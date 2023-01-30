/* Class25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class25
{
    public static Class31 aClass31_460;
    public static Class31 aClass31_461;
    public static Class31 aClass31_462
	= Class64.method992("Starting game engine)3)3)3", 255);
    public static Class31 aClass31_463;
    public static Class37 aClass37_464;
    public static Class31 aClass31_465;
    public static Class31 aClass31_466;
    public static int anInt467;
    public static int anInt468;
    public int[] anIntArray469;
    public static int anInt470;
    public static Class41 aClass41_471;
    public static Class31 aClass31_472;
    public static Class37 aClass37_473;
    public static int anInt474;
    public static Class40 aClass40_475;
    public static Class31 aClass31_476;
    public static Class31 aClass31_477;
    public static Class31 aClass31_478;
    public static int anInt479;
    public static boolean aBoolean480;
    public static byte[][][] aByteArrayArrayArray481;
    public static Class37 aClass37_482;
    
    public int method596(int arg0, int arg1) {
	try {
	    if (arg0 > -21)
		aClass31_472 = null;
	    anInt474++;
	    int i = anIntArray469.length - 2;
	    int i_0_ = i & arg1 << 504854145;
	    for (;;) {
		int i_1_ = anIntArray469[i_0_];
		if (arg1 == i_1_)
		    return anIntArray469[i_0_ + 1];
		if ((i_1_ ^ 0xffffffff) == 0)
		    return -1;
		i_0_ = i_0_ + 2 & i;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "ma.B(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method597(int arg0) {
	try {
	    if (Class11_Sub12.aClass14_1699 != null)
		Class11_Sub12.aClass14_1699.method520(-9098);
	    Class11_Sub12.aClass14_1699 = null;
	    Class15_Sub2.method554(33554431);
	    anInt468++;
	    Class52.aClass49_1024.method797();
	    if (arg0 < -43) {
		for (int i = 0; (i ^ 0xffffffff) > -5; i++)
		    Class39.aClass8Array707[i].method92(true);
		System.gc();
		Class53.method860(10, -39);
		Class39_Sub1.anInt1823 = 0;
		Class46.anInt853 = -1;
		Class34.method674(10, false);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ma.D(" + arg0 + ')');
	}
    }
    
    public static void method598(int arg0, Class11_Sub10_Sub4_Sub2 arg1) {
	anInt467++;
	if (arg0 != arg1.anInt2518) {
	    if (arg1.anInt2568 != -1 && arg1.anInt2568 < 32768) {
		Class11_Sub10_Sub4_Sub2_Sub2 class11_sub10_sub4_sub2_sub2
		    = (Class12.aClass11_Sub10_Sub4_Sub2_Sub2Array235
		       [arg1.anInt2568]);
		if (class11_sub10_sub4_sub2_sub2 != null) {
		    int i = (-class11_sub10_sub4_sub2_sub2.anInt2517
			     + arg1.anInt2517);
		    int i_2_ = (arg1.anInt2506
				+ -class11_sub10_sub4_sub2_sub2.anInt2506);
		    if ((i_2_ ^ 0xffffffff) != -1 || i != 0)
			arg1.anInt2516
			    = 0x7ff & (int) (Math.atan2((double) i_2_,
							(double) i)
					     * 325.949);
		}
	    }
	    if (arg1.anInt2568 >= 32768) {
		int i = arg1.anInt2568 - 32768;
		if (i == Class44.anInt800)
		    i = 2047;
		Class11_Sub10_Sub4_Sub2_Sub1 class11_sub10_sub4_sub2_sub1
		    = (Class11_Sub10_Sub7
		       .aClass11_Sub10_Sub4_Sub2_Sub1Array2160[i]);
		if (class11_sub10_sub4_sub2_sub1 != null) {
		    int i_3_ = (-class11_sub10_sub4_sub2_sub1.anInt2506
				+ arg1.anInt2506);
		    int i_4_ = (arg1.anInt2517
				- class11_sub10_sub4_sub2_sub1.anInt2517);
		    if ((i_3_ ^ 0xffffffff) != -1 || i_4_ != 0)
			arg1.anInt2516
			    = 0x7ff & (int) (Math.atan2((double) i_3_,
							(double) i_4_)
					     * 325.949);
		}
	    }
	    if (((arg1.anInt2513 ^ 0xffffffff) != -1
		 || (arg1.anInt2532 ^ 0xffffffff) != -1)
		&& ((arg1.anInt2551 ^ 0xffffffff) == -1
		    || arg1.anInt2515 > 0)) {
		int i = arg1.anInt2517 + -((-Class10.anInt214 + arg1.anInt2532
					    - Class10.anInt214)
					   * 64);
		int i_5_ = (-(64 * (-Class11_Sub10_Sub6.anInt2133
				    + (-Class11_Sub10_Sub6.anInt2133
				       + arg1.anInt2513)))
			    + arg1.anInt2506);
		if (i_5_ != 0 || (i ^ 0xffffffff) != -1)
		    arg1.anInt2516
			= 0x7ff & (int) (Math.atan2((double) i_5_, (double) i)
					 * 325.949);
		arg1.anInt2513 = 0;
		arg1.anInt2532 = 0;
	    }
	    int i = 0x7ff & -arg1.anInt2547 + arg1.anInt2516;
	    if ((i ^ 0xffffffff) != -1) {
		if ((i ^ 0xffffffff) > (arg1.anInt2518 ^ 0xffffffff)
		    || (i ^ 0xffffffff) < (2048 + -arg1.anInt2518
					   ^ 0xffffffff))
		    arg1.anInt2547 = arg1.anInt2516;
		else if ((i ^ 0xffffffff) < -1025)
		    arg1.anInt2547 -= arg1.anInt2518;
		else
		    arg1.anInt2547 += arg1.anInt2518;
		arg1.anInt2547 &= 0x7ff;
		if ((arg1.anInt2560 ^ 0xffffffff) == (arg1.anInt2525
						      ^ 0xffffffff)
		    && (arg1.anInt2547 ^ 0xffffffff) != (arg1.anInt2516
							 ^ 0xffffffff)) {
		    if (arg1.anInt2507 == -1)
			arg1.anInt2560 = arg1.anInt2499;
		    else
			arg1.anInt2560 = arg1.anInt2507;
		}
	    }
	}
    }
    
    public static void method599(boolean arg0) {
	aClass37_464 = null;
	aClass31_466 = null;
	aClass31_460 = null;
	aClass31_462 = null;
	aClass31_477 = null;
	aClass31_476 = null;
	aClass31_461 = null;
	aByteArrayArrayArray481 = null;
	aClass31_463 = null;
	aClass31_465 = null;
	aClass40_475 = null;
	aClass31_472 = null;
	aClass37_473 = null;
	aClass41_471 = null;
	aClass37_482 = null;
	aClass31_478 = null;
	if (arg0 != true)
	    aClass40_475 = null;
    }
    
    public Class25(int[] arg0) {
	try {
	    int i;
	    for (i = 1;
		 ((arg0.length + (arg0.length >> -264800927) ^ 0xffffffff)
		  <= (i ^ 0xffffffff));
		 i <<= 1) {
		/* empty */
	    }
	    anIntArray469 = new int[i + i];
	    for (int i_6_ = 0; i + i > i_6_; i_6_++)
		anIntArray469[i_6_] = -1;
	    for (int i_7_ = 0; i_7_ < arg0.length; i_7_++) {
		int i_8_;
		for (i_8_ = arg0[i_7_] & -1 + i;
		     anIntArray469[i_8_ - -i_8_ - -1] != -1;
		     i_8_ = -1 + i & 1 + i_8_) {
		    /* empty */
		}
		anIntArray469[i_8_ + i_8_] = arg0[i_7_];
		anIntArray469[i_8_ + (i_8_ + 1)] = i_7_;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "ma.<init>(" + (arg0 != null ? "{...}"
						    : "null") + ')');
	}
    }
    
    static {
	aClass31_461 = Class64.method992("", 255);
	aClass31_472 = Class64.method992("glow2:", 255);
	aClass31_463 = aClass31_461;
	aClass31_460 = aClass31_461;
	aClass31_465 = aClass31_461;
	anInt470 = -1;
	aClass31_466 = Class64.method992("Use @lre@", 255);
	aClass31_478 = aClass31_461;
	aClass31_476 = aClass31_461;
	aClass31_477 = aClass31_461;
	aClass40_475 = new Class40(64);
	anInt479 = 0;
	aBoolean480 = false;
	aByteArrayArrayArray481 = new byte[4][104][104];
    }
}
