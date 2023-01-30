/* Class11_Sub10_Sub4_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11_Sub10_Sub4_Sub2_Sub1 extends Class11_Sub10_Sub4_Sub2
{
    public static int anInt2781;
    public int anInt2782;
    public int anInt2783;
    public int anInt2784 = -1;
    public static int anInt2785;
    public static int anInt2786;
    public int anInt2787;
    public Class11_Sub10_Sub4_Sub4 aClass11_Sub10_Sub4_Sub4_2788;
    public static int anInt2789;
    public int anInt2790;
    public int anInt2791;
    public int anInt2792 = 0;
    public int anInt2793;
    public static int[] anIntArray2794 = new int[500];
    public int anInt2795;
    public int anInt2796;
    public int anInt2797 = 0;
    public static boolean aBoolean2798;
    public int anInt2799;
    public Class31 aClass31_2800;
    public static int anInt2801;
    public int anInt2802;
    public static Class55 aClass55_2803;
    public static Class11_Sub10_Sub13_Sub4[] aClass11_Sub10_Sub13_Sub4Array2804;
    public static int anInt2805;
    public static Class31 aClass31_2806 = Class64.method992("Mar", 255);
    public int anInt2807;
    public int anInt2808;
    public static boolean aBoolean2809;
    public Class24 aClass24_2810;
    public static int anInt2811;
    public static int[] anIntArray2812;
    public static int anInt2813;
    public static Class55 aClass55_2814;
    public boolean aBoolean2815;
    
    public static void method275(int arg0) {
	try {
	    anInt2785++;
	    synchronized (Class42.aClass58_762) {
		Class37_Sub1.anInt1804 = Class14.anInt274;
		Class11_Sub6.anInt1590 = Class55.anInt1129;
		Class11_Sub10_Sub7.anInt2161 = Class28.anInt524;
		Class11_Sub10_Sub4_Sub5.anInt2681 = Class60.anInt1249;
		Class61.anInt1266 = Canvas_Sub1.anInt66;
		Class50.anInt995 = Class58.anInt1229;
		Class1.aLong90 = Class11_Sub10.aLong1663;
		Class60.anInt1249 = arg0;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "kc.B(" + arg0 + ')');
	}
    }
    
    public static void method276(boolean arg0) {
	anInt2813++;
	for (Class11_Sub10_Sub4_Sub1 class11_sub10_sub4_sub1
		 = ((Class11_Sub10_Sub4_Sub1)
		    Class11_Sub10_Sub11.aClass36_2263.method694((byte) -121));
	     class11_sub10_sub4_sub1 != null;
	     class11_sub10_sub4_sub1
		 = ((Class11_Sub10_Sub4_Sub1)
		    Class11_Sub10_Sub11.aClass36_2263.method701(0))) {
	    if (((class11_sub10_sub4_sub1.anInt2455 ^ 0xffffffff)
		 != (Class1.anInt82 ^ 0xffffffff))
		|| ((class11_sub10_sub4_sub1.anInt2473 ^ 0xffffffff)
		    > (Class61.anInt1283 ^ 0xffffffff)))
		class11_sub10_sub4_sub1.method107(0);
	    else if (Class61.anInt1283 >= class11_sub10_sub4_sub1.anInt2459) {
		if (class11_sub10_sub4_sub1.anInt2485 > 0) {
		    Class11_Sub10_Sub4_Sub2_Sub2 class11_sub10_sub4_sub2_sub2
			= (Class12.aClass11_Sub10_Sub4_Sub2_Sub2Array235
			   [class11_sub10_sub4_sub1.anInt2485 + -1]);
		    if (class11_sub10_sub4_sub2_sub2 != null
			&& (class11_sub10_sub4_sub2_sub2.anInt2506
			    ^ 0xffffffff) <= -1
			&& class11_sub10_sub4_sub2_sub2.anInt2506 < 13312
			&& (class11_sub10_sub4_sub2_sub2.anInt2517
			    ^ 0xffffffff) <= -1
			&& class11_sub10_sub4_sub2_sub2.anInt2517 < 13312)
			class11_sub10_sub4_sub1.method260
			    (class11_sub10_sub4_sub2_sub2.anInt2506,
			     ((Class11_Sub10_Sub4_Sub5.method324
			       (class11_sub10_sub4_sub1.anInt2455,
				class11_sub10_sub4_sub2_sub2.anInt2506, 3,
				class11_sub10_sub4_sub2_sub2.anInt2517))
			      - class11_sub10_sub4_sub1.anInt2454),
			     1, Class61.anInt1283,
			     class11_sub10_sub4_sub2_sub2.anInt2517);
		}
		if (class11_sub10_sub4_sub1.anInt2485 < 0) {
		    int i = -class11_sub10_sub4_sub1.anInt2485 + -1;
		    Class11_Sub10_Sub4_Sub2_Sub1 class11_sub10_sub4_sub2_sub1;
		    if (i != Class44.anInt800)
			class11_sub10_sub4_sub2_sub1
			    = (Class11_Sub10_Sub7
			       .aClass11_Sub10_Sub4_Sub2_Sub1Array2160[i]);
		    else
			class11_sub10_sub4_sub2_sub1
			    = Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899;
		    if (class11_sub10_sub4_sub2_sub1 != null
			&& class11_sub10_sub4_sub2_sub1.anInt2506 >= 0
			&& (class11_sub10_sub4_sub2_sub1.anInt2506
			    ^ 0xffffffff) > -13313
			&& (class11_sub10_sub4_sub2_sub1.anInt2517
			    ^ 0xffffffff) <= -1
			&& (class11_sub10_sub4_sub2_sub1.anInt2517
			    ^ 0xffffffff) > -13313)
			class11_sub10_sub4_sub1.method260
			    (class11_sub10_sub4_sub2_sub1.anInt2506,
			     ((Class11_Sub10_Sub4_Sub5.method324
			       (class11_sub10_sub4_sub1.anInt2455,
				class11_sub10_sub4_sub2_sub1.anInt2506, 3,
				class11_sub10_sub4_sub2_sub1.anInt2517))
			      + -class11_sub10_sub4_sub1.anInt2454),
			     1, Class61.anInt1283,
			     class11_sub10_sub4_sub2_sub1.anInt2517);
		}
		class11_sub10_sub4_sub1.method263((byte) -79,
						  Class17.anInt340);
		Class52.aClass49_1024.method808
		    (Class1.anInt82, (int) class11_sub10_sub4_sub1.aDouble2483,
		     (int) class11_sub10_sub4_sub1.aDouble2472,
		     (int) class11_sub10_sub4_sub1.aDouble2456, 60,
		     class11_sub10_sub4_sub1,
		     class11_sub10_sub4_sub1.anInt2488, -1, false);
	    }
	}
	if (arg0 != false)
	    method278(78);
    }
    
    public void method277(Buffer arg0, int arg1) {
	try {
	    arg0.position = 0;
	    anInt2811++;
	    int i = arg0.method168(arg1 ^ ~0x2800);
	    anInt2796 = arg0.method156(arg1 + 37165);
	    int i_0_ = -1;
	    anInt2784 = arg0.method156(arg1 ^ ~0x40d2);
	    int[] is = new int[12];
	    anInt2799 = 0;
	    for (int i_1_ = 0; i_1_ < 12; i_1_++) {
		int i_2_ = arg0.method168(255);
		if ((i_2_ ^ 0xffffffff) == -1)
		    is[i_1_] = 0;
		else {
		    int i_3_ = arg0.method168(255);
		    is[i_1_] = i_3_ + (i_2_ << 1745789352);
		    if (i_1_ == 0 && is[0] == 65535) {
			i_0_ = arg0.method164();
			break;
		    }
		    if (is[i_1_] >= 512) {
			int i_4_
			    = (Class60.method950
			       (arg1 ^ 0x28c2, -512 + is[i_1_]).anInt2402);
			if ((i_4_ ^ 0xffffffff) != -1)
			    anInt2799 = i_4_;
		    }
		}
	    }
	    int[] is_5_ = new int[5];
	    for (int i_6_ = 0; i_6_ < 5; i_6_++) {
		int i_7_ = arg0.method168(arg1 + 10751);
		if (i_7_ < 0
		    || i_7_ >= Class62.anIntArrayArray1299[i_6_].length)
		    i_7_ = 0;
		is_5_[i_6_] = i_7_;
	    }
	    anInt2525 = arg0.method164();
	    if ((anInt2525 ^ 0xffffffff) == -65536)
		anInt2525 = -1;
	    anInt2507 = arg0.method164();
	    if (anInt2507 == 65535)
		anInt2507 = -1;
	    anInt2499 = arg0.method164();
	    if ((anInt2499 ^ 0xffffffff) == -65536)
		anInt2499 = -1;
	    anInt2545 = arg0.method164();
	    if ((anInt2545 ^ 0xffffffff) == -65536)
		anInt2545 = -1;
	    anInt2546 = arg0.method164();
	    if (anInt2546 == 65535)
		anInt2546 = -1;
	    anInt2566 = arg0.method164();
	    if (anInt2566 == 65535)
		anInt2566 = -1;
	    anInt2504 = arg0.method164();
	    if (anInt2504 == 65535)
		anInt2504 = -1;
	    if (arg1 == -10496) {
		aClass31_2800
		    = Class15_Sub2.method553
			  (arg0.method177(121), (byte) -42).method621(true);
		anInt2793 = arg0.method168(255);
		anInt2787 = arg0.method164();
		if (aClass24_2810 == null)
		    aClass24_2810 = new Class24();
		aClass24_2810.method587((i ^ 0xffffffff) == -2, is_5_, i_0_,
					is, (byte) 86);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "kc.E(" + (arg0 != null ? "{...}"
					       : "null") + ',' + arg1 + ')');
	}
    }
    
    public static void method278(int arg0) {
	try {
	    aClass31_2806 = null;
	    if (arg0 == -1537) {
		anIntArray2794 = null;
		aClass11_Sub10_Sub13_Sub4Array2804 = null;
		anIntArray2812 = null;
		aClass55_2814 = null;
		aClass55_2803 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "kc.C(" + arg0 + ')');
	}
    }
    
    public static void method279(int arg0, Class11_Sub10_Sub5 arg1, int arg2,
				 int arg3, int arg4, int arg5, int arg6,
				 int arg7, int arg8) {
	anInt2801++;
	if (!Class11_Sub10.aBoolean1652)
	    Class11_Sub10_Sub1.anInt1941 = 0;
	else
	    Class11_Sub10_Sub1.anInt1941 = 32;
	Class11_Sub10.aBoolean1652 = false;
	if ((arg7 ^ 0xffffffff) <= (arg2 ^ 0xffffffff)
	    && (arg7 ^ 0xffffffff) > (16 + arg2 ^ 0xffffffff) && arg8 <= arg6
	    && arg8 + 16 > arg6) {
	    arg1.anInt2080 -= Class11_Sub10_Sub4_Sub2.anInt2570 * 4;
	    if ((arg5 ^ 0xffffffff) == -2)
		Class11_Sub10_Sub14.aBoolean2352 = true;
	    if (arg5 == 2 || arg5 == 3)
		Class32.aBoolean575 = true;
	} else if ((arg2 ^ 0xffffffff) < (arg7 ^ 0xffffffff)
		   || (arg2 + 16 ^ 0xffffffff) >= (arg7 ^ 0xffffffff)
		   || -16 + arg4 + arg8 > arg6 || arg4 + arg8 <= arg6) {
	    if (arg2 - Class11_Sub10_Sub1.anInt1941 <= arg7
		&& ((arg7 ^ 0xffffffff)
		    > (16 + arg2 + Class11_Sub10_Sub1.anInt1941 ^ 0xffffffff))
		&& arg8 - -16 <= arg6 && arg6 < arg4 + (arg8 + -16)
		&& Class11_Sub10_Sub4_Sub2.anInt2570 > 0) {
		if (arg5 == 1)
		    Class11_Sub10_Sub14.aBoolean2352 = true;
		if (arg5 == 2 || (arg5 ^ 0xffffffff) == -4)
		    Class32.aBoolean575 = true;
		Class11_Sub10.aBoolean1652 = true;
		int i = arg4 * (arg4 - 32) / arg3;
		if ((i ^ 0xffffffff) > -9)
		    i = 8;
		int i_8_ = -16 + arg6 - (arg8 - -(i / 2));
		int i_9_ = -i + (-32 + arg4);
		arg1.anInt2080 = (arg3 + -arg4) * i_8_ / i_9_;
	    }
	} else {
	    if (arg5 == 2 || (arg5 ^ 0xffffffff) == -4)
		Class32.aBoolean575 = true;
	    if ((arg5 ^ 0xffffffff) == -2)
		Class11_Sub10_Sub14.aBoolean2352 = true;
	    arg1.anInt2080 += Class11_Sub10_Sub4_Sub2.anInt2570 * 4;
	}
	if (arg0 <= 97)
	    method280(null, 81, -71, -126, -63, -47, 120, null, -63,
		      (byte) -120);
    }
    
    public static void method280(byte[] arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, Class8[] arg7,
				 int arg8, byte arg9) {
	try {
	    anInt2786++;
	    for (int i = 0; i < 8; i++) {
		for (int i_10_ = 0; i_10_ < 8; i_10_++) {
		    if (i + arg4 > 0 && (arg4 - -i ^ 0xffffffff) > -104
			&& arg1 - -i_10_ > 0 && i_10_ + arg1 < 103)
			arg7[arg8].anIntArrayArray179[i + arg4][i_10_ + arg1]
			    = Class20.method572((arg7[arg8].anIntArrayArray179
						 [i + arg4][i_10_ + arg1]),
						-16777217);
		}
	    }
	    if (arg9 <= 52)
		method278(-27);
	    Buffer buffer = new Buffer(arg0);
	    for (int i = 0; i < 4; i++) {
		for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > -65; i_11_++) {
		    for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > -65; i_12_++) {
			if ((arg5 ^ 0xffffffff) != (i ^ 0xffffffff)
			    || i_11_ < arg2
			    || (i_11_ ^ 0xffffffff) <= (8 + arg2 ^ 0xffffffff)
			    || (arg6 ^ 0xffffffff) < (i_12_ ^ 0xffffffff)
			    || (i_12_ ^ 0xffffffff) <= (arg6 + 8 ^ 0xffffffff))
			    Class11_Sub10_Sub4_Sub3.method289(-1, 0, 0, 0,
						buffer, 0,
							      (byte) -106, -1);
			else
			    Class11_Sub10_Sub4_Sub3.method289
				(Class34.method676(true, 0x7 & i_12_, arg3,
						   0x7 & i_11_) + arg1,
				 arg8, arg3, 0, buffer, 0, (byte) -74,
				 Class46.method785(i_11_ & 0x7, 124,
						   i_12_ & 0x7, arg3) + arg4);
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("kc.G("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + arg1 + ',' + arg2 + ',' + arg3 + ','
				     + arg4 + ',' + arg5 + ',' + arg6 + ','
				     + (arg7 != null ? "{...}" : "null") + ','
				     + arg8 + ',' + arg9 + ')'));
	}
    }
    
    public boolean method270(int arg0) {
	try {
	    anInt2805++;
	    if (arg0 != 28738)
		method279(52, null, 34, -74, 40, 103, -119, 36, 105);
	    if (aClass24_2810 == null)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "kc.H(" + arg0 + ')');
	}
    }
    
    public Class11_Sub10_Sub4_Sub4 method255(byte arg0) {
	try {
	    anInt2789++;
	    if (aClass24_2810 == null)
		return null;
	    Class11_Sub10_Sub12 class11_sub10_sub12
		= (((anInt2549 ^ 0xffffffff) != 0
		    && (anInt2555 ^ 0xffffffff) == -1)
		   ? NotActuallyBuffer.method600(anInt2549, 4867) : null);
	    Class11_Sub10_Sub12 class11_sub10_sub12_13_
		= ((anInt2560 != -1 && !aBoolean2815
		    && (anInt2525 != anInt2560 || class11_sub10_sub12 == null))
		   ? NotActuallyBuffer.method600(anInt2560, 4867) : null);
	    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
		= aClass24_2810.method591(anInt2558, anInt2535, (byte) 101,
					  class11_sub10_sub12,
					  class11_sub10_sub12_13_);
	    if (class11_sub10_sub4_sub4 == null)
		return null;
	    class11_sub10_sub4_sub4.method294();
	    anInt2552 = class11_sub10_sub4_sub4.anInt2046;
	    if (!aBoolean2815 && (anInt2543 ^ 0xffffffff) != 0
		&& anInt2527 != -1) {
		Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4_14_
		    = Class11_Sub10_Sub1.method229((byte) 30, anInt2543)
			  .method378((byte) -39, anInt2527);
		if (class11_sub10_sub4_sub4_14_ != null) {
		    class11_sub10_sub4_sub4_14_.method296(0, -anInt2524, 0);
		    Class11_Sub10_Sub4_Sub4[] class11_sub10_sub4_sub4s
			= { class11_sub10_sub4_sub4,
			    class11_sub10_sub4_sub4_14_ };
		    class11_sub10_sub4_sub4
			= new Class11_Sub10_Sub4_Sub4(class11_sub10_sub4_sub4s,
						      2, true);
		}
	    }
	    if (!aBoolean2815 && aClass11_Sub10_Sub4_Sub4_2788 != null) {
		if (anInt2797 <= Class61.anInt1283)
		    aClass11_Sub10_Sub4_Sub4_2788 = null;
		if (Class61.anInt1283 >= anInt2792
		    && (Class61.anInt1283 ^ 0xffffffff) > (anInt2797
							   ^ 0xffffffff)) {
		    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4_15_
			= aClass11_Sub10_Sub4_Sub4_2788;
		    Class11_Sub10_Sub4_Sub4[] class11_sub10_sub4_sub4s
			= { class11_sub10_sub4_sub4,
			    class11_sub10_sub4_sub4_15_ };
		    class11_sub10_sub4_sub4_15_.method296
			(-anInt2506 + anInt2808, -anInt2795 + anInt2802,
			 -anInt2517 + anInt2790);
		    if ((anInt2516 ^ 0xffffffff) == -513) {
			class11_sub10_sub4_sub4_15_.method307();
			class11_sub10_sub4_sub4_15_.method307();
			class11_sub10_sub4_sub4_15_.method307();
		    } else if ((anInt2516 ^ 0xffffffff) == -1025) {
			class11_sub10_sub4_sub4_15_.method307();
			class11_sub10_sub4_sub4_15_.method307();
		    } else if (anInt2516 == 1536)
			class11_sub10_sub4_sub4_15_.method307();
		    class11_sub10_sub4_sub4
			= new Class11_Sub10_Sub4_Sub4(class11_sub10_sub4_sub4s,
						      2, true);
		    if (anInt2516 != 512) {
			if (anInt2516 == 1024) {
			    class11_sub10_sub4_sub4_15_.method307();
			    class11_sub10_sub4_sub4_15_.method307();
			} else if ((anInt2516 ^ 0xffffffff) == -1537) {
			    class11_sub10_sub4_sub4_15_.method307();
			    class11_sub10_sub4_sub4_15_.method307();
			    class11_sub10_sub4_sub4_15_.method307();
			}
		    } else
			class11_sub10_sub4_sub4_15_.method307();
		    class11_sub10_sub4_sub4_15_.method296
			(anInt2506 + -anInt2808, anInt2795 + -anInt2802,
			 -anInt2790 + anInt2517);
		}
	    }
	    if (arg0 != 3)
		method255((byte) -110);
	    class11_sub10_sub4_sub4.aBoolean2623 = true;
	    return class11_sub10_sub4_sub4;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "kc.D(" + arg0 + ')');
	}
    }
    
    public Class11_Sub10_Sub4_Sub2_Sub1() {
	anInt2796 = -1;
	anInt2799 = 0;
	anInt2787 = 0;
	anInt2793 = 0;
	aBoolean2815 = false;
    }
    
    static {
	aBoolean2798 = false;
	aBoolean2809 = false;
	anIntArray2812 = new int[2000];
    }
}
