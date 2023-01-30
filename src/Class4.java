/* Class4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class4
{
    public static int anInt135;
    public static int[] anIntArray136;
    public static int anInt137;
    public static int anInt138;
    public static Class31 aClass31_139
	= (Class64.method992
	   ("To cancel this request:*6n1(Y Logout and return to the frontpage of this website)3*6n2(Y Choose (WCancel recovery questions(W)3",
	    255));
    public static int anInt140;
    public static Class31[] aClass31Array141;
    public static int anInt142;
    public static int anInt143;
    public static int anInt144;
    public static Class64[] aClass64Array145;
    public static boolean aBoolean146;
    public static int anInt147;
    
    public static void method60(byte arg0) {
	try {
	    aClass31_139 = null;
	    if (arg0 <= 52)
		anInt143 = -128;
	    anIntArray136 = null;
	    aClass31Array141 = null;
	    aClass64Array145 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "db.B(" + arg0 + ')');
	}
    }
    
    public static void method61(byte arg0) {
	try {
	    anInt138++;
	    int i = (Class54.anInt1082
		     + Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899.anInt2517);
	    int i_0_ = (Class59.anInt1242
			+ Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899.anInt2506);
	    if ((-i_0_ + Class28.anInt511 ^ 0xffffffff) > 499
		|| -i_0_ + Class28.anInt511 > 500
		|| (-i + Class11_Sub10_Sub10.anInt2213 ^ 0xffffffff) > 499
		|| (Class11_Sub10_Sub10.anInt2213 - i ^ 0xffffffff) < -501) {
		Class28.anInt511 = i_0_;
		Class11_Sub10_Sub10.anInt2213 = i;
	    }
	    if ((i_0_ ^ 0xffffffff) != (Class28.anInt511 ^ 0xffffffff))
		Class28.anInt511 += (i_0_ - Class28.anInt511) / 16;
	    int i_1_ = Class28.anInt511 >> 1542895495;
	    if ((i ^ 0xffffffff)
		!= (Class11_Sub10_Sub10.anInt2213 ^ 0xffffffff))
		Class11_Sub10_Sub10.anInt2213
		    += (i - Class11_Sub10_Sub10.anInt2213) / 16;
	    if (Class11_Sub10_Sub7.aBooleanArray2148[96])
		Class11_Sub8.anInt1613 += (-Class11_Sub8.anInt1613 + -24) / 2;
	    else if (!Class11_Sub10_Sub7.aBooleanArray2148[97])
		Class11_Sub8.anInt1613 /= 2;
	    else
		Class11_Sub8.anInt1613 += (24 - Class11_Sub8.anInt1613) / 2;
	    int i_2_ = Class11_Sub10_Sub10.anInt2213 >> -655848665;
	    if (!Class11_Sub10_Sub7.aBooleanArray2148[98]) {
		if (!Class11_Sub10_Sub7.aBooleanArray2148[99])
		    Class39.anInt708 /= 2;
		else
		    Class39.anInt708 += (-Class39.anInt708 + -12) / 2;
	    } else
		Class39.anInt708 += (-Class39.anInt708 + 12) / 2;
	    Class52.anInt1022 += Class39.anInt708 / 2;
	    Class29.anInt535
		= Class11_Sub8.anInt1613 / 2 + Class29.anInt535 & 0x7ff;
	    if ((Class52.anInt1022 ^ 0xffffffff) > -129)
		Class52.anInt1022 = 128;
	    int i_3_ = 77 % ((arg0 - -64) / 55);
	    int i_4_ = 0;
	    if ((Class52.anInt1022 ^ 0xffffffff) < -384)
		Class52.anInt1022 = 383;
	    int i_5_ = Class11_Sub10_Sub4_Sub5.method324(Class1.anInt82,
							 Class28.anInt511, 3,
							 (Class11_Sub10_Sub10
							  .anInt2213));
	    if (i_1_ > 3 && i_2_ > 3 && i_1_ < 100 && i_2_ < 100) {
		for (int i_6_ = i_1_ - 4;
		     (i_6_ ^ 0xffffffff) >= (4 + i_1_ ^ 0xffffffff); i_6_++) {
		    for (int i_7_ = -4 + i_2_;
			 (i_7_ ^ 0xffffffff) >= (i_2_ + 4 ^ 0xffffffff);
			 i_7_++) {
			int i_8_ = Class1.anInt82;
			if (i_8_ < 3 && (0x2 & (Class25.aByteArrayArrayArray481
						[1][i_6_][i_7_])) == 2)
			    i_8_++;
			int i_9_ = (-(Class51.anIntArrayArrayArray1005[i_8_]
				      [i_6_][i_7_])
				    + i_5_);
			if ((i_4_ ^ 0xffffffff) > (i_9_ ^ 0xffffffff))
			    i_4_ = i_9_;
		    }
		}
	    }
	    int i_10_ = 192 * i_4_;
	    if (i_10_ > 98048)
		i_10_ = 98048;
	    if (i_10_ < 32768)
		i_10_ = 32768;
	    if ((Class64.anInt1346 ^ 0xffffffff) <= (i_10_ ^ 0xffffffff)) {
		if ((i_10_ ^ 0xffffffff) > (Class64.anInt1346 ^ 0xffffffff))
		    Class64.anInt1346 += (-Class64.anInt1346 + i_10_) / 80;
	    } else
		Class64.anInt1346 += (-Class64.anInt1346 + i_10_) / 24;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "db.A(" + arg0 + ')');
	}
    }
    
    public static int method62(Class55 arg0, byte arg1) {
	try {
	    anInt142++;
	    int i = 0;
	    if (arg0.method892(client.aClass31_1452, 0, Class10.aClass31_213))
		i++;
	    if (arg0.method892(client.aClass31_1452, 0, Class39.aClass31_715))
		i++;
	    if (arg0.method892(client.aClass31_1452, 0,
			       Class11_Sub10_Sub12.aClass31_2293))
		i++;
	    int i_11_ = 59 % ((arg1 - 8) / 62);
	    if (arg0.method892(client.aClass31_1452, 0,
			       Buffer.aClass31_1557))
		i++;
	    if (arg0.method892(client.aClass31_1452, 0, Class62.aClass31_1302))
		i++;
	    if (arg0.method892(client.aClass31_1452, 0, Class10.aClass31_205))
		i++;
	    if (arg0.method892(client.aClass31_1452, 0, Class60.aClass31_1244))
		i++;
	    if (arg0.method892(client.aClass31_1452, 0, Class61.aClass31_1270))
		i++;
	    if (arg0.method892(client.aClass31_1452, 0,
			       Class11_Sub10.aClass31_1673))
		i++;
	    if (arg0.method892(client.aClass31_1452, 0,
			       Class55_Sub1.aClass31_1859))
		i++;
	    if (arg0.method892(client.aClass31_1452, 0,
			       Class11_Sub10_Sub2.aClass31_1982))
		i++;
	    if (arg0.method892(client.aClass31_1452, 0, Class53.aClass31_1052))
		i++;
	    if (arg0.method892(client.aClass31_1452, 0, Class29.aClass31_539))
		i++;
	    if (arg0.method892(client.aClass31_1452, 0,
			       Class11_Sub10_Sub15.aClass31_2383))
		i++;
	    if (arg0.method892(client.aClass31_1452, 0, Class13.aClass31_256))
		i++;
	    if (arg0.method892(client.aClass31_1452, 0, Class1.aClass31_93))
		i++;
	    if (arg0.method892(client.aClass31_1452, 0, Class61.aClass31_1273))
		i++;
	    if (arg0.method892(client.aClass31_1452, 0, Class7.aClass31_1426))
		i++;
	    if (arg0.method892(client.aClass31_1452, 0,
			       Class11_Sub10_Sub9.aClass31_2199))
		i++;
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "db.D(" + (arg0 != null ? "{...}"
					       : "null") + ',' + arg1 + ')');
	}
    }
    
    public static void method63(byte arg0) {
	anInt144++;
	Class34.method673(4);
	if ((Class17.anInt342 ^ 0xffffffff) == -2)
	    Class11_Sub10_Sub4_Sub2_Sub1.aClass11_Sub10_Sub13_Sub4Array2804
		[Class57.anInt1174 / 100].method456
		(NotActuallyBuffer.anInt490 - 8 + -4,
		 Class11_Sub10_Sub8.anInt2177 - 8 + -4);
	if ((Class17.anInt342 ^ 0xffffffff) == -3)
	    Class11_Sub10_Sub4_Sub2_Sub1.aClass11_Sub10_Sub13_Sub4Array2804
		[Class57.anInt1174 / 100 + 4].method456
		(-4 + (NotActuallyBuffer.anInt490 - 8),
		 -8 + Class11_Sub10_Sub8.anInt2177 + -4);
	if (Class23.anInt426 != -1) {
	    Class8.method91(Class23.anInt426, 65536);
	    Class7.method81(0, -1, Class23.anInt426, 4, 0, 334, 0, 512, 2);
	}
	if ((Buffer.anInt1564 ^ 0xffffffff) != 0) {
	    Class8.method91(Buffer.anInt1564, 65536);
	    Class7.method81(0, -1, Buffer.anInt1564, 0, 0, 334, 0, 512,
			    2);
	}
	if (arg0 != 38)
	    method63((byte) 62);
	Class15.method524((byte) -118);
	if (!Class11_Sub4.aBoolean1491) {
	    Class39_Sub1.method734(-107);
	    Class11_Sub10_Sub1.method228(2);
	} else if (Class1.anInt95 == 0)
	    Class11_Sub10_Sub10.method377(30307);
	if (Class61.anInt1276 == 1)
	    Class15.aClass11_Sub10_Sub13_Sub4_315.method456(472, 296);
	if (Class11_Sub10_Sub4_Sub2_Sub2.aBoolean2830) {
	    int i = 507;
	    int i_12_ = 20;
	    int i_13_ = 16776960;
	    if (Class11_Sub12.anInt1702 < 30 && Class1.aBoolean94)
		i_13_ = 16711680;
	    if ((Class11_Sub12.anInt1702 ^ 0xffffffff) > -21
		&& !Class1.aBoolean94)
		i_13_ = 16711680;
	    Class58.aClass11_Sub10_Sub13_Sub2_1228.method432
		(Class40.method744(0,
				   (new Class31[]
				    { Class54.aClass31_1065,
				      Class11_Sub11.method493((Class11_Sub12
							       .anInt1702),
							      (byte) -127) })),
		 i, i_12_, i_13_);
	    i_13_ = 16776960;
	    i_12_ += 15;
	    Runtime runtime = Runtime.getRuntime();
	    int i_14_ = (int) ((runtime.totalMemory() + -runtime.freeMemory())
			       / 1024L);
	    if ((i_14_ ^ 0xffffffff) < -32769 && Class1.aBoolean94)
		i_13_ = 16711680;
	    if ((i_14_ ^ 0xffffffff) < -65537 && !Class1.aBoolean94)
		i_13_ = 16711680;
	    Class58.aClass11_Sub10_Sub13_Sub2_1228.method432
		(Class40.method744(0, (new Class31[]
				       { Class11_Sub10_Sub1.aClass31_1943,
					 Class11_Sub11.method493(i_14_,
								 (byte) -126),
					 Class11_Sub4.aClass31_1477 })),
		 i, i_12_, i_13_);
	    i_12_ += 15;
	    if (Class11_Sub10_Sub1.aBoolean1946) {
		Class58.aClass11_Sub10_Sub13_Sub2_1228
		    .method432(Buffer.aClass31_1559, i, i_12_, 16711680);
		i_12_ += 15;
		Class11_Sub10_Sub1.aBoolean1946 = false;
	    }
	    if (Class34.aBoolean637) {
		Class58.aClass11_Sub10_Sub13_Sub2_1228
		    .method432(Class28.aClass31_514, i, i_12_, 16711680);
		Class34.aBoolean637 = false;
		i_12_ += 15;
	    }
	    if (Class37_Sub1.aBoolean1801) {
		Class58.aClass11_Sub10_Sub13_Sub2_1228
		    .method432(Class24.aClass31_458, i, i_12_, 16711680);
		i_12_ += 15;
		Class37_Sub1.aBoolean1801 = false;
	    }
	}
	if ((Class46.anInt848 ^ 0xffffffff) != -1) {
	    int i = Class46.anInt848 / 50;
	    int i_15_ = i / 60;
	    i %= 60;
	    if (i >= 10)
		Class58.aClass11_Sub10_Sub13_Sub2_1228.method435
		    (Class40.method744(0,
				       (new Class31[]
					{ Class37_Sub1.aClass31_1788,
					  Class11_Sub11.method493(i_15_,
								  (byte) -128),
					  Class11_Sub4.aClass31_1504,
					  Class11_Sub11
					      .method493(i, (byte) -128) })),
		     4, 329, 16776960);
	    else
		Class58.aClass11_Sub10_Sub13_Sub2_1228.method435
		    (Class40.method744(0,
				       (new Class31[]
					{ Class37_Sub1.aClass31_1788,
					  Class11_Sub11.method493(i_15_,
								  (byte) -128),
					  Class39_Sub1.aClass31_1836,
					  Class11_Sub11
					      .method493(i, (byte) -127) })),
		     4, 329, 16776960);
	}
    }
    
    public static Class31 method64(byte arg0, Buffer arg1, int arg2) {
	try {
	    anInt135++;
	    try {
		if (arg0 != 40)
		    method60((byte) 109);
		Class31 class31 = new Class31();
		class31.anInt1403 = arg1.method158(true);
		if ((class31.anInt1403 ^ 0xffffffff) < (arg2 ^ 0xffffffff))
		    class31.anInt1403 = arg2;
		class31.aByteArray1366 = new byte[class31.anInt1403];
		arg1.position
		    += (Class11_Sub4.aClass33_1503.method667
			(0, class31.anInt1403, arg1.position,
			 arg1.payload, -1, class31.aByteArray1366));
		return class31;
	    } catch (Exception exception) {
		return Class47.aClass31_880;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("db.C(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + arg2 + ')'));
	}
    }
    
    public static int method65(int arg0) {
	try {
	    int i
		= Class11_Sub10_Sub4_Sub5.method324(Class1.anInt82,
						    Class15_Sub2.anInt1764, 3,
						    Class15_Sub1.anInt1748);
	    anInt137++;
	    if (i - Class42.anInt761 < 800
		&& ((Class25.aByteArrayArrayArray481[Class1.anInt82]
		     [Class15_Sub2.anInt1764 >> 1123689447]
		     [Class15_Sub1.anInt1748 >> -666822713])
		    & 0x4) != 0)
		return Class1.anInt82;
	    if (arg0 <= 16)
		return 124;
	    return 3;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "db.E(" + arg0 + ')');
	}
    }
    
    static {
	anIntArray136 = new int[256];
	for (int i = 0; i < 256; i++) {
	    int i_16_ = i;
	    for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > -9; i_17_++) {
		if ((i_16_ & 0x1) != 1)
		    i_16_ >>>= 1;
		else
		    i_16_ = i_16_ >>> -1799670431 ^ ~0x12477cdf;
	    }
	    anIntArray136[i] = i_16_;
	}
	aClass31Array141 = new Class31[500];
	anInt143 = 0;
	aBoolean146 = false;
	anInt147 = 0;
    }
}
