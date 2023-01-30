/* Class11_Sub10_Sub4_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11_Sub10_Sub4_Sub5 extends Class11_Sub10_Sub4
{
    public static Class31 aClass31_2661
	= Class64.method992("Loaded update list", 255);
    public int anInt2662;
    public int anInt2663;
    public static Class31 aClass31_2664;
    public static Class31 aClass31_2665
	= Class64.method992("Please try using a different world)3", 255);
    public static Class31 aClass31_2666;
    public static Class31 aClass31_2667;
    public static Class31 aClass31_2668;
    public Class11_Sub10_Sub12 aClass11_Sub10_Sub12_2669;
    public int anInt2670;
    public int anInt2671;
    public static int anInt2672;
    public int anInt2673;
    public static byte[] aByteArray2674 = new byte[520];
    public static Class31 aClass31_2675
	= Class64.method992(" with @lre@", 255);
    public static int anInt2676;
    public int anInt2677;
    public static int[][] anIntArrayArray2678;
    public static int anInt2679;
    public static Class31 aClass31_2680;
    public static int anInt2681;
    public static Class31 aClass31_2682;
    public static int anInt2683;
    public int anInt2684;
    public static int anInt2685;
    public int anInt2686;
    public static Class31 aClass31_2687;
    public static int anInt2688;
    public static int anInt2689;
    public static int anInt2690;
    public int anInt2691;
    public static int anInt2692;
    
    public Class11_Sub10_Sub4_Sub4 method255(byte arg0) {
	try {
	    anInt2672++;
	    if (aClass11_Sub10_Sub12_2669 != null) {
		int i = Class61.anInt1283 - anInt2673;
		if ((i ^ 0xffffffff) < -101
		    && (aClass11_Sub10_Sub12_2669.anInt2288 ^ 0xffffffff) < -1)
		    i = 100;
		while (aClass11_Sub10_Sub12_2669.anIntArray2296[anInt2670]
		       < i) {
		    i -= aClass11_Sub10_Sub12_2669.anIntArray2296[anInt2670];
		    anInt2670++;
		    if ((aClass11_Sub10_Sub12_2669.anIntArray2280.length
			 ^ 0xffffffff)
			>= (anInt2670 ^ 0xffffffff)) {
			anInt2670 -= aClass11_Sub10_Sub12_2669.anInt2288;
			if ((anInt2670 ^ 0xffffffff) > -1
			    || (aClass11_Sub10_Sub12_2669.anIntArray2280.length
				^ 0xffffffff) >= (anInt2670 ^ 0xffffffff)) {
			    aClass11_Sub10_Sub12_2669 = null;
			    break;
			}
		    }
		}
		anInt2673 = -i + Class61.anInt1283;
	    }
	    Class11_Sub10_Sub2 class11_sub10_sub2
		= Class51.method853((byte) -119, anInt2686);
	    if (class11_sub10_sub2.anIntArray1980 != null)
		class11_sub10_sub2 = class11_sub10_sub2.method236(false);
	    if (arg0 != 3)
		method323(false);
	    if (class11_sub10_sub2 == null)
		return null;
	    return class11_sub10_sub2.method247(anInt2662, anInt2677,
						anInt2671,
						aClass11_Sub10_Sub12_2669,
						anInt2663, anInt2670,
						anInt2691, anInt2684,
						(byte) -92);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "sa.D(" + arg0 + ')');
	}
    }
    
    public static void method323(boolean arg0) {
	try {
	    aClass31_2665 = null;
	    aClass31_2680 = null;
	    aByteArray2674 = null;
	    anIntArrayArray2678 = null;
	    aClass31_2666 = null;
	    if (arg0 != true)
		method327((byte) -87);
	    aClass31_2682 = null;
	    aClass31_2661 = null;
	    aClass31_2667 = null;
	    aClass31_2675 = null;
	    aClass31_2668 = null;
	    aClass31_2687 = null;
	    aClass31_2664 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "sa.B(" + arg0 + ')');
	}
    }
    
    public static int method324(int arg0, int arg1, int arg2, int arg3) {
	try {
	    anInt2679++;
	    int i = arg3 >> -354203609;
	    int i_0_ = arg1 >> 1935514407;
	    if (i_0_ < 0 || i < 0 || (i_0_ ^ 0xffffffff) < -104
		|| (i ^ 0xffffffff) < -104)
		return 0;
	    int i_1_ = arg0;
	    if (arg2 > i_1_
		&& (Class25.aByteArrayArrayArray481[1][i_0_][i] & 0x2
		    ^ 0xffffffff) == -3)
		i_1_++;
	    int i_2_ = 0x7f & arg1;
	    int i_3_ = 0x7f & arg3;
	    int i_4_ = ((((-i_2_ + 128)
			  * Class51.anIntArrayArrayArray1005[i_1_][i_0_][i])
			 + (Class51.anIntArrayArrayArray1005[i_1_][1 + i_0_][i]
			    * i_2_))
			>> 1840377959);
	    int i_5_ = (((Class51.anIntArrayArrayArray1005[i_1_][i_0_][i - -1]
			  * (-i_2_ + 128))
			 - -(i_2_ * (Class51.anIntArrayArrayArray1005[i_1_]
				     [i_0_ - -1][1 + i])))
			>> -936209657);
	    return i_3_ * i_5_ + i_4_ * (-i_3_ + 128) >> -197694809;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("sa.A(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + arg3 + ')'));
	}
    }
    
    public static void method325(int arg0, byte[] arg1) {
	try {
	    anInt2689++;
	    Buffer buffer = new Buffer(arg1);
	    buffer.position = arg1.length + -2;
	    Class10.anInt216 = buffer.method164(127);
	    Class51.aByteArrayArray1013 = new byte[Class10.anInt216][];
	    Class28.anIntArray523 = new int[Class10.anInt216];
	    Class11_Sub4.anIntArray1505 = new int[Class10.anInt216];
	    Class6.anIntArray153 = new int[Class10.anInt216];
	    Class44.anIntArray814 = new int[Class10.anInt216];
	    buffer.position = -(Class10.anInt216 * 8) + arg1.length - 7;
	    Class11_Sub10_Sub3.anInt2023 = buffer.method164(127);
	    Class59.anInt1233 = buffer.method164(127);
	    int i = 1 + (0xff & buffer.method168(arg0 ^ 0xff));
	    for (int i_6_ = 0; Class10.anInt216 > i_6_; i_6_++)
		Class44.anIntArray814[i_6_] = buffer.method164(127);
	    for (int i_7_ = 0;
		 (i_7_ ^ 0xffffffff) > (Class10.anInt216 ^ 0xffffffff); i_7_++)
		Class11_Sub4.anIntArray1505[i_7_]
		    = buffer.method164(127);
	    for (int i_8_ = 0;
		 (i_8_ ^ 0xffffffff) > (Class10.anInt216 ^ 0xffffffff); i_8_++)
		Class28.anIntArray523[i_8_] = buffer.method164(127);
	    for (int i_9_ = arg0;
		 (i_9_ ^ 0xffffffff) > (Class10.anInt216 ^ 0xffffffff); i_9_++)
		Class6.anIntArray153[i_9_] = buffer.method164(127);
	    buffer.position
		= -((i + -1) * 3) + (arg1.length - 7) - 8 * Class10.anInt216;
	    Class39_Sub1.anIntArray1833 = new int[i];
	    for (int i_10_ = 1; i > i_10_; i_10_++) {
		Class39_Sub1.anIntArray1833[i_10_] = buffer.method178(2);
		if (Class39_Sub1.anIntArray1833[i_10_] == 0)
		    Class39_Sub1.anIntArray1833[i_10_] = 1;
	    }
	    buffer.position = 0;
	    for (int i_11_ = 0; Class10.anInt216 > i_11_; i_11_++) {
		int i_12_ = Class28.anIntArray523[i_11_];
		int i_13_ = Class6.anIntArray153[i_11_];
		int i_14_ = i_12_ * i_13_;
		byte[] is = new byte[i_14_];
		Class51.aByteArrayArray1013[i_11_] = is;
		int i_15_ = buffer.method168(arg0 + 255);
		if ((i_15_ ^ 0xffffffff) == -1) {
		    for (int i_16_ = 0; i_14_ > i_16_; i_16_++)
			is[i_16_] = buffer.method156(26669);
		} else if (i_15_ == 1) {
		    for (int i_17_ = 0;
			 (i_12_ ^ 0xffffffff) < (i_17_ ^ 0xffffffff);
			 i_17_++) {
			for (int i_18_ = 0;
			     (i_18_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff);
			     i_18_++)
			    is[i_12_ * i_18_ + i_17_]
				= buffer.method156(26669);
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("sa.E(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public static void method326(boolean arg0) {
	try {
	    anInt2683++;
	    if (arg0 != true)
		aClass31_2667 = null;
	    if (Class11_Sub10_Sub8.anInt2190 != 0) {
		int i = 0;
		if (Class46.anInt848 != 0)
		    i = 1;
		for (int i_19_ = 0; i_19_ < 100; i_19_++) {
		    if (Class11_Sub10_Sub5.aClass31Array2089[i_19_] != null) {
			int i_20_ = Class37.anIntArray684[i_19_];
			Class31 class31
			    = Class11_Sub5_Sub1.aClass31Array1915[i_19_];
			if (class31 != null
			    && class31.method622((Class11_Sub10_Sub2
						  .aClass31_2006),
						 100))
			    class31 = class31.method639(28418, 5);
			if (class31 != null
			    && class31.method622(Class37_Sub1.aClass31_1802,
						 123))
			    class31 = class31.method639(28418, 5);
			if ((i_20_ == 3 || i_20_ == 7)
			    && ((i_20_ ^ 0xffffffff) == -8
				|| Class59.anInt1236 == 0
				|| (Class59.anInt1236 == 1
				    && Class14.method519(class31, -20281)))) {
			    int i_21_ = 329 - i * 13;
			    if (Class11_Sub6.anInt1590 > 4
				&& ((-10 + i_21_ ^ 0xffffffff)
				    > (-4 + Class11_Sub10_Sub7.anInt2161
				       ^ 0xffffffff))
				&& (3 + i_21_
				    >= -4 + Class11_Sub10_Sub7.anInt2161)) {
				int i_22_
				    = ((Class58
					    .aClass11_Sub10_Sub13_Sub2_1228
					    .method428
					(Class40.method744
					 (0,
					  (new Class31[]
					   { Class23.aClass31_430, class31,
					     (Class11_Sub10_Sub5
					      .aClass31Array2089[i_19_]) }))))
				       - -25);
				if (i_22_ > 450)
				    i_22_ = 450;
				if ((4 - -i_22_ ^ 0xffffffff)
				    < (Class11_Sub6.anInt1590 ^ 0xffffffff)) {
				    Class59.anInt1237++;
				    if ((Class25.anInt479 ^ 0xffffffff)
					<= -2) {
					RuntimeException_Sub1.anInt1360++;
					Class7.method80((Class40.method744
							 (0,
							  (new Class31[]
							   { (client
							      .aClass31_1453),
							     class31 }))),
							2042, 0, 0, false, 0);
				    }
				    Class7.method80((Class40.method744
						     (0,
						      (new Class31[]
						       { Class48.aClass31_901,
							 class31 }))),
						    2012, 0, 0, false, 0);
				    Class7.method80
					(Class40.method744(0,
							   (new Class31[]
							    { (Class15_Sub1
							       .aClass31_1735),
							      class31 })),
					 2051, 0, 0, false, 0);
				    Class39.anInt705++;
				}
			    }
			    if (++i >= 5)
				break;
			}
			if (((i_20_ ^ 0xffffffff) == -6 || i_20_ == 6)
			    && (Class59.anInt1236 ^ 0xffffffff) > -3
			    && ++i >= 5)
			    break;
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "sa.F(" + arg0 + ')');
	}
    }
    
    public static void method327(byte arg0) {
	anInt2690++;
	if (arg0 >= 0)
	    aClass31_2665 = null;
	if (Class11_Sub10_Sub4_Sub2_Sub2.anInt2816 == 0) {
	    if (anInt2681 == 1) {
		int i = Class50.anInt995 - 9;
		int i_23_ = -550 + (-25 + Class61.anInt1266);
		if ((i_23_ ^ 0xffffffff) <= -1 && i >= 0 && i_23_ < 146
		    && i < 151) {
		    i_23_ -= 73;
		    i -= 75;
		    int i_24_ = Class29.anInt535 - -Class46.anInt855 & 0x7ff;
		    int i_25_ = Class11_Sub10_Sub13_Sub1.anIntArray2725[i_24_];
		    i_25_
			= (256 + Class15_Sub1.anInt1737) * i_25_ >> -787116408;
		    int i_26_ = Class11_Sub10_Sub13_Sub1.anIntArray2721[i_24_];
		    i_26_ = (i_26_ * (Class15_Sub1.anInt1737 + 256)
			     >> -1202711800);
		    int i_27_ = i_23_ * i_26_ + i * i_25_ >> -1122428437;
		    int i_28_ = -(i_25_ * i_23_) + i_26_ * i >> -848901557;
		    int i_29_
			= (-i_28_ + (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				     .anInt2517)
			   >> -192464185);
		    int i_30_
			= ((Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899.anInt2506
			    - -i_27_)
			   >> 357627399);
		    boolean bool
			= Class44.method759(i_29_, (byte) 110, 0,
					    (Class48
					     .aClass11_Sub10_Sub4_Sub2_Sub1_899
					     .anIntArray2500[0]),
					    0, 0, 1, true, 0,
					    (Class48
					     .aClass11_Sub10_Sub4_Sub2_Sub1_899
					     .anIntArray2562[0]),
					    0, i_30_);
		    if (bool) {
			Class40.aClass11_Sub5_Sub1_728.writeByte(i_23_);
			Class40.aClass11_Sub5_Sub1_728.writeByte(i);
			Class40.aClass11_Sub5_Sub1_728
			    .writeShortBE(Class29.anInt535);
			Class40.aClass11_Sub5_Sub1_728.writeByte(57);
			Class40.aClass11_Sub5_Sub1_728
			    .writeByte(Class46.anInt855);
			Class40.aClass11_Sub5_Sub1_728
			    .writeByte(Class15_Sub1.anInt1737);
			Class40.aClass11_Sub5_Sub1_728.writeByte(89);
			Class40.aClass11_Sub5_Sub1_728.writeShortBE
			    ((Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
			      .anInt2506)
				);
			Class40.aClass11_Sub5_Sub1_728.writeShortBE
			    ((Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
			      .anInt2517)
				);
			Class40.aClass11_Sub5_Sub1_728
			    .writeByte(Class57.anInt1155);
			Class40.aClass11_Sub5_Sub1_728.writeByte(63);
		    }
		}
	    }
	}
    }
    
    public Class11_Sub10_Sub4_Sub5(int arg0, int arg1, int arg2, int arg3,
				   int arg4, int arg5, int arg6, int arg7,
				   boolean arg8) {
	anInt2684 = arg6;
	anInt2691 = arg3;
	anInt2663 = arg1;
	anInt2662 = arg2;
	anInt2677 = arg5;
	anInt2671 = arg4;
	anInt2686 = arg0;
	if ((arg7 ^ 0xffffffff) != 0) {
	    aClass11_Sub10_Sub12_2669 = NotActuallyBuffer.method600(arg7, 4867);
	    anInt2670 = 0;
	    anInt2673 = Class61.anInt1283 + -1;
	    if (arg8 && aClass11_Sub10_Sub12_2669.anInt2288 != -1) {
		anInt2670 = (int) ((double) (aClass11_Sub10_Sub12_2669
					     .anIntArray2280).length
				   * Math.random());
		anInt2673 -= (int) ((double) (aClass11_Sub10_Sub12_2669
					      .anIntArray2296[anInt2670])
				    * Math.random());
	    }
	}
    }
    
    static {
	aClass31_2664 = Class64.method992("Unexpected server response: ", 255);
	aClass31_2667 = Class64.method992("RuneScape has been updated(Q", 255);
	anInt2681 = 0;
	aClass31_2687 = Class64.method992("", 255);
	aClass31_2666 = aClass31_2687;
	aClass31_2682 = aClass31_2687;
	anInt2692 = 0;
	aClass31_2668 = aClass31_2687;
	aClass31_2680 = aClass31_2687;
    }
}
