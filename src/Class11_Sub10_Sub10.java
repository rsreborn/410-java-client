/* Class11_Sub10_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11_Sub10_Sub10 extends Class11_Sub10
{
    public static int anInt2212;
    public static int anInt2213;
    public static Class31 aClass31_2214
	= Class64.method992("No response from server", 255);
    public int anInt2215;
    public static Class31 aClass31_2216;
    public static int anInt2217;
    public static int anInt2218;
    public int anInt2219;
    public static Class31 aClass31_2220;
    public int anInt2221 = -1;
    public static int anInt2222;
    public static Class31 aClass31_2223;
    public static int anInt2224;
    public int anInt2225;
    public static int[] anIntArray2226 = new int[4000];
    public int anInt2227;
    public static int anInt2228;
    public int anInt2229;
    public static int[][] anIntArrayArray2230;
    public static Class31 aClass31_2231;
    public static int anInt2232;
    public static Class31 aClass31_2233;
    public static Class31 aClass31_2234;
    public static int anInt2235;
    public static Class55 aClass55_2236;
    public int anInt2237;
    public static int anInt2238;
    public static Class31 aClass31_2239;
    public boolean aBoolean2240;
    public int anInt2241;
    public int anInt2242;
    
    public static void method371(byte arg0) {
	try {
	    aClass31_2233 = null;
	    if (arg0 != 69)
		method377(-64);
	    aClass55_2236 = null;
	    aClass31_2231 = null;
	    aClass31_2223 = null;
	    anIntArrayArray2230 = null;
	    aClass31_2239 = null;
	    aClass31_2214 = null;
	    anIntArray2226 = null;
	    aClass31_2216 = null;
	    aClass31_2234 = null;
	    aClass31_2220 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ec.G(" + arg0 + ')');
	}
    }
    
    public void method372(byte arg0, int arg1, Buffer arg2, int arg3) {
	try {
	    if (arg1 == 1)
		anInt2219 = arg2.method178(2);
	    else if ((arg1 ^ 0xffffffff) != -3) {
		if (arg1 == 5)
		    aBoolean2240 = false;
		else if (arg1 == 7)
		    anInt2241 = arg2.method178(2);
	    } else
		anInt2221 = arg2.method168(255);
	    if (arg0 <= 105)
		anInt2215 = 36;
	    anInt2217++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ec.D(" + arg0 + ',' + arg1 + ','
				     + (arg2 != null ? "{...}" : "null") + ','
				     + arg3 + ')'));
	}
    }
    
    public void method373(byte arg0) {
	try {
	    if (arg0 <= 106)
		method371((byte) -93);
	    if (anInt2241 != -1) {
		method376((byte) 75, anInt2241);
		anInt2237 = anInt2225;
		anInt2215 = anInt2242;
		anInt2227 = anInt2229;
	    }
	    method376((byte) 65, anInt2219);
	    anInt2212++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ec.B(" + arg0 + ')');
	}
    }
    
    public static void method374(byte arg0) {
	try {
	    Class11_Sub10_Sub4_Sub2.aClass11_Sub5_Sub1_2531.method197(false);
	    anInt2218++;
	    int i = Class11_Sub10_Sub4_Sub2.aClass11_Sub5_Sub1_2531
			.method203(-106, 8);
	    if (Class32.anInt581 > i) {
		for (int i_0_ = i;
		     (i_0_ ^ 0xffffffff) > (Class32.anInt581 ^ 0xffffffff);
		     i_0_++)
		    Class20.anIntArray394[Class64.anInt1340++]
			= Class11_Sub10_Sub5.anIntArray2063[i_0_];
	    }
	    if ((Class32.anInt581 ^ 0xffffffff) > (i ^ 0xffffffff))
		throw new RuntimeException("gnpov1");
	    Class32.anInt581 = 0;
	    int i_1_ = 108 / ((arg0 - 64) / 49);
	    for (int i_2_ = 0; i_2_ < i; i_2_++) {
		int i_3_ = Class11_Sub10_Sub5.anIntArray2063[i_2_];
		Class11_Sub10_Sub4_Sub2_Sub2 class11_sub10_sub4_sub2_sub2
		    = Class12.aClass11_Sub10_Sub4_Sub2_Sub2Array235[i_3_];
		int i_4_ = Class11_Sub10_Sub4_Sub2.aClass11_Sub5_Sub1_2531
			       .method203(55, 1);
		if (i_4_ == 0) {
		    Class11_Sub10_Sub5.anIntArray2063[Class32.anInt581++]
			= i_3_;
		    class11_sub10_sub4_sub2_sub2.anInt2505 = Class61.anInt1283;
		} else {
		    int i_5_ = Class11_Sub10_Sub4_Sub2
				   .aClass11_Sub5_Sub1_2531.method203(-65, 2);
		    if (i_5_ == 0) {
			Class11_Sub10_Sub5.anIntArray2063[Class32.anInt581++]
			    = i_3_;
			class11_sub10_sub4_sub2_sub2.anInt2505
			    = Class61.anInt1283;
			Class54.anIntArray1066[Class11_Sub11.anInt1687++]
			    = i_3_;
		    } else if (i_5_ == 1) {
			Class11_Sub10_Sub5.anIntArray2063[Class32.anInt581++]
			    = i_3_;
			class11_sub10_sub4_sub2_sub2.anInt2505
			    = Class61.anInt1283;
			int i_6_
			    = Class11_Sub10_Sub4_Sub2
				  .aClass11_Sub5_Sub1_2531.method203(78, 3);
			class11_sub10_sub4_sub2_sub2.method273(i_6_, (byte) 68,
							       false);
			int i_7_
			    = Class11_Sub10_Sub4_Sub2
				  .aClass11_Sub5_Sub1_2531.method203(108, 1);
			if ((i_7_ ^ 0xffffffff) == -2)
			    Class54.anIntArray1066[Class11_Sub11.anInt1687++]
				= i_3_;
		    } else if (i_5_ == 2) {
			Class11_Sub10_Sub5.anIntArray2063[Class32.anInt581++]
			    = i_3_;
			class11_sub10_sub4_sub2_sub2.anInt2505
			    = Class61.anInt1283;
			int i_8_
			    = Class11_Sub10_Sub4_Sub2
				  .aClass11_Sub5_Sub1_2531.method203(106, 3);
			class11_sub10_sub4_sub2_sub2.method273(i_8_, (byte) 68,
							       true);
			int i_9_
			    = Class11_Sub10_Sub4_Sub2
				  .aClass11_Sub5_Sub1_2531.method203(-91, 3);
			class11_sub10_sub4_sub2_sub2.method273(i_9_, (byte) 68,
							       true);
			int i_10_
			    = Class11_Sub10_Sub4_Sub2
				  .aClass11_Sub5_Sub1_2531.method203(-122, 1);
			if (i_10_ == 1)
			    Class54.anIntArray1066[Class11_Sub11.anInt1687++]
				= i_3_;
		    } else if (i_5_ == 3)
			Class20.anIntArray394[Class64.anInt1340++] = i_3_;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ec.A(" + arg0 + ')');
	}
    }
    
    public void method375(Buffer arg0, byte arg1, int arg2) {
	try {
	    if (arg1 != 55)
		method372((byte) -11, -61, null, 93);
	    for (;;) {
		int i = arg0.method168(255);
		if ((i ^ 0xffffffff) == -1)
		    break;
		method372((byte) 111, i, arg0, arg2);
	    }
	    anInt2238++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ec.C("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + arg1 + ',' + arg2 + ')'));
	}
    }
    
    public void method376(byte arg0, int arg1) {
	try {
	    double d = (double) (arg1 >> 759314792 & 0xff) / 256.0;
	    int i = 67 % ((arg0 - -47) / 48);
	    anInt2235++;
	    double d_11_ = (double) (arg1 >> -1406525840 & 0xff) / 256.0;
	    double d_12_ = (double) (0xff & arg1) / 256.0;
	    double d_13_ = d_11_;
	    if (d < d_13_)
		d_13_ = d;
	    if (d_13_ > d_12_)
		d_13_ = d_12_;
	    double d_14_ = 0.0;
	    double d_15_ = d_11_;
	    if (d_15_ < d)
		d_15_ = d;
	    if (d_15_ < d_12_)
		d_15_ = d_12_;
	    double d_16_ = 0.0;
	    double d_17_ = (d_15_ + d_13_) / 2.0;
	    anInt2242 = (int) (d_17_ * 256.0);
	    if (anInt2242 < 0)
		anInt2242 = 0;
	    else if (anInt2242 > 255)
		anInt2242 = 255;
	    if (d_13_ != d_15_) {
		if (d_17_ < 0.5)
		    d_16_ = (d_15_ - d_13_) / (d_15_ + d_13_);
		if (d_17_ >= 0.5)
		    d_16_ = (-d_13_ + d_15_) / (2.0 - d_15_ - d_13_);
		if (d_11_ == d_15_)
		    d_14_ = (d - d_12_) / (-d_13_ + d_15_);
		else if (d_15_ == d)
		    d_14_ = 2.0 + (-d_11_ + d_12_) / (d_15_ - d_13_);
		else if (d_15_ == d_12_)
		    d_14_ = 4.0 + (d_11_ - d) / (d_15_ - d_13_);
	    }
	    d_14_ /= 6.0;
	    anInt2225 = (int) (256.0 * d_16_);
	    anInt2229 = (int) (256.0 * d_14_);
	    if (anInt2225 >= 0) {
		if ((anInt2225 ^ 0xffffffff) < -256)
		    anInt2225 = 255;
	    } else
		anInt2225 = 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "ec.E(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method377(int arg0) {
	try {
	    int i = Class15_Sub2.anInt1758;
	    anInt2224++;
	    int i_18_ = Class61.anInt1262;
	    int i_19_ = Class15_Sub1.anInt1736;
	    if (arg0 != 30307)
		aClass31_2231 = null;
	    int i_20_ = Class55.anInt1142;
	    int i_21_ = 6116423;
	    Class11_Sub10_Sub13.method404(i, i_18_, i_19_, i_20_, i_21_);
	    Class11_Sub10_Sub13.method404(i + 1, 1 + i_18_, i_19_ + -2, 16, 0);
	    Class11_Sub10_Sub13.method399(i + 1, i_18_ + 18, i_19_ - 2,
					  i_20_ - 19, 0);
	    RuntimeException_Sub1.aClass11_Sub10_Sub13_Sub2_1357
		.method435(Class33.aClass31_615, 3 + i, i_18_ + 14, i_21_);
	    int i_22_ = Class11_Sub6.anInt1590;
	    int i_23_ = Class11_Sub10_Sub7.anInt2161;
	    if (Class1.anInt95 == 0) {
		i_23_ -= 4;
		i_22_ -= 4;
	    }
	    if (Class1.anInt95 == 1) {
		i_23_ -= 205;
		i_22_ -= 553;
	    }
	    if ((Class1.anInt95 ^ 0xffffffff) == -3) {
		i_23_ -= 357;
		i_22_ -= 17;
	    }
	    for (int i_24_ = 0;
		 (Class11_Sub7.anInt1597 ^ 0xffffffff) < (i_24_ ^ 0xffffffff);
		 i_24_++) {
		int i_25_
		    = 15 * (-i_24_ + Class11_Sub7.anInt1597 - 1) + 31 + i_18_;
		int i_26_ = 16777215;
		if (i_22_ > i
		    && (i_22_ ^ 0xffffffff) > (i - -i_19_ ^ 0xffffffff)
		    && (i_23_ ^ 0xffffffff) < (i_25_ + -13 ^ 0xffffffff)
		    && 3 + i_25_ > i_23_)
		    i_26_ = 16776960;
		RuntimeException_Sub1.aClass11_Sub10_Sub13_Sub2_1357.method434
		    (Class4.aClass31Array141[i_24_], 3 + i, i_25_, i_26_,
		     true);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ec.F(" + arg0 + ')');
	}
    }
    
    public Class11_Sub10_Sub10() {
	anInt2219 = 0;
	anInt2241 = -1;
	aBoolean2240 = true;
    }
    
    static {
	aClass31_2223 = Class64.method992("M", 255);
	anInt2222 = 0;
	aClass31_2220 = Class64.method992("Enter object name", 255);
	aClass31_2216 = Class64.method992("Drop @lre@", 255);
	anIntArrayArray2230 = new int[104][104];
	aClass31_2231 = Class64.method992("Take", 255);
	aClass31_2234 = aClass31_2231;
	aClass31_2239 = Class64.method992("::", 255);
	aClass31_2233 = Class64.method992("No reply from loginserver)3", 255);
    }
}
