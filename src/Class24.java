/* Class24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class24
{
    public long aLong434;
    public static int anInt435;
    public static int anInt436;
    public static int anInt437;
    public long aLong438;
    public static int anInt439 = 0;
    public static int anInt440;
    public static Class31 aClass31_441;
    public int[] anIntArray442;
    public static byte[][][] aByteArrayArrayArray443;
    public static int anInt444;
    public static int anInt445;
    public static int anInt446;
    public static int anInt447;
    public int[] anIntArray448;
    public static int anInt449;
    public static int anInt450;
    public static int anInt451;
    public static int anInt452 = 3353893;
    public int anInt453;
    public static Class31 aClass31_454
	= Class64.method992("Your ignore list is full)3 Max of 100 hit", 255);
    public static int anInt455;
    public static Class31 aClass31_456
	= Class64.method992("headicons_prayer", 255);
    public static Class31 aClass31_457
	= Class64.method992("Loading title screen )2 ", 255);
    public static Class31 aClass31_458
	= Class64.method992("Icons redrawn", 255);
    public boolean aBoolean459;
    
    public static void method584(int arg0) {
	try {
	    anInt451++;
	    Class11_Sub10_Sub4_Sub1.anInt2468++;
	    Class40.outBuffer.method196(1, 255);
	    if (Class28.anInt512 != -1) {
		Class44.method760(256, Class28.anInt512);
		Class11_Sub10_Sub14.aBoolean2352 = true;
		Class39_Sub1.aBoolean1839 = false;
		Buffer.aBoolean1558 = true;
		Class28.anInt512 = -1;
	    }
	    if (Class47.anInt881 != -1) {
		Class44.method760(256, Class47.anInt881);
		Class39_Sub1.aBoolean1839 = false;
		Class47.anInt881 = -1;
		Class32.aBoolean575 = true;
	    }
	    if ((Class46.anInt844 ^ 0xffffffff) != 0) {
		Class44.method760(256, Class46.anInt844);
		Class46.anInt844 = -1;
		Class34.method674(30, false);
	    }
	    if (Class52.anInt1019 != -1) {
		Class44.method760(256, Class52.anInt1019);
		Class52.anInt1019 = -1;
	    }
	    if (Buffer.anInt1564 != -1) {
		Class44.method760(256, Buffer.anInt1564);
		Buffer.anInt1564 = -1;
	    }
	    int i = -71 / ((-8 - arg0) / 53);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "le.H(" + arg0 + ')');
	}
    }
    
    public Class11_Sub10_Sub4_Sub4 method585(int arg0) {
	try {
	    anInt437++;
	    if (anInt453 != arg0)
		return Class13.method512(111, anInt453).method471(-2);
	    boolean bool = false;
	    for (int i = 0; (i ^ 0xffffffff) > -13; i++) {
		int i_0_ = anIntArray448[i];
		if ((i_0_ ^ 0xffffffff) <= -257 && i_0_ < 512
		    && !Class51.method852(true, i_0_ - 256).method357(124))
		    bool = true;
		if ((i_0_ ^ 0xffffffff) <= -513
		    && !Class60.method950(-77, i_0_ + -512)
			    .method473(aBoolean459, arg0))
		    bool = true;
	    }
	    if (bool)
		return null;
	    int i = 0;
	    Class11_Sub10_Sub4_Sub4[] class11_sub10_sub4_sub4s
		= new Class11_Sub10_Sub4_Sub4[12];
	    for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -13; i_1_++) {
		int i_2_ = anIntArray448[i_1_];
		if ((i_2_ ^ 0xffffffff) <= -257
		    && (i_2_ ^ 0xffffffff) > -513) {
		    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
			= Class51.method852(true, i_2_ - 256)
			      .method358(arg0 ^ 0x27);
		    if (class11_sub10_sub4_sub4 != null)
			class11_sub10_sub4_sub4s[i++]
			    = class11_sub10_sub4_sub4;
		}
		if ((i_2_ ^ 0xffffffff) <= -513) {
		    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
			= Class60.method950(120, -512 + i_2_)
			      .method477(aBoolean459, 124);
		    if (class11_sub10_sub4_sub4 != null)
			class11_sub10_sub4_sub4s[i++]
			    = class11_sub10_sub4_sub4;
		}
	    }
	    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
		= new Class11_Sub10_Sub4_Sub4(class11_sub10_sub4_sub4s, i);
	    for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -6; i_3_++) {
		if ((anIntArray442[i_3_] ^ 0xffffffff) != -1) {
		    class11_sub10_sub4_sub4.method299((Class62
						       .anIntArrayArray1299
						       [i_3_][0]),
						      (Class62
						       .anIntArrayArray1299
						       [i_3_]
						       [anIntArray442[i_3_]]));
		    if (i_3_ == 1)
			class11_sub10_sub4_sub4.method299
			    (Class11_Sub4.anIntArray1494[0],
			     Class11_Sub4.anIntArray1494[anIntArray442[i_3_]]);
		}
	    }
	    return class11_sub10_sub4_sub4;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "le.F(" + arg0 + ')');
	}
    }
    
    public static Class11_Sub10_Sub13_Sub4 method586(int arg0, int arg1,
						     int arg2, int arg3) {
	try {
	    anInt444++;
	    if (arg0 == 0) {
		Class11_Sub10_Sub13_Sub4 class11_sub10_sub13_sub4
		    = ((Class11_Sub10_Sub13_Sub4)
		       Class11_Sub10_Sub12.aClass40_2291
			   .method735((long) arg2, (byte) -96));
		if (class11_sub10_sub13_sub4 != null
		    && class11_sub10_sub13_sub4.anInt2777 != arg1
		    && ((class11_sub10_sub13_sub4.anInt2777 ^ 0xffffffff)
			!= 0)) {
		    class11_sub10_sub13_sub4.method107(arg3 + 27287);
		    class11_sub10_sub13_sub4 = null;
		}
		if (class11_sub10_sub13_sub4 != null)
		    return class11_sub10_sub13_sub4;
	    }
	    Class11_Sub10_Sub15 class11_sub10_sub15
		= Class60.method950(56, arg2);
	    if (class11_sub10_sub15.anIntArray2414 == null)
		arg1 = -1;
	    if (arg3 != -27287)
		return null;
	    if ((arg1 ^ 0xffffffff) < -2) {
		int i = -1;
		for (int i_4_ = 0; i_4_ < 10; i_4_++) {
		    if (((arg1 ^ 0xffffffff)
			 <= (class11_sub10_sub15.anIntArray2378[i_4_]
			     ^ 0xffffffff))
			&& (class11_sub10_sub15.anIntArray2378[i_4_]
			    ^ 0xffffffff) != -1)
			i = class11_sub10_sub15.anIntArray2414[i_4_];
		}
		if (i != -1)
		    class11_sub10_sub15 = Class60.method950(96, i);
	    }
	    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
		= class11_sub10_sub15.method476(-10, 1, true);
	    if (class11_sub10_sub4_sub4 == null)
		return null;
	    Class11_Sub10_Sub13_Sub4 class11_sub10_sub13_sub4 = null;
	    if ((class11_sub10_sub15.anInt2380 ^ 0xffffffff) != 0) {
		class11_sub10_sub13_sub4
		    = method586(-1, 10, class11_sub10_sub15.anInt2412, -27287);
		if (class11_sub10_sub13_sub4 == null)
		    return null;
	    }
	    int[] is = Class11_Sub10_Sub13_Sub1.method409();
	    int i = Class11_Sub10_Sub13.anInt2306;
	    int[] is_5_ = Class11_Sub10_Sub13.anIntArray2307;
	    int i_6_ = Class11_Sub10_Sub13.anInt2301;
	    int i_7_ = Class11_Sub10_Sub13.anInt2303;
	    int i_8_ = Class11_Sub10_Sub13.anInt2305;
	    int i_9_ = Class11_Sub10_Sub13.anInt2302;
	    int i_10_ = Class11_Sub10_Sub13.anInt2304;
	    Class11_Sub10_Sub13_Sub4 class11_sub10_sub13_sub4_11_
		= new Class11_Sub10_Sub13_Sub4(32, 32);
	    Class11_Sub10_Sub13.method396((class11_sub10_sub13_sub4_11_
					   .anIntArray2776),
					  32, 32);
	    Class11_Sub10.anIntArray1660
		= Class11_Sub10_Sub13_Sub1
		      .method417(Class11_Sub10.anIntArray1660);
	    Class11_Sub10_Sub13.method404(0, 0, 32, 32, 0);
	    Class11_Sub10_Sub13_Sub1.aBoolean2724 = false;
	    int i_12_ = class11_sub10_sub15.anInt2370;
	    if (arg0 == -1)
		i_12_ *= 1.5;
	    if ((arg0 ^ 0xffffffff) < -1)
		i_12_ *= 1.04;
	    int i_13_ = ((Class11_Sub10_Sub13_Sub1.anIntArray2721
			  [class11_sub10_sub15.anInt2403]) * i_12_
			 >> 294383696);
	    int i_14_ = (i_12_ * (Class11_Sub10_Sub13_Sub1.anIntArray2725
				  [class11_sub10_sub15.anInt2403])
			 >> -393110896);
	    class11_sub10_sub4_sub4.method294();
	    class11_sub10_sub4_sub4.method310
		(0, class11_sub10_sub15.anInt2358,
		 class11_sub10_sub15.anInt2386, class11_sub10_sub15.anInt2403,
		 class11_sub10_sub15.anInt2397,
		 i_14_ + (class11_sub10_sub4_sub4.anInt2046 / 2
			  + class11_sub10_sub15.anInt2417),
		 i_13_ + class11_sub10_sub15.anInt2417);
	    for (int i_15_ = 31; (i_15_ ^ 0xffffffff) <= -1; i_15_--) {
		for (i_13_ = 31; i_13_ >= 0; i_13_--) {
		    if (((class11_sub10_sub13_sub4_11_.anIntArray2776
			  [i_13_ * 32 + i_15_])
			 ^ 0xffffffff)
			== -1) {
			if ((i_15_ ^ 0xffffffff) < -1
			    && ((class11_sub10_sub13_sub4_11_.anIntArray2776
				 [i_13_ * 32 + i_15_ + -1])
				^ 0xffffffff) < -2)
			    class11_sub10_sub13_sub4_11_.anIntArray2776
				[32 * i_13_ + i_15_]
				= 1;
			else if ((i_13_ ^ 0xffffffff) < -1
				 && ((class11_sub10_sub13_sub4_11_
				      .anIntArray2776[i_13_ * 32 - 32 + i_15_])
				     > 1))
			    class11_sub10_sub13_sub4_11_.anIntArray2776
				[32 * i_13_ + i_15_]
				= 1;
			else if ((i_15_ ^ 0xffffffff) > -32
				 && (class11_sub10_sub13_sub4_11_
				     .anIntArray2776
				     [1 + i_15_ - -(32 * i_13_)]) > 1)
			    class11_sub10_sub13_sub4_11_.anIntArray2776
				[32 * i_13_ + i_15_]
				= 1;
			else if ((i_13_ ^ 0xffffffff) > -32
				 && ((class11_sub10_sub13_sub4_11_
				      .anIntArray2776
				      [i_15_ + (32 + 32 * i_13_)])
				     ^ 0xffffffff) < -2)
			    class11_sub10_sub13_sub4_11_.anIntArray2776
				[i_13_ * 32 + i_15_]
				= 1;
		    }
		}
	    }
	    if ((arg0 ^ 0xffffffff) < -1) {
		for (int i_16_ = 31; i_16_ >= 0; i_16_--) {
		    for (i_13_ = 31; (i_13_ ^ 0xffffffff) <= -1; i_13_--) {
			if ((class11_sub10_sub13_sub4_11_.anIntArray2776
			     [i_16_ + 32 * i_13_])
			    == 0) {
			    if ((i_16_ ^ 0xffffffff) < -1
				&& (class11_sub10_sub13_sub4_11_.anIntArray2776
				    [i_13_ * 32 + -1 + i_16_]) == 1)
				class11_sub10_sub13_sub4_11_.anIntArray2776
				    [i_16_ + 32 * i_13_]
				    = arg0;
			    else if (i_13_ > 0
				     && ((class11_sub10_sub13_sub4_11_
					  .anIntArray2776
					  [32 * (-1 + i_13_) + i_16_])
					 ^ 0xffffffff) == -2)
				class11_sub10_sub13_sub4_11_.anIntArray2776
				    [32 * i_13_ + i_16_]
				    = arg0;
			    else if ((i_16_ ^ 0xffffffff) > -32
				     && ((class11_sub10_sub13_sub4_11_
					  .anIntArray2776
					  [i_13_ * 32 + (1 + i_16_)])
					 ^ 0xffffffff) == -2)
				class11_sub10_sub13_sub4_11_.anIntArray2776
				    [i_13_ * 32 + i_16_]
				    = arg0;
			    else if (i_13_ < 31
				     && ((class11_sub10_sub13_sub4_11_
					  .anIntArray2776
					  [32 + (32 * i_13_ + i_16_)])
					 ^ 0xffffffff) == -2)
				class11_sub10_sub13_sub4_11_.anIntArray2776
				    [i_13_ * 32 + i_16_]
				    = arg0;
			}
		    }
		}
	    } else if (arg0 == 0) {
		for (int i_17_ = 31; i_17_ >= 0; i_17_--) {
		    for (i_13_ = 31; i_13_ >= 0; i_13_--) {
			if (((class11_sub10_sub13_sub4_11_.anIntArray2776
			      [32 * i_13_ + i_17_])
			     ^ 0xffffffff) == -1
			    && i_17_ > 0 && (i_13_ ^ 0xffffffff) < -1
			    && ((class11_sub10_sub13_sub4_11_.anIntArray2776
				 [-1 + (i_17_ + -32) + 32 * i_13_])
				^ 0xffffffff) < -1)
			    class11_sub10_sub13_sub4_11_.anIntArray2776
				[i_17_ + i_13_ * 32]
				= 3153952;
		    }
		}
	    }
	    if (class11_sub10_sub15.anInt2380 != -1) {
		int i_18_ = class11_sub10_sub13_sub4.anInt2779;
		int i_19_ = class11_sub10_sub13_sub4.anInt2777;
		class11_sub10_sub13_sub4.anInt2777 = 32;
		class11_sub10_sub13_sub4.anInt2779 = 32;
		class11_sub10_sub13_sub4.method456(0, 0);
		class11_sub10_sub13_sub4.anInt2777 = i_19_;
		class11_sub10_sub13_sub4.anInt2779 = i_18_;
	    }
	    if (arg0 == 0)
		Class11_Sub10_Sub12.aClass40_2291.method742
		    (arg3 + 27165, (long) arg2, class11_sub10_sub13_sub4_11_);
	    Class11_Sub10_Sub13.method396(is_5_, i, i_6_);
	    Class11_Sub10_Sub13.method405(i_7_, i_8_, i_9_, i_10_);
	    Class11_Sub10_Sub13_Sub1.method417(is);
	    Class11_Sub10_Sub13_Sub1.aBoolean2724 = true;
	    if (!class11_sub10_sub15.aBoolean2405)
		class11_sub10_sub13_sub4_11_.anInt2779 = 32;
	    else
		class11_sub10_sub13_sub4_11_.anInt2779 = 33;
	    class11_sub10_sub13_sub4_11_.anInt2777 = arg1;
	    return class11_sub10_sub13_sub4_11_;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("le.K(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + arg3 + ')'));
	}
    }
    
    public void method587(boolean arg0, int[] arg1, int arg2, int[] arg3,
			  byte arg4) {
	try {
	    anInt447++;
	    if (arg3 == null) {
		arg3 = new int[12];
		for (int i = 0; (i ^ 0xffffffff) > -8; i++) {
		    for (int i_20_ = 0; i_20_ < Class58.anInt1226; i_20_++) {
			Class11_Sub10_Sub7 class11_sub10_sub7
			    = Class51.method852(true, i_20_);
			if (class11_sub10_sub7 != null
			    && !class11_sub10_sub7.aBoolean2153
			    && class11_sub10_sub7.anInt2149 == i - -(!arg0 ? 0
								     : 7)) {
			    arg3[Class11_Sub8.anIntArray1621[i]] = 256 + i_20_;
			    break;
			}
		    }
		}
	    }
	    aBoolean459 = arg0;
	    anIntArray442 = arg1;
	    anInt453 = arg2;
	    if (arg4 != 86)
		anIntArray442 = null;
	    anIntArray448 = arg3;
	    method594(0);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("le.E(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + arg2 + ','
				     + (arg3 != null ? "{...}" : "null") + ','
				     + arg4 + ')'));
	}
    }
    
    public void method588(boolean arg0, boolean arg1) {
	try {
	    if (arg1 != false)
		aByteArrayArrayArray443 = null;
	    anInt446++;
	    if (aBoolean459 != arg0)
		method587(arg0, anIntArray442, -1, null, (byte) 86);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "le.A(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method589(int arg0) {
	try {
	    aClass31_441 = null;
	    aByteArrayArrayArray443 = null;
	    aClass31_457 = null;
	    int i = 99 % ((-47 - arg0) / 54);
	    aClass31_458 = null;
	    aClass31_454 = null;
	    aClass31_456 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "le.L(" + arg0 + ')');
	}
    }
    
    public void method590(boolean arg0, int arg1, int arg2) {
	try {
	    anInt455++;
	    if (arg1 != 1 || !aBoolean459) {
		int i = anIntArray448[Class11_Sub8.anIntArray1621[arg1]];
		if ((i ^ 0xffffffff) != -1) {
		    i -= 256;
		    Class11_Sub10_Sub7 class11_sub10_sub7;
		    do {
			if (!arg0) {
			    if (--i < 0)
				i = -1 + Class58.anInt1226;
			} else {
			    i++;
			    if (Class58.anInt1226 <= i)
				i = 0;
			}
			class11_sub10_sub7 = Class51.method852(true, i);
		    } while (class11_sub10_sub7 == null
			     || class11_sub10_sub7.aBoolean2153
			     || ((!aBoolean459 ? 0 : 7) + arg1
				 != class11_sub10_sub7.anInt2149));
		    anIntArray448[Class11_Sub8.anIntArray1621[arg1]] = 256 + i;
		    method594(0);
		    int i_21_ = 36 / ((arg2 - 53) / 51);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("le.C(" + arg0 + ',' + arg1 + ',' + arg2
				     + ')'));
	}
    }
    
    public Class11_Sub10_Sub4_Sub4 method591(int arg0, int arg1, byte arg2,
					     Class11_Sub10_Sub12 arg3,
					     Class11_Sub10_Sub12 arg4) {
	try {
	    anInt436++;
	    if (anInt453 != -1)
		return Class13.method512(arg2 ^ ~0x5b, anInt453)
			   .method461(arg3, arg4, arg2 ^ 0x65, arg0, arg1);
	    int[] is = anIntArray448;
	    if (arg2 != 101)
		aClass31_456 = null;
	    long l = aLong438;
	    if (arg3 != null && ((arg3.anInt2287 ^ 0xffffffff) <= -1
				 || (arg3.anInt2281 ^ 0xffffffff) <= -1)) {
		is = new int[12];
		for (int i = 0; (i ^ 0xffffffff) > -13; i++)
		    is[i] = anIntArray448[i];
		if ((arg3.anInt2287 ^ 0xffffffff) <= -1) {
		    l += (long) (-anIntArray448[5] + arg3.anInt2287
				 << -526654648);
		    is[5] = arg3.anInt2287;
		}
		if ((arg3.anInt2281 ^ 0xffffffff) <= -1) {
		    l += (long) (-anIntArray448[3] + arg3.anInt2281
				 << 1727445200);
		    is[3] = arg3.anInt2281;
		}
	    }
	    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
		= ((Class11_Sub10_Sub4_Sub4)
		   Class50.aClass40_990.method735(l, (byte) -123));
	    if (class11_sub10_sub4_sub4 == null) {
		boolean bool = false;
		for (int i = 0; i < 12; i++) {
		    int i_22_ = is[i];
		    if (i_22_ >= 256 && i_22_ < 512
			&& !Class51.method852(true, -256 + i_22_)
				.method354(-1000000000))
			bool = true;
		    if ((i_22_ ^ 0xffffffff) <= -513
			&& !Class60.method950(-83, i_22_ + -512)
				.method472((byte) 18, aBoolean459))
			bool = true;
		}
		if (bool) {
		    if (aLong434 != -1L)
			class11_sub10_sub4_sub4
			    = ((Class11_Sub10_Sub4_Sub4)
			       Class50.aClass40_990.method735(aLong434,
							      (byte) -121));
		    if (class11_sub10_sub4_sub4 == null)
			return null;
		}
		if (class11_sub10_sub4_sub4 == null) {
		    Class11_Sub10_Sub4_Sub4[] class11_sub10_sub4_sub4s
			= new Class11_Sub10_Sub4_Sub4[12];
		    int i = 0;
		    for (int i_23_ = 0; i_23_ < 12; i_23_++) {
			int i_24_ = is[i_23_];
			if ((i_24_ ^ 0xffffffff) <= -257
			    && (i_24_ ^ 0xffffffff) > -513) {
			    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4_25_
				= Class51.method852(true, -256 + i_24_)
				      .method351((byte) 73);
			    if (class11_sub10_sub4_sub4_25_ != null)
				class11_sub10_sub4_sub4s[i++]
				    = class11_sub10_sub4_sub4_25_;
			}
			if (i_24_ >= 512) {
			    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4_26_
				= Class60.method950(108, i_24_ + -512)
				      .method481((byte) 107, aBoolean459);
			    if (class11_sub10_sub4_sub4_26_ != null)
				class11_sub10_sub4_sub4s[i++]
				    = class11_sub10_sub4_sub4_26_;
			}
		    }
		    class11_sub10_sub4_sub4
			= new Class11_Sub10_Sub4_Sub4(class11_sub10_sub4_sub4s,
						      i);
		    for (int i_27_ = 0; i_27_ < 5; i_27_++) {
			if (anIntArray442[i_27_] != 0) {
			    class11_sub10_sub4_sub4.method299
				(Class62.anIntArrayArray1299[i_27_][0],
				 (Class62.anIntArrayArray1299[i_27_]
				  [anIntArray442[i_27_]]));
			    if ((i_27_ ^ 0xffffffff) == -2)
				class11_sub10_sub4_sub4.method299
				    (Class11_Sub4.anIntArray1494[0],
				     (Class11_Sub4.anIntArray1494
				      [anIntArray442[i_27_]]));
			}
		    }
		    class11_sub10_sub4_sub4.method319();
		    class11_sub10_sub4_sub4.method312(64, 850, -30, -50, -30,
						      true);
		    Class50.aClass40_990.method742(-121, l,
						   class11_sub10_sub4_sub4);
		    aLong434 = l;
		}
	    }
	    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4_28_;
	    if (arg3 != null || arg4 != null) {
		if (arg3 != null && arg4 != null)
		    class11_sub10_sub4_sub4_28_
			= arg3.method387(arg4, arg1, class11_sub10_sub4_sub4,
					 arg0, false);
		else if (arg3 == null)
		    class11_sub10_sub4_sub4_28_
			= arg4.method394((byte) 119, class11_sub10_sub4_sub4,
					 arg1);
		else
		    class11_sub10_sub4_sub4_28_
			= arg3.method394((byte) -84, class11_sub10_sub4_sub4,
					 arg0);
	    } else
		return class11_sub10_sub4_sub4;
	    return class11_sub10_sub4_sub4_28_;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("le.G(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + (arg3 != null ? "{...}" : "null")
				     + ',' + (arg4 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public int method592(byte arg0) {
	try {
	    if (arg0 > -119)
		method584(93);
	    anInt440++;
	    if (anInt453 != -1)
		return 305419896 - -Class13.method512(-77, anInt453).anInt2313;
	    return ((anIntArray448[11] << 408261989)
		    + ((anIntArray448[8] << -1843588118)
		       + (anIntArray442[4] << 595715668))
		    + (anIntArray442[0] << 2080362745)
		    - (-(anIntArray448[0] << -324292369) + -anIntArray448[1]));
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "le.J(" + arg0 + ')');
	}
    }
    
    public void method593(Buffer arg0, int arg1) {
	try {
	    anInt449++;
	    arg0.writeByte(aBoolean459 ? 1 : 0);
	    if (arg1 == -1) {
		for (int i = 0; (i ^ 0xffffffff) > -8; i++) {
		    int i_29_ = anIntArray448[Class11_Sub8.anIntArray1621[i]];
		    if (i_29_ != 0)
			arg0.writeByte(-256 + i_29_);
		    else
			arg0.writeByte(-1);
		}
		for (int i = 0; i < 5; i++)
		    arg0.writeByte(anIntArray442[i]);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "le.B(" + (arg0 != null ? "{...}"
					       : "null") + ',' + arg1 + ')');
	}
    }
    
    public void method594(int arg0) {
	anInt450++;
	long l = aLong438;
	int i = anIntArray448[5];
	int i_30_ = anIntArray448[9];
	anIntArray448[5] = i_30_;
	anIntArray448[9] = i;
	aLong438 = 0L;
	for (int i_31_ = 0; i_31_ < 12; i_31_++) {
	    aLong438 <<= 4;
	    if ((anIntArray448[i_31_] ^ 0xffffffff) <= -257)
		aLong438 += (long) (anIntArray448[i_31_] - 256);
	}
	if (anIntArray448[0] >= 256)
	    aLong438 += (long) (-256 + anIntArray448[0] >> -2067109756);
	if ((anIntArray448[1] ^ 0xffffffff) <= -257)
	    aLong438 += (long) (anIntArray448[1] - 256 >> 103581608);
	for (int i_32_ = arg0; (i_32_ ^ 0xffffffff) > -6; i_32_++) {
	    aLong438 <<= 3;
	    aLong438 += (long) anIntArray442[i_32_];
	}
	aLong438 <<= 1;
	Class24 class24 = this;
	class24.aLong438 = class24.aLong438 + (long) (aBoolean459 ? 1 : 0);
	anIntArray448[5] = i;
	anIntArray448[9] = i_30_;
	if ((l ^ 0xffffffffffffffffL) != -1L && l != aLong438)
	    Class50.aClass40_990.method737(arg0 + 1, l);
    }
    
    public void method595(int arg0, int arg1, boolean arg2) {
	try {
	    anInt435++;
	    if (arg0 == 0) {
		int i = anIntArray442[arg1];
		if (arg2) {
		    if ((++i ^ 0xffffffff)
			<= (Class62.anIntArrayArray1299[arg1].length
			    ^ 0xffffffff))
			i = 0;
		} else if (--i < 0)
		    i = -1 + Class62.anIntArrayArray1299[arg1].length;
		anIntArray442[arg1] = i;
		method594(0);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("le.D(" + arg0 + ',' + arg1 + ',' + arg2
				     + ')'));
	}
    }
    
    static {
	aClass31_441 = Class64.method992("@bla@ from: @red@", 255);
    }
}
