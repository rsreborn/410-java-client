/* Class34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class34
{
    public static int anInt621;
    public static int anInt622 = 0;
    public static int anInt623;
    public static Class37 aClass37_624;
    public static int anInt625;
    public static int anInt626;
    public static int anInt627;
    public Class11[] aClass11Array628;
    public int anInt629;
    public static int anInt630;
    public static int anInt631;
    public static int anInt632;
    public static Class31 aClass31_633;
    public static int anInt634;
    public static byte aByte635;
    public static boolean aBoolean636;
    public static boolean aBoolean637 = false;
    public Class11 aClass11_638;
    public static int anInt639;
    public static int anInt640;
    public static Class31 aClass31_641;
    public static int anInt642;
    public static int anInt643;
    public long aLong644;
    public static int anInt645;
    public static int anInt646;
    public static byte[] aByteArray647;
    public Class11 aClass11_648;
    public int anInt649 = 0;
    
    public Class11 method669(int arg0) {
	try {
	    anInt630++;
	    if (aClass11_638 == null)
		return null;
	    for (Class11 class11 = aClass11Array628[(int) (aLong644
							   & (long) (anInt629
								     + arg0))];
		 class11 != aClass11_638;
		 aClass11_638 = aClass11_638.aClass11_233) {
		if (aClass11_638.aLong231 == aLong644) {
		    Class11 class11_0_ = aClass11_638;
		    aClass11_638 = aClass11_638.aClass11_233;
		    return class11_0_;
		}
	    }
	    aClass11_638 = null;
	    return null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ba.J(" + arg0 + ')');
	}
    }
    
    public static void method670(byte arg0) {
	try {
	    if (arg0 == 3) {
		if (Class40.aClass61_729 != null) {
		    Class40.aClass61_729.method959();
		    Class40.aClass61_729 = null;
		}
		anInt631++;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ba.D(" + arg0 + ')');
	}
    }
    
    public Class11 method671(byte arg0) {
	try {
	    anInt649 = 0;
	    anInt625++;
	    if (arg0 >= -73)
		method676(false, -24, 2, -91);
	    return method680(true);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ba.N(" + arg0 + ')');
	}
    }
    
    public static Component method672(int arg0) {
	try {
	    if (arg0 >= -92)
		aClass31_641 = null;
	    anInt645++;
	    if (Class60.aCanvas_Sub1_1260 != null)
		return Class60.aCanvas_Sub1_1260;
	    if (Class55.aClass45_1141 != null)
		return Class55.aClass45_1141.anApplet836;
	    return null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ba.A(" + arg0 + ')');
	}
    }
    
    public static void method673(int arg0) {
	try {
	    anInt643++;
	    if ((Class11_Sub10_Sub8.anInt2190 ^ 0xffffffff) != -1) {
		Class11_Sub10_Sub13_Sub2 class11_sub10_sub13_sub2
		    = Class58.aClass11_Sub10_Sub13_Sub2_1228;
		int i = 0;
		if (Class46.anInt848 != 0)
		    i = 1;
		if (arg0 != 4)
		    aClass31_641 = null;
		for (int i_1_ = 0; i_1_ < 100; i_1_++) {
		    if (Class11_Sub10_Sub5.aClass31Array2089[i_1_] != null) {
			int i_2_ = Class37.anIntArray684[i_1_];
			Class31 class31
			    = Class11_Sub5_Sub1.aClass31Array1915[i_1_];
			int i_3_ = 0;
			if (class31 != null
			    && class31.method622((Class11_Sub10_Sub2
						  .aClass31_2006),
						 98)) {
			    i_3_ = 1;
			    class31 = class31.method639(arg0 + 28414, 5);
			}
			if (class31 != null
			    && class31.method622(Class37_Sub1.aClass31_1802,
						 87)) {
			    i_3_ = 2;
			    class31 = class31.method639(arg0 + 28414, 5);
			}
			if (((i_2_ ^ 0xffffffff) == -4 || i_2_ == 7)
			    && ((i_2_ ^ 0xffffffff) == -8
				|| (Class59.anInt1236 ^ 0xffffffff) == -1
				|| ((Class59.anInt1236 ^ 0xffffffff) == -2
				    && Class14.method519(class31, -20281)))) {
			    int i_4_ = 329 + -(13 * i);
			    i++;
			    int i_5_ = 4;
			    class11_sub10_sub13_sub2.method435((Class17
								.aClass31_341),
							       i_5_, i_4_, 0);
			    class11_sub10_sub13_sub2.method435((Class17
								.aClass31_341),
							       i_5_, i_4_ + -1,
							       65535);
			    i_5_ += class11_sub10_sub13_sub2
					.method428(Class43.aClass31_781);
			    if (i_3_ == 1) {
				Class11_Sub12
				    .aClass11_Sub10_Sub13_Sub3Array1705[0]
				    .method443(i_5_, -12 + i_4_);
				i_5_ += 14;
			    }
			    if ((i_3_ ^ 0xffffffff) == -3) {
				Class11_Sub12
				    .aClass11_Sub10_Sub13_Sub3Array1705[1]
				    .method443(i_5_, i_4_ + -12);
				i_5_ += 14;
			    }
			    class11_sub10_sub13_sub2.method435
				(Class40.method744(arg0 ^ 0x4,
						   (new Class31[]
						    { class31,
						      Class1.aClass31_97,
						      (Class11_Sub10_Sub5
						       .aClass31Array2089
						       [i_1_]) })),
				 i_5_, i_4_, 0);
			    class11_sub10_sub13_sub2.method435
				(Class40.method744(0, (new Class31[]
						       { class31,
							 Class1.aClass31_97,
							 (Class11_Sub10_Sub5
							  .aClass31Array2089
							  [i_1_]) })),
				 i_5_, i_4_ + -1, 65535);
			    if ((i ^ 0xffffffff) <= -6)
				break;
			}
			if (i_2_ == 5
			    && (Class59.anInt1236 ^ 0xffffffff) > -3) {
			    int i_6_ = -(13 * i) + 329;
			    i++;
			    class11_sub10_sub13_sub2.method435
				(Class11_Sub10_Sub5.aClass31Array2089[i_1_], 4,
				 i_6_, 0);
			    class11_sub10_sub13_sub2.method435
				(Class11_Sub10_Sub5.aClass31Array2089[i_1_], 4,
				 -1 + i_6_, 65535);
			    if (i >= 5)
				break;
			}
			if ((i_2_ ^ 0xffffffff) == -7
			    && Class59.anInt1236 < 2) {
			    int i_7_ = -(i * 13) + 329;
			    class11_sub10_sub13_sub2.method435
				(Class40.method744(arg0 + -4,
						   (new Class31[]
						    { (Class11_Sub10_Sub7
						       .aClass31_2166),
						      class31,
						      Class1.aClass31_97,
						      (Class11_Sub10_Sub5
						       .aClass31Array2089
						       [i_1_]) })),
				 4, i_7_, 0);
			    class11_sub10_sub13_sub2.method435
				(Class40.method744(arg0 + -4,
						   (new Class31[]
						    { (Class11_Sub10_Sub7
						       .aClass31_2166),
						      class31,
						      Class1.aClass31_97,
						      (Class11_Sub10_Sub5
						       .aClass31Array2089
						       [i_1_]) })),
				 4, i_7_ - 1, 65535);
			    if ((++i ^ 0xffffffff) <= -6)
				break;
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ba.I(" + arg0 + ')');
	}
    }
    
    public static void method674(int arg0, boolean arg1) {
	try {
	    anInt642++;
	    if ((arg0 ^ 0xffffffff)
		!= (Class11_Sub10_Sub3.anInt2013 ^ 0xffffffff)) {
		if (Class11_Sub10_Sub3.anInt2013 == 0)
		    Class17.method562(true);
		if ((arg0 ^ 0xffffffff) == -21 || (arg0 ^ 0xffffffff) == -41) {
		    Class28.anInt506 = 0;
		    Class11_Sub10_Sub4_Sub5.anInt2692 = 0;
		    Class8.loginState = 0;
		}
		if ((arg0 ^ 0xffffffff) != -21 && arg0 != 40
		    && Class13.aClass14_265 != null)
		    Class13.aClass14_265.method520(-9098);
		if ((Class11_Sub10_Sub3.anInt2013 ^ 0xffffffff) == -26
		    || Class11_Sub10_Sub3.anInt2013 == 40) {
		    Class36.method700(25085);
		    Class11_Sub10_Sub13.method402();
		}
		if (Class11_Sub10_Sub3.anInt2013 == 25) {
		    Class11_Sub7.anInt1607 = 1;
		    Class29.anInt530 = 0;
		    Applet_Sub1.anInt5 = 0;
		    Class11_Sub10.anInt1655 = 1;
		    Class11_Sub10_Sub3.anInt2024 = 0;
		}
		if ((arg0 ^ 0xffffffff) == -1 || (arg0 ^ 0xffffffff) == -36) {
		    Class12.method502(true);
		    Class11_Sub10_Sub9.method369(10);
		    if (Class9.aClass37_196 == null)
			Class9.aClass37_196
			    = Class44.method761(765, method672(-96), -8, 503);
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
		    Class9.aClass37_196 = null;
		    Class12.method502(true);
		    Class15_Sub1.method548(Class43.aClass55_Sub1_780,
					   method672(-127),
					   Class42.aClass55_Sub1_766,
					   (byte) -75);
		}
		if (arg1 != false)
		    aClass31_641 = null;
		if ((arg0 ^ 0xffffffff) == -26 || arg0 == 30 || arg0 == 40) {
		    Class9.aClass37_196 = null;
		    Class11_Sub10_Sub9.method369(10);
		    Class22.method578(Class43.aClass55_Sub1_780, 23589,
				      method672(-128));
		}
		Class11_Sub10_Sub3.anInt2013 = arg0;
		Class1.aBoolean76 = true;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "ba.E(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method675(byte arg0) {
	try {
	    anInt646++;
	    if (arg0 != 84)
		method670((byte) -61);
	    Class49.aBoolean930 = false;
	    Class1.aBoolean94 = false;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ba.O(" + arg0 + ')');
	}
    }
    
    public static int method676(boolean arg0, int arg1, int arg2, int arg3) {
	try {
	    anInt627++;
	    arg2 &= 0x3;
	    if ((arg2 ^ 0xffffffff) == -1)
		return arg1;
	    if ((arg2 ^ 0xffffffff) == -2)
		return -arg3 + 7;
	    if ((arg2 ^ 0xffffffff) == -3)
		return 7 + -arg1;
	    if (arg0 != true)
		method674(-26, false);
	    return arg3;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ba.C(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + arg3 + ')'));
	}
    }
    
    public Class11 method677(int arg0, long arg1) {
	try {
	    aLong644 = arg1;
	    anInt639++;
	    if (arg0 <= 119)
		aBoolean637 = false;
	    Class11 class11
		= aClass11Array628[(int) ((long) (-1 + anInt629) & arg1)];
	    for (aClass11_638 = class11.aClass11_233; aClass11_638 != class11;
		 aClass11_638 = aClass11_638.aClass11_233) {
		if (arg1 == aClass11_638.aLong231) {
		    Class11 class11_8_ = aClass11_638;
		    aClass11_638 = aClass11_638.aClass11_233;
		    return class11_8_;
		}
	    }
	    aClass11_638 = null;
	    return null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "ba.L(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method678(byte arg0) {
	try {
	    aByteArray647 = null;
	    int i = 11 / ((arg0 - 84) / 32);
	    aClass31_633 = null;
	    aClass31_641 = null;
	    aClass37_624 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ba.F(" + arg0 + ')');
	}
    }
    
    public static Class31 method679(int arg0, Buffer arg1) {
	try {
	    if (arg0 >= -4)
		aClass31_633 = null;
	    anInt640++;
	    return Class4.method64((byte) 40, arg1, 32767);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ba.M(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public Class11 method680(boolean arg0) {
	try {
	    if (arg0 != true)
		anInt622 = 15;
	    anInt626++;
	    if ((anInt649 ^ 0xffffffff) < -1
		&& aClass11_648 != aClass11Array628[-1 + anInt649]) {
		Class11 class11 = aClass11_648;
		aClass11_648 = class11.aClass11_233;
		return class11;
	    }
	    while ((anInt649 ^ 0xffffffff) > (anInt629 ^ 0xffffffff)) {
		Class11 class11 = aClass11Array628[anInt649++].aClass11_233;
		if (aClass11Array628[-1 + anInt649] != class11) {
		    aClass11_648 = class11.aClass11_233;
		    return class11;
		}
	    }
	    return null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ba.G(" + arg0 + ')');
	}
    }
    
    public static Class11_Sub10_Sub13_Sub3[] method681(int arg0, Class55 arg1,
						       int arg2, int arg3) {
	try {
	    anInt621++;
	    if (arg3 <= 38)
		return null;
	    if (!Class37_Sub1.method714(arg0, -29446, arg1, arg2))
		return null;
	    return Class11_Sub10_Sub4_Sub2_Sub2.method287(0);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ba.H(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + arg2 + ',' + arg3 + ')'));
	}
    }
    
    public void method682(int arg0, Class11 arg1, long arg2) {
	try {
	    if (arg1.aClass11_226 != null)
		arg1.method107(0);
	    anInt634++;
	    Class11 class11
		= aClass11Array628[(int) ((long) (-1 + anInt629) & arg2)];
	    if (arg0 < 120)
		method675((byte) -3);
	    arg1.aLong231 = arg2;
	    arg1.aClass11_233 = class11;
	    arg1.aClass11_226 = class11.aClass11_226;
	    arg1.aClass11_226.aClass11_233 = arg1;
	    arg1.aClass11_233.aClass11_226 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ba.B(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + arg2 + ')'));
	}
    }
    
    public static void method683(int arg0, int arg1, int arg2, int arg3,
				 int arg4) {
	try {
	    anInt623++;
	    if (arg2 == 20318) {
		for (int i = arg3; i <= arg3 + arg0; i++) {
		    for (int i_9_ = arg4;
			 (arg4 - -arg1 ^ 0xffffffff) <= (i_9_ ^ 0xffffffff);
			 i_9_++) {
			if (i_9_ >= 0 && (i_9_ ^ 0xffffffff) > -105
			    && (i ^ 0xffffffff) <= -1 && i < 104) {
			    Class24.aByteArrayArrayArray443[0][i_9_][i]
				= (byte) 127;
			    if ((arg4 ^ 0xffffffff) == (i_9_ ^ 0xffffffff)
				&& (i_9_ ^ 0xffffffff) < -1)
				Class51.anIntArrayArrayArray1005[0][i_9_][i]
				    = (Class51.anIntArrayArrayArray1005[0]
				       [-1 + i_9_][i]);
			    if (i_9_ == arg4 + arg1
				&& (i_9_ ^ 0xffffffff) > -104)
				Class51.anIntArrayArrayArray1005[0][i_9_][i]
				    = (Class51.anIntArrayArrayArray1005[0]
				       [i_9_ + 1][i]);
			    if (arg3 == i && (i ^ 0xffffffff) < -1)
				Class51.anIntArrayArrayArray1005[0][i_9_][i]
				    = (Class51.anIntArrayArrayArray1005[0]
				       [i_9_][i - 1]);
			    if ((i ^ 0xffffffff) == (arg0 + arg3 ^ 0xffffffff)
				&& i < 103)
				Class51.anIntArrayArrayArray1005[0][i_9_][i]
				    = (Class51.anIntArrayArrayArray1005[0]
				       [i_9_][i + 1]);
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ba.K(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + arg3 + ',' + arg4 + ')'));
	}
    }
    
    public Class34(int arg0) {
	try {
	    aClass11Array628 = new Class11[arg0];
	    anInt629 = arg0;
	    for (int i = 0; (i ^ 0xffffffff) > (arg0 ^ 0xffffffff); i++) {
		Class11 class11 = aClass11Array628[i] = new Class11();
		class11.aClass11_233 = class11;
		class11.aClass11_226 = class11;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "ba.<init>(" + arg0 + ')');
	}
    }
    
    static {
	anInt632 = 255;
	aByte635 = (byte) 0;
	aClass31_633 = Class64.method992("Enter amount:", 255);
	aClass31_641 = Class64.method992(")3)3)3", 255);
	aByteArray647
	    = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106,
			   107, 108, 109, 110, 111, 112, 113, 114, 115, 116,
			   117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52,
			   53, 54, 55, 56, 57 };
	aBoolean636 = false;
    }
}
