/* Class29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class29
{
    public static Class31 aClass31_529;
    public static int anInt530;
    public static Class37 aClass37_531;
    public static Class31 aClass31_532;
    public static int anInt533;
    public static Class31 aClass31_534;
    public static int anInt535 = 0;
    public static Class31 aClass31_536;
    public static Class31 aClass31_537;
    public static int anInt538;
    public static Class31 aClass31_539;
    public static int anInt540;
    public static int anInt541;
    public static Class31 aClass31_542;
    public static int anInt543;
    public static int anInt544;
    public static int anInt545;
    public static int anInt546;
    public static int[] anIntArray547;
    public static Class31 aClass31_548;
    
    public static void method611(int arg0) {
	try {
	    aClass31_537 = null;
	    aClass31_542 = null;
	    if (arg0 <= 49)
		method613(false, -21);
	    aClass31_529 = null;
	    anIntArray547 = null;
	    aClass31_539 = null;
	    aClass31_534 = null;
	    aClass37_531 = null;
	    aClass31_536 = null;
	    aClass31_532 = null;
	    aClass31_548 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "na.A(" + arg0 + ')');
	}
    }
    
    public static void method612(Component arg0, int arg1) {
	try {
	    if (arg1 < 52)
		method611(-42);
	    arg0.addMouseListener(Class42.aClass58_762);
	    arg0.addMouseMotionListener(Class42.aClass58_762);
	    anInt540++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "na.F(" + (arg0 != null ? "{...}"
					       : "null") + ',' + arg1 + ')');
	}
    }
    
    public static void method613(boolean arg0, int arg1) {
	Class51.anInt1016++;
	anInt533++;
	if (arg1 <= Class51.anInt1016 || arg0) {
	    Class51.anInt1016 = 0;
	    do {
		if (!Class37.aBoolean686
		    && Class11_Sub12.aClass14_1699 != null) {
		    Class28.anInt509++;
		    Class40.outBuffer.method196(1, 217);
		    try {
			Class11_Sub12.aClass14_1699.method521
			    (Class40.outBuffer.payload,
			     Class40.outBuffer.position, 0,
			     true);
			Class40.outBuffer.position = 0;
		    } catch (java.io.IOException ioexception) {
			Class37.aBoolean686 = true;
			break;
		    }
		    break;
		}
	    } while (false);
	}
    }
    
    public static void method614(int arg0) {
	anInt543++;
	if ((Class51.anInt1006 ^ 0xffffffff) == -3) {
	    Class59.method948(Class40.anInt731 * 2,
			      (-Class11_Sub10_Sub6.anInt2133 + client.anInt1466
			       << 106111335) - -Class6.anInt162,
			      (Class11_Sub10_Sub4_Sub3.anInt2585
			       + (-Class10.anInt214 + Class44.anInt794
				  << -154831673)),
			      -1);
	    if (arg0 == -11) {
		if ((Class3.anInt130 ^ 0xffffffff) < 0
		    && (Class61.anInt1283 % 20 ^ 0xffffffff) > -11)
		    Class57.aClass11_Sub10_Sub13_Sub4Array1161[0].method456
			(Class3.anInt130 - 12, Class39_Sub1.anInt1838 + -28);
	    }
	}
    }
    
    public static int method615(int arg0, byte arg1, int arg2) {
	try {
	    if (arg1 < 83)
		return 109;
	    anInt544++;
	    if (arg2 < arg0) {
		int i = arg2;
		arg2 = arg0;
		arg0 = i;
	    }
	    int i;
	    for (/**/; arg0 != 0; arg0 = i) {
		i = arg2 % arg0;
		arg2 = arg0;
	    }
	    return arg2;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("na.B(" + arg0 + ',' + arg1 + ',' + arg2
				     + ')'));
	}
    }
    
    public static void method616(int arg0) {
	try {
	    anInt538++;
	    synchronized (Class32.aClass20_577) {
		Class17.anInt332 = Class6.anInt157;
		if (arg0 <= Class11_Sub10_Sub15.anInt2400) {
		    while ((Class11_Sub10_Sub15.anInt2400 ^ 0xffffffff)
			   != (Class11_Sub10_Sub4_Sub2_Sub2.anInt2838
			       ^ 0xffffffff)) {
			int i = (Class37.anIntArray690
				 [Class11_Sub10_Sub4_Sub2_Sub2.anInt2838]);
			Class11_Sub10_Sub4_Sub2_Sub2.anInt2838
			    = (Class11_Sub10_Sub4_Sub2_Sub2.anInt2838 - -1
			       & 0x7f);
			if ((i ^ 0xffffffff) <= -1)
			    Class11_Sub10_Sub7.aBooleanArray2148[i] = true;
			else
			    Class11_Sub10_Sub7.aBooleanArray2148
				[i ^ 0xffffffff]
				= false;
		    }
		} else {
		    for (int i = 0; i < 112; i++)
			Class11_Sub10_Sub7.aBooleanArray2148[i] = false;
		    Class11_Sub10_Sub15.anInt2400
			= Class11_Sub10_Sub4_Sub2_Sub2.anInt2838;
		}
		Class6.anInt157 = Class11_Sub10_Sub4_Sub6.anInt2697;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "na.D(" + arg0 + ')');
	}
    }
    
    static {
	aClass31_529 = Class64.method992("Username: ", 255);
	aClass31_532
	    = Class64.method992("You have not yet set*6nany contact details)3",
				255);
	anInt530 = 0;
	aClass31_542
	    = (Class64.method992
	       ("Please check your message)2centre for details)3", 255));
	aClass31_536
	    = (Class64.method992
	       ("To extend or cancel a subscription:*6n1(Y Logout and return to the frontpage of this website)3*6n2(YChoose the relevant option from the (Wmembership(W section)3*6n*6nNote: If you are a credit card subscriber a top)2up payment will*6nautomatically be taken when 3 days credit remain)3*6n(Xunless you cancel your subscription)1 which can be done at any time)3(Y",
		255));
	anInt545 = 0;
	aClass31_539 = Class64.method992("backvmid2", 255);
	aClass31_534 = Class64.method992("Continue", 255);
	aClass31_548
	    = (Class64.method992
	       ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R\0341(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ",
		255));
	anIntArray547 = new int[2000];
	anInt541 = 0;
	aClass31_537 = aClass31_548;
    }
}
