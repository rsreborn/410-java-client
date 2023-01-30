/* Class11_Sub10_Sub4_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11_Sub10_Sub4_Sub3 extends Class11_Sub10_Sub4
{
    public static int anInt2573;
    public static int anInt2574;
    public static Class31 aClass31_2575;
    public static Class31 aClass31_2576
	= Class64.method992("Try again in 60 secs)3)3)3", 255);
    public static int anInt2577;
    public int anInt2578;
    public static int anInt2579;
    public static boolean aBoolean2580;
    public static int anInt2581;
    public static Class31 aClass31_2582;
    public static Class31 aClass31_2583;
    public static Class11_Sub10_Sub13_Sub4[] aClass11_Sub10_Sub13_Sub4Array2584;
    public static int anInt2585;
    public static int anInt2586;
    public static boolean aBoolean2587;
    public int anInt2588;
    public static int[] anIntArray2589;
    public static int anInt2590;
    public static volatile int anInt2591;
    
    public static void method288(int arg0, Class31 arg1, Class31 arg2,
				 boolean arg3) {
	try {
	    anInt2579++;
	    if (arg0 == 0 && Class14.anInt294 != -1) {
		Class3.aClass31_99 = arg2;
		Class11_Sub10_Sub4_Sub5.anInt2681 = 0;
	    }
	    if ((Class47.anInt881 ^ 0xffffffff) == 0)
		Class32.aBoolean575 = true;
	    if (arg3 != true)
		method289(-125, 11, 64, -64, null, 5, (byte) 95, -46);
	    for (int i = 99; (i ^ 0xffffffff) < -1; i--) {
		Class37.anIntArray684[i] = Class37.anIntArray684[-1 + i];
		Class11_Sub5_Sub1.aClass31Array1915[i]
		    = Class11_Sub5_Sub1.aClass31Array1915[-1 + i];
		Class11_Sub10_Sub5.aClass31Array2089[i]
		    = Class11_Sub10_Sub5.aClass31Array2089[i - 1];
	    }
	    Class37.anIntArray684[0] = arg0;
	    Class11_Sub5_Sub1.aClass31Array1915[0] = arg1;
	    Class11_Sub10_Sub5.aClass31Array2089[0] = arg2;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("la.B(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + (arg2 != null ? "{...}" : "null") + ','
				     + arg3 + ')'));
	}
    }
    
    public static void method289(int arg0, int arg1, int arg2, int arg3,
                                 Buffer arg4, int arg5, byte arg6,
                                 int arg7) {
	try {
	    int i = 42 % ((arg6 - 18) / 55);
	    anInt2574++;
	    if (arg7 < 0 || arg7 >= 104 || (arg0 ^ 0xffffffff) > -1
		|| arg0 >= 104) {
		for (;;) {
		    int i_0_ = arg4.method168(255);
		    if ((i_0_ ^ 0xffffffff) == -1)
			break;
		    if ((i_0_ ^ 0xffffffff) == -2) {
			arg4.method168(255);
			break;
		    }
		    if (i_0_ <= 49)
			arg4.method168(255);
		}
	    } else {
		Class25.aByteArrayArrayArray481[arg1][arg7][arg0] = (byte) 0;
		for (;;) {
		    int i_1_ = arg4.method168(255);
		    if ((i_1_ ^ 0xffffffff) == -1) {
			if ((arg1 ^ 0xffffffff) != -1)
			    Class51.anIntArrayArrayArray1005[arg1][arg7][arg0]
				= -240 + (Class51.anIntArrayArrayArray1005
					  [arg1 - 1][arg7][arg0]);
			else {
			    Class51.anIntArrayArrayArray1005[0][arg7][arg0]
				= -Class55_Sub1.method903(35,
							  (556238 + arg0
							   - -arg3),
							  arg5 + (932731
								  + arg7)) * 8;
			    break;
			}
			break;
		    }
		    if ((i_1_ ^ 0xffffffff) == -2) {
			int i_2_ = arg4.method168(255);
			if (i_2_ == 1)
			    i_2_ = 0;
			if (arg1 == 0)
			    Class51.anIntArrayArrayArray1005[0][arg7][arg0]
				= 8 * -i_2_;
			else {
			    Class51.anIntArrayArrayArray1005[arg1][arg7][arg0]
				= (Class51.anIntArrayArrayArray1005[arg1 + -1]
				   [arg7][arg0]) - 8 * i_2_;
			    break;
			}
			break;
		    }
		    if (i_1_ <= 49) {
			Class36.aByteArrayArrayArray655[arg1][arg7][arg0]
			    = arg4.method156(26669);
			Class15_Sub1.aByteArrayArrayArray1754[arg1][arg7][arg0]
			    = (byte) ((i_1_ - 2) / 4);
			Class33.aByteArrayArrayArray612[arg1][arg7][arg0]
			    = (byte) Class20.method572(arg2 + (i_1_ - 2), 3);
		    } else if ((i_1_ ^ 0xffffffff) >= -82)
			Class25.aByteArrayArrayArray481[arg1][arg7][arg0]
			    = (byte) (-49 + i_1_);
		    else
			Class11_Sub10_Sub15.aByteArrayArrayArray2364[arg1]
			    [arg7][arg0]
			    = (byte) (-81 + i_1_);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("la.E(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + arg3 + ','
				     + (arg4 != null ? "{...}" : "null") + ','
				     + arg5 + ',' + arg6 + ',' + arg7 + ')'));
	}
    }
    
    public Class11_Sub10_Sub4_Sub4 method255(byte arg0) {
	try {
	    if (arg0 != 3)
		anInt2585 = -117;
	    anInt2577++;
	    return Class60.method950(-57, anInt2578).method476(-10, anInt2588,
							       true);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "la.D(" + arg0 + ')');
	}
    }
    
    public static void method290(boolean arg0) {
	try {
	    aClass11_Sub10_Sub13_Sub4Array2584 = null;
	    if (arg0 != true)
		anInt2585 = -50;
	    aClass31_2583 = null;
	    aClass31_2575 = null;
	    aClass31_2582 = null;
	    anIntArray2589 = null;
	    aClass31_2576 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "la.A(" + arg0 + ')');
	}
    }
    
    public static void method291(int arg0) {
	try {
	    synchronized (Class55.anObject1111) {
		if ((Class32.anInt583 ^ 0xffffffff) == -1)
		    Class55.aClass45_1141.method778(5, new Class47(),
						    (byte) 31);
		Class32.anInt583 = 600;
	    }
	    anInt2581++;
	    int i = -74 % ((49 - arg0) / 59);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "la.C(" + arg0 + ')');
	}
    }
    
    static {
	aClass31_2575 = Class64.method992(" from your friend list first", 255);
	aClass31_2583
	    = (Class64.method992
	       ("@yel@ days of*6nmember credit remaining)3*6n*6n@lre@Credit low(Q Renew now*6n@lre@to avoid losing members)3",
		255));
	aBoolean2587 = false;
	aClass31_2582 = Class64.method992("null", 255);
	aBoolean2580 = false;
	anInt2585 = 0;
	anInt2591 = 0;
	anInt2590 = -1;
    }
}
