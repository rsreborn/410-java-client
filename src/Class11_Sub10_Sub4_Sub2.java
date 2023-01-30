/* Class11_Sub10_Sub4_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class11_Sub10_Sub4_Sub2 extends Class11_Sub10_Sub4
{
    public static int anInt2495;
    public int anInt2496;
    public boolean[] aBooleanArray2497;
    public int anInt2498;
    public int anInt2499;
    public int[] anIntArray2500;
    public static int anInt2501;
    public int anInt2502 = 0;
    public static int anInt2503;
    public int anInt2504;
    public int anInt2505 = 0;
    public int anInt2506;
    public int anInt2507;
    public static Class31 aClass31_2508
	= (Class64.method992
	   ("You need a members account to login to this world)3", 255));
    public int anInt2509;
    public int anInt2510;
    public int[] anIntArray2511;
    public int anInt2512;
    public int anInt2513;
    public int anInt2514;
    public int anInt2515;
    public int anInt2516;
    public int anInt2517;
    public int anInt2518;
    public int anInt2519;
    public static int anInt2520;
    public static Class55 aClass55_2521;
    public static int anInt2522;
    public static Class31 aClass31_2523
	= Class64.method992(" with @whi@", 255);
    public int anInt2524;
    public int anInt2525;
    public static Class31 aClass31_2526
	= Class64.method992("Unexpected loginserver response)3", 255);
    public int anInt2527;
    public static Class31 aClass31_2528
	= Class64.method992(" with @cya@", 255);
    public static long aLong2529 = 0L;
    public int[] anIntArray2530;
    public static Class11_Sub5_Sub1 inBuffer;
    public int anInt2532;
    public static int anInt2533;
    public int anInt2534;
    public int anInt2535;
    public int anInt2536;
    public int anInt2537;
    public int anInt2538;
    public static int anInt2539 = 1;
    public int anInt2540;
    public int anInt2541;
    public Class31 aClass31_2542;
    public int anInt2543;
    public int[] anIntArray2544;
    public int anInt2545;
    public int anInt2546;
    public int anInt2547;
    public static int anInt2548;
    public int anInt2549;
    public static int anInt2550;
    public int anInt2551;
    public int anInt2552;
    public int anInt2553;
    public static int anInt2554;
    public int anInt2555;
    public int anInt2556;
    public int anInt2557;
    public int anInt2558;
    public int anInt2559;
    public int anInt2560;
    public static int anInt2561;
    public int[] anIntArray2562;
    public int anInt2563;
    public int anInt2564;
    public boolean aBoolean2565;
    public int anInt2566;
    public static int anInt2567;
    public int anInt2568;
    public static int anInt2569;
    public static int anInt2570;
    public static int anInt2571;
    public static Class11_Sub10_Sub13_Sub3[] aClass11_Sub10_Sub13_Sub3Array2572;
    
    public static void method264(int arg0) {
	if (Class45.aString832.toLowerCase().indexOf("microsoft") != -1) {
	    Class59.anIntArray1243[186] = 57;
	    Class59.anIntArray1243[187] = 27;
	    Class59.anIntArray1243[188] = 71;
	    Class59.anIntArray1243[189] = 26;
	    Class59.anIntArray1243[190] = 72;
	    Class59.anIntArray1243[191] = 73;
	    Class59.anIntArray1243[192] = 58;
	    Class59.anIntArray1243[219] = 42;
	    Class59.anIntArray1243[220] = 74;
	    Class59.anIntArray1243[221] = 43;
	    Class59.anIntArray1243[222] = 59;
	    Class59.anIntArray1243[223] = 28;
	} else {
	    Class59.anIntArray1243[44] = 71;
	    Class59.anIntArray1243[45] = 26;
	    Class59.anIntArray1243[46] = 72;
	    Class59.anIntArray1243[47] = 73;
	    Class59.anIntArray1243[59] = 57;
	    Class59.anIntArray1243[61] = 27;
	    Class59.anIntArray1243[91] = 42;
	    Class59.anIntArray1243[92] = 74;
	    Class59.anIntArray1243[93] = 43;
	    if (Class45.aMethod843 == null) {
		Class59.anIntArray1243[192] = 58;
		Class59.anIntArray1243[222] = 59;
	    } else {
		Class59.anIntArray1243[192] = 28;
		Class59.anIntArray1243[222] = 58;
		Class59.anIntArray1243[520] = 59;
	    }
	}
	anInt2554++;
	if (arg0 < 101)
	    method264(-103);
    }
    
    public static Class39 method265(int arg0) {
	try {
	    anInt2567++;
	    if (arg0 != 61)
		return null;
	    try {
		return (Class39) Class.forName("Class39_Sub2").newInstance();
	    } catch (Throwable throwable) {
		return new Class39_Sub1();
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ke.W(" + arg0 + ')');
	}
    }
    
    public void method266(int arg0, int arg1, int arg2, int arg3) {
	anInt2520++;
	for (int i = 0; (i ^ 0xffffffff) > -5; i++) {
	    if ((anIntArray2530[i] ^ 0xffffffff) >= (arg2 ^ 0xffffffff)) {
		anIntArray2511[i] = arg0;
		anIntArray2544[i] = arg3;
		anIntArray2530[i] = arg2 + 70;
		return;
	    }
	}
	if (arg1 < 49)
	    method267(6);
    }
    
    public static void method267(int arg0) {
	try {
	    if (Class42.aClass58_762 != null) {
		synchronized (Class42.aClass58_762) {
		    Class42.aClass58_762 = null;
		}
	    }
	    if (arg0 <= -58)
		anInt2533++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ke.GA(" + arg0 + ')');
	}
    }
    
    public static Class31 method268(int arg0, byte arg1) {
	try {
	    anInt2522++;
	    if (arg1 > -65)
		method265(-88);
	    Class31 class31 = Class11_Sub11.method493(arg0, (byte) -126);
	    for (int i = class31.method623(119) - 3; i > 0; i -= 3)
		class31
		    = Class40.method744(0, (new Class31[]
					    { class31.method634(i, -32, 0),
					      Class11_Sub4.aClass31_1502,
					      class31.method639(28418, i) }));
	    if ((class31.method623(-76) ^ 0xffffffff) < -9)
		class31
		    = (Class40.method744
		       (0, (new Class31[]
			    { Class11_Sub10_Sub7.aClass31_2155,
			      class31.method634(class31.method623(124) + -8,
						-32, 0),
			      Class11_Sub10_Sub4_Sub1.aClass31_2465, class31,
			      Class50.aClass31_986 })));
	    else if (class31.method623(125) > 4)
		class31 = (Class40.method744
			   (0, (new Class31[]
				{ Class54.aClass31_1071,
				  class31.method634(class31.method623(-76) - 4,
						    -32, 0),
				  Class10.aClass31_207, class31,
				  Class50.aClass31_986 })));
	    return Class40.method744(0, new Class31[] { Class61.aClass31_1265,
							class31 });
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "ke.FA(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public void method269(int arg0) {
	try {
	    anInt2551 = 0;
	    if (arg0 != -2)
		method267(-83);
	    anInt2514 = 0;
	    anInt2550++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ke.EA(" + arg0 + ')');
	}
    }
    
    public boolean method270(int arg0) {
	try {
	    anInt2501++;
	    if (arg0 != 28738)
		method273(45, (byte) 25, false);
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ke.H(" + arg0 + ')');
	}
    }
    
    public void method271(boolean arg0, int arg1, byte arg2, int arg3) {
	try {
	    if (anInt2549 != -1
		&& ((NotActuallyBuffer.method600(anInt2549, 4867).anInt2283 ^ 0xffffffff)
		    == -2))
		anInt2549 = -1;
	    anInt2495++;
	    if (!arg0) {
		int i = -anIntArray2562[0] + arg1;
		int i_0_ = arg3 - anIntArray2500[0];
		if (i_0_ >= -8 && i_0_ <= 8 && i >= -8
		    && (i ^ 0xffffffff) >= -9) {
		    if (anInt2551 < 9)
			anInt2551++;
		    for (int i_1_ = anInt2551; (i_1_ ^ 0xffffffff) < -1;
			 i_1_--) {
			anIntArray2500[i_1_] = anIntArray2500[-1 + i_1_];
			anIntArray2562[i_1_] = anIntArray2562[-1 + i_1_];
			aBooleanArray2497[i_1_] = aBooleanArray2497[-1 + i_1_];
		    }
		    anIntArray2500[0] = arg3;
		    anIntArray2562[0] = arg1;
		    aBooleanArray2497[0] = false;
		    return;
		}
	    }
	    anInt2514 = 0;
	    anInt2551 = 0;
	    anInt2515 = 0;
	    anIntArray2500[0] = arg3;
	    anIntArray2562[0] = arg1;
	    if (arg2 >= 40) {
		anInt2506 = 64 * anInt2510 + 128 * anIntArray2500[0];
		anInt2517 = 64 * anInt2510 + 128 * anIntArray2562[0];
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ke.V(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + arg3 + ')'));
	}
    }
    
    public static void method272(boolean arg0) {
	try {
	    aClass31_2526 = null;
	    aClass31_2508 = null;
	    aClass55_2521 = null;
	    aClass31_2523 = null;
	    if (arg0 == true) {
		inBuffer = null;
		aClass11_Sub10_Sub13_Sub3Array2572 = null;
		aClass31_2528 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ke.U(" + arg0 + ')');
	}
    }
    
    public void method273(int arg0, byte arg1, boolean arg2) {
	try {
	    int i = anIntArray2500[0];
	    anInt2561++;
	    int i_2_ = anIntArray2562[0];
	    if ((anInt2549 ^ 0xffffffff) != 0
		&& ((NotActuallyBuffer.method600(anInt2549, 4867).anInt2283 ^ 0xffffffff)
		    == -2))
		anInt2549 = -1;
	    if ((arg0 ^ 0xffffffff) == -1) {
		i--;
		i_2_++;
	    }
	    if (arg0 == 1)
		i_2_++;
	    if ((anInt2551 ^ 0xffffffff) > -10)
		anInt2551++;
	    if (arg1 != 68)
		method265(106);
	    for (int i_3_ = anInt2551; i_3_ > 0; i_3_--) {
		anIntArray2500[i_3_] = anIntArray2500[-1 + i_3_];
		anIntArray2562[i_3_] = anIntArray2562[-1 + i_3_];
		aBooleanArray2497[i_3_] = aBooleanArray2497[i_3_ - 1];
	    }
	    if ((arg0 ^ 0xffffffff) == -3) {
		i++;
		i_2_++;
	    }
	    if (arg0 == 3)
		i--;
	    if ((arg0 ^ 0xffffffff) == -5)
		i++;
	    if (arg0 == 5) {
		i--;
		i_2_--;
	    }
	    if (arg0 == 6)
		i_2_--;
	    if ((arg0 ^ 0xffffffff) == -8) {
		i++;
		i_2_--;
	    }
	    anIntArray2500[0] = i;
	    anIntArray2562[0] = i_2_;
	    aBooleanArray2497[0] = arg2;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ke.BA(" + arg0 + ',' + arg1 + ',' + arg2
				     + ')'));
	}
    }
    
    public static void method274(int arg0) {
	if (arg0 != 192)
	    method264(-82);
	anInt2548++;
	Class11_Sub10_Sub16.method491(47);
	if (Class11_Sub10_Sub3.anInt2013 == 10) {
	    int i = Class50.anInt995 - 171;
	    int i_4_ = Class11_Sub10_Sub4_Sub5.anInt2681;
	    int i_5_ = -202 + Class61.anInt1266;
	    if (Class51.anInt1011 != 0) {
		if (Class51.anInt1011 != 2) {
		    if ((Class51.anInt1011 ^ 0xffffffff) == -4) {
			int i_6_ = 180;
			int i_7_ = 150;
			if (i_4_ == 1 && i_5_ >= -75 + i_6_
			    && i_5_ <= i_6_ + 75 && i >= -20 + i_7_
			    && i_7_ - -20 >= i)
			    Class51.anInt1011 = 0;
		    }
		} else {
		    int i_8_ = 100;
		    int i_9_ = 60;
		    int i_10_ = 150;
		    i_9_ += 30;
		    if ((i_4_ ^ 0xffffffff) == -2
			&& (i_9_ + -15 ^ 0xffffffff) >= (i ^ 0xffffffff)
			&& (i_9_ ^ 0xffffffff) < (i ^ 0xffffffff))
			Class55.anInt1091 = 0;
		    i_9_ += 15;
		    if ((i_4_ ^ 0xffffffff) == -2 && i >= i_9_ + -15
			&& (i ^ 0xffffffff) > (i_9_ ^ 0xffffffff))
			Class55.anInt1091 = 1;
		    i_9_ += 15;
		    if ((i_4_ ^ 0xffffffff) == -2
			&& (-75 + i_8_ ^ 0xffffffff) >= (i_5_ ^ 0xffffffff)
			&& (75 + i_8_ ^ 0xffffffff) <= (i_5_ ^ 0xffffffff)
			&& (i ^ 0xffffffff) <= (i_10_ + -20 ^ 0xffffffff)
			&& i_10_ + 20 >= i) {
			Class11_Sub10_Sub4_Sub5.aClass31_2680
			    = Class11_Sub10_Sub4_Sub5.aClass31_2680.method629
				  (112).method621(true);
			Class11_Sub10_Sub4.method259((Class11_Sub10_Sub4_Sub5
						      .aClass31_2687),
						     Class3.aClass31_132,
						     (byte) 54);
			Class34.method674(20, false);
		    } else {
			i_8_ = 260;
			if (i_4_ == 1 && i_5_ >= -75 + i_8_
			    && i_5_ <= 75 + i_8_
			    && (i ^ 0xffffffff) <= (i_10_ - 20 ^ 0xffffffff)
			    && (20 + i_10_ ^ 0xffffffff) <= (i ^ 0xffffffff)) {
			    Class51.anInt1011 = 0;
			    Class11_Sub10_Sub4_Sub5.aClass31_2680
				= Class11_Sub10_Sub4_Sub5.aClass31_2687;
			    Class11_Sub10_Sub4_Sub5.aClass31_2666
				= Class11_Sub10_Sub4_Sub5.aClass31_2687;
			}
			while (Class11_Sub4.method135(-14465)) {
			    boolean bool = false;
			    for (int i_11_ = 0;
				 Class29.aClass31_537.method623(119) > i_11_;
				 i_11_++) {
				if (Class55_Sub1.anInt1857
				    == Class29.aClass31_537.method628(false,
								      i_11_)) {
				    bool = true;
				    break;
				}
			    }
			    if (Class55.anInt1091 != 0) {
				if ((Class55.anInt1091 ^ 0xffffffff) == -2) {
				    if ((Class11_Sub10_Sub15.anInt2384
					 ^ 0xffffffff) == -86
					&& (Class11_Sub10_Sub4_Sub5
						.aClass31_2666
						.method623(arg0 ^ ~0x84)
					    ^ 0xffffffff) < -1)
					Class11_Sub10_Sub4_Sub5.aClass31_2666
					    = (Class11_Sub10_Sub4_Sub5
						   .aClass31_2666.method634
					       (-1 + (Class11_Sub10_Sub4_Sub5
							  .aClass31_2666
							  .method623
						      (arg0 + -228)),
						-32, 0));
				    if (Class11_Sub10_Sub15.anInt2384 == 84
					|| Class11_Sub10_Sub15.anInt2384 == 80)
					Class55.anInt1091 = 0;
				    if (bool && Class11_Sub10_Sub4_Sub5
						    .aClass31_2666
						    .method623(-123) < 20)
					Class11_Sub10_Sub4_Sub5.aClass31_2666
					    = (Class11_Sub10_Sub4_Sub5
						   .aClass31_2666.method646
					       ((byte) -126,
						Class55_Sub1.anInt1857));
				}
			    } else {
				if ((Class11_Sub10_Sub15.anInt2384
				     ^ 0xffffffff) == -86
				    && (Class11_Sub10_Sub4_Sub5
					    .aClass31_2680.method623(4)
					^ 0xffffffff) < -1)
				    Class11_Sub10_Sub4_Sub5.aClass31_2680
					= (Class11_Sub10_Sub4_Sub5
					       .aClass31_2680.method634
					   (-1 + Class11_Sub10_Sub4_Sub5
						     .aClass31_2680
						     .method623(-12),
					    arg0 + -224, 0));
				if (Class11_Sub10_Sub15.anInt2384 == 84
				    || (Class11_Sub10_Sub15.anInt2384
					^ 0xffffffff) == -81)
				    Class55.anInt1091 = 1;
				if (bool
				    && (Class11_Sub10_Sub4_Sub5
					    .aClass31_2680
					    .method623(arg0 ^ 0xba)
					^ 0xffffffff) > -13)
				    Class11_Sub10_Sub4_Sub5.aClass31_2680
					= (Class11_Sub10_Sub4_Sub5
					       .aClass31_2680.method646
					   ((byte) -95,
					    Class55_Sub1.anInt1857));
			    }
			}
		    }
		}
	    } else {
		int i_12_ = 100;
		int i_13_ = 120;
		if ((i_4_ ^ 0xffffffff) == -2 && i_12_ - 75 <= i_5_
		    && i_12_ - -75 >= i_5_ && i >= -20 + i_13_
		    && (i ^ 0xffffffff) >= (i_13_ - -20 ^ 0xffffffff)) {
		    Class51.anInt1011 = 3;
		    Class55.anInt1091 = 0;
		}
		i_12_ = 260;
		if (i_4_ == 1 && i_12_ - 75 <= i_5_ && i_5_ <= 75 + i_12_
		    && (i_13_ + -20 ^ 0xffffffff) >= (i ^ 0xffffffff)
		    && (20 + i_13_ ^ 0xffffffff) <= (i ^ 0xffffffff)) {
		    Class51.anInt1011 = 2;
		    Class11_Sub10_Sub4_Sub5.aClass31_2668
			= Class11_Sub10_Sub16.aClass31_2428;
		    Class55.anInt1091 = 0;
		    Class11_Sub10_Sub4_Sub5.aClass31_2682
			= Class11_Sub10_Sub4_Sub5.aClass31_2687;
		}
	    }
	}
    }
    
    public Class11_Sub10_Sub4_Sub2() {
	anIntArray2500 = new int[10];
	anInt2513 = 0;
	anInt2515 = 0;
	anInt2514 = 0;
	anInt2496 = 0;
	anInt2499 = -1;
	anInt2507 = -1;
	anInt2504 = -1;
	anInt2534 = 100;
	anInt2510 = 1;
	anInt2536 = 0;
	anInt2518 = 32;
	anIntArray2530 = new int[4];
	anInt2498 = 0;
	aClass31_2542 = null;
	anInt2540 = 0;
	anInt2532 = 0;
	aBooleanArray2497 = new boolean[10];
	anInt2546 = -1;
	anIntArray2511 = new int[4];
	anInt2552 = 200;
	anInt2535 = 0;
	anIntArray2544 = new int[4];
	anInt2543 = -1;
	anInt2551 = 0;
	anInt2545 = -1;
	anInt2557 = -1000;
	anInt2560 = -1;
	anInt2541 = 0;
	anIntArray2562 = new int[10];
	anInt2549 = -1;
	anInt2558 = 0;
	anInt2527 = 0;
	anInt2525 = -1;
	anInt2568 = -1;
	aBoolean2565 = false;
	anInt2555 = 0;
	anInt2566 = -1;
    }
    
    static {
	inBuffer = new Class11_Sub5_Sub1(5000);
	anInt2570 = 0;
    }
}
