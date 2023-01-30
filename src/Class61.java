/* Class61 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;

public class Class61
{
    public static int anInt1261;
    public static int anInt1262;
    public static int anInt1263;
    public static int anInt1264;
    public static Class31 aClass31_1265;
    public static int anInt1266;
    public static int anInt1267;
    public static Class31 aClass31_1268;
    public static int anInt1269;
    public static Class31 aClass31_1270 = Class64.method992("backleft2", 255);
    public static int anInt1271;
    public static Class31 aClass31_1272;
    public static Class31 aClass31_1273;
    public static Class31 aClass31_1274;
    public static int anInt1275;
    public static int anInt1276;
    public static int anInt1277;
    public static int anInt1278;
    public static int anInt1279;
    public static int anInt1280;
    public static int anInt1281;
    public static Class37 aClass37_1282;
    public static int anInt1283;
    public static Class31 aClass31_1284;
    
    public Class61(int arg0) {
	try {
	    Class11_Sub10_Sub9.anInt2203 = arg0;
	    Class57.aLong1184 = System.currentTimeMillis();
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "wd.<init>(" + arg0 + ')');
	}
    }
    
    public static void method956(int arg0) {
	try {
	    aClass31_1273 = null;
	    aClass31_1272 = null;
	    aClass31_1270 = null;
	    aClass31_1284 = null;
	    aClass31_1274 = null;
	    aClass31_1268 = null;
	    aClass37_1282 = null;
	    if (arg0 <= -117)
		aClass31_1265 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "wd.R(" + arg0 + ')');
	}
    }
    
    public void method957(long arg0) {
	try {
	    anInt1271++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "wd.G(" + arg0 + ')');
	}
    }
    
    public static int method958(int arg0, int arg1, int arg2, boolean arg3) {
	try {
	    anInt1269++;
	    int i = arg1 / arg0;
	    int i_0_ = arg0 + -1 & arg1;
	    int i_1_ = arg2 / arg0;
	    int i_2_ = arg2 & arg0 + -1;
	    if (arg3 != true)
		return -107;
	    int i_3_ = Class39_Sub1.method732(i, i_1_, false);
	    int i_4_ = Class39_Sub1.method732(1 + i, i_1_, false);
	    int i_5_ = Class39_Sub1.method732(i, 1 + i_1_, !arg3);
	    int i_6_ = Class39_Sub1.method732(i + 1, 1 + i_1_, false);
	    int i_7_ = Class40.method736(i_0_, 688514529, i_3_, arg0, i_4_);
	    int i_8_ = Class40.method736(i_0_, 688514529, i_5_, arg0, i_6_);
	    return Class40.method736(i_2_, 688514529, i_7_, arg0, i_8_);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("wd.O(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + arg3 + ')'));
	}
    }
    
    public void method959() {
	try {
	    anInt1277++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "wd.A(" + ')');
	}
    }
    
    public static synchronized void method960(byte arg0, Class11_Sub2 arg1) {
	anInt1275++;
	Class7.aClass11_Sub2_1421 = arg1;
	if (arg0 <= 125)
	    method965(21, -6);
    }
    
    public static synchronized void method961(int arg0, byte arg1) {
	try {
	    anInt1281++;
	    if (Class7.aClass11_Sub2_1421 != null)
		Class7.aClass11_Sub2_1421.method113(arg0);
	    if (arg1 == -64)
		Class63.method983(arg0, true);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "wd.P(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method962(byte arg0) {
	try {
	    anInt1280++;
	    Class11_Sub10_Sub6.aClass39_2137.method725(false);
	    if (arg0 < 38)
		anInt1266 = -2;
	    for (int i = 0; (i ^ 0xffffffff) > -33; i++)
		Class48.aLongArray910[i] = 0L;
	    for (int i = 0; (i ^ 0xffffffff) > -33; i++)
		Class11_Sub4.aLongArray1482[i] = 0L;
	    Class11_Sub10_Sub10.anInt2228 = 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "wd.V(" + arg0 + ')');
	}
    }
    
    public static int method963(int arg0, int arg1, Class11_Sub10_Sub5 arg2) {
	try {
	    anInt1261++;
	    if (arg2.anIntArrayArray2070 == null
		|| arg0 >= arg2.anIntArrayArray2070.length)
		return -2;
	    try {
		int i = 0;
		int[] is = arg2.anIntArrayArray2070[arg0];
		int i_9_ = 0;
		int i_10_ = 0;
		for (;;) {
		    int i_11_ = is[i++];
		    int i_12_ = 0;
		    int i_13_ = 0;
		    if ((i_11_ ^ 0xffffffff) == -1)
			return i_9_;
		    if ((i_11_ ^ 0xffffffff) == -2)
			i_12_ = Class53.anIntArray1047[is[i++]];
		    if ((i_11_ ^ 0xffffffff) == -16)
			i_13_ = 1;
		    if (i_11_ == 16)
			i_13_ = 2;
		    if ((i_11_ ^ 0xffffffff) == -18)
			i_13_ = 3;
		    if (i_11_ == 2)
			i_12_ = Class22.anIntArray408[is[i++]];
		    if (i_11_ == 3)
			i_12_ = Class15_Sub2.anIntArray1768[is[i++]];
		    if (i_11_ == 4) {
			int i_14_ = is[i++] << -2011078672;
			i_14_ += is[i++];
			Class11_Sub10_Sub5 class11_sub10_sub5
			    = Class42.method750(i_14_, arg1 ^ 0x5a94);
			int i_15_ = is[i++];
			if (i_15_ != -1
			    && (!Class60.method950(92, i_15_).aBoolean2369
				|| Class4.aBoolean146)) {
			    for (int i_16_ = 0;
				 (class11_sub10_sub5.anIntArray2106.length
				  > i_16_);
				 i_16_++) {
				if (1 + i_15_ == (class11_sub10_sub5
						  .anIntArray2106[i_16_]))
				    i_12_ += (class11_sub10_sub5.anIntArray2068
					      [i_16_]);
			    }
			}
		    }
		    if (i_11_ == 5)
			i_12_ = Class29.anIntArray547[is[i++]];
		    if (i_11_ == 6)
			i_12_ = (Class64.anIntArray1328
				 [-1 + Class22.anIntArray408[is[i++]]]);
		    if (i_11_ == 7)
			i_12_ = 100 * Class29.anIntArray547[is[i++]] / 46875;
		    if ((i_11_ ^ 0xffffffff) == -9)
			i_12_ = (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				 .anInt2793);
		    if ((i_11_ ^ 0xffffffff) == -10) {
			for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > -26;
			     i_17_++) {
			    if (Class32.aBooleanArray573[i_17_])
				i_12_ += Class22.anIntArray408[i_17_];
			}
		    }
		    if (i_11_ == 10) {
			int i_18_ = is[i++] << -1062283856;
			i_18_ += is[i++];
			Class11_Sub10_Sub5 class11_sub10_sub5
			    = Class42.method750(i_18_, 694);
			int i_19_ = is[i++];
			if ((i_19_ ^ 0xffffffff) != 0
			    && (!Class60.method950(-115, i_19_).aBoolean2369
				|| Class4.aBoolean146)) {
			    for (int i_20_ = 0;
				 (i_20_
				  < class11_sub10_sub5.anIntArray2106.length);
				 i_20_++) {
				if (1 + i_19_ == (class11_sub10_sub5
						  .anIntArray2106[i_20_])) {
				    i_12_ = 999999999;
				    break;
				}
			    }
			}
		    }
		    if ((i_11_ ^ 0xffffffff) == -12)
			i_12_ = Class52.anInt1031;
		    if ((i_11_ ^ 0xffffffff) == -13)
			i_12_ = Class33.anInt619;
		    if (i_11_ == 13) {
			int i_21_ = Class29.anIntArray547[is[i++]];
			int i_22_ = is[i++];
			i_12_ = (1 << i_22_ & i_21_) == 0 ? 0 : 1;
		    }
		    if ((i_11_ ^ 0xffffffff) == -15) {
			int i_23_ = is[i++];
			i_12_ = method965(-23573, i_23_);
		    }
		    if ((i_11_ ^ 0xffffffff) == -19)
			i_12_
			    = ((Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				.anInt2506)
			       >> -526158265) - -Class11_Sub10_Sub6.anInt2133;
		    if ((i_11_ ^ 0xffffffff) == -20)
			i_12_ = (Class10.anInt214
				 + ((Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				     .anInt2517)
				    >> 1623767687));
		    if (i_11_ == 20)
			i_12_ = is[i++];
		    if ((i_13_ ^ 0xffffffff) != -1)
			i_10_ = i_13_;
		    else {
			if (i_10_ == 0)
			    i_9_ += i_12_;
			if (i_10_ == 1)
			    i_9_ -= i_12_;
			if (i_10_ == 2 && (i_12_ ^ 0xffffffff) != -1)
			    i_9_ /= i_12_;
			if ((i_10_ ^ 0xffffffff) == -4)
			    i_9_ *= i_12_;
			i_10_ = 0;
		    }
		}
	    } catch (Exception exception) {
		if (arg1 != 22562)
		    aClass31_1268 = null;
		return -1;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("wd.T(" + arg0 + ',' + arg1 + ','
				     + (arg2 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public static void method964(int arg0, int arg1, int arg2) {
	try {
	    anInt1278++;
	    long l = (long) ((arg0 << arg1) - -arg2);
	    Class11_Sub10_Sub16 class11_sub10_sub16
		= ((Class11_Sub10_Sub16)
		   Class60.aClass34_1248.method677(124, l));
	    if (class11_sub10_sub16 != null)
		Class33.aClass32_607.method659((byte) -108,
					       class11_sub10_sub16);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("wd.S(" + arg0 + ',' + arg1 + ',' + arg2
				     + ')'));
	}
    }
    
    public static int method965(int arg0, int arg1) {
	try {
	    anInt1264++;
	    Class11_Sub10_Sub1 class11_sub10_sub1
		= Class11_Sub7.method210((byte) -74, arg1);
	    int i = class11_sub10_sub1.anInt1930;
	    int i_24_ = class11_sub10_sub1.anInt1934;
	    int i_25_ = class11_sub10_sub1.anInt1927;
	    int i_26_ = Class57.anIntArray1159[i_25_ + -i];
	    if (arg0 != -23573)
		return 70;
	    return i_26_ & Class29.anIntArray547[i_24_] >> i;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "wd.M(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static synchronized void method966(int[] arg0, int arg1) {
	int i = 0;
	arg1 -= 7;
	while (i < arg1) {
	    arg0[i++] = 0;
	    arg0[i++] = 0;
	    arg0[i++] = 0;
	    arg0[i++] = 0;
	    arg0[i++] = 0;
	    arg0[i++] = 0;
	    arg0[i++] = 0;
	    arg0[i++] = 0;
	}
	arg1 += 7;
	while (i < arg1)
	    arg0[i++] = 0;
	if (Class7.aClass11_Sub2_1421 != null)
	    Class7.aClass11_Sub2_1421.method112(arg0, 0, arg1);
	Class63.method983(arg1, true);
    }
    
    public static void method967(int arg0, Graphics arg1,
				 Class11_Sub10_Sub13_Sub2 arg2, int arg3,
				 int arg4, int arg5) {
	try {
	    Class55_Sub1.aClass37_1847.method706(-60);
	    anInt1267++;
	    Canvas_Sub1.aClass11_Sub10_Sub13_Sub3_57.method443(0, 0);
	    arg2.method438(Class9.aClass31_195, 55, 28, 16777215, true);
	    if (arg4 != -14024)
		anInt1276 = -20;
	    if ((arg5 ^ 0xffffffff) == -1)
		arg2.method438(Class58.aClass31_1224, 55, 41, 65280, true);
	    if (arg5 == 1)
		arg2.method438(Applet_Sub1.aClass31_22, 55, 41, 16776960,
			       true);
	    if (arg5 == 2)
		arg2.method438(Class53.aClass31_1043, 55, 41, 16711680, true);
	    if ((arg5 ^ 0xffffffff) == -4)
		arg2.method438(Class11_Sub10_Sub1.aClass31_1947, 55, 41, 65535,
			       true);
	    arg2.method438(Class11_Sub11.aClass31_1679, 184, 28, 16777215,
			   true);
	    if ((arg0 ^ 0xffffffff) == -1)
		arg2.method438(Class58.aClass31_1224, 184, 41, 65280, true);
	    if (arg0 == 1)
		arg2.method438(Applet_Sub1.aClass31_22, 184, 41, 16776960,
			       true);
	    if (arg0 == 2)
		arg2.method438(Class53.aClass31_1043, 184, 41, 16711680, true);
	    arg2.method438(Class36.aClass31_673, 324, 28, 16777215, true);
	    if ((arg3 ^ 0xffffffff) == -1)
		arg2.method438(Class58.aClass31_1224, 324, 41, 65280, true);
	    if ((arg3 ^ 0xffffffff) == -2)
		arg2.method438(Applet_Sub1.aClass31_22, 324, 41, 16776960,
			       true);
	    if ((arg3 ^ 0xffffffff) == -3)
		arg2.method438(Class53.aClass31_1043, 324, 41, 16711680, true);
	    arg2.method438(Class33.aClass31_604, 458, 33, 16777215, true);
	    Class55_Sub1.aClass37_1847.method704(0, arg1, 0, 453);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("wd.Q(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + (arg2 != null ? "{...}" : "null") + ','
				     + arg3 + ',' + arg4 + ',' + arg5 + ')'));
	}
    }
    
    public static boolean method968(int arg0, int arg1) {
	try {
	    anInt1279++;
	    if (Class37_Sub1.aBooleanArray1808[arg0])
		return true;
	    if (!Class11_Sub10_Sub4_Sub2_Sub1.aClass55_2803
		     .method878(arg0, arg1 + 20268))
		return false;
	    int i = Class11_Sub10_Sub4_Sub2_Sub1.aClass55_2803
			.method895(arg0, (byte) 120);
	    if ((i ^ 0xffffffff) == -1) {
		Class37_Sub1.aBooleanArray1808[arg0] = true;
		return true;
	    }
	    if (Canvas_Sub1.aClass11_Sub10_Sub5ArrayArray61[arg0] == null)
		Canvas_Sub1.aClass11_Sub10_Sub5ArrayArray61[arg0]
		    = new Class11_Sub10_Sub5[i];
	    for (int i_27_ = 0; (i_27_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_27_++) {
		if (Canvas_Sub1.aClass11_Sub10_Sub5ArrayArray61[arg0][i_27_]
		    == null) {
		    byte[] is = Class11_Sub10_Sub4_Sub2_Sub1.aClass55_2803
				    .method887((byte) -121, i_27_, arg0);
		    if (is != null) {
			Canvas_Sub1.aClass11_Sub10_Sub5ArrayArray61[arg0]
			    [i_27_]
			    = new Class11_Sub10_Sub5();
			Canvas_Sub1.aClass11_Sub10_Sub5ArrayArray61[arg0]
			    [i_27_].method331(new Buffer(is), 31911);
		    }
		}
	    }
	    if (arg1 != -20142)
		method967(23, null, null, -72, 63, -31);
	    Class37_Sub1.aBooleanArray1808[arg0] = true;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "wd.N(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    static {
	aClass31_1265 = Class64.method992(" ", 255);
	aClass31_1274 = Class64.method992("Prepared visibility map", 255);
	aClass31_1273 = Class64.method992("redstone2", 255);
	aClass31_1268 = Class64.method992("@gre@1 unread message", 255);
	anInt1266 = 0;
	anInt1276 = 0;
	aClass31_1284
	    = (Class64.method992
	       ("Swap this note at any bank for the equivalent item", 255));
	anInt1283 = 0;
	aClass31_1272 = aClass31_1284;
    }
}
