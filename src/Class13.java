/* Class13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class13
{
    public static int anInt252;
    public static int anInt253;
    public static int anInt254;
    public static Class34 aClass34_255;
    public static Class31 aClass31_256;
    public static Class31 aClass31_257
	= Class64.method992("Malformed login packet)3", 255);
    public static Class31 aClass31_258
	= Class64.method992("go back to the main RuneScape webpage", 255);
    public static int anInt259;
    public static int[] anIntArray260;
    public static int anInt261;
    public static int anInt262;
    public static int[] anIntArray263 = new int[4000];
    public static int anInt264;
    public static Class14 aClass14_265;
    public static int[] anIntArray266;
    public static int[] anIntArray267;
    public static int[] anIntArray268;
    public static boolean aBoolean269;
    public static Class55_Sub1 aClass55_Sub1_270;
    public static int anInt271;
    
    public static void method508(byte arg0, boolean arg1) {
	try {
	    if (arg0 >= -99)
		anIntArray260 = null;
	    anInt252++;
	    int i = 0;
	    for (/**/; (Class32.anInt581 ^ 0xffffffff) < (i ^ 0xffffffff);
		 i++) {
		Class11_Sub10_Sub4_Sub2_Sub2 class11_sub10_sub4_sub2_sub2
		    = (Class12.aClass11_Sub10_Sub4_Sub2_Sub2Array235
		       [Class11_Sub10_Sub5.anIntArray2063[i]]);
		int i_0_ = 536870912 - -(Class11_Sub10_Sub5.anIntArray2063[i]
					 << 1521670254);
		if (class11_sub10_sub4_sub2_sub2 != null
		    && class11_sub10_sub4_sub2_sub2.method270(28738)
		    && (class11_sub10_sub4_sub2_sub2.aClass11_Sub10_Sub14_2828
			.aBoolean2331) == arg1
		    && class11_sub10_sub4_sub2_sub2
			   .aClass11_Sub10_Sub14_2828.method462((byte) 80)) {
		    int i_1_
			= class11_sub10_sub4_sub2_sub2.anInt2506 >> 1050747943;
		    int i_2_
			= class11_sub10_sub4_sub2_sub2.anInt2517 >> 1706273671;
		    if ((i_1_ ^ 0xffffffff) <= -1 && i_1_ < 104 && i_2_ >= 0
			&& i_2_ < 104) {
			if (class11_sub10_sub4_sub2_sub2.anInt2510 == 1
			    && ((0x7f & class11_sub10_sub4_sub2_sub2.anInt2506)
				== 64)
			    && ((class11_sub10_sub4_sub2_sub2.anInt2517 & 0x7f)
				== 64)) {
			    if (Buffer.anInt1566
				== (RuntimeException_Sub1.anIntArrayArray1356
				    [i_1_][i_2_]))
				continue;
			    RuntimeException_Sub1.anIntArrayArray1356[i_1_]
				[i_2_]
				= Buffer.anInt1566;
			}
			if (!class11_sub10_sub4_sub2_sub2
			     .aClass11_Sub10_Sub14_2828.aBoolean2340)
			    i_0_ += -2147483648;
			Class52.aClass49_1024.method808
			    (Class1.anInt82,
			     class11_sub10_sub4_sub2_sub2.anInt2506,
			     class11_sub10_sub4_sub2_sub2.anInt2517,
			     (Class11_Sub10_Sub4_Sub5.method324
			      (Class1.anInt82,
			       class11_sub10_sub4_sub2_sub2.anInt2506, 3,
			       class11_sub10_sub4_sub2_sub2.anInt2517)),
			     60 + (64 * class11_sub10_sub4_sub2_sub2.anInt2510
				   + -64),
			     class11_sub10_sub4_sub2_sub2,
			     class11_sub10_sub4_sub2_sub2.anInt2547, i_0_,
			     class11_sub10_sub4_sub2_sub2.aBoolean2565);
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "h.E(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method509(byte arg0) {
	anInt253++;
	for (int i = 0;
	     (Class55_Sub1.anInt1853 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
	    Class11_Sub10_Sub1.anIntArray1944[i]--;
	    if (Class11_Sub10_Sub1.anIntArray1944[i] < -10) {
		Class55_Sub1.anInt1853--;
		for (int i_3_ = i; i_3_ < Class55_Sub1.anInt1853; i_3_++) {
		    Class11_Sub10_Sub4_Sub2_Sub2.anIntArray2824[i_3_]
			= (Class11_Sub10_Sub4_Sub2_Sub2.anIntArray2824
			   [i_3_ - -1]);
		    Class36.aClass35Array671[i_3_]
			= Class36.aClass35Array671[i_3_ + 1];
		    Class64.anIntArray1327[i_3_]
			= Class64.anIntArray1327[i_3_ + 1];
		    Class11_Sub10_Sub1.anIntArray1944[i_3_]
			= Class11_Sub10_Sub1.anIntArray1944[i_3_ - -1];
		}
		i--;
	    } else {
		Class35 class35 = Class36.aClass35Array671[i];
		if (class35 == null) {
		    class35
			= Class35.method684(Class11_Sub8.aClass55_Sub1_1623,
					    (Class11_Sub10_Sub4_Sub2_Sub2
					     .anIntArray2824[i]),
					    0);
		    if (class35 == null)
			continue;
		    Class11_Sub10_Sub1.anIntArray1944[i]
			+= class35.method685();
		    Class36.aClass35Array671[i] = class35;
		}
		if ((Class11_Sub10_Sub1.anIntArray1944[i] ^ 0xffffffff) > -1) {
		    Class11_Sub3_Sub1 class11_sub3_sub1
			= class35.method686().method134(Class63.aClass50_1320);
		    Class11_Sub2_Sub1 class11_sub2_sub1
			= Class11_Sub2_Sub1.method121(class11_sub3_sub1, 100,
						      Class54.anInt1083);
		    class11_sub2_sub1
			.method116(-1 + Class64.anIntArray1327[i]);
		    Class48.aClass11_Sub2_Sub2_912
			.method127(class11_sub2_sub1);
		    Class11_Sub10_Sub1.anIntArray1944[i] = -100;
		}
	    }
	}
	if (arg0 >= -119)
	    method508((byte) -42, false);
	if (Class39_Sub1.anInt1823 > 0) {
	    Class39_Sub1.anInt1823 -= 20;
	    if ((Class39_Sub1.anInt1823 ^ 0xffffffff) > -1)
		Class39_Sub1.anInt1823 = 0;
	    if (Class39_Sub1.anInt1823 == 0
		&& (Class34.anInt632 ^ 0xffffffff) != -1
		&& Class46.anInt853 != -1)
		Class53.method869(0, 0, Class46.anInt853, 100,
				  Class47.aClass55_Sub1_876, Class34.anInt632,
				  false);
	}
    }
    
    public static Class11_Sub10_Sub13_Sub4[] method510
	(int arg0, Class55 arg1, Class31 arg2, Class31 arg3) {
	try {
	    anInt262++;
	    if (arg0 != 0)
		return null;
	    int i = arg1.method899((byte) -18, arg2);
	    int i_4_ = arg1.method891(false, arg3, i);
	    return Class55.method898(arg1, i_4_, 0, i);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("h.F(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + (arg2 != null ? "{...}" : "null") + ','
				     + (arg3 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public static boolean method511(Class11_Sub10_Sub5 arg0, int arg1) {
	try {
	    anInt261++;
	    int i = arg0.anInt2116;
	    if ((Class11_Sub10_Sub2.anInt1972 ^ 0xffffffff) == -3) {
		if (i == 201) {
		    Class25.aClass31_478 = Class11_Sub10_Sub9.aClass31_2201;
		    Class57.anInt1154 = 0;
		    Class52.anInt1027 = 1;
		    Class32.aBoolean575 = true;
		    Class25.aClass31_463 = Class25.aClass31_461;
		    Class33.aBoolean609 = true;
		}
		if (i == 202) {
		    Class52.anInt1027 = 2;
		    Class33.aBoolean609 = true;
		    Class25.aClass31_463 = Class25.aClass31_461;
		    Class25.aClass31_478 = Class6.aClass31_152;
		    Class57.anInt1154 = 0;
		    Class32.aBoolean575 = true;
		}
	    }
	    if ((i ^ 0xffffffff) == -206) {
		Class29.anInt541 = 250;
		return true;
	    }
	    if ((i ^ 0xffffffff) == -502) {
		Class57.anInt1154 = 0;
		Class52.anInt1027 = 4;
		Class25.aClass31_478 = Class3.aClass31_104;
		Class33.aBoolean609 = true;
		Class25.aClass31_463 = Class25.aClass31_461;
		Class32.aBoolean575 = true;
	    }
	    if (i == 502) {
		Class57.anInt1154 = 0;
		Class32.aBoolean575 = true;
		Class25.aClass31_463 = Class25.aClass31_461;
		Class33.aBoolean609 = true;
		Class25.aClass31_478 = Class64.aClass31_1331;
		Class52.anInt1027 = 5;
	    }
	    if (i >= 300 && i <= 313) {
		int i_5_ = i & 0x1;
		int i_6_ = (i + -300) / 2;
		Class14.aClass24_279.method590(i_5_ == 1, i_6_, 108);
	    }
	    if (i >= 314 && (i ^ 0xffffffff) >= -324) {
		int i_7_ = (-314 + i) / 2;
		int i_8_ = 0x1 & i;
		Class14.aClass24_279.method595(0, i_7_, i_8_ == 1);
	    }
	    if (i == 324)
		Class14.aClass24_279.method588(false, false);
	    if (i == 325)
		Class14.aClass24_279.method588(true, false);
	    if ((i ^ 0xffffffff) == -327) {
		Class40.outBuffer.method196(1, 12);
		Class14.aClass24_279.method593(Class40.outBuffer,
					       -1);
		Class20.anInt399++;
		return true;
	    }
	    if (arg1 <= 12)
		return false;
	    if ((i ^ 0xffffffff) == -621)
		Class11_Sub10_Sub4_Sub2_Sub1.aBoolean2809
		    = !Class11_Sub10_Sub4_Sub2_Sub1.aBoolean2809;
	    if (i >= 601 && (i ^ 0xffffffff) >= -614) {
		Class24.method584(-125);
		if (Class25.aClass31_465.method623(124) > 0) {
		    Class32.anInt594++;
		    Class40.outBuffer.method196(1, 72);
		    Class40.outBuffer.method140
			(-24628, Class25.aClass31_465.method633((byte) -125));
		    Class40.outBuffer.writeByte(-601 + i);
		    Class40.outBuffer.writeByte
			(
                    !Class11_Sub10_Sub4_Sub2_Sub1.aBoolean2809 ? 0 : 1);
		}
	    }
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("h.G(" + (arg0 != null ? "{...}" : "null")
				     + ',' + arg1 + ')'));
	}
    }
    
    public static Class11_Sub10_Sub14 method512(int arg0, int arg1) {
	try {
	    anInt264++;
	    int i = -93 / ((arg0 - 41) / 43);
	    Class11_Sub10_Sub14 class11_sub10_sub14
		= ((Class11_Sub10_Sub14)
		   Class25.aClass40_475.method735((long) arg1, (byte) -75));
	    if (class11_sub10_sub14 != null)
		return class11_sub10_sub14;
	    byte[] is
		= Class11_Sub7.aClass55_1605.method887((byte) -118, arg1, 9);
	    class11_sub10_sub14 = new Class11_Sub10_Sub14();
	    class11_sub10_sub14.anInt2313 = arg1;
	    if (is != null)
		class11_sub10_sub14.method464(false, new Buffer(is));
	    class11_sub10_sub14.method468((byte) 13);
	    Class25.aClass40_475.method742(-124, (long) arg1,
					   class11_sub10_sub14);
	    return class11_sub10_sub14;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "h.C(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method513(int arg0, int arg1) {
	try {
	    anInt259++;
	    if (Class11_Sub12.method496(true)) {
		if (arg0 != -14399)
		    method510(44, null, null, null);
		if (!Class15_Sub1.aBoolean1744)
		    Class11_Sub8.method216(382, arg1);
		else
		    Class11_Sub12.anInt1704 = arg1;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "h.B(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method514(byte arg0) {
	try {
	    if (arg0 != -66)
		method510(-75, null, null, null);
	    aClass14_265 = null;
	    aClass31_258 = null;
	    aClass55_Sub1_270 = null;
	    aClass31_256 = null;
	    anIntArray260 = null;
	    anIntArray266 = null;
	    anIntArray268 = null;
	    aClass31_257 = null;
	    aClass34_255 = null;
	    anIntArray263 = null;
	    anIntArray267 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "h.D(" + arg0 + ')');
	}
    }
    
    static {
	aClass31_256 = Class64.method992("backhmid2", 255);
	aClass34_255 = new Class34(4096);
	anIntArray268 = new int[100];
	anIntArray266 = new int[5];
	aBoolean269 = false;
	anIntArray267 = new int[500];
    }
}
