/* Class54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class54
{
    public int anInt1058;
    public static Class31 aClass31_1059;
    public static boolean[] aBooleanArray1060;
    public static Applet_Sub1 anApplet_Sub1_1061;
    public Class11_Sub10_Sub4 aClass11_Sub10_Sub4_1062;
    public static Class31 aClass31_1063;
    public int anInt1064;
    public static Class31 aClass31_1065 = Class64.method992("Fps:", 255);
    public static int[] anIntArray1066;
    public int anInt1067;
    public int anInt1068;
    public static Class11_Sub10_Sub4_Sub4[] aClass11_Sub10_Sub4_Sub4Array1069;
    public static Class31 aClass31_1070;
    public static Class31 aClass31_1071;
    public int anInt1072;
    public int anInt1073;
    public static int anInt1074;
    public static int anInt1075;
    public static Class31 aClass31_1076;
    public static int anInt1077;
    public int anInt1078 = 0;
    public Class11_Sub10_Sub4 aClass11_Sub10_Sub4_1079;
    public static int anInt1080;
    public static Class37 aClass37_1081;
    public static int anInt1082;
    public static int anInt1083;
    public static long aLong1084;
    public static Class31 aClass31_1085;
    public static Class31 aClass31_1086;
    
    public static void method871(int arg0, int arg1, boolean arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7) {
	anInt1075++;
	if ((arg1 ^ 0xffffffff) <= -2 && (arg3 ^ 0xffffffff) <= -2
	    && arg1 <= 102 && (arg3 ^ 0xffffffff) >= -103) {
	    if (Class1.aBoolean94 && Class1.anInt82 != arg5)
		return;
	    int i = 0;
	    int i_0_ = -1;
	    if (arg0 == 0)
		i = Class52.aClass49_1024.method842(arg5, arg1, arg3);
	    boolean bool = false;
	    if ((arg0 ^ 0xffffffff) == -2)
		i = Class52.aClass49_1024.method802(arg5, arg1, arg3);
	    if (arg0 == 2)
		i = Class52.aClass49_1024.method812(arg5, arg1, arg3);
	    boolean bool_1_ = false;
	    if ((arg0 ^ 0xffffffff) == -4)
		i = Class52.aClass49_1024.method841(arg5, arg1, arg3);
	    if ((i ^ 0xffffffff) != -1) {
		i_0_ = i >> 883927118 & 0x7fff;
		int i_2_
		    = Class52.aClass49_1024.method832(arg5, arg1, arg3, i);
		int i_3_ = i_2_ >> 697110630 & 0x3;
		int i_4_ = 0x1f & i_2_;
		if ((arg0 ^ 0xffffffff) == -1) {
		    Class52.aClass49_1024.method822(arg5, arg1, arg3);
		    Class11_Sub10_Sub2 class11_sub10_sub2
			= Class51.method853((byte) -107, i_0_);
		    if (class11_sub10_sub2.aBoolean1960)
			Class39.aClass8Array707[arg5].method90
			    (i_4_, (byte) -122,
			     class11_sub10_sub2.aBoolean1969, arg3, i_3_,
			     arg1);
		}
		if (arg0 == 1)
		    Class52.aClass49_1024.method798(arg5, arg1, arg3);
		if (arg0 == 2) {
		    Class52.aClass49_1024.method806(arg5, arg1, arg3);
		    Class11_Sub10_Sub2 class11_sub10_sub2
			= Class51.method853((byte) -124, i_0_);
		    if (arg1 + class11_sub10_sub2.anInt1967 > 103
			|| ((arg3 - -class11_sub10_sub2.anInt1967 ^ 0xffffffff)
			    < -104)
			|| ((arg1 + class11_sub10_sub2.anInt1974 ^ 0xffffffff)
			    < -104)
			|| ((class11_sub10_sub2.anInt1974 + arg3 ^ 0xffffffff)
			    < -104))
			return;
		    if (class11_sub10_sub2.aBoolean1960)
			Class39.aClass8Array707[arg5].method87
			    (class11_sub10_sub2.anInt1967,
			     class11_sub10_sub2.anInt1974, i_3_,
			     class11_sub10_sub2.aBoolean1969, arg1, -1, arg3);
		}
		if (arg0 == 3) {
		    Class52.aClass49_1024.method796(arg5, arg1, arg3);
		    Class11_Sub10_Sub2 class11_sub10_sub2
			= Class51.method853((byte) -125, i_0_);
		    if (class11_sub10_sub2.aBoolean1960
			&& (class11_sub10_sub2.anInt1998 ^ 0xffffffff) == -2)
			Class39.aClass8Array707[arg5].method95(arg3, arg1,
							       (byte) -32);
		}
	    }
	    if (arg6 >= 0) {
		int i_5_ = arg5;
		if (i_5_ < 3
		    && (Class25.aByteArrayArrayArray481[1][arg1][arg3] & 0x2
			^ 0xffffffff) == -3)
		    i_5_++;
		Canvas_Sub1.method38(i_5_, arg3, arg4,
				     Class39.aClass8Array707[arg5], arg6,
				     Class52.aClass49_1024, (byte) 79, arg7,
				     arg5, arg1);
	    }
	}
	if (arg2 != false)
	    anInt1080 = -31;
    }
    
    public static void method872(byte arg0) {
	try {
	    while ((Class11_Sub10_Sub4_Sub2.aClass11_Sub5_Sub1_2531
			.method202(true, Class11_Sub10_Sub14.anInt2348)
		    ^ 0xffffffff)
		   <= -12) {
		int i = Class11_Sub10_Sub4_Sub2.aClass11_Sub5_Sub1_2531
			    .method203(-73, 11);
		if (i == 2047)
		    break;
		if ((Class11_Sub10_Sub7.aClass11_Sub10_Sub4_Sub2_Sub1Array2160
		     [i])
		    == null) {
		    Class11_Sub10_Sub7
			.aClass11_Sub10_Sub4_Sub2_Sub1Array2160[i]
			= new Class11_Sub10_Sub4_Sub2_Sub1();
		    if (Class22.aBufferArray401[i] != null)
			Class11_Sub10_Sub7
			    .aClass11_Sub10_Sub4_Sub2_Sub1Array2160[i]
			    .method277
			    (Class22.aBufferArray401[i], -10496);
		}
		Class32.anIntArray597[Class48.anInt885++] = i;
		Class11_Sub10_Sub4_Sub2_Sub1 class11_sub10_sub4_sub2_sub1
		    = (Class11_Sub10_Sub7
		       .aClass11_Sub10_Sub4_Sub2_Sub1Array2160[i]);
		class11_sub10_sub4_sub2_sub1.anInt2505 = Class61.anInt1283;
		int i_6_ = Class11_Sub10_Sub4_Sub2.aClass11_Sub5_Sub1_2531
			       .method203(-111, 5);
		if (i_6_ > 15)
		    i_6_ -= 32;
		int i_7_ = Class11_Sub10_Sub4_Sub2.aClass11_Sub5_Sub1_2531
			       .method203(-60, 5);
		if ((i_7_ ^ 0xffffffff) < -16)
		    i_7_ -= 32;
		int i_8_ = Class11_Sub10_Sub4_Sub2.aClass11_Sub5_Sub1_2531
			       .method203(-77, 1);
		if ((i_8_ ^ 0xffffffff) == -2)
		    anIntArray1066[Class11_Sub11.anInt1687++] = i;
		int i_9_ = Class11_Sub10_Sub4_Sub2.aClass11_Sub5_Sub1_2531
			       .method203(83, 1);
		class11_sub10_sub4_sub2_sub1.method271
		    ((i_9_ ^ 0xffffffff) == -2,
		     (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899.anIntArray2562
		      [0]) + i_6_,
		     (byte) 113,
		     i_7_ + (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
			     .anIntArray2500[0]));
	    }
	    Class11_Sub10_Sub4_Sub2.aClass11_Sub5_Sub1_2531
		.method199((byte) 43);
	    anInt1074++;
	    int i = 120 / ((arg0 - 54) / 44);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "uc.D(" + arg0 + ')');
	}
    }
    
    public static Class11_Sub10_Sub3 method873(byte arg0, int arg1) {
	try {
	    anInt1077++;
	    Class11_Sub10_Sub3 class11_sub10_sub3
		= ((Class11_Sub10_Sub3)
		   Class17.aClass40_334.method735((long) arg1, (byte) -72));
	    if (class11_sub10_sub3 != null)
		return class11_sub10_sub3;
	    byte[] is = Class8.aClass55_188.method887((byte) -122, arg1, 16);
	    class11_sub10_sub3 = new Class11_Sub10_Sub3();
	    if (is != null)
		class11_sub10_sub3.method249(new Buffer(is), false);
	    int i = 69 / ((arg0 - 56) / 62);
	    Class17.aClass40_334.method742(-121, (long) arg1,
					   class11_sub10_sub3);
	    return class11_sub10_sub3;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "uc.C(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method874(int arg0) {
	try {
	    anIntArray1066 = null;
	    aClass31_1065 = null;
	    aClass31_1076 = null;
	    aClass31_1059 = null;
	    aClass31_1063 = null;
	    aClass11_Sub10_Sub4_Sub4Array1069 = null;
	    if (arg0 <= 125)
		aClass31_1086 = null;
	    aClass31_1085 = null;
	    aClass31_1086 = null;
	    aBooleanArray1060 = null;
	    aClass31_1070 = null;
	    aClass37_1081 = null;
	    aClass31_1071 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "uc.A(" + arg0 + ')');
	}
    }
    
    public Class54() {
	anInt1073 = 0;
    }
    
    static {
	aBooleanArray1060 = new boolean[5];
	anApplet_Sub1_1061 = null;
	aClass11_Sub10_Sub4_Sub4Array1069 = new Class11_Sub10_Sub4_Sub4[4];
	aClass31_1070
	    = Class64.method992(" is already on your friend list", 255);
	aClass31_1063 = Class64.method992("Loading)3)3)3 ", 255);
	aClass31_1059 = Class64.method992("Loading )2 please wait)3", 255);
	aClass31_1071 = Class64.method992("@cya@", 255);
	aClass31_1076 = Class64.method992("Jan", 255);
	aLong1084 = 0L;
	anIntArray1066 = new int[2048];
	anInt1082 = 0;
	aClass31_1085 = aClass31_1063;
	aClass31_1086 = Class64.method992("(U4", 255);
	anInt1083 = 127;
    }
}
