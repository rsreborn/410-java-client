/* Class11_Sub10_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.FontMetrics;

public class Class11_Sub10_Sub12 extends Class11_Sub10
{
    public static Class55_Sub1 aClass55_Sub1_2270;
    public static int anInt2271;
    public static int anInt2272;
    public static int anInt2273;
    public int anInt2274;
    public static int anInt2275;
    public int anInt2276;
    public static int anInt2277;
    public int anInt2278;
    public int anInt2279;
    public int[] anIntArray2280;
    public int anInt2281 = -1;
    public static int anInt2282;
    public int anInt2283 = -1;
    public boolean aBoolean2284;
    public int[] anIntArray2285;
    public static int anInt2286 = 2;
    public int anInt2287;
    public int anInt2288 = -1;
    public static Class37 aClass37_2289;
    public static int anInt2290;
    public static Class40 aClass40_2291;
    public static int[] anIntArray2292;
    public static Class31 aClass31_2293 = Class64.method992("mapback", 255);
    public static FontMetrics aFontMetrics2294;
    public int[] anIntArray2295;
    public int[] anIntArray2296;
    public static int anInt2297;
    public static int anInt2298;
    public static int anInt2299;
    public static Class31 aClass31_2300;
    
    public Class11_Sub10_Sub4_Sub4 method384(int arg0, int arg1,
					     Class11_Sub10_Sub4_Sub4 arg2) {
	try {
	    anInt2273++;
	    int i = anIntArray2280[arg0];
	    Class11_Sub10_Sub6 class11_sub10_sub6
		= Class11_Sub10_Sub16.method490(arg1 + -65624,
						i >> -1374468784);
	    i &= arg1;
	    if (class11_sub10_sub6 == null)
		return arg2.method301(true);
	    Class11_Sub10_Sub6 class11_sub10_sub6_0_ = null;
	    int i_1_ = 0;
	    if (anIntArray2295 != null && anIntArray2295.length > arg0) {
		i_1_ = anIntArray2295[arg0];
		class11_sub10_sub6_0_
		    = Class11_Sub10_Sub16.method490(-67, i_1_ >> -979963248);
		i_1_ &= 0xffff;
	    }
	    if (class11_sub10_sub6_0_ == null || i_1_ == 65535) {
		Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
		    = arg2.method301(!class11_sub10_sub6.method349(122, i));
		class11_sub10_sub4_sub4.method293(class11_sub10_sub6, i);
		return class11_sub10_sub4_sub4;
	    }
	    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
		= arg2.method301(!class11_sub10_sub6.method349(109, i)
				 & !class11_sub10_sub6_0_.method349(109,
								    i_1_));
	    class11_sub10_sub4_sub4.method293(class11_sub10_sub6, i);
	    class11_sub10_sub4_sub4.method293(class11_sub10_sub6_0_, i_1_);
	    return class11_sub10_sub4_sub4;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("f.K(" + arg0 + ',' + arg1 + ','
				     + (arg2 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public void method385(byte arg0, int arg1, Buffer arg2) {
	try {
	    if (arg0 != -52)
		method387(null, 47, null, -110, true);
	    if (arg1 == 1) {
		int i = arg2.method168(255);
		anIntArray2296 = new int[i];
		for (int i_2_ = 0; (i ^ 0xffffffff) < (i_2_ ^ 0xffffffff);
		     i_2_++)
		    anIntArray2296[i_2_]
			= arg2.method164();
		anIntArray2280 = new int[i];
		for (int i_3_ = 0; (i ^ 0xffffffff) < (i_3_ ^ 0xffffffff);
		     i_3_++)
		    anIntArray2280[i_3_] = arg2.method164();
		for (int i_4_ = 0; i_4_ < i; i_4_++)
		    anIntArray2280[i_4_] = ((arg2.method164() << 259320784)
					    - -anIntArray2280[i_4_]);
	    } else if ((arg1 ^ 0xffffffff) != -3) {
		if (arg1 == 3) {
		    int i = arg2.method168(255);
		    anIntArray2285 = new int[i - -1];
		    for (int i_5_ = 0; (i ^ 0xffffffff) < (i_5_ ^ 0xffffffff);
			 i_5_++)
			anIntArray2285[i_5_] = arg2.method168(arg0 + 307);
		    anIntArray2285[i] = 9999999;
		} else if ((arg1 ^ 0xffffffff) != -5) {
		    if (arg1 != 5) {
			if ((arg1 ^ 0xffffffff) == -7)
			    anInt2287 = arg2.method164();
			else if ((arg1 ^ 0xffffffff) == -8)
			    anInt2281 = arg2.method164();
			else if ((arg1 ^ 0xffffffff) != -9) {
			    if (arg1 != 9) {
				if (arg1 != 10) {
				    if ((arg1 ^ 0xffffffff) != -12) {
					if (arg1 == 12) {
					    int i = arg2.method168(255);
					    anIntArray2295 = new int[i];
					    for (int i_6_ = 0; i > i_6_;
						 i_6_++)
						anIntArray2295[i_6_]
						    = arg2.method164();
					    for (int i_7_ = 0; i > i_7_;
						 i_7_++)
						anIntArray2295[i_7_]
						    = (((arg2.method164
							 ())
							<< 1036739600)
						       - -(anIntArray2295
							   [i_7_]));
					}
				    } else
					anInt2278 = arg2.method168(255);
				} else
				    anInt2283 = arg2.method168(255);
			    } else
				anInt2279 = arg2.method168(255);
			} else
			    anInt2276 = arg2.method168(255);
		    } else
			anInt2274 = arg2.method168(arg0 + 307);
		} else
		    aBoolean2284 = true;
	    } else
		anInt2288 = arg2.method164();
	    anInt2271++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("f.A(" + arg0 + ',' + arg1 + ','
				     + (arg2 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public Class11_Sub10_Sub4_Sub4 method386(Class11_Sub10_Sub4_Sub4 arg0,
					     int arg1, byte arg2) {
	try {
	    anInt2277++;
	    arg1 = anIntArray2280[arg1];
	    Class11_Sub10_Sub6 class11_sub10_sub6
		= Class11_Sub10_Sub16.method490(arg2 + -154,
						arg1 >> 831579504);
	    arg1 &= 0xffff;
	    if (class11_sub10_sub6 == null)
		return arg0.method306(true);
	    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
		= arg0.method306(!class11_sub10_sub6.method349(arg2 ^ 0x19,
							       arg1));
	    class11_sub10_sub4_sub4.method293(class11_sub10_sub6, arg1);
	    if (arg2 != 98)
		method389(null, 38, (byte) -27, 115);
	    return class11_sub10_sub4_sub4;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("f.G(" + (arg0 != null ? "{...}" : "null")
				     + ',' + arg1 + ',' + arg2 + ')'));
	}
    }
    
    public Class11_Sub10_Sub4_Sub4 method387
	(Class11_Sub10_Sub12 arg0, int arg1, Class11_Sub10_Sub4_Sub4 arg2,
	 int arg3, boolean arg4) {
	try {
	    arg3 = anIntArray2280[arg3];
	    anInt2282++;
	    Class11_Sub10_Sub6 class11_sub10_sub6
		= Class11_Sub10_Sub16.method490(-66, arg3 >> -1438917904);
	    arg3 &= 0xffff;
	    if (class11_sub10_sub6 == null)
		return arg0.method394((byte) -9, arg2, arg1);
	    arg1 = arg0.anIntArray2280[arg1];
	    Class11_Sub10_Sub6 class11_sub10_sub6_8_
		= Class11_Sub10_Sub16.method490(88, arg1 >> -1070611760);
	    arg1 &= 0xffff;
	    if (class11_sub10_sub6_8_ == null) {
		Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
		    = arg2.method301(!class11_sub10_sub6.method349(121, arg3));
		class11_sub10_sub4_sub4.method293(class11_sub10_sub6, arg3);
		return class11_sub10_sub4_sub4;
	    }
	    if (arg4 != false)
		return null;
	    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
		= arg2.method301(!class11_sub10_sub6.method349(126, arg3)
				 & !class11_sub10_sub6_8_.method349(112,
								    arg1));
	    class11_sub10_sub4_sub4.method318(class11_sub10_sub6, arg3,
					      class11_sub10_sub6_8_, arg1,
					      anIntArray2285);
	    return class11_sub10_sub4_sub4;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("f.F(" + (arg0 != null ? "{...}" : "null")
				     + ',' + arg1 + ','
				     + (arg2 != null ? "{...}" : "null") + ','
				     + arg3 + ',' + arg4 + ')'));
	}
    }
    
    public static void method388(byte arg0) {
	try {
	    if (arg0 != 94)
		method393((byte) 110);
	    while (Class11_Sub10_Sub4_Sub2.inBuffer
		       .method202(true, Class11_Sub10_Sub14.anInt2348)
		   >= 26) {
		int i = Class11_Sub10_Sub4_Sub2.inBuffer
			    .method203(-126, 14);
		if (i == 16383)
		    break;
		if (Class12.aClass11_Sub10_Sub4_Sub2_Sub2Array235[i] == null)
		    Class12.aClass11_Sub10_Sub4_Sub2_Sub2Array235[i]
			= new Class11_Sub10_Sub4_Sub2_Sub2();
		Class11_Sub10_Sub4_Sub2_Sub2 class11_sub10_sub4_sub2_sub2
		    = Class12.aClass11_Sub10_Sub4_Sub2_Sub2Array235[i];
		Class11_Sub10_Sub5.anIntArray2063[Class32.anInt581++] = i;
		class11_sub10_sub4_sub2_sub2.anInt2505 = Class61.anInt1283;
		int i_9_ = Class11_Sub10_Sub4_Sub2.inBuffer
			       .method203(120, 5);
		if ((i_9_ ^ 0xffffffff) < -16)
		    i_9_ -= 32;
		int i_10_ = Class11_Sub10_Sub4_Sub2.inBuffer
				.method203(-74, 1);
		class11_sub10_sub4_sub2_sub2.aClass11_Sub10_Sub14_2828
		    = Class13.method512(arg0 ^ ~0x19,
					Class11_Sub10_Sub4_Sub2
					    .inBuffer
					    .method203(78, 13));
		int i_11_ = Class11_Sub10_Sub4_Sub2.inBuffer
				.method203(arg0 ^ 0x25, 5);
		int i_12_ = Class11_Sub10_Sub4_Sub2.inBuffer
				.method203(arg0 + -187, 1);
		if ((i_12_ ^ 0xffffffff) == -2)
		    Class54.anIntArray1066[Class11_Sub11.anInt1687++] = i;
		class11_sub10_sub4_sub2_sub2.anInt2525
		    = (class11_sub10_sub4_sub2_sub2.aClass11_Sub10_Sub14_2828
		       .anInt2320);
		class11_sub10_sub4_sub2_sub2.anInt2545
		    = (class11_sub10_sub4_sub2_sub2.aClass11_Sub10_Sub14_2828
		       .anInt2316);
		class11_sub10_sub4_sub2_sub2.anInt2566
		    = (class11_sub10_sub4_sub2_sub2.aClass11_Sub10_Sub14_2828
		       .anInt2312);
		class11_sub10_sub4_sub2_sub2.anInt2546
		    = (class11_sub10_sub4_sub2_sub2.aClass11_Sub10_Sub14_2828
		       .anInt2325);
		class11_sub10_sub4_sub2_sub2.anInt2518
		    = (class11_sub10_sub4_sub2_sub2.aClass11_Sub10_Sub14_2828
		       .anInt2323);
		class11_sub10_sub4_sub2_sub2.anInt2510
		    = (class11_sub10_sub4_sub2_sub2.aClass11_Sub10_Sub14_2828
		       .anInt2308);
		if ((i_11_ ^ 0xffffffff) < -16)
		    i_11_ -= 32;
		class11_sub10_sub4_sub2_sub2.anInt2499
		    = (class11_sub10_sub4_sub2_sub2.aClass11_Sub10_Sub14_2828
		       .anInt2334);
		class11_sub10_sub4_sub2_sub2.method271
		    (i_10_ == 1,
		     (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899.anIntArray2562
		      [0]) + i_11_,
		     (byte) 79,
		     i_9_ + (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
			     .anIntArray2500[0]));
	    }
	    Class11_Sub10_Sub4_Sub2.inBuffer
		.method199((byte) 43);
	    anInt2275++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "f.H(" + arg0 + ')');
	}
    }
    
    public Class11_Sub10_Sub4_Sub4 method389(Class11_Sub10_Sub4_Sub4 arg0,
					     int arg1, byte arg2, int arg3) {
	try {
	    arg1 = anIntArray2280[arg1];
	    Class11_Sub10_Sub6 class11_sub10_sub6
		= Class11_Sub10_Sub16.method490(-65, arg1 >> -1193920112);
	    arg1 &= 0xffff;
	    anInt2297++;
	    if (class11_sub10_sub6 == null)
		return arg0.method301(true);
	    arg3 &= 0x3;
	    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
		= arg0.method301(!class11_sub10_sub6.method349(arg2 + 37,
							       arg1));
	    if ((arg3 ^ 0xffffffff) != -2) {
		if (arg3 == 2)
		    class11_sub10_sub4_sub4.method308();
		else if (arg3 == 3)
		    class11_sub10_sub4_sub4.method307();
	    } else
		class11_sub10_sub4_sub4.method305();
	    class11_sub10_sub4_sub4.method293(class11_sub10_sub6, arg1);
	    if ((arg3 ^ 0xffffffff) == -2)
		class11_sub10_sub4_sub4.method307();
	    else if ((arg3 ^ 0xffffffff) != -3) {
		if ((arg3 ^ 0xffffffff) == -4)
		    class11_sub10_sub4_sub4.method305();
	    } else
		class11_sub10_sub4_sub4.method308();
	    if (arg2 != 81)
		aClass31_2293 = null;
	    return class11_sub10_sub4_sub4;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("f.B(" + (arg0 != null ? "{...}" : "null")
				     + ',' + arg1 + ',' + arg2 + ',' + arg3
				     + ')'));
	}
    }
    
    public void method390(boolean arg0) {
	if ((anInt2279 ^ 0xffffffff) == 0) {
	    if (anIntArray2285 == null)
		anInt2279 = 0;
	    else
		anInt2279 = 2;
	}
	anInt2272++;
	if (anInt2283 == -1) {
	    if (anIntArray2285 != null)
		anInt2283 = 2;
	    else
		anInt2283 = 0;
	}
	if (arg0 != false)
	    anIntArray2285 = null;
    }
    
    public void method391(int arg0, Buffer arg1) {
	for (;;) {
	    int i = arg1.method168(255);
	    if ((i ^ 0xffffffff) == -1)
		break;
	    method385((byte) -52, i, arg1);
	}
	anInt2299++;
	if (arg0 != -1)
	    method387(null, -30, null, -91, false);
    }
    
    public static void method392(int arg0) {
	try {
	    Class11_Sub10_Sub6.aClass39_2137.method730(7971);
	    for (int i = 0; i < 32; i++)
		Class48.aLongArray910[i] = 0L;
	    for (int i = 0; i < 32; i++)
		Class11_Sub4.aLongArray1482[i] = 0L;
	    Class11_Sub10_Sub10.anInt2228 = 0;
	    if (arg0 != 65535)
		aClass40_2291 = null;
	    anInt2290++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "f.C(" + arg0 + ')');
	}
    }
    
    public static void method393(byte arg0) {
	try {
	    aClass37_2289 = null;
	    aClass31_2300 = null;
	    aClass40_2291 = null;
	    aFontMetrics2294 = null;
	    aClass55_Sub1_2270 = null;
	    if (arg0 != 68)
		aFontMetrics2294 = null;
	    aClass31_2293 = null;
	    anIntArray2292 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "f.I(" + arg0 + ')');
	}
    }
    
    public Class11_Sub10_Sub4_Sub4 method394
	(byte arg0, Class11_Sub10_Sub4_Sub4 arg1, int arg2) {
	try {
	    anInt2298++;
	    int i = -31 % ((arg0 - 45) / 52);
	    arg2 = anIntArray2280[arg2];
	    Class11_Sub10_Sub6 class11_sub10_sub6
		= Class11_Sub10_Sub16.method490(-77, arg2 >> 682355664);
	    arg2 &= 0xffff;
	    if (class11_sub10_sub6 == null)
		return arg1.method301(true);
	    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
		= arg1.method301(!class11_sub10_sub6.method349(123, arg2));
	    class11_sub10_sub4_sub4.method293(class11_sub10_sub6, arg2);
	    return class11_sub10_sub4_sub4;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("f.J(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + arg2 + ')'));
	}
    }
    
    public Class11_Sub10_Sub12() {
	anInt2279 = -1;
	anInt2274 = 5;
	anInt2278 = 2;
	anInt2276 = 99;
	aBoolean2284 = false;
	anInt2287 = -1;
    }
    
    static {
	aClass40_2291 = new Class40(100);
	aClass31_2300 = Class64.method992("Please reload this page)3", 255);
    }
}
