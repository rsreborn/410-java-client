/* Class42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.CRC32;

public class Class42
{
    public static int anInt753;
    public static int anInt754;
    public static int anInt755;
    public static int anInt756;
    public static int anInt757;
    public static Class40 aClass40_758 = new Class40(64);
    public static int anInt759;
    public static CRC32 aCRC32_760 = new CRC32();
    public static int anInt761;
    public static Class58 aClass58_762 = new Class58();
    public static Class11_Sub10_Sub13_Sub3[] aClass11_Sub10_Sub13_Sub3Array763;
    public static Class31 aClass31_764;
    public static Class31 aClass31_765
	= Class64.method992("Error loading your profile)3", 255);
    public static Class55_Sub1 aClass55_Sub1_766;
    public static Class31 aClass31_767;
    public static Class31 aClass31_768;
    
    public static boolean method745(int arg0, int arg1, int arg2) {
	try {
	    anInt753++;
	    if (arg2 == 11)
		arg2 = 10;
	    if (arg2 >= 5 && arg2 <= 8)
		arg2 = 4;
	    Class11_Sub10_Sub2 class11_sub10_sub2
		= Class51.method853((byte) -128, arg0);
	    int i = 91 / ((-5 - arg1) / 57);
	    return class11_sub10_sub2.method239(arg2, 65535);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("r.G(" + arg0 + ',' + arg1 + ',' + arg2
				     + ')'));
	}
    }
    
    public static void method746(Class14 arg0, byte arg1, boolean arg2) {
	try {
	    anInt754++;
	    if (arg1 != -37)
		aClass58_762 = null;
	    if (Class11.aClass14_222 != null) {
		try {
		    Class11.aClass14_222.method520(arg1 ^ 0x23ad);
		} catch (Exception exception) {
		    /* empty */
		}
		Class11.aClass14_222 = null;
	    }
	    Class11.aClass14_222 = arg0;
	    Class11_Sub10_Sub3.method248(arg2, -23689);
	    Class50.aClass11_Sub10_Sub16_1001 = null;
	    Class63.anInt1323 = 0;
	    Class11_Sub4.aBuffer_1476.position = 0;
	    Class9.aBuffer_193 = null;
	    for (;;) {
		Class11_Sub10_Sub16 class11_sub10_sub16
		    = ((Class11_Sub10_Sub16)
		       Class37.aClass34_696.method671((byte) -113));
		if (class11_sub10_sub16 == null)
		    break;
		Class52.aClass34_1020.method682(124, class11_sub10_sub16,
						class11_sub10_sub16.aLong231);
		Class12.anInt238++;
		Class11_Sub10_Sub4_Sub2_Sub2.anInt2822--;
	    }
	    for (;;) {
		Class11_Sub10_Sub16 class11_sub10_sub16
		    = ((Class11_Sub10_Sub16)
		       Class13.aClass34_255.method671((byte) -77));
		if (class11_sub10_sub16 == null)
		    break;
		Class33.aClass32_607.method659((byte) -105,
					       class11_sub10_sub16);
		Class60.aClass34_1248.method682(124, class11_sub10_sub16,
						class11_sub10_sub16.aLong231);
		Class52.anInt1032--;
		Class11_Sub10_Sub3.anInt2016++;
	    }
	    if (Class34.aByte635 != 0) {
		try {
		    Buffer buffer = new Buffer(4);
		    buffer.writeByte(4);
		    buffer.writeByte(Class34.aByte635);
		    buffer.writeShortBE(0);
		    Class11.aClass14_222.method521(buffer.payload,
						   4, 0, true);
		} catch (java.io.IOException ioexception) {
		    try {
			Class11.aClass14_222.method520(-9098);
		    } catch (Exception exception) {
			/* empty */
		    }
		    Class57.anInt1158++;
		    Class11.aClass14_222 = null;
		}
	    }
	    Class24.anInt439 = 0;
	    Class11.aLong221 = System.currentTimeMillis();
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("r.A(" + (arg0 != null ? "{...}" : "null")
				     + ',' + arg1 + ',' + arg2 + ')'));
	}
    }
    
    public static void method747(boolean arg0) {
	anInt756++;
	if ((Class11_Sub10_Sub4_Sub5.anInt2681 ^ 0xffffffff) == -2) {
	    if (Class61.anInt1266 >= 539
		&& (Class61.anInt1266 ^ 0xffffffff) >= -574
		&& Class50.anInt995 >= 169
		&& (Class50.anInt995 ^ 0xffffffff) > -206
		&& (Class12.anIntArray237[0] ^ 0xffffffff) != 0) {
		NotActuallyBuffer.anInt483 = 0;
		Class11_Sub10_Sub14.aBoolean2352 = true;
		Buffer.aBoolean1558 = true;
	    }
	    if (Class61.anInt1266 >= 569
		&& (Class61.anInt1266 ^ 0xffffffff) >= -600
		&& Class50.anInt995 >= 168 && Class50.anInt995 < 205
		&& Class12.anIntArray237[1] != -1) {
		Class11_Sub10_Sub14.aBoolean2352 = true;
		Buffer.aBoolean1558 = true;
		NotActuallyBuffer.anInt483 = 1;
	    }
	    if (Class61.anInt1266 >= 597 && Class61.anInt1266 <= 627
		&& (Class50.anInt995 ^ 0xffffffff) <= -169
		&& (Class50.anInt995 ^ 0xffffffff) > -206
		&& (Class12.anIntArray237[2] ^ 0xffffffff) != 0) {
		Class11_Sub10_Sub14.aBoolean2352 = true;
		Buffer.aBoolean1558 = true;
		NotActuallyBuffer.anInt483 = 2;
	    }
	    if ((Class61.anInt1266 ^ 0xffffffff) <= -626
		&& (Class61.anInt1266 ^ 0xffffffff) >= -670
		&& (Class50.anInt995 ^ 0xffffffff) <= -169
		&& Class50.anInt995 < 203 && Class12.anIntArray237[3] != -1) {
		Class11_Sub10_Sub14.aBoolean2352 = true;
		Buffer.aBoolean1558 = true;
		NotActuallyBuffer.anInt483 = 3;
	    }
	    if ((Class61.anInt1266 ^ 0xffffffff) <= -667
		&& Class61.anInt1266 <= 696 && Class50.anInt995 >= 168
		&& (Class50.anInt995 ^ 0xffffffff) > -206
		&& (Class12.anIntArray237[4] ^ 0xffffffff) != 0) {
		Class11_Sub10_Sub14.aBoolean2352 = true;
		NotActuallyBuffer.anInt483 = 4;
		Buffer.aBoolean1558 = true;
	    }
	    if (Class61.anInt1266 >= 694
		&& (Class61.anInt1266 ^ 0xffffffff) >= -725
		&& (Class50.anInt995 ^ 0xffffffff) <= -169
		&& (Class50.anInt995 ^ 0xffffffff) > -206
		&& (Class12.anIntArray237[5] ^ 0xffffffff) != 0) {
		Buffer.aBoolean1558 = true;
		NotActuallyBuffer.anInt483 = 5;
		Class11_Sub10_Sub14.aBoolean2352 = true;
	    }
	    if (Class61.anInt1266 >= 722
		&& (Class61.anInt1266 ^ 0xffffffff) >= -757
		&& Class50.anInt995 >= 169
		&& (Class50.anInt995 ^ 0xffffffff) > -206
		&& Class12.anIntArray237[6] != -1) {
		Class11_Sub10_Sub14.aBoolean2352 = true;
		Buffer.aBoolean1558 = true;
		NotActuallyBuffer.anInt483 = 6;
	    }
	    if (Class61.anInt1266 >= 540
		&& (Class61.anInt1266 ^ 0xffffffff) >= -575
		&& Class50.anInt995 >= 466 && Class50.anInt995 < 502
		&& Class12.anIntArray237[7] != -1) {
		Buffer.aBoolean1558 = true;
		NotActuallyBuffer.anInt483 = 7;
		Class11_Sub10_Sub14.aBoolean2352 = true;
	    }
	    if ((Class61.anInt1266 ^ 0xffffffff) <= -573
		&& Class61.anInt1266 <= 602 && Class50.anInt995 >= 466
		&& Class50.anInt995 < 503 && Class12.anIntArray237[8] != -1) {
		Buffer.aBoolean1558 = true;
		Class11_Sub10_Sub14.aBoolean2352 = true;
		NotActuallyBuffer.anInt483 = 8;
	    }
	    if ((Class61.anInt1266 ^ 0xffffffff) <= -600
		&& Class61.anInt1266 <= 629
		&& (Class50.anInt995 ^ 0xffffffff) <= -467
		&& Class50.anInt995 < 503 && Class12.anIntArray237[9] != -1) {
		NotActuallyBuffer.anInt483 = 9;
		Class11_Sub10_Sub14.aBoolean2352 = true;
		Buffer.aBoolean1558 = true;
	    }
	    if ((Class61.anInt1266 ^ 0xffffffff) <= -628
		&& Class61.anInt1266 <= 671
		&& (Class50.anInt995 ^ 0xffffffff) <= -468
		&& Class50.anInt995 < 502
		&& (Class12.anIntArray237[10] ^ 0xffffffff) != 0) {
		Class11_Sub10_Sub14.aBoolean2352 = true;
		Buffer.aBoolean1558 = true;
		NotActuallyBuffer.anInt483 = 10;
	    }
	    if (Class61.anInt1266 >= 669 && Class61.anInt1266 <= 699
		&& Class50.anInt995 >= 466 && Class50.anInt995 < 503
		&& Class12.anIntArray237[11] != -1) {
		Buffer.aBoolean1558 = true;
		Class11_Sub10_Sub14.aBoolean2352 = true;
		NotActuallyBuffer.anInt483 = 11;
	    }
	    if ((Class61.anInt1266 ^ 0xffffffff) <= -697
		&& Class61.anInt1266 <= 726
		&& (Class50.anInt995 ^ 0xffffffff) <= -467
		&& Class50.anInt995 < 503 && Class12.anIntArray237[12] != -1) {
		Class11_Sub10_Sub14.aBoolean2352 = true;
		NotActuallyBuffer.anInt483 = 12;
		Buffer.aBoolean1558 = true;
	    }
	    if (Class61.anInt1266 >= 724 && Class61.anInt1266 <= 758
		&& Class50.anInt995 >= 466
		&& (Class50.anInt995 ^ 0xffffffff) > -503
		&& (Class12.anIntArray237[13] ^ 0xffffffff) != 0) {
		NotActuallyBuffer.anInt483 = 13;
		Class11_Sub10_Sub14.aBoolean2352 = true;
		Buffer.aBoolean1558 = true;
	    }
	}
	if (arg0 != false)
	    aClass11_Sub10_Sub13_Sub3Array763 = null;
    }
    
    public static Class11_Sub10_Sub10 method748(int arg0, int arg1) {
	try {
	    anInt759++;
	    Class11_Sub10_Sub10 class11_sub10_sub10
		= ((Class11_Sub10_Sub10)
		   Buffer.aClass40_1531.method735((long) arg0,
							(byte) -82));
	    if (class11_sub10_sub10 != null)
		return class11_sub10_sub10;
	    int i = 4 % ((arg1 - -68) / 55);
	    byte[] is = Class10.aClass55_204.method887((byte) -125, arg0, 4);
	    class11_sub10_sub10 = new Class11_Sub10_Sub10();
	    if (is != null)
		class11_sub10_sub10.method375(new Buffer(is), (byte) 55,
					      arg0);
	    class11_sub10_sub10.method373((byte) 126);
	    Buffer.aClass40_1531.method742(-121, (long) arg0,
						 class11_sub10_sub10);
	    return class11_sub10_sub10;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "r.F(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method749(int arg0) {
	try {
	    aClass31_768 = null;
	    int i = 64 / ((arg0 - -31) / 45);
	    aClass31_767 = null;
	    aClass58_762 = null;
	    aClass11_Sub10_Sub13_Sub3Array763 = null;
	    aClass40_758 = null;
	    aClass55_Sub1_766 = null;
	    aCRC32_760 = null;
	    aClass31_764 = null;
	    aClass31_765 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "r.B(" + arg0 + ')');
	}
    }
    
    public static Class11_Sub10_Sub5 method750(int arg0, int arg1) {
	try {
	    int i = arg0 >> -640798960;
	    anInt755++;
	    int i_0_ = 0xffff & arg0;
	    if (arg1 != 694)
		aClass31_768 = null;
	    if (Canvas_Sub1.aClass11_Sub10_Sub5ArrayArray61[i] == null
		|| (Canvas_Sub1.aClass11_Sub10_Sub5ArrayArray61[i][i_0_]
		    == null)) {
		boolean bool = Class61.method968(i, -20142);
		if (!bool)
		    return null;
	    }
	    return Canvas_Sub1.aClass11_Sub10_Sub5ArrayArray61[i][i_0_];
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "r.D(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method751(int arg0) {
	try {
	    int i = -107 / ((-38 - arg0) / 50);
	    anInt757++;
	    for (;;) {
		Class11_Sub11 class11_sub11;
		synchronized (Class39_Sub1.aClass36_1822) {
		    class11_sub11
			= ((Class11_Sub11)
			   Class11_Sub10_Sub1.aClass36_1928.method690(-20575));
		}
		if (class11_sub11 == null)
		    break;
		class11_sub11.aClass55_Sub1_1688.method914
		    (class11_sub11.aClass64_1689, (int) class11_sub11.aLong231,
		     class11_sub11.aByteArray1682, (byte) 2, false);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "r.C(" + arg0 + ')');
	}
    }
    
    static {
	aClass31_764 = Class64.method992("Checking for updates )2 ", 255);
	aClass31_767 = Class64.method992("::fpson", 255);
	aClass31_768 = Class64.method992("null", 255);
    }
}
