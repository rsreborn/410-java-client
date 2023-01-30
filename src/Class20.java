/* Class20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Class20 implements KeyListener, FocusListener
{
    public static int[] anIntArray382;
    public static int anInt383;
    public static int anInt384;
    public static int anInt385;
    public static int anInt386 = 0;
    public static Class31 aClass31_387;
    public static int anInt388;
    public static int anInt389;
    public static Class31 aClass31_390 = Class64.method992("null", 255);
    public static Class31 aClass31_391;
    public static boolean aBoolean392;
    public static int anInt393;
    public static int[] anIntArray394;
    public static int anInt395;
    public static int anInt396;
    public static int anInt397;
    public static Class31 aClass31_398;
    public static int anInt399;
    
    public void keyTyped(KeyEvent arg0) {
	try {
	    anInt384++;
	    arg0.consume();
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "ka.keyTyped(" + (arg0 != null ? "{...}"
						      : "null") + ')');
	}
    }
    
    public static int method570(int arg0, int arg1, int arg2) {
	try {
	    anInt385++;
	    if ((arg2 ^ 0xffffffff) == 0)
		return 12345678;
	    arg1 = arg1 * (0x7f & arg2) / 128;
	    if (arg1 < 2)
		arg1 = 2;
	    else if ((arg1 ^ 0xffffffff) < -127)
		arg1 = 126;
	    if (arg0 != 12800)
		return 61;
	    return arg1 + (0xff80 & arg2);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ka.A(" + arg0 + ',' + arg1 + ',' + arg2
				     + ')'));
	}
    }
    
    public static void method571(byte arg0) {
	Class50.aClass40_990.method740(4);
	anInt396++;
	if (arg0 > -42)
	    anInt386 = -113;
    }
    
    public synchronized void focusLost(FocusEvent arg0) {
	anInt397++;
	if (Class32.aClass20_577 != null)
	    Class11_Sub10_Sub15.anInt2400 = -1;
    }
    
    public static int method572(int arg0, int arg1) {
	try {
	    return arg0 & arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "ka.C(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public synchronized void keyReleased(KeyEvent arg0) {
	try {
	    anInt383++;
	    if (Class32.aClass20_577 != null) {
		Class15_Sub1.anInt1741 = 0;
		int i = arg0.getKeyCode();
		if ((i ^ 0xffffffff) <= -1
		    && Class59.anIntArray1243.length > i)
		    i = Class59.anIntArray1243[i] & ~0x80;
		else
		    i = -1;
		if ((Class11_Sub10_Sub15.anInt2400 ^ 0xffffffff) <= -1
		    && (i ^ 0xffffffff) <= -1) {
		    Class37.anIntArray690[Class11_Sub10_Sub15.anInt2400]
			= i ^ 0xffffffff;
		    Class11_Sub10_Sub15.anInt2400
			= 0x7f & Class11_Sub10_Sub15.anInt2400 - -1;
		    if (Class11_Sub10_Sub15.anInt2400
			== Class11_Sub10_Sub4_Sub2_Sub2.anInt2838)
			Class11_Sub10_Sub15.anInt2400 = -1;
		}
	    }
	    arg0.consume();
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "ka.keyReleased(" + (arg0 != null ? "{...}"
							 : "null") + ')');
	}
    }
    
    public void focusGained(FocusEvent arg0) {
	try {
	    anInt393++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "ka.focusGained(" + (arg0 != null ? "{...}"
							 : "null") + ')');
	}
    }
    
    public static void method573(int arg0) {
	try {
	    aClass31_387 = null;
	    anIntArray382 = null;
	    anIntArray394 = null;
	    if (arg0 == 0) {
		aClass31_390 = null;
		aClass31_398 = null;
		aClass31_391 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ka.B(" + arg0 + ')');
	}
    }
    
    public synchronized void keyPressed(KeyEvent arg0) {
	try {
	    if (Class32.aClass20_577 != null) {
		Class15_Sub1.anInt1741 = 0;
		int i = arg0.getKeyCode();
		if (i < 0 || i >= Class59.anIntArray1243.length)
		    i = -1;
		else {
		    i = Class59.anIntArray1243[i];
		    if ((0x80 & i) != 0)
			i = -1;
		}
		int i_0_;
		if ((i ^ 0xffffffff) == -86 || i == 80 || i == 84
		    || (i ^ 0xffffffff) == -1 || i == 101)
		    i_0_ = -1;
		else
		    i_0_ = Class15.method528(arg0, 98);
		if ((Class11_Sub10_Sub15.anInt2400 ^ 0xffffffff) <= -1
		    && i >= 0) {
		    Class37.anIntArray690[Class11_Sub10_Sub15.anInt2400] = i;
		    Class11_Sub10_Sub15.anInt2400
			= 1 + Class11_Sub10_Sub15.anInt2400 & 0x7f;
		    if (Class11_Sub10_Sub4_Sub2_Sub2.anInt2838
			== Class11_Sub10_Sub15.anInt2400)
			Class11_Sub10_Sub15.anInt2400 = -1;
		}
		if ((i ^ 0xffffffff) <= -1 || (i_0_ ^ 0xffffffff) <= -1) {
		    int i_1_ = 0x7f & Class11_Sub10_Sub4_Sub6.anInt2697 - -1;
		    if (Class17.anInt332 != i_1_) {
			Class48.anIntArray897[(Class11_Sub10_Sub4_Sub6
					       .anInt2697)]
			    = i;
			Class11_Sub10_Sub8.anIntArray2192
			    [Class11_Sub10_Sub4_Sub6.anInt2697]
			    = i_0_;
			Class11_Sub10_Sub4_Sub6.anInt2697 = i_1_;
		    }
		}
	    }
	    arg0.consume();
	    anInt388++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "ka.keyPressed(" + (arg0 != null ? "{...}"
							: "null") + ')');
	}
    }
    
    static {
	anIntArray382 = new int[] { 12800, 12800, 12800, 12800, 12800, 12800,
				    12800, 12800, 12800, 12800, 12800, 12800,
				    12800, 12800, 12800, 12800 };
	anIntArray394 = new int[1000];
	aClass31_387 = Class64.method992("Cancel", 255);
	anInt395 = 0;
	aBoolean392 = false;
	aClass31_398 = Class64.method992("Please wait)3)3)3", 255);
	aClass31_391 = Class64.method992("::hiddenbuttontest", 255);
    }
}
