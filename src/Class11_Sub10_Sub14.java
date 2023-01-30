/* Class11_Sub10_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11_Sub10_Sub14 extends Class11_Sub10
{
    public int anInt2308;
    public static int[] anIntArray2309 = new int[256];
    public int anInt2310;
    public static int anInt2311;
    public int anInt2312;
    public int anInt2313;
    public int anInt2314;
    public int[] anIntArray2315;
    public int anInt2316 = -1;
    public int[] anIntArray2317;
    public int anInt2318;
    public int anInt2319 = -1;
    public int anInt2320;
    public Class31[] aClass31Array2321;
    public int anInt2322;
    public int anInt2323;
    public static int anInt2324;
    public int anInt2325;
    public static Class40 aClass40_2326 = new Class40(200);
    public static int anInt2327;
    public int anInt2328;
    public boolean aBoolean2329;
    public static int anInt2330;
    public boolean aBoolean2331;
    public static int anInt2332;
    public static int anInt2333;
    public int anInt2334;
    public Class31 aClass31_2335;
    public static int anInt2336;
    public int anInt2337;
    public int[] anIntArray2338;
    public int[] anIntArray2339;
    public boolean aBoolean2340;
    public Class31 aClass31_2341;
    public static int anInt2342;
    public static int anInt2343;
    public int[] anIntArray2344;
    public int anInt2345;
    public static int anInt2346;
    public static int anInt2347;
    public static int anInt2348 = 0;
    public static int[] anIntArray2349;
    public static Class31 aClass31_2350;
    public static Class11_Sub10_Sub13_Sub3 aClass11_Sub10_Sub13_Sub3_2351;
    public static boolean aBoolean2352 = false;
    public static Class31 aClass31_2353;
    public static Class31 aClass31_2354;
    public static int anInt2355;
    public static int anInt2356;
    public static int anInt2357;
    
    public Class11_Sub10_Sub4_Sub4 method461(Class11_Sub10_Sub12 arg0,
					     Class11_Sub10_Sub12 arg1,
					     int arg2, int arg3, int arg4) {
	try {
	    anInt2347++;
	    if (anIntArray2317 != null) {
		Class11_Sub10_Sub14 class11_sub10_sub14 = method467((byte) 87);
		if (class11_sub10_sub14 == null)
		    return null;
		return class11_sub10_sub14.method461(arg0, arg1, 0, arg3,
						     arg4);
	    }
	    if (arg2 != 0)
		anInt2320 = -6;
	    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
		= ((Class11_Sub10_Sub4_Sub4)
		   Class50.aClass40_998.method735((long) anInt2313,
						  (byte) -91));
	    if (class11_sub10_sub4_sub4 == null) {
		boolean bool = false;
		for (int i = 0;
		     (anIntArray2338.length ^ 0xffffffff) < (i ^ 0xffffffff);
		     i++) {
		    if (!Class58.aClass55_1221.method883(50, 0,
							 anIntArray2338[i]))
			bool = true;
		}
		if (bool)
		    return null;
		Class11_Sub10_Sub4_Sub4[] class11_sub10_sub4_sub4s
		    = new Class11_Sub10_Sub4_Sub4[anIntArray2338.length];
		for (int i = 0;
		     (anIntArray2338.length ^ 0xffffffff) < (i ^ 0xffffffff);
		     i++)
		    class11_sub10_sub4_sub4s[i]
			= Class11_Sub10_Sub4_Sub4.method322((Class58
							     .aClass55_1221),
							    anIntArray2338[i],
							    0);
		if (class11_sub10_sub4_sub4s.length != 1)
		    class11_sub10_sub4_sub4
			= (new Class11_Sub10_Sub4_Sub4
			   (class11_sub10_sub4_sub4s,
			    class11_sub10_sub4_sub4s.length));
		else
		    class11_sub10_sub4_sub4 = class11_sub10_sub4_sub4s[0];
		if (anIntArray2339 != null) {
		    for (int i = 0; i < anIntArray2339.length; i++)
			class11_sub10_sub4_sub4.method299(anIntArray2339[i],
							  anIntArray2315[i]);
		}
		class11_sub10_sub4_sub4.method319();
		class11_sub10_sub4_sub4.method312(64 - -anInt2337,
						  anInt2310 + 850, -30, -50,
						  -30, true);
		Class50.aClass40_998.method742(arg2 + -121, (long) anInt2313,
					       class11_sub10_sub4_sub4);
	    }
	    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4_0_;
	    if (arg0 == null || arg1 == null) {
		if (arg0 == null) {
		    if (arg1 != null)
			class11_sub10_sub4_sub4_0_
			    = arg1.method394((byte) -86,
					     class11_sub10_sub4_sub4, arg4);
		    else
			class11_sub10_sub4_sub4_0_
			    = class11_sub10_sub4_sub4.method301(true);
		} else
		    class11_sub10_sub4_sub4_0_
			= arg0.method394((byte) -43, class11_sub10_sub4_sub4,
					 arg3);
	    } else
		class11_sub10_sub4_sub4_0_
		    = arg0.method387(arg1, arg4, class11_sub10_sub4_sub4, arg3,
				     false);
	    if ((anInt2345 ^ 0xffffffff) != -129
		|| (anInt2314 ^ 0xffffffff) != -129)
		class11_sub10_sub4_sub4_0_.method315(anInt2345, anInt2314,
						     anInt2345);
	    return class11_sub10_sub4_sub4_0_;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("gb.F("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + arg2 + ',' + arg3 + ',' + arg4 + ')'));
	}
    }
    
    public boolean method462(byte arg0) {
	try {
	    anInt2356++;
	    if (anIntArray2317 == null)
		return true;
	    int i = -1;
	    if (anInt2318 != -1)
		i = Class61.method965(arg0 ^ ~0x5c44, anInt2318);
	    else if ((anInt2322 ^ 0xffffffff) != 0)
		i = Class29.anIntArray547[anInt2322];
	    if (i < 0 || anIntArray2317.length <= i || anIntArray2317[i] == -1)
		return false;
	    if (arg0 != 80)
		method469(true);
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "gb.H(" + arg0 + ')');
	}
    }
    
    public static boolean method463(Class11_Sub10_Sub5 arg0, byte arg1) {
	try {
	    if (arg1 > -6)
		aClass11_Sub10_Sub13_Sub3_2351 = null;
	    anInt2332++;
	    int i = arg0.anInt2116;
	    if (i >= 1 && i <= 200
		|| (i ^ 0xffffffff) <= -702 && (i ^ 0xffffffff) >= -901) {
		Class37_Sub1.anInt1798++;
		if (i < 801) {
		    if ((i ^ 0xffffffff) <= -702)
			i -= 601;
		    else if (i >= 101)
			i -= 101;
		    else
			i--;
		} else
		    i -= 701;
		Class11_Sub10_Sub9.anInt2197++;
		Class7.method80(Class40.method744(0,
						  (new Class31[]
						   { aClass31_2353,
						     (Canvas_Sub1
						      .aClass31Array63[i]) })),
				2, 0, 0, false, 0);
		Class7.method80(Class40.method744(0,
						  (new Class31[]
						   { Applet_Sub1.aClass31_37,
						     (Canvas_Sub1
						      .aClass31Array63[i]) })),
				20, 0, 0, false, 0);
		return true;
	    }
	    if (i >= 401 && (i ^ 0xffffffff) >= -501) {
		Class7.method80(Class40.method744(0, (new Class31[]
						      { aClass31_2353,
							arg0.aClass31_2077 })),
				45, 0, 0, false, 0);
		Class10.anInt210++;
		return true;
	    }
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "gb.J(" + (arg0 != null ? "{...}"
					       : "null") + ',' + arg1 + ')');
	}
    }
    
    public void method464(boolean arg0, Buffer arg1) {
	for (;;) {
	    int i = arg1.method168(255);
	    if (i == 0)
		break;
	    method466(arg1, (byte) 87, i);
	}
	anInt2324++;
	if (arg0 != false)
	    anIntArray2344 = null;
    }
    
    public static void method465(int arg0, int arg1, int arg2, int arg3) {
	for (int i = 0; (i ^ 0xffffffff) > -9; i++) {
	    for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -9; i_1_++)
		Class51.anIntArrayArrayArray1005[arg2][arg0 - -i][arg3 + i_1_]
		    = 0;
	}
	if (arg0 > arg1) {
	    for (int i = 1; i < 8; i++)
		Class51.anIntArrayArrayArray1005[arg2][arg0][i + arg3]
		    = (Class51.anIntArrayArrayArray1005[arg2][-1 + arg0]
		       [arg3 - -i]);
	}
	anInt2342++;
	if ((arg3 ^ 0xffffffff) < -1) {
	    for (int i = 1; (i ^ 0xffffffff) > -9; i++)
		Class51.anIntArrayArrayArray1005[arg2][i + arg0][arg3]
		    = (Class51.anIntArrayArrayArray1005[arg2][arg0 - -i]
		       [-1 + arg3]);
	}
	if (arg0 <= 0
	    || Class51.anIntArrayArrayArray1005[arg2][arg0 - 1][arg3] == 0) {
	    if ((arg3 ^ 0xffffffff) >= -1
		|| (Class51.anIntArrayArrayArray1005[arg2][arg0][-1 + arg3]
		    ^ 0xffffffff) == -1) {
		if (arg0 > 0 && arg3 > 0 && (Class51.anIntArrayArrayArray1005
					     [arg2][-1 + arg0][arg3 - 1]) != 0)
		    Class51.anIntArrayArrayArray1005[arg2][arg0][arg3]
			= (Class51.anIntArrayArrayArray1005[arg2][-1 + arg0]
			   [arg3 - 1]);
	    } else
		Class51.anIntArrayArrayArray1005[arg2][arg0][arg3]
		    = Class51.anIntArrayArrayArray1005[arg2][arg0][arg3 + -1];
	} else
	    Class51.anIntArrayArrayArray1005[arg2][arg0][arg3]
		= Class51.anIntArrayArrayArray1005[arg2][-1 + arg0][arg3];
    }
    
    public void method466(Buffer arg0, byte arg1, int arg2) {
	try {
	    if (arg2 == 1) {
		int i = arg0.method168(255);
		anIntArray2338 = new int[i];
		for (int i_2_ = 0; i_2_ < i; i_2_++)
		    anIntArray2338[i_2_] = arg0.method164(127);
	    } else if ((arg2 ^ 0xffffffff) != -3) {
		if (arg2 != 3) {
		    if (arg2 == 12)
			anInt2308 = arg0.method168(255);
		    else if (arg2 != 13) {
			if ((arg2 ^ 0xffffffff) != -15) {
			    if (arg2 == 17) {
				anInt2334 = arg0.method164(127);
				anInt2316 = arg0.method164(127);
				anInt2325 = arg0.method164(127);
				anInt2312 = arg0.method164(127);
			    } else if (arg2 >= 30
				       && (arg2 ^ 0xffffffff) > -36) {
				aClass31Array2321[-30 + arg2]
				    = arg0.method181((byte) 127);
				if (aClass31Array2321[-30 + arg2].method653
				    (Class15_Sub2.aClass31_1776, true))
				    aClass31Array2321[arg2 - 30] = null;
			    } else if ((arg2 ^ 0xffffffff) == -41) {
				int i = arg0.method168(255);
				anIntArray2339 = new int[i];
				anIntArray2315 = new int[i];
				for (int i_3_ = 0; i > i_3_; i_3_++) {
				    anIntArray2339[i_3_] = arg0.method164(127);
				    anIntArray2315[i_3_] = arg0.method164(127);
				}
			    } else if ((arg2 ^ 0xffffffff) != -61) {
				if ((arg2 ^ 0xffffffff) == -94)
				    aBoolean2329 = false;
				else if (arg2 != 95) {
				    if ((arg2 ^ 0xffffffff) != -98) {
					if (arg2 != 98) {
					    if ((arg2 ^ 0xffffffff) != -100) {
						if ((arg2 ^ 0xffffffff)
						    != -101) {
						    if (arg2 != 101) {
							if (arg2 != 102) {
							    if ((arg2
								 ^ 0xffffffff)
								== -104)
								anInt2323
								    = (arg0.method164
								       (127));
							    else if ((arg2
								      ^ 0xffffffff)
								     != -107) {
								if ((arg2
								     ^ 0xffffffff)
								    == -108)
								    aBoolean2340
									= false;
							    } else {
								anInt2318
								    = (arg0.method164
								       (127));
								if ((anInt2318
								     ^ 0xffffffff)
								    == -65536)
								    anInt2318
									= -1;
								anInt2322
								    = (arg0.method164
								       (127));
								if ((anInt2322
								     ^ 0xffffffff)
								    == -65536)
								    anInt2322
									= -1;
								int i
								    = (arg0.method168
								       (255));
								anIntArray2317
								    = (new int
								       [1 + i]);
								for (int i_4_
									 = 0;
								     ((i_4_
								       ^ 0xffffffff)
								      >= (i
									  ^ 0xffffffff));
								     i_4_++) {
								    anIntArray2317
									[i_4_]
									= (arg0.method164
									   (127));
								    if (((anIntArray2317
									  [i_4_])
									 ^ 0xffffffff)
									== -65536)
									anIntArray2317
									    [i_4_]
									    = -1;
								}
							    }
							} else
							    anInt2328
								= (arg0.method164
								   (127));
						    } else
							anInt2310
							    = (arg0.method156
							       (26669)) * 5;
						} else
						    anInt2337 = (arg0.method156
								 (26669));
					    } else
						aBoolean2331 = true;
					} else
					    anInt2314 = arg0.method164(127);
				    } else
					anInt2345 = arg0.method164(127);
				} else
				    anInt2319 = arg0.method164(127);
			    } else {
				int i = arg0.method168(255);
				anIntArray2344 = new int[i];
				for (int i_5_ = 0;
				     (i_5_ ^ 0xffffffff) > (i ^ 0xffffffff);
				     i_5_++)
				    anIntArray2344[i_5_] = arg0.method164(127);
			    }
			} else
			    anInt2334 = arg0.method164(127);
		    } else
			anInt2320 = arg0.method164(127);
		} else
		    aClass31_2335 = arg0.method181((byte) 127);
	    } else
		aClass31_2341 = arg0.method181((byte) 127);
	    int i = 124 / ((-19 - arg1) / 58);
	    anInt2336++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("gb.B("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + arg1 + ',' + arg2 + ')'));
	}
    }
    
    public Class11_Sub10_Sub14 method467(byte arg0) {
	try {
	    anInt2343++;
	    int i = 73 / ((arg0 - -9) / 37);
	    int i_6_ = -1;
	    if ((anInt2318 ^ 0xffffffff) == 0) {
		if ((anInt2322 ^ 0xffffffff) != 0)
		    i_6_ = Class29.anIntArray547[anInt2322];
	    } else
		i_6_ = Class61.method965(-23573, anInt2318);
	    if (i_6_ < 0
		|| (anIntArray2317.length ^ 0xffffffff) >= (i_6_ ^ 0xffffffff)
		|| anIntArray2317[i_6_] == -1)
		return null;
	    return Class13.method512(86, anIntArray2317[i_6_]);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "gb.K(" + arg0 + ')');
	}
    }
    
    public void method468(byte arg0) {
	anInt2327++;
	if (arg0 != 13)
	    method461(null, null, 125, -54, -69);
    }
    
    public static void method469(boolean arg0) {
	try {
	    anIntArray2349 = null;
	    aClass31_2350 = null;
	    aClass11_Sub10_Sub13_Sub3_2351 = null;
	    if (arg0 != true)
		anInt2357 = 6;
	    aClass40_2326 = null;
	    aClass31_2354 = null;
	    aClass31_2353 = null;
	    anIntArray2309 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "gb.D(" + arg0 + ')');
	}
    }
    
    public static boolean method470(int arg0, int arg1, byte arg2) {
	try {
	    if (arg2 > -36)
		return false;
	    anInt2311++;
	    if (arg0 == 0
		&& (Class10.anInt206 ^ 0xffffffff) == (arg1 ^ 0xffffffff))
		return true;
	    if ((arg0 ^ 0xffffffff) == -2
		&& ((Class11_Sub10_Sub4_Sub3.anInt2590 ^ 0xffffffff)
		    == (arg1 ^ 0xffffffff)))
		return true;
	    if ((arg0 == 2 || (arg0 ^ 0xffffffff) == -4)
		&& (arg1 ^ 0xffffffff) == (Class11_Sub10_Sub8.anInt2178
					   ^ 0xffffffff))
		return true;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("gb.E(" + arg0 + ',' + arg1 + ',' + arg2
				     + ')'));
	}
    }
    
    public Class11_Sub10_Sub4_Sub4 method471(int arg0) {
	try {
	    anInt2330++;
	    if (anIntArray2317 != null) {
		Class11_Sub10_Sub14 class11_sub10_sub14
		    = method467((byte) -117);
		if (class11_sub10_sub14 == null)
		    return null;
		return class11_sub10_sub14.method471(-2);
	    }
	    if (anIntArray2344 == null)
		return null;
	    boolean bool = false;
	    for (int i = 0; i < anIntArray2344.length; i++) {
		if (!Class58.aClass55_1221.method883(50, 0, anIntArray2344[i]))
		    bool = true;
	    }
	    if (bool)
		return null;
	    Class11_Sub10_Sub4_Sub4[] class11_sub10_sub4_sub4s
		= new Class11_Sub10_Sub4_Sub4[anIntArray2344.length];
	    for (int i = 0;
		 (anIntArray2344.length ^ 0xffffffff) < (i ^ 0xffffffff); i++)
		class11_sub10_sub4_sub4s[i]
		    = Class11_Sub10_Sub4_Sub4.method322(Class58.aClass55_1221,
							anIntArray2344[i], 0);
	    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4;
	    if (arg0 != (class11_sub10_sub4_sub4s.length ^ 0xffffffff))
		class11_sub10_sub4_sub4 = (new Class11_Sub10_Sub4_Sub4
					   (class11_sub10_sub4_sub4s,
					    class11_sub10_sub4_sub4s.length));
	    else
		class11_sub10_sub4_sub4 = class11_sub10_sub4_sub4s[0];
	    if (anIntArray2339 != null) {
		for (int i = 0; anIntArray2339.length > i; i++)
		    class11_sub10_sub4_sub4.method299(anIntArray2339[i],
						      anIntArray2315[i]);
	    }
	    return class11_sub10_sub4_sub4;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "gb.G(" + arg0 + ')');
	}
    }
    
    public Class11_Sub10_Sub14() {
	anInt2312 = -1;
	aClass31Array2321 = new Class31[5];
	anInt2325 = -1;
	anInt2310 = 0;
	anInt2318 = -1;
	anInt2323 = 32;
	anInt2328 = -1;
	anInt2322 = -1;
	aBoolean2329 = true;
	anInt2308 = 1;
	anInt2334 = -1;
	anInt2314 = 128;
	aBoolean2340 = true;
	anInt2320 = -1;
	anInt2337 = 0;
	aBoolean2331 = false;
	aClass31_2341 = Class42.aClass31_768;
	anInt2345 = 128;
    }
    
    static {
	aClass31_2350 = Class64.method992("Walk here", 255);
	aClass31_2353 = Class64.method992("Remove @whi@", 255);
	anInt2355 = 0;
	aClass31_2354 = Class64.method992("Yesterday", 255);
	anInt2357 = 0;
    }
}
