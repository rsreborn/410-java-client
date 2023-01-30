/* Class63 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class63
{
    public int[] anIntArray1308;
    public static Class31 aClass31_1309
	= Class64.method992("Loading game screen )2 ", 255);
    public int anInt1310;
    public static int anInt1311;
    public int anInt1312;
    public static Class31 aClass31_1313 = Class64.method992("b12_full", 255);
    public static int anInt1314;
    public static int anInt1315;
    public int anInt1316;
    public static int anInt1317;
    public int anInt1318;
    public int[] anIntArray1319;
    public static Class50 aClass50_1320;
    public static int anInt1321;
    public static Class31 aClass31_1322;
    public static int anInt1323 = 0;
    public static Class11_Sub10_Sub13_Sub4 aClass11_Sub10_Sub13_Sub4_1324;
    public static Class31 aClass31_1325;
    
    public static void method983(int arg0, boolean arg1) {
	anInt1321++;
	Class37_Sub1.anInt1807 += arg0;
	if (arg1 != true)
	    method987((byte) -124);
	while ((Class11_Sub10_Sub9.anInt2203 ^ 0xffffffff)
	       >= (Class37_Sub1.anInt1807 ^ 0xffffffff)) {
	    Class37_Sub1.anInt1807 -= Class11_Sub10_Sub9.anInt2203;
	    Class11_Sub10_Sub1.anInt1933
		-= Class11_Sub10_Sub1.anInt1933 >> 343452866;
	}
	Class11_Sub10_Sub1.anInt1933 -= 1000 * arg0;
	if ((Class11_Sub10_Sub1.anInt1933 ^ 0xffffffff) > -1)
	    Class11_Sub10_Sub1.anInt1933 = 0;
    }
    
    public int method984(int arg0) {
	try {
	    anInt1315++;
	    if ((anInt1310-- ^ 0xffffffff) == -1) {
		method985((byte) 116);
		anInt1310 = 255;
	    }
	    if (arg0 != 255)
		method986(-121);
	    return anIntArray1308[anInt1310];
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "be.C(" + arg0 + ')');
	}
    }
    
    public void method985(byte arg0) {
	try {
	    anInt1316 += ++anInt1312;
	    anInt1317++;
	    if (arg0 <= 89)
		method988(false);
	    for (int i = 0; i < 256; i++) {
		int i_0_ = anIntArray1319[i];
		if ((0x2 & i) != 0) {
		    if ((i & 0x1 ^ 0xffffffff) == -1)
			anInt1318 ^= anInt1318 << -72591678;
		    else
			anInt1318 ^= anInt1318 >>> -1158930800;
		} else if ((0x1 & i) == 0)
		    anInt1318 ^= anInt1318 << -568936403;
		else
		    anInt1318 ^= anInt1318 >>> -234250490;
		anInt1318 += anIntArray1319[i - -128 & 0xff];
		int i_1_;
		anIntArray1319[i] = i_1_
		    = (anInt1318
		       + anIntArray1319[Class20.method572(255,
							  i_0_ >> 1226169250)]
		       + anInt1316);
		anIntArray1308[i] = anInt1316
		    = (anIntArray1319[Class20.method572(255, (i_1_ >> 653451208
							      >> 732466178))]
		       + i_0_);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "be.F(" + arg0 + ')');
	}
    }
    
    public void method986(int arg0) {
	try {
	    anInt1311++;
	    if (arg0 <= 1)
		anInt1316 = -84;
	    int i_2_;
	    int i_3_;
	    int i_4_;
	    int i_5_;
	    int i_6_;
	    int i_7_;
	    int i_8_;
	    int i
		= i_2_ = i_3_ = i_4_ = i_5_ = i_6_ = i_7_ = i_8_ = -1640531527;
	    for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -5; i_9_++) {
		i ^= i_2_ << -778250293;
		i_4_ += i;
		i_2_ += i_3_;
		i_2_ ^= i_3_ >>> -1018434078;
		i_3_ += i_4_;
		i_3_ ^= i_4_ << -2117807352;
		i_5_ += i_2_;
		i_6_ += i_3_;
		i_4_ += i_5_;
		i_4_ ^= i_5_ >>> -1727886256;
		i_7_ += i_4_;
		i_5_ += i_6_;
		i_5_ ^= i_6_ << 217871562;
		i_6_ += i_7_;
		i_8_ += i_5_;
		i_6_ ^= i_7_ >>> -1038575516;
		i_7_ += i_8_;
		i += i_6_;
		i_7_ ^= i_8_ << -158182296;
		i_8_ += i;
		i_2_ += i_7_;
		i_8_ ^= i >>> 750644969;
		i += i_2_;
		i_3_ += i_8_;
	    }
	    for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > -257; i_10_ += 8) {
		i_6_ += anIntArray1308[i_10_ + 5];
		i_8_ += anIntArray1308[i_10_ + 7];
		i_4_ += anIntArray1308[3 + i_10_];
		i_3_ += anIntArray1308[i_10_ + 2];
		i_7_ += anIntArray1308[i_10_ + 6];
		i_2_ += anIntArray1308[1 + i_10_];
		i += anIntArray1308[i_10_];
		i ^= i_2_ << 885206955;
		i_4_ += i;
		i_2_ += i_3_;
		i_5_ += anIntArray1308[i_10_ + 4];
		i_2_ ^= i_3_ >>> -1153078590;
		i_3_ += i_4_;
		i_5_ += i_2_;
		i_3_ ^= i_4_ << 2105193928;
		i_6_ += i_3_;
		i_4_ += i_5_;
		i_4_ ^= i_5_ >>> 510944720;
		i_5_ += i_6_;
		i_7_ += i_4_;
		i_5_ ^= i_6_ << 466794666;
		i_6_ += i_7_;
		i_6_ ^= i_7_ >>> -1507012412;
		i_8_ += i_5_;
		i += i_6_;
		i_7_ += i_8_;
		i_7_ ^= i_8_ << 1049856840;
		i_8_ += i;
		i_8_ ^= i >>> 1147092329;
		i_2_ += i_7_;
		i_3_ += i_8_;
		i += i_2_;
		anIntArray1319[i_10_] = i;
		anIntArray1319[1 + i_10_] = i_2_;
		anIntArray1319[2 + i_10_] = i_3_;
		anIntArray1319[3 + i_10_] = i_4_;
		anIntArray1319[i_10_ - -4] = i_5_;
		anIntArray1319[i_10_ + 5] = i_6_;
		anIntArray1319[6 + i_10_] = i_7_;
		anIntArray1319[7 + i_10_] = i_8_;
	    }
	    for (int i_11_ = 0; i_11_ < 256; i_11_ += 8) {
		i_2_ += anIntArray1319[1 + i_11_];
		i_4_ += anIntArray1319[i_11_ + 3];
		i_6_ += anIntArray1319[i_11_ + 5];
		i_7_ += anIntArray1319[6 + i_11_];
		i += anIntArray1319[i_11_];
		i_3_ += anIntArray1319[i_11_ + 2];
		i_8_ += anIntArray1319[i_11_ + 7];
		i_5_ += anIntArray1319[4 + i_11_];
		i ^= i_2_ << 1893002475;
		i_2_ += i_3_;
		i_4_ += i;
		i_2_ ^= i_3_ >>> 327391106;
		i_3_ += i_4_;
		i_5_ += i_2_;
		i_3_ ^= i_4_ << 125749320;
		i_6_ += i_3_;
		i_4_ += i_5_;
		i_4_ ^= i_5_ >>> -1678910288;
		i_7_ += i_4_;
		i_5_ += i_6_;
		i_5_ ^= i_6_ << -1129386806;
		i_8_ += i_5_;
		i_6_ += i_7_;
		i_6_ ^= i_7_ >>> 1945747780;
		i += i_6_;
		i_7_ += i_8_;
		i_7_ ^= i_8_ << 362867816;
		i_8_ += i;
		i_8_ ^= i >>> -681704151;
		i_2_ += i_7_;
		i_3_ += i_8_;
		i += i_2_;
		anIntArray1319[i_11_] = i;
		anIntArray1319[1 + i_11_] = i_2_;
		anIntArray1319[i_11_ + 2] = i_3_;
		anIntArray1319[i_11_ - -3] = i_4_;
		anIntArray1319[i_11_ - -4] = i_5_;
		anIntArray1319[5 + i_11_] = i_6_;
		anIntArray1319[i_11_ - -6] = i_7_;
		anIntArray1319[7 + i_11_] = i_8_;
	    }
	    method985((byte) 100);
	    anInt1310 = 256;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "be.D(" + arg0 + ')');
	}
    }
    
    public static void method987(byte arg0) {
	try {
	    aClass50_1320 = null;
	    aClass31_1313 = null;
	    if (arg0 < -117) {
		aClass31_1322 = null;
		aClass31_1309 = null;
		aClass11_Sub10_Sub13_Sub4_1324 = null;
		aClass31_1325 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "be.B(" + arg0 + ')');
	}
    }
    
    public static void method988(boolean arg0) {
	try {
	    anInt1314++;
	    if (arg0 == true && Class11_Sub5_Sub1.aClass15_1925 != null) {
		Class11_Sub10_Sub5.method333((byte) 35);
		if (Class4.anInt143 > 0) {
		    Class11_Sub5_Sub1.aClass15_1925.method536(1);
		    Class4.anInt143 = 0;
		}
		Class11_Sub5_Sub1.aClass15_1925.method534(128);
		Class11_Sub5_Sub1.aClass15_1925 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "be.A(" + arg0 + ')');
	}
    }
    
    public Class63(int[] arg0) {
	try {
	    anIntArray1319 = new int[256];
	    anIntArray1308 = new int[256];
	    for (int i = 0; i < arg0.length; i++)
		anIntArray1308[i] = arg0[i];
	    method986(25);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "be.<init>(" + (arg0 != null ? "{...}"
						    : "null") + ')');
	}
    }
    
    static {
	aClass31_1322 = Class64.method992("Jul", 255);
	aClass31_1325
	    = Class64.method992("To create a new account you need to", 255);
    }
}
