/* Class11_Sub10_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11_Sub10_Sub4_Sub1 extends Class11_Sub10_Sub4
{
    public int anInt2454;
    public int anInt2455;
    public double aDouble2456;
    public static int anInt2457;
    public static int[] anIntArray2458;
    public int anInt2459;
    public int anInt2460;
    public int anInt2461;
    public Class11_Sub10_Sub12 aClass11_Sub10_Sub12_2462;
    public double aDouble2463;
    public int anInt2464;
    public static Class31 aClass31_2465;
    public int anInt2466;
    public boolean aBoolean2467;
    public static int anInt2468;
    public static int anInt2469;
    public int anInt2470 = 0;
    public double aDouble2471;
    public double aDouble2472;
    public int anInt2473;
    public static int anInt2474;
    public static Class31 aClass31_2475;
    public static Class31 aClass31_2476;
    public int anInt2477;
    public static int anInt2478;
    public int anInt2479;
    public int anInt2480;
    public double aDouble2481;
    public static Class31 aClass31_2482
	= (Class64.method992
	   ("To start a subscripton:*6n1(Y Logout and return to the frontpage of this website)3*6n2(Y Choose (WStart a new subscription(W",
	    255));
    public double aDouble2483;
    public static int anInt2484;
    public int anInt2485;
    public static Class31 aClass31_2486;
    public int anInt2487 = 0;
    public int anInt2488;
    public static Class40 aClass40_2489;
    public static int[] anIntArray2490;
    public static Class31 aClass31_2491;
    public double aDouble2492;
    public double aDouble2493;
    public static int anInt2494;
    
    public void method260(int arg0, int arg1, int arg2, int arg3, int arg4) {
	try {
	    if (!aBoolean2467) {
		double d = (double) (-anInt2479 + arg0);
		double d_0_ = (double) (arg4 - anInt2466);
		double d_1_ = Math.sqrt(d * d + d_0_ * d_0_);
		aDouble2483
		    = (double) anInt2461 * d / d_1_ + (double) anInt2479;
		aDouble2472
		    = (double) anInt2466 + d_0_ * (double) anInt2461 / d_1_;
		aDouble2456 = (double) anInt2480;
	    }
	    anInt2469++;
	    double d = (double) (arg2 + anInt2473 - arg3);
	    aDouble2471 = (-aDouble2472 + (double) arg4) / d;
	    aDouble2463 = ((double) arg0 - aDouble2483) / d;
	    aDouble2492 = Math.sqrt(aDouble2463 * aDouble2463
				    + aDouble2471 * aDouble2471);
	    if (!aBoolean2467)
		aDouble2493
		    = -aDouble2492 * Math.tan(0.02454369 * (double) anInt2460);
	    aDouble2481 = 2.0 * (-(aDouble2493 * d)
				 + (-aDouble2456 + (double) arg1)) / (d * d);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("kd.E(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + arg3 + ',' + arg4 + ')'));
	}
    }
    
    public static void method261(int arg0) {
	try {
	    aClass40_2489 = null;
	    aClass31_2476 = null;
	    aClass31_2482 = null;
	    anIntArray2458 = null;
	    anIntArray2490 = null;
	    aClass31_2491 = null;
	    aClass31_2486 = null;
	    aClass31_2465 = null;
	    if (arg0 == 1)
		aClass31_2475 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "kd.B(" + arg0 + ')');
	}
    }
    
    public static Class11_Sub10_Sub13_Sub2 method262
	(Class55 arg0, Class31 arg1, Class31 arg2, boolean arg3) {
	try {
	    anInt2484++;
	    if (arg3 != true)
		method261(21);
	    int i = arg0.hashFileName((byte) -18, arg2);
	    int i_2_ = arg0.method891(false, arg1, i);
	    return Class64.method995(i, arg0, i_2_, (byte) 76);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("kd.C("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + (arg2 != null ? "{...}" : "null") + ','
				     + arg3 + ')'));
	}
    }
    
    public void method263(byte arg0, int arg1) {
	if (arg0 < -47) {
	    anInt2494++;
	    aBoolean2467 = true;
	    aDouble2483 += (double) arg1 * aDouble2463;
	    aDouble2472 += aDouble2471 * (double) arg1;
	    aDouble2456
		+= (aDouble2493 * (double) arg1
		    + aDouble2481 * 0.5 * (double) arg1 * (double) arg1);
	    aDouble2493 += (double) arg1 * aDouble2481;
	    anInt2488
		= 1024 + (int) (325.949 * Math.atan2(aDouble2463,
						     aDouble2471)) & 0x7ff;
	    anInt2477 = 0x7ff & (int) (325.949
				       * Math.atan2(aDouble2493, aDouble2492));
	    if (aClass11_Sub10_Sub12_2462 != null) {
		anInt2487 += arg1;
		while (anInt2487
		       > aClass11_Sub10_Sub12_2462.anIntArray2296[anInt2470]) {
		    anInt2487
			-= aClass11_Sub10_Sub12_2462.anIntArray2296[anInt2470];
		    anInt2470++;
		    if ((anInt2470 ^ 0xffffffff)
			<= (aClass11_Sub10_Sub12_2462.anIntArray2280.length
			    ^ 0xffffffff))
			anInt2470 = 0;
		}
	    }
	}
    }
    
    public Class11_Sub10_Sub4_Sub4 method255(byte arg0) {
	try {
	    anInt2474++;
	    Class11_Sub10_Sub11 class11_sub10_sub11
		= Class11_Sub10_Sub1.method229((byte) 30, anInt2464);
	    if (arg0 != 3)
		method263((byte) -71, -80);
	    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
		= class11_sub10_sub11.method378((byte) -39, anInt2470);
	    if (class11_sub10_sub4_sub4 == null)
		return null;
	    class11_sub10_sub4_sub4.method303(anInt2477);
	    return class11_sub10_sub4_sub4;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "kd.D(" + arg0 + ')');
	}
    }
    
    public Class11_Sub10_Sub4_Sub1(int arg0, int arg1, int arg2, int arg3,
				   int arg4, int arg5, int arg6, int arg7,
				   int arg8, int arg9, int arg10) {
	aBoolean2467 = false;
	try {
	    anInt2485 = arg9;
	    anInt2460 = arg7;
	    aBoolean2467 = false;
	    anInt2459 = arg5;
	    anInt2464 = arg0;
	    anInt2473 = arg6;
	    anInt2454 = arg10;
	    anInt2479 = arg2;
	    anInt2461 = arg8;
	    anInt2455 = arg1;
	    anInt2480 = arg4;
	    anInt2466 = arg3;
	    int i
		= Class11_Sub10_Sub1.method229((byte) 30, anInt2464).anInt2262;
	    if ((i ^ 0xffffffff) == 0)
		aClass11_Sub10_Sub12_2462 = null;
	    else
		aClass11_Sub10_Sub12_2462 = NotActuallyBuffer.method600(i, 4867);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("kd.<init>(" + arg0 + ',' + arg1 + ','
				     + arg2 + ',' + arg3 + ',' + arg4 + ','
				     + arg5 + ',' + arg6 + ',' + arg7 + ','
				     + arg8 + ',' + arg9 + ',' + arg10 + ')'));
	}
    }
    
    static {
	anIntArray2458 = new int[] { 0, -1, 0, 1 };
	aClass31_2465 = Class64.method992(" million @whi@(X", 255);
	anInt2478 = -16 + (int) (Math.random() * 33.0);
	aClass31_2486 = Class64.method992(")2", 255);
	aClass31_2476 = Class64.method992("@gr1@", 255);
	aClass31_2491 = Class64.method992("Unable to connect)3", 255);
	aClass31_2475
	    = (Class64.method992
	       ("Account locked as we suspect it has been stolen)3", 255));
	aClass40_2489 = new Class40(64);
    }
}
