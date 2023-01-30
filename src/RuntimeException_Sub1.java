/* RuntimeException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class RuntimeException_Sub1 extends RuntimeException
{
    public Throwable aThrowable1350;
    public static int anInt1351;
    public static int anInt1352;
    public String aString1353;
    public static int anInt1354;
    public static Class31 aClass31_1355
	= Class64.method992("Could not complete login)3", 255);
    public static int[][] anIntArrayArray1356;
    public static Class11_Sub10_Sub13_Sub2 aClass11_Sub10_Sub13_Sub2_1357;
    public static int anInt1358;
    public static Class31 aClass31_1359;
    public static int anInt1360;
    
    public static void method997(int arg0) {
	try {
	    Class11_Sub10_Sub1.aClass40_1949.method740(4);
	    if (arg0 != -30989)
		anInt1352 = -92;
	    anInt1358++;
	    Class33.aClass40_613.method740(4);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "cc.A(" + arg0 + ')');
	}
    }
    
    public static void method998(int arg0) {
	try {
	    aClass31_1359 = null;
	    if (arg0 < 118)
		anIntArrayArray1356 = null;
	    aClass31_1355 = null;
	    anIntArrayArray1356 = null;
	    aClass11_Sub10_Sub13_Sub2_1357 = null;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public static void method999(Class31 arg0, int arg1) {
	try {
	    anInt1354++;
	    if (arg0 == null || (arg0.method623(120) ^ 0xffffffff) == -1)
		Class11_Sub10_Sub6.anInt2145 = 0;
	    else {
		int i = 23 % ((76 - arg1) / 49);
		Class31 class31 = arg0;
		int i_0_ = 0;
		Class31[] class31s = new Class31[100];
		for (;;) {
		    int i_1_ = class31.method636(32, 118);
		    if ((i_1_ ^ 0xffffffff) == 0)
			break;
		    Class31 class31_2_
			= class31.method634(i_1_, -32, 0).method632((byte) 12);
		    if (class31_2_.method623(124) > 0)
			class31s[i_0_++] = class31_2_.method650(-27);
		    class31 = class31.method639(28418, 1 + i_1_);
		}
		class31 = class31.method632((byte) 12);
		if ((class31.method623(124) ^ 0xffffffff) < -1)
		    class31s[i_0_++] = class31.method650(-33);
		Class11_Sub10_Sub6.anInt2145 = 0;
		int i_3_ = 0;
	    while_14_:
		for (/**/;
		     (Class14.anInt278 ^ 0xffffffff) < (i_3_ ^ 0xffffffff);
		     i_3_++) {
		    Class11_Sub10_Sub15 class11_sub10_sub15
			= Class60.method950(56, i_3_);
		    if (class11_sub10_sub15.anInt2380 == -1
			&& class11_sub10_sub15.aClass31_2406 != null) {
			Class31 class31_4_
			    = class11_sub10_sub15.aClass31_2406.method650(-45);
			for (int i_5_ = 0; i_5_ < i_0_; i_5_++) {
			    if ((class31_4_.method654(class31s[i_5_],
						      (byte) 95)
				 ^ 0xffffffff)
				== 0)
				continue while_14_;
			}
			Class3.aClass31Array126[Class11_Sub10_Sub6.anInt2145]
			    = class31_4_;
			Class13.anIntArray268[Class11_Sub10_Sub6.anInt2145]
			    = i_3_;
			Class11_Sub10_Sub6.anInt2145++;
			if (Class3.aClass31Array126.length
			    <= Class11_Sub10_Sub6.anInt2145)
			    break;
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "cc.C(" + (arg0 != null ? "{...}"
					       : "null") + ',' + arg1 + ')');
	}
    }
    
    public RuntimeException_Sub1(Throwable arg0, String arg1) {
	try {
	    aString1353 = arg1;
	    aThrowable1350 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    static {
	anInt1352 = 7759444;
	anIntArrayArray1356 = new int[104][104];
	aClass31_1359 = Class64.method992("@gre@Classic", 255);
    }
}
