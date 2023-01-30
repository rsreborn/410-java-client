/* Class39_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class39_Sub1 extends Class39
{
    public static int anInt1810;
    public static Class40 aClass40_1811 = new Class40(64);
    public int anInt1812;
    public long aLong1813;
    public static int anInt1814;
    public static int anInt1815;
    public static int anInt1816;
    public long[] aLongArray1817 = new long[10];
    public static Class31 aClass31_1818 = Class64.method992("huffman", 255);
    public int anInt1819;
    public int anInt1820;
    public static int anInt1821;
    public static Class36 aClass36_1822;
    public static int anInt1823;
    public int anInt1824;
    public static Class31 aClass31_1825 = Class64.method992("flash1:", 255);
    public static int anInt1826;
    public static int[] anIntArray1827;
    public static int anInt1828;
    public static Class31 aClass31_1829 = Class64.method992("@or3@", 255);
    public static Class31 aClass31_1830;
    public static int anInt1831;
    public static int anInt1832 = 0;
    public static int[] anIntArray1833;
    public static int[] anIntArray1834;
    public static int anInt1835;
    public static Class31 aClass31_1836;
    public static Class37 aClass37_1837;
    public static int anInt1838;
    public static boolean aBoolean1839;
    
    public int method724(byte arg0, int arg1, int arg2) {
	try {
	    anInt1835++;
	    int i = anInt1824;
	    anInt1824 = 300;
	    int i_0_ = anInt1819;
	    anInt1819 = 1;
	    aLong1813 = System.currentTimeMillis();
	    if (aLongArray1817[anInt1820] != 0L) {
		if ((aLong1813 ^ 0xffffffffffffffffL)
		    < (aLongArray1817[anInt1820] ^ 0xffffffffffffffffL))
		    anInt1824
			= (int) ((long) (arg1 * 2560)
				 / (-aLongArray1817[anInt1820] + aLong1813));
	    } else {
		anInt1819 = i_0_;
		anInt1824 = i;
	    }
	    if (anInt1824 < 25)
		anInt1824 = 25;
	    if ((anInt1824 ^ 0xffffffff) < -257) {
		anInt1824 = 256;
		anInt1819 = (int) ((long) arg1
				   + -((-aLongArray1817[anInt1820] + aLong1813)
				       / 10L));
	    }
	    if (anInt1819 > arg1)
		anInt1819 = arg1;
	    if (arg0 < 59)
		method725(true);
	    aLongArray1817[anInt1820] = aLong1813;
	    anInt1820 = (1 + anInt1820) % 10;
	    if ((anInt1819 ^ 0xffffffff) < -2) {
		for (int i_1_ = 0; i_1_ < 10; i_1_++) {
		    if ((aLongArray1817[i_1_] ^ 0xffffffffffffffffL) != -1L)
			aLongArray1817[i_1_]
			    = aLongArray1817[i_1_] - -(long) anInt1819;
		}
	    }
	    if ((arg2 ^ 0xffffffff) < (anInt1819 ^ 0xffffffff))
		anInt1819 = arg2;
	    Class53.method864(true, (long) anInt1819);
	    int i_2_ = 0;
	    while (anInt1812 < 256) {
		anInt1812 += anInt1824;
		i_2_++;
	    }
	    anInt1812 &= 0xff;
	    return i_2_;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("e.A(" + arg0 + ',' + arg1 + ',' + arg2
				     + ')'));
	}
    }
    
    public static void method731(byte arg0) {
	try {
	    aClass31_1829 = null;
	    aClass40_1811 = null;
	    aClass36_1822 = null;
	    aClass31_1836 = null;
	    aClass31_1818 = null;
	    anIntArray1834 = null;
	    if (arg0 != -6)
		method732(-38, 58, true);
	    aClass31_1830 = null;
	    anIntArray1833 = null;
	    anIntArray1827 = null;
	    aClass37_1837 = null;
	    aClass31_1825 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "e.J(" + arg0 + ')');
	}
    }
    
    public static int method732(int arg0, int arg1, boolean arg2) {
	try {
	    if (arg2 != false)
		method731((byte) -71);
	    int i = (Class55_Sub1.method912(-1 + arg0, arg1 - 1, 1376312589)
		     + (Class55_Sub1.method912(arg0 + 1, arg1 + -1, 1376312589)
			- (-Class55_Sub1.method912(-1 + arg0, arg1 - -1,
						   1376312589)
			   - Class55_Sub1.method912(1 + arg0, arg1 - -1,
						    1376312589))));
	    anInt1831++;
	    int i_3_
		= (Class55_Sub1.method912(-1 + arg0, arg1, 1376312589)
		   - -Class55_Sub1.method912(1 + arg0, arg1, 1376312589)
		   + (Class55_Sub1.method912(arg0, -1 + arg1, 1376312589)
		      + Class55_Sub1.method912(arg0, 1 + arg1, 1376312589)));
	    int i_4_ = Class55_Sub1.method912(arg0, arg1, 1376312589);
	    return i / 16 - -(i_3_ / 8) - -(i_4_ / 4);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("e.I(" + arg0 + ',' + arg1 + ',' + arg2
				     + ')'));
	}
    }
    
    public void method730(int arg0) {
	anInt1819 = 1;
	anInt1814++;
	anInt1824 = 256;
	anInt1812 = 0;
	aLong1813 = System.currentTimeMillis();
	for (int i = 0; i < 10; i++)
	    aLongArray1817[i] = aLong1813;
	if (arg0 != 7971)
	    anInt1838 = 0;
    }
    
    public void method725(boolean arg0) {
	try {
	    anInt1828++;
	    if (arg0 != false)
		method733(12);
	    for (int i = 0; i < 10; i++)
		aLongArray1817[i] = 0L;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "e.C(" + arg0 + ')');
	}
    }
    
    public Class39_Sub1() {
	try {
	    method730(7971);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "e.<init>(" + ')');
	}
    }
    
    public static void method733(int arg0) {
	try {
	    int i = -1;
	    if (arg0 != 127)
		anInt1832 = 88;
	    anInt1810++;
	    if (Class39.anInt721 == 0
		&& (Class11_Sub10_Sub11.anInt2269 ^ 0xffffffff) == -1) {
		Class11_Sub10_Sub8.anInt2183++;
		Class7.method80(Class11_Sub10_Sub14.aClass31_2350, 24,
				Class11_Sub10_Sub7.anInt2161,
				Class11_Sub6.anInt1590, false, 0);
	    }
	    int i_5_ = 0;
	    for (/**/; Class11_Sub10_Sub4_Sub4.anInt2631 > i_5_; i_5_++) {
		int i_6_ = Class11_Sub10_Sub4_Sub4.anIntArray2634[i_5_];
		int i_7_ = i_6_ & 0x7f;
		int i_8_ = i_6_ >> -1728137241 & 0x7f;
		int i_9_ = 0x7fff & i_6_ >> -156781714;
		int i_10_ = (i_6_ & 0x7d4a5303) >> -1519926403;
		if ((i ^ 0xffffffff) != (i_6_ ^ 0xffffffff)) {
		    i = i_6_;
		    if (i_10_ == 2
			&& (Class52.aClass49_1024.method832(Class1.anInt82,
							    i_7_, i_8_, i_6_)
			    >= 0)) {
			Class11_Sub10_Sub2 class11_sub10_sub2
			    = Class51.method853((byte) -111, i_9_);
			if (class11_sub10_sub2.anIntArray1980 != null)
			    class11_sub10_sub2
				= class11_sub10_sub2.method236(false);
			if (class11_sub10_sub2 == null)
			    continue;
			if ((Class39.anInt721 ^ 0xffffffff) != -2) {
			    if ((Class11_Sub10_Sub11.anInt2269 ^ 0xffffffff)
				!= -2) {
				Class3.anInt116++;
				Class31[] class31s
				    = class11_sub10_sub2.aClass31Array2008;
				if (Class13.aBoolean269)
				    class31s
					= Class11_Sub10_Sub6
					      .method350((byte) 112, class31s);
				if (class31s != null) {
				    for (int i_11_ = 4;
					 (i_11_ ^ 0xffffffff) <= -1; i_11_--) {
					if (class31s[i_11_] != null) {
					    Class47.anInt873++;
					    int i_12_ = 0;
					    if ((i_11_ ^ 0xffffffff) == -1)
						i_12_ = 34;
					    if (i_11_ == 1)
						i_12_ = 41;
					    if ((i_11_ ^ 0xffffffff) == -3)
						i_12_ = 10;
					    if (i_11_ == 3)
						i_12_ = 5;
					    if (i_11_ == 4)
						i_12_ = 1004;
					    Class7.method80
						((Class40.method744
						  (0, (new Class31[]
						       { class31s[i_11_],
							 Class48.aClass31_884,
							 (class11_sub10_sub2
							  .aClass31_1958) }))),
						 i_12_, i_8_, i_7_, false,
						 i_6_);
					}
				    }
				}
				Class7.method80
				    (Class40.method744(0,
						       (new Class31[]
							{ (Class11_Sub10_Sub15
							   .aClass31_2375),
							  (class11_sub10_sub2
							   .aClass31_1958) })),
				     1005, i_8_, i_7_, false,
				     (class11_sub10_sub2.anInt1963
				      << 1358534574));
			    } else if ((0x4 & Class11_Sub10_Sub4_Sub5.anInt2676
					^ 0xffffffff)
				       == -5) {
				Class3.anInt125++;
				Class7.method80
				    (Class40.method744(0,
						       (new Class31[]
							{ Class44.aClass31_799,
							  Class48.aClass31_884,
							  (class11_sub10_sub2
							   .aClass31_1958) })),
				     6, i_8_, i_7_, false, i_6_);
			    }
			} else {
			    Applet_Sub1.anInt13++;
			    Class7.method80
				(Class40.method744(arg0 ^ 0x7f,
						   (new Class31[]
						    { Class8.aClass31_168,
						      (Class11_Sub10_Sub6
						       .aClass31_2146),
						      (Class11_Sub10_Sub4_Sub2
						       .aClass31_2528),
						      (class11_sub10_sub2
						       .aClass31_1958) })),
				 9, i_8_, i_7_, false, i_6_);
			}
		    }
		    if ((i_10_ ^ 0xffffffff) == -2) {
			Class11_Sub10_Sub4_Sub2_Sub2 class11_sub10_sub4_sub2_sub2
			    = (Class12.aClass11_Sub10_Sub4_Sub2_Sub2Array235
			       [i_9_]);
			if ((class11_sub10_sub4_sub2_sub2
			     .aClass11_Sub10_Sub14_2828.anInt2308) == 1
			    && (class11_sub10_sub4_sub2_sub2.anInt2506 & 0x7f
				^ 0xffffffff) == -65
			    && (class11_sub10_sub4_sub2_sub2.anInt2517 & 0x7f
				^ 0xffffffff) == -65) {
			    for (int i_13_ = 0; Class32.anInt581 > i_13_;
				 i_13_++) {
				Class11_Sub10_Sub4_Sub2_Sub2 class11_sub10_sub4_sub2_sub2_14_
				    = (Class12
				       .aClass11_Sub10_Sub4_Sub2_Sub2Array235
				       [(Class11_Sub10_Sub5.anIntArray2063
					 [i_13_])]);
				if (class11_sub10_sub4_sub2_sub2_14_ != null
				    && (class11_sub10_sub4_sub2_sub2_14_
					!= class11_sub10_sub4_sub2_sub2)
				    && ((class11_sub10_sub4_sub2_sub2_14_
					 .aClass11_Sub10_Sub14_2828.anInt2308)
					^ 0xffffffff) == -2
				    && ((class11_sub10_sub4_sub2_sub2_14_
					 .anInt2506)
					== (class11_sub10_sub4_sub2_sub2
					    .anInt2506))
				    && ((class11_sub10_sub4_sub2_sub2_14_
					 .anInt2517)
					== (class11_sub10_sub4_sub2_sub2
					    .anInt2517)))
				    Class15_Sub2.method556
					((Class11_Sub10_Sub5.anIntArray2063
					  [i_13_]),
					 i_7_,
					 (class11_sub10_sub4_sub2_sub2_14_
					  .aClass11_Sub10_Sub14_2828),
					 112, i_8_);
			    }
			    for (int i_15_ = 0;
				 ((Class48.anInt885 ^ 0xffffffff)
				  < (i_15_ ^ 0xffffffff));
				 i_15_++) {
				Class11_Sub10_Sub4_Sub2_Sub1 class11_sub10_sub4_sub2_sub1
				    = (Class11_Sub10_Sub7
				       .aClass11_Sub10_Sub4_Sub2_Sub1Array2160
				       [Class32.anIntArray597[i_15_]]);
				if (class11_sub10_sub4_sub2_sub1 != null
				    && (class11_sub10_sub4_sub2_sub1.anInt2506
					== (class11_sub10_sub4_sub2_sub2
					    .anInt2506))
				    && ((class11_sub10_sub4_sub2_sub1.anInt2517
					 ^ 0xffffffff)
					== ((class11_sub10_sub4_sub2_sub2
					     .anInt2517)
					    ^ 0xffffffff)))
				    Class11_Sub10_Sub8.method361
					(i_8_, class11_sub10_sub4_sub2_sub1,
					 i_7_, 1000,
					 Class32.anIntArray597[i_15_]);
			    }
			}
			Class15_Sub2.method556(i_9_, i_7_,
					       (class11_sub10_sub4_sub2_sub2
						.aClass11_Sub10_Sub14_2828),
					       81, i_8_);
		    }
		    if (i_10_ == 0) {
			Class11_Sub10_Sub4_Sub2_Sub1 class11_sub10_sub4_sub2_sub1
			    = (Class11_Sub10_Sub7
			       .aClass11_Sub10_Sub4_Sub2_Sub1Array2160[i_9_]);
			if ((class11_sub10_sub4_sub2_sub1.anInt2506 & 0x7f
			     ^ 0xffffffff) == -65
			    && ((class11_sub10_sub4_sub2_sub1.anInt2517 & 0x7f)
				== 64)) {
			    for (int i_16_ = 0; Class32.anInt581 > i_16_;
				 i_16_++) {
				Class11_Sub10_Sub4_Sub2_Sub2 class11_sub10_sub4_sub2_sub2
				    = (Class12
				       .aClass11_Sub10_Sub4_Sub2_Sub2Array235
				       [(Class11_Sub10_Sub5.anIntArray2063
					 [i_16_])]);
				if (class11_sub10_sub4_sub2_sub2 != null
				    && ((class11_sub10_sub4_sub2_sub2
					 .aClass11_Sub10_Sub14_2828.anInt2308)
					^ 0xffffffff) == -2
				    && ((class11_sub10_sub4_sub2_sub2.anInt2506
					 ^ 0xffffffff)
					== ((class11_sub10_sub4_sub2_sub1
					     .anInt2506)
					    ^ 0xffffffff))
				    && ((class11_sub10_sub4_sub2_sub1.anInt2517
					 ^ 0xffffffff)
					== ((class11_sub10_sub4_sub2_sub2
					     .anInt2517)
					    ^ 0xffffffff)))
				    Class15_Sub2.method556
					((Class11_Sub10_Sub5.anIntArray2063
					  [i_16_]),
					 i_7_,
					 (class11_sub10_sub4_sub2_sub2
					  .aClass11_Sub10_Sub14_2828),
					 85, i_8_);
			    }
			    for (int i_17_ = 0;
				 ((i_17_ ^ 0xffffffff)
				  > (Class48.anInt885 ^ 0xffffffff));
				 i_17_++) {
				Class11_Sub10_Sub4_Sub2_Sub1 class11_sub10_sub4_sub2_sub1_18_
				    = (Class11_Sub10_Sub7
				       .aClass11_Sub10_Sub4_Sub2_Sub1Array2160
				       [Class32.anIntArray597[i_17_]]);
				if (class11_sub10_sub4_sub2_sub1_18_ != null
				    && (class11_sub10_sub4_sub2_sub1_18_
					!= class11_sub10_sub4_sub2_sub1)
				    && (class11_sub10_sub4_sub2_sub1.anInt2506
					== (class11_sub10_sub4_sub2_sub1_18_
					    .anInt2506))
				    && (((class11_sub10_sub4_sub2_sub1_18_
					  .anInt2517)
					 ^ 0xffffffff)
					== ((class11_sub10_sub4_sub2_sub1
					     .anInt2517)
					    ^ 0xffffffff)))
				    Class11_Sub10_Sub8.method361
					(i_8_,
					 class11_sub10_sub4_sub2_sub1_18_,
					 i_7_, 1000,
					 Class32.anIntArray597[i_17_]);
			    }
			}
			Class11_Sub10_Sub8.method361
			    (i_8_, class11_sub10_sub4_sub2_sub1, i_7_, 1000,
			     i_9_);
		    }
		    if ((i_10_ ^ 0xffffffff) == -4) {
			Class36 class36 = (Class51.aClass36ArrayArrayArray1007
					   [Class1.anInt82][i_7_][i_8_]);
			if (class36 != null) {
			    for (Class11_Sub10_Sub4_Sub3 class11_sub10_sub4_sub3
				     = ((Class11_Sub10_Sub4_Sub3)
					class36.method696((byte) -68));
				 class11_sub10_sub4_sub3 != null;
				 class11_sub10_sub4_sub3
				     = ((Class11_Sub10_Sub4_Sub3)
					class36.method695(arg0 ^ ~0x15))) {
				Class11_Sub10_Sub15 class11_sub10_sub15
				    = (Class60.method950
				       (arg0 ^ ~0x1e,
					class11_sub10_sub4_sub3.anInt2578));
				if ((Class39.anInt721 ^ 0xffffffff) == -2) {
				    Class7.method80
					((Class40.method744
					  (0,
					   (new Class31[]
					    { Class8.aClass31_168,
					      Class11_Sub10_Sub6.aClass31_2146,
					      (Class11_Sub10_Sub4_Sub5
					       .aClass31_2675),
					      (class11_sub10_sub15
					       .aClass31_2406) }))),
					 11, i_8_, i_7_, false,
					 class11_sub10_sub4_sub3.anInt2578);
				    Class29.anInt546++;
				} else if (Class11_Sub10_Sub11.anInt2269
					   != 1) {
				    Class62.anInt1291++;
				    Class31[] class31s = (class11_sub10_sub15
							  .aClass31Array2389);
				    if (Class13.aBoolean269)
					class31s
					    = (Class11_Sub10_Sub6.method350
					       ((byte) 112, class31s));
				    for (int i_19_ = 4;
					 (i_19_ ^ 0xffffffff) <= -1; i_19_--) {
					if (class31s == null
					    || class31s[i_19_] == null) {
					    if ((i_19_ ^ 0xffffffff) == -3) {
						Class7.method80
						    ((Class40.method744
						      (0,
						       (new Class31[]
							{ (Class15_Sub2
							   .aClass31_1772),
							  (class11_sub10_sub15
							   .aClass31_2406) }))),
						     16, i_8_, i_7_, false,
						     (class11_sub10_sub4_sub3
						      .anInt2578));
						Class43.anInt774++;
					    }
					} else {
					    anInt1816++;
					    int i_20_ = 0;
					    if (i_19_ == 0)
						i_20_ = 50;
					    if (i_19_ == 1)
						i_20_ = 13;
					    if ((i_19_ ^ 0xffffffff) == -3)
						i_20_ = 16;
					    if (i_19_ == 3)
						i_20_ = 14;
					    if ((i_19_ ^ 0xffffffff) == -5)
						i_20_ = 3;
					    Class7.method80
						((Class40.method744
						  (0, (new Class31[]
						       { class31s[i_19_],
							 Class47.aClass31_875,
							 (class11_sub10_sub15
							  .aClass31_2406) }))),
						 i_20_, i_8_, i_7_, false,
						 (class11_sub10_sub4_sub3
						  .anInt2578));
					}
				    }
				    Class7.method80((Class40.method744
						     (0,
						      (new Class31[]
						       { (Class11_Sub10_Sub9
							  .aClass31_2207),
							 (class11_sub10_sub15
							  .aClass31_2406) }))),
						    1001, i_8_, i_7_, false,
						    (class11_sub10_sub4_sub3
						     .anInt2578));
				} else if ((0x1 & (Class11_Sub10_Sub4_Sub5
						   .anInt2676))
					   == 1) {
				    Class7.method80((Class40.method744
						     (0,
						      (new Class31[]
						       { Class44.aClass31_799,
							 Class47.aClass31_875,
							 (class11_sub10_sub15
							  .aClass31_2406) }))),
						    48, i_8_, i_7_, false,
						    (class11_sub10_sub4_sub3
						     .anInt2578));
				    Class62.anInt1285++;
				}
			    }
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "e.H(" + arg0 + ')');
	}
    }
    
    public static void method734(int arg0) {
	try {
	    anInt1821++;
	    if (Class48.anInt896 == 0) {
		Class4.aClass31Array141[0] = Class20.aClass31_387;
		Class11_Sub10_Sub4_Sub2_Sub1.anIntArray2794[0] = 1003;
		Class11_Sub7.anInt1597 = 1;
		if (Class46.anInt844 != -1) {
		    Class46.anInt856 = -1;
		    Class14.anInt297 = -1;
		    Class39.method726(Class11_Sub10_Sub7.anInt2161, 0,
				      (byte) -102, Class46.anInt844, 765, 0, 0,
				      Class11_Sub6.anInt1590, 503, -1, 0);
		    Class11_Sub10_Sub16.anInt2430 = Class46.anInt856;
		    Class10.anInt206 = Class14.anInt297;
		} else {
		    Class11_Sub10_Sub4_Sub5.method326(true);
		    Class14.anInt297 = -1;
		    Class46.anInt856 = -1;
		    if ((Class11_Sub6.anInt1590 ^ 0xffffffff) < -5
			&& (Class11_Sub10_Sub7.anInt2161 ^ 0xffffffff) < -5
			&& (Class11_Sub6.anInt1590 ^ 0xffffffff) > -517
			&& Class11_Sub10_Sub7.anInt2161 < 338) {
			if ((Buffer.anInt1564 ^ 0xffffffff) == 0)
			    method733(127);
			else
			    Class39.method726(Class11_Sub10_Sub7.anInt2161, 4,
					      (byte) -118,
					      Buffer.anInt1564, 516, 0,
					      0, Class11_Sub6.anInt1590, 338,
					      -1, 4);
		    }
		    Class10.anInt206 = Class14.anInt297;
		    Class11_Sub10_Sub16.anInt2430 = Class46.anInt856;
		    if (arg0 < -73) {
			Class46.anInt856 = -1;
			Class14.anInt297 = -1;
			if ((Class11_Sub6.anInt1590 ^ 0xffffffff) < -554
			    && Class11_Sub10_Sub7.anInt2161 > 205
			    && Class11_Sub6.anInt1590 < 743
			    && Class11_Sub10_Sub7.anInt2161 < 466) {
			    if (Class28.anInt512 != -1)
				Class39.method726(Class11_Sub10_Sub7.anInt2161,
						  553, (byte) -109,
						  Class28.anInt512, 743, 0, 1,
						  Class11_Sub6.anInt1590, 466,
						  -1, 205);
			    else if ((Class12.anIntArray237[NotActuallyBuffer.anInt483]
				      ^ 0xffffffff)
				     != 0)
				Class39.method726(Class11_Sub10_Sub7.anInt2161,
						  553, (byte) -99,
						  (Class12.anIntArray237
						   [NotActuallyBuffer.anInt483]),
						  743, 0, 1,
						  Class11_Sub6.anInt1590, 466,
						  -1, 205);
			}
			if ((Class11_Sub10_Sub4_Sub3.anInt2590 ^ 0xffffffff)
			    != (Class14.anInt297 ^ 0xffffffff)) {
			    Class11_Sub10_Sub14.aBoolean2352 = true;
			    Class11_Sub10_Sub4_Sub3.anInt2590
				= Class14.anInt297;
			}
			Class14.anInt297 = -1;
			if ((Class11_Sub10_Sub4_Sub2_Sub2.anInt2836
			     ^ 0xffffffff)
			    != (Class46.anInt856 ^ 0xffffffff)) {
			    Class11_Sub10_Sub14.aBoolean2352 = true;
			    Class11_Sub10_Sub4_Sub2_Sub2.anInt2836
				= Class46.anInt856;
			}
			boolean bool = false;
			Class46.anInt856 = -1;
			if ((Class11_Sub6.anInt1590 ^ 0xffffffff) < -18
			    && Class11_Sub10_Sub7.anInt2161 > 357
			    && (Class11_Sub6.anInt1590 ^ 0xffffffff) > -497
			    && Class11_Sub10_Sub7.anInt2161 < 453) {
			    if ((Class47.anInt881 ^ 0xffffffff) != 0)
				Class39.method726(Class11_Sub10_Sub7.anInt2161,
						  17, (byte) -102,
						  Class47.anInt881, 496, 0, 2,
						  Class11_Sub6.anInt1590, 453,
						  -1, 357);
			    else if ((Class14.anInt294 ^ 0xffffffff) == 0) {
				if ((Class11_Sub10_Sub7.anInt2161
				     ^ 0xffffffff) > -435
				    && Class11_Sub6.anInt1590 < 426)
				    Class57.method934
					(Class11_Sub10_Sub7.anInt2161 - 357,
					 -115, Class11_Sub6.anInt1590 - 17);
			    } else
				Class39.method726(Class11_Sub10_Sub7.anInt2161,
						  17, (byte) -88,
						  Class14.anInt294, 496, 0, 3,
						  Class11_Sub6.anInt1590, 453,
						  -1, 357);
			}
			if ((Class47.anInt881 != -1 || Class14.anInt294 != -1)
			    && (Class14.anInt297
				!= Class11_Sub10_Sub8.anInt2178)) {
			    Class32.aBoolean575 = true;
			    Class11_Sub10_Sub8.anInt2178 = Class14.anInt297;
			}
			if ((Class47.anInt881 != -1
			     || (Class14.anInt294 ^ 0xffffffff) != 0)
			    && ((Class22.anInt404 ^ 0xffffffff)
				!= (Class46.anInt856 ^ 0xffffffff))) {
			    Class22.anInt404 = Class46.anInt856;
			    Class32.aBoolean575 = true;
			}
			while (!bool) {
			    bool = true;
			    for (int i = 0; ((i ^ 0xffffffff)
					     > (-1 + Class11_Sub7.anInt1597
						^ 0xffffffff)); i++) {
				if ((Class11_Sub10_Sub4_Sub2_Sub1
				     .anIntArray2794[i]) < 1000
				    && ((Class11_Sub10_Sub4_Sub2_Sub1
					 .anIntArray2794[i - -1])
					^ 0xffffffff) < -1001) {
				    Class31 class31
					= Class4.aClass31Array141[i];
				    bool = false;
				    Class4.aClass31Array141[i]
					= Class4.aClass31Array141[i + 1];
				    Class4.aClass31Array141[1 + i] = class31;
				    int i_21_ = (Class11_Sub10_Sub4_Sub2_Sub1
						 .anIntArray2794[i]);
				    Class11_Sub10_Sub4_Sub2_Sub1
					.anIntArray2794[i]
					= (Class11_Sub10_Sub4_Sub2_Sub1
					   .anIntArray2794[i + 1]);
				    Class11_Sub10_Sub4_Sub2_Sub1
					.anIntArray2794[i - -1]
					= i_21_;
				    i_21_ = Class11_Sub8.anIntArray1627[i];
				    Class11_Sub8.anIntArray1627[i]
					= Class11_Sub8.anIntArray1627[1 + i];
				    Class11_Sub8.anIntArray1627[1 + i] = i_21_;
				    i_21_ = Class13.anIntArray267[i];
				    Class13.anIntArray267[i]
					= Class13.anIntArray267[1 + i];
				    Class13.anIntArray267[i - -1] = i_21_;
				    i_21_ = Class48.anIntArray914[i];
				    Class48.anIntArray914[i]
					= Class48.anIntArray914[1 + i];
				    Class48.anIntArray914[1 + i] = i_21_;
				}
			    }
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "e.K(" + arg0 + ')');
	}
    }
    
    static {
	anInt1823 = 0;
	aClass31_1830 = Class64.method992("@or1@", 255);
	aClass31_1836 = Class64.method992(":0", 255);
	anIntArray1834 = new int[5];
	aClass36_1822 = new Class36();
	anInt1838 = -1;
	aBoolean1839 = false;
    }
}
