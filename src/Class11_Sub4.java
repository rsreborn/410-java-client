/* Class11_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11_Sub4 extends Class11
{
    public int anInt1474;
    public static boolean aBoolean1475;
    public static Buffer aBuffer_1476;
    public static Class31 aClass31_1477;
    public static int anInt1478;
    public static int anInt1479;
    public static int anInt1480 = 0;
    public Class41[] aClass41Array1481;
    public static long[] aLongArray1482;
    public static int anInt1483;
    public int anInt1484;
    public int[] anIntArray1485;
    public static Class31 aClass31_1486;
    public static int anInt1487;
    public int[] anIntArray1488;
    public byte[][][] aByteArrayArrayArray1489;
    public static int anInt1490;
    public static boolean aBoolean1491;
    public static Class31 aClass31_1492;
    public static int[] anIntArray1493;
    public static int[] anIntArray1494;
    public static Class31 aClass31_1495;
    public static Class11_Sub10_Sub13_Sub3 aClass11_Sub10_Sub13_Sub3_1496;
    public int[] anIntArray1497;
    public static int anInt1498;
    public Class41[] aClass41Array1499;
    public static int anInt1500;
    public static Class11_Sub10_Sub13_Sub3 aClass11_Sub10_Sub13_Sub3_1501;
    public static Class31 aClass31_1502;
    public static Class33 aClass33_1503;
    public static Class31 aClass31_1504;
    public static int[] anIntArray1505;
    
    public static boolean method135(int arg0) {
	try {
	    if (arg0 != -14465)
		method136((byte) 29);
	    anInt1478++;
	    synchronized (Class32.aClass20_577) {
		if ((Class6.anInt157 ^ 0xffffffff)
		    == (Class17.anInt332 ^ 0xffffffff))
		    return false;
		Class11_Sub10_Sub15.anInt2384
		    = Class48.anIntArray897[Class17.anInt332];
		Class55_Sub1.anInt1857
		    = Class11_Sub10_Sub8.anIntArray2192[Class17.anInt332];
		Class17.anInt332 = 0x7f & 1 + Class17.anInt332;
		return true;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ub.B(" + arg0 + ')');
	}
    }
    
    public static void method136(byte arg0) {
	try {
	    aClass11_Sub10_Sub13_Sub3_1496 = null;
	    aClass31_1504 = null;
	    aClass31_1486 = null;
	    aClass31_1502 = null;
	    aClass33_1503 = null;
	    aClass31_1477 = null;
	    aBuffer_1476 = null;
	    aClass31_1492 = null;
	    aClass31_1495 = null;
	    anIntArray1493 = null;
	    aClass11_Sub10_Sub13_Sub3_1501 = null;
	    aLongArray1482 = null;
	    int i = 117 / ((31 - arg0) / 53);
	    anIntArray1505 = null;
	    anIntArray1494 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ub.D(" + arg0 + ')');
	}
    }
    
    public static Class31 method137(Class31[] arg0, int arg1, int arg2,
				    int arg3) {
	try {
	    anInt1490++;
	    int i = 0;
	    int i_0_ = 0;
	    if (arg2 != 8526)
		method135(-48);
	    for (/**/; (arg3 ^ 0xffffffff) < (i_0_ ^ 0xffffffff); i_0_++) {
		if (arg0[arg1 + i_0_] == null)
		    arg0[arg1 + i_0_] = Class11_Sub10_Sub5.aClass31_2049;
		i += arg0[arg1 + i_0_].anInt1403;
	    }
	    byte[] is = new byte[i];
	    int i_1_ = 0;
	    for (int i_2_ = 0; i_2_ < arg3; i_2_++) {
		Class31 class31 = arg0[arg1 - -i_2_];
		Class21.method574(class31.aByteArray1366, 0, is, i_1_,
				  class31.anInt1403);
		i_1_ += class31.anInt1403;
	    }
	    Class31 class31 = new Class31();
	    class31.aByteArray1366 = is;
	    class31.anInt1403 = i;
	    return class31;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ub.E("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + arg1 + ',' + arg2 + ',' + arg3 + ')'));
	}
    }
    
    public static boolean method138(int arg0, int arg1, int arg2) {
	try {
	    anInt1483++;
	    if (arg1 < 40)
		aClass11_Sub10_Sub13_Sub3_1501 = null;
	    if ((arg0 ^ 0xffffffff) == -1
		&& ((Class11_Sub10_Sub16.anInt2430 ^ 0xffffffff)
		    == (arg2 ^ 0xffffffff)))
		return true;
	    if (arg0 == 1 && Class11_Sub10_Sub4_Sub2_Sub2.anInt2836 == arg2)
		return true;
	    if (((arg0 ^ 0xffffffff) == -3 || (arg0 ^ 0xffffffff) == -4)
		&& (arg2 ^ 0xffffffff) == (Class22.anInt404 ^ 0xffffffff))
		return true;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ub.C(" + arg0 + ',' + arg1 + ',' + arg2
				     + ')'));
	}
    }
    
    public static void method139(int arg0, int arg1, Class49 arg2, byte[] arg3,
				 int arg4, Class8[] arg5) {
	do {
	    try {
		anInt1498++;
		Buffer buffer = new Buffer(arg3);
		int i = -1;
		for (;;) {
		    int i_3_ = buffer.method158(true);
		    if (i_3_ == 0)
			break;
		    i += i_3_;
		    int i_4_ = 0;
		    for (;;) {
			int i_5_ = buffer.method158(true);
			if (i_5_ == 0)
			    break;
			i_4_ += i_5_ + -1;
			int i_6_ = 0x3f & i_4_;
			int i_7_ = i_4_ >> -990783956;
			int i_8_ = buffer.method168(255);
			int i_9_ = i_8_ >> -190033150;
			int i_10_ = i_8_ & 0x3;
			int i_11_ = (0xfe1 & i_4_) >> 1068093638;
			int i_12_ = i_11_ + arg1;
			int i_13_ = arg0 + i_6_;
			if (i_12_ > 0 && (i_13_ ^ 0xffffffff) < -1
			    && (i_12_ ^ 0xffffffff) > -104 && i_13_ < 103) {
			    int i_14_ = i_7_;
			    if ((0x2 & (Class25.aByteArrayArrayArray481[1]
					[i_12_][i_13_]))
				== 2)
				i_14_--;
			    Class8 class8 = null;
			    if (i_14_ >= 0)
				class8 = arg5[i_14_];
			    Class44.method763(i_7_, i, i_12_, (byte) -61,
					      class8, i_10_, i_9_, arg2,
					      i_13_);
			}
		    }
		}
		if (arg4 < -95)
		    break;
		aLongArray1482 = null;
	    } catch (RuntimeException runtimeexception) {
		throw Class58.method939(runtimeexception,
					("ub.A(" + arg0 + ',' + arg1 + ','
					 + (arg2 != null ? "{...}" : "null")
					 + ','
					 + (arg3 != null ? "{...}" : "null")
					 + ',' + arg4 + ','
					 + (arg5 != null ? "{...}" : "null")
					 + ')'));
	    }
	    break;
	} while (false);
    }
    
    static {
	anInt1479 = 0;
	aClass31_1477 = Class64.method992("k", 255);
	anInt1487 = -1;
	aClass31_1492 = Class64.method992("Feb", 255);
	anIntArray1493 = new int[1000];
	anIntArray1494 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918,
				     38802, 24466, 10145, 58654, 5027, 1457,
				     16565, 34991, 25486 };
	aBoolean1491 = false;
	aClass31_1486 = Class64.method992("K", 255);
	aLongArray1482 = new long[32];
	aClass31_1495 = Class64.method992("headicons_hint", 255);
	anInt1500 = 0;
	aBuffer_1476 = new Buffer(8);
	aClass31_1502 = Class64.method992(")1", 255);
	aClass31_1504 = Class64.method992(":", 255);
    }
}
