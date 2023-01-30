/* Class22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class22
{
    public static int anInt400;
    public static Buffer[] aBufferArray401;
    public static int anInt402;
    public static int anInt403;
    public static int anInt404 = -1;
    public static int anInt405;
    public static int anInt406;
    public static int anInt407;
    public static int[] anIntArray408;
    public static Class55 aClass55_409;
    public static int anInt410;
    public static Class31 aClass31_411;
    public static int anInt412;
    
    public static void method575(byte arg0) {
	try {
	    aClass55_409 = null;
	    int i = 78 % ((arg0 - 31) / 62);
	    aBufferArray401 = null;
	    anIntArray408 = null;
	    aClass31_411 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "lc.D(" + arg0 + ')');
	}
    }
    
    public static int method576(boolean arg0) {
	try {
	    if (arg0 != false)
		return 101;
	    anInt405++;
	    int i = 3;
	    if ((Class11_Sub8.anInt1628 ^ 0xffffffff) > -311) {
		int i_0_ = Class15_Sub2.anInt1764 >> -123398105;
		int i_1_ = Class15_Sub1.anInt1748 >> -1551120121;
		int i_2_ = (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899.anInt2506
			    >> 1425928871);
		if (((Class25.aByteArrayArrayArray481[Class1.anInt82][i_0_]
		      [i_1_]) & 0x4
		     ^ 0xffffffff)
		    != -1)
		    i = Class1.anInt82;
		int i_3_ = (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899.anInt2517
			    >> 1059016615);
		int i_4_;
		if ((i_2_ ^ 0xffffffff) < (i_0_ ^ 0xffffffff))
		    i_4_ = -i_0_ + i_2_;
		else
		    i_4_ = -i_2_ + i_0_;
		int i_5_;
		if (i_3_ > i_1_)
		    i_5_ = -i_1_ + i_3_;
		else
		    i_5_ = i_1_ - i_3_;
		if (i_4_ <= i_5_) {
		    int i_6_ = i_4_ * 65536 / i_5_;
		    int i_7_ = 32768;
		    while (i_3_ != i_1_) {
			if (i_1_ >= i_3_) {
			    if (i_3_ < i_1_)
				i_1_--;
			} else
			    i_1_++;
			if ((0x4 & (Class25.aByteArrayArrayArray481
				    [Class1.anInt82][i_0_][i_1_])
			     ^ 0xffffffff)
			    != -1)
			    i = Class1.anInt82;
			i_7_ += i_6_;
			if ((i_7_ ^ 0xffffffff) <= -65537) {
			    i_7_ -= 65536;
			    if (i_0_ >= i_2_) {
				if ((i_0_ ^ 0xffffffff) < (i_2_ ^ 0xffffffff))
				    i_0_--;
			    } else
				i_0_++;
			    if ((0x4 & (Class25.aByteArrayArrayArray481
					[Class1.anInt82][i_0_][i_1_]))
				!= 0)
				i = Class1.anInt82;
			}
		    }
		} else {
		    int i_8_ = 32768;
		    int i_9_ = 65536 * i_5_ / i_4_;
		    while ((i_0_ ^ 0xffffffff) != (i_2_ ^ 0xffffffff)) {
			i_8_ += i_9_;
			if (i_0_ >= i_2_) {
			    if ((i_2_ ^ 0xffffffff) > (i_0_ ^ 0xffffffff))
				i_0_--;
			} else
			    i_0_++;
			if (((Class25.aByteArrayArrayArray481[Class1.anInt82]
			      [i_0_][i_1_])
			     & 0x4)
			    != 0)
			    i = Class1.anInt82;
			if ((i_8_ ^ 0xffffffff) <= -65537) {
			    if (i_3_ > i_1_)
				i_1_++;
			    else if ((i_1_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff))
				i_1_--;
			    if ((0x4 & (Class25.aByteArrayArrayArray481
					[Class1.anInt82][i_0_][i_1_]))
				!= 0)
				i = Class1.anInt82;
			    i_8_ -= 65536;
			}
		    }
		}
	    }
	    if (((Class25.aByteArrayArrayArray481[Class1.anInt82]
		  [(Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899.anInt2506
		    >> 760317511)]
		  [(Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899.anInt2517
		    >> -1907743449)]) & 0x4
		 ^ 0xffffffff)
		!= -1)
		i = Class1.anInt82;
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "lc.B(" + arg0 + ')');
	}
    }
    
    public static void method577(byte arg0) {
	try {
	    Class58.aClass40_1214.method740(4);
	    if (arg0 >= -117)
		anInt410 = 83;
	    anInt402++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "lc.C(" + arg0 + ')');
	}
    }
    
    public static void method578(Class55 arg0, int arg1, Component arg2) {
	try {
	    anInt406++;
	    if (!Class39.aBoolean711) {
		Class15_Sub1.aClass11_Sub10_Sub13_Sub3_1746
		    = Class55.method896(arg0, true, client.aClass31_1452,
					Class10.aClass31_213);
		Class11_Sub11.aClass11_Sub10_Sub13_Sub3_1684
		    = Class55.method896(arg0, true, client.aClass31_1452,
					Class39.aClass31_715);
		Class3.aClass11_Sub10_Sub13_Sub3_131
		    = Class55.method896(arg0, true, client.aClass31_1452,
					Class11_Sub10_Sub12.aClass31_2293);
		Canvas_Sub1.aClass11_Sub10_Sub13_Sub3_57
		    = Class55.method896(arg0, true, client.aClass31_1452,
					Buffer.aClass31_1557);
		Class15_Sub1.aClass11_Sub10_Sub13_Sub3_1733
		    = Class55.method896(arg0, true, client.aClass31_1452,
					Class62.aClass31_1302);
		Class11_Sub10_Sub8.aClass11_Sub10_Sub13_Sub3_2186
		    = Class55.method896(arg0, true, client.aClass31_1452,
					Class10.aClass31_205);
		Class25.aClass37_473 = Class44.method761(479, arg2, -8, 96);
		Class11_Sub11.aClass11_Sub10_Sub13_Sub3_1684.method443(0, 0);
		Class11_Sub10_Sub9.aClass37_2211
		    = Class44.method761(172, arg2, -8, 156);
		Class11_Sub10_Sub13.method402();
		Class3.aClass11_Sub10_Sub13_Sub3_131.method443(0, 0);
		Class34.aClass37_624
		    = Class44.method761(190, arg2, arg1 + -23597, 261);
		Class15_Sub1.aClass11_Sub10_Sub13_Sub3_1746.method443(0, 0);
		Class12.aClass37_243 = Class44.method761(512, arg2, -8, 334);
		Class11_Sub10_Sub13.method402();
		Class55_Sub1.aClass37_1847
		    = Class44.method761(496, arg2, -8, 50);
		Applet_Sub1.aClass37_27 = Class44.method761(269, arg2, -8, 37);
		Class11_Sub10_Sub12.aClass37_2289
		    = Class44.method761(249, arg2, -8, 45);
		Class11_Sub10_Sub13_Sub4 class11_sub10_sub13_sub4
		    = Class58.method938(Class60.aClass31_1244,
					client.aClass31_1452, arg1 ^ ~0x5c10,
					arg0);
		Class11_Sub10_Sub16.aClass37_2434
		    = Class44.method761(class11_sub10_sub13_sub4.anInt2780,
					arg2, -8,
					class11_sub10_sub13_sub4.anInt2775);
		class11_sub10_sub13_sub4.method451(0, 0);
		class11_sub10_sub13_sub4
		    = Class58.method938(Class61.aClass31_1270,
					client.aClass31_1452, -74, arg0);
		Class10.aClass37_203
		    = Class44.method761(class11_sub10_sub13_sub4.anInt2780,
					arg2, arg1 ^ ~0x5c22,
					class11_sub10_sub13_sub4.anInt2775);
		class11_sub10_sub13_sub4.method451(0, 0);
		class11_sub10_sub13_sub4
		    = Class58.method938(Class11_Sub10.aClass31_1673,
					client.aClass31_1452, -107, arg0);
		Class40.aClass37_738
		    = Class44.method761(class11_sub10_sub13_sub4.anInt2780,
					arg2, -8,
					class11_sub10_sub13_sub4.anInt2775);
		class11_sub10_sub13_sub4.method451(0, 0);
		class11_sub10_sub13_sub4
		    = Class58.method938(Class55_Sub1.aClass31_1859,
					client.aClass31_1452, -76, arg0);
		Class9.aClass37_191
		    = Class44.method761(class11_sub10_sub13_sub4.anInt2780,
					arg2, -8,
					class11_sub10_sub13_sub4.anInt2775);
		class11_sub10_sub13_sub4.method451(0, 0);
		class11_sub10_sub13_sub4
		    = Class58.method938(Class11_Sub10_Sub2.aClass31_1982,
					client.aClass31_1452, -115, arg0);
		Class37_Sub1.aClass37_1809
		    = Class44.method761(class11_sub10_sub13_sub4.anInt2780,
					arg2, -8,
					class11_sub10_sub13_sub4.anInt2775);
		class11_sub10_sub13_sub4.method451(0, 0);
		class11_sub10_sub13_sub4
		    = Class58.method938(Class53.aClass31_1052,
					client.aClass31_1452, arg1 + -23648,
					arg0);
		Class39_Sub1.aClass37_1837
		    = Class44.method761(class11_sub10_sub13_sub4.anInt2780,
					arg2, -8,
					class11_sub10_sub13_sub4.anInt2775);
		class11_sub10_sub13_sub4.method451(0, 0);
		class11_sub10_sub13_sub4
		    = Class58.method938(Class29.aClass31_539,
					client.aClass31_1452, -124, arg0);
		Class1.aClass37_98
		    = Class44.method761(class11_sub10_sub13_sub4.anInt2780,
					arg2, -8,
					class11_sub10_sub13_sub4.anInt2775);
		class11_sub10_sub13_sub4.method451(0, 0);
		class11_sub10_sub13_sub4
		    = Class58.method938(Class11_Sub10_Sub15.aClass31_2383,
					client.aClass31_1452, -59, arg0);
		Class11_Sub10_Sub3.aClass37_2019
		    = Class44.method761(class11_sub10_sub13_sub4.anInt2780,
					arg2, -8,
					class11_sub10_sub13_sub4.anInt2775);
		class11_sub10_sub13_sub4.method451(0, 0);
		class11_sub10_sub13_sub4
		    = Class58.method938(Class13.aClass31_256,
					client.aClass31_1452, -113, arg0);
		Class6.aClass37_156
		    = Class44.method761(class11_sub10_sub13_sub4.anInt2780,
					arg2, -8,
					class11_sub10_sub13_sub4.anInt2775);
		class11_sub10_sub13_sub4.method451(0, 0);
		Class12.aClass11_Sub10_Sub13_Sub3_244
		    = Class55.method896(arg0, true, client.aClass31_1452,
					Class1.aClass31_93);
		Class15_Sub1.aClass11_Sub10_Sub13_Sub3_1732
		    = Class55.method896(arg0, true, client.aClass31_1452,
					Class61.aClass31_1273);
		Canvas_Sub1.aClass11_Sub10_Sub13_Sub3_54
		    = Class55.method896(arg0, true, client.aClass31_1452,
					Class7.aClass31_1426);
		Class44.aClass11_Sub10_Sub13_Sub3_811
		    = Class12.aClass11_Sub10_Sub13_Sub3_244.method442();
		Class44.aClass11_Sub10_Sub13_Sub3_811.method441();
		Class11_Sub4.aClass11_Sub10_Sub13_Sub3_1501
		    = Class15_Sub1.aClass11_Sub10_Sub13_Sub3_1732.method442();
		Class11_Sub4.aClass11_Sub10_Sub13_Sub3_1501.method441();
		Class11_Sub6.aClass11_Sub10_Sub13_Sub3_1581
		    = Class12.aClass11_Sub10_Sub13_Sub3_244.method442();
		Class11_Sub6.aClass11_Sub10_Sub13_Sub3_1581.method445();
		Class58.aClass11_Sub10_Sub13_Sub3_1218
		    = Class15_Sub1.aClass11_Sub10_Sub13_Sub3_1732.method442();
		Class58.aClass11_Sub10_Sub13_Sub3_1218.method445();
		Class11_Sub11.aClass11_Sub10_Sub13_Sub3_1677
		    = Canvas_Sub1.aClass11_Sub10_Sub13_Sub3_54.method442();
		Class11_Sub11.aClass11_Sub10_Sub13_Sub3_1677.method445();
		Class11_Sub10_Sub14.aClass11_Sub10_Sub13_Sub3_2351
		    = Class12.aClass11_Sub10_Sub13_Sub3_244.method442();
		Class11_Sub10_Sub14.aClass11_Sub10_Sub13_Sub3_2351.method441();
		Class11_Sub10_Sub14.aClass11_Sub10_Sub13_Sub3_2351.method445();
		Class23.aClass11_Sub10_Sub13_Sub3_433
		    = Class15_Sub1.aClass11_Sub10_Sub13_Sub3_1732.method442();
		Class23.aClass11_Sub10_Sub13_Sub3_433.method441();
		Class23.aClass11_Sub10_Sub13_Sub3_433.method445();
		Class42.aClass11_Sub10_Sub13_Sub3Array763
		    = Class55_Sub1.method904(arg0,
					     Class11_Sub10_Sub9.aClass31_2199,
					     (byte) -58, client.aClass31_1452);
		Class12.anIntArray251 = new int[151];
		Class32.anIntArray584 = new int[151];
		Class11_Sub10_Sub8.anIntArray2188 = new int[33];
		Class17.anIntArray339 = new int[33];
		for (int i = 0; (i ^ 0xffffffff) > -34; i++) {
		    int i_10_ = 0;
		    int i_11_ = 999;
		    for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > -35; i_12_++) {
			if ((Class3.aClass11_Sub10_Sub13_Sub3_131
			     .aByteArray2768
			     [i * (Class3.aClass11_Sub10_Sub13_Sub3_131
				   .anInt2766) + i_12_])
			    == 0) {
			    if (i_11_ == 999)
				i_11_ = i_12_;
			} else if (i_11_ != 999) {
			    i_10_ = i_12_;
			    break;
			}
		    }
		    Class11_Sub10_Sub8.anIntArray2188[i] = i_11_;
		    Class17.anIntArray339[i] = -i_11_ + i_10_;
		}
		int i = 5;
		if (arg1 != 23589)
		    aBufferArray401 = null;
		for (/**/; (i ^ 0xffffffff) > -157; i++) {
		    int i_13_ = 999;
		    int i_14_ = 0;
		    for (int i_15_ = 25; i_15_ < 172; i_15_++) {
			if (((Class3.aClass11_Sub10_Sub13_Sub3_131
			      .aByteArray2768
			      [i * (Class3.aClass11_Sub10_Sub13_Sub3_131
				    .anInt2766) + i_15_])
			     ^ 0xffffffff) != -1
			    || (i_15_ ^ 0xffffffff) >= -35 && i <= 34) {
			    if (i_13_ != 999) {
				i_14_ = i_15_;
				break;
			    }
			} else if (i_13_ == 999)
			    i_13_ = i_15_;
		    }
		    Class32.anIntArray584[-5 + i] = i_13_ - 25;
		    Class12.anIntArray251[i - 5] = -i_13_ + i_14_;
		}
		Class39.aBoolean711 = true;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("lc.A("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + arg1 + ','
				     + (arg2 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    static {
	aBufferArray401 = new Buffer[2048];
	aClass31_411 = Class64.method992("(U", 255);
	anIntArray408 = new int[25];
	anInt412 = 78;
    }
}
