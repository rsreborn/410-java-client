/* Class28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class28
{
    public int anInt500 = 0;
    public static Class31 aClass31_501;
    public static int anInt502;
    public int anInt503;
    public int anInt504;
    public int anInt505;
    public static int anInt506 = 0;
    public int anInt507;
    public static Class55 aClass55_508;
    public static int anInt509;
    public int anInt510;
    public static int anInt511;
    public static int anInt512;
    public int anInt513 = 0;
    public static Class31 aClass31_514;
    public int anInt515;
    public int anInt516;
    public int anInt517;
    public static int anInt518;
    public static int anInt519;
    public static int anInt520;
    public static Class3 aClass3_521;
    public int anInt522;
    public static int[] anIntArray523;
    public static volatile int anInt524;
    public static int anInt525;
    public int anInt526;
    public int anInt527;
    public Class11_Sub10_Sub4 aClass11_Sub10_Sub4_528;
    
    public static void method608(int arg0) {
	try {
	    if (arg0 == 0) {
		aClass55_508 = null;
		aClass31_514 = null;
		aClass31_501 = null;
		aClass3_521 = null;
		anIntArray523 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "n.B(" + arg0 + ')');
	}
    }
    
    public static boolean method609(int arg0, byte arg1) {
	try {
	    if (arg1 != -122)
		anInt519 = 38;
	    anInt518++;
	    if ((arg0 ^ 0xffffffff) > -49 || (arg0 ^ 0xffffffff) < -58)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "n.A(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method610(boolean arg0, Class31 arg1, Class31 arg2,
				 int arg3) {
	try {
	    anInt520++;
	    int i = 151;
	    i -= 3;
	    if (Class1.aBoolean76) {
		Class1.aBoolean76 = false;
		Class11_Sub10_Sub2
		    .method238(0, Class11_Sub10_Sub11.aGraphics2261);
		Class55_Sub1.method902(-111,
				       Class11_Sub10_Sub11.aGraphics2261);
		Class32.method662(-114, Class11_Sub10_Sub11.aGraphics2261);
		Class11_Sub6.method208(4, Class11_Sub10_Sub11.aGraphics2261);
		Class61.method967(Class59.anInt1236,
				  Class11_Sub10_Sub11.aGraphics2261,
				  Class58.aClass11_Sub10_Sub13_Sub2_1228,
				  Class58.anInt1222, -14024,
				  Class11_Sub10_Sub10.anInt2222);
		Class52.method857(NotActuallyBuffer.anInt483, Class12.anIntArray237, -1,
				  (anInt512 ^ 0xffffffff) == 0, arg3 ^ ~0x7e09,
				  Class11_Sub10_Sub11.aGraphics2261);
		Class34.aBoolean637 = true;
		Class37_Sub1.aBoolean1801 = true;
		Class11_Sub10_Sub1.aBoolean1946 = true;
	    }
	    Class36.method700(25085);
	    Class58.aClass11_Sub10_Sub13_Sub2_1228.method426(arg2, 257, i, 0);
	    if (arg3 == -32266) {
		Class58.aClass11_Sub10_Sub13_Sub2_1228
		    .method426(arg2, 256, -1 + i, 16777215);
		if (arg1 != null) {
		    i += 15;
		    if (arg0) {
			int i_0_ = (Class58.aClass11_Sub10_Sub13_Sub2_1228
					.method428(arg1)
				    - -4);
			Class11_Sub10_Sub13.method404(-(i_0_ / 2) + 257,
						      -11 + i, i_0_, 11, 0);
		    }
		    Class58.aClass11_Sub10_Sub13_Sub2_1228.method426(arg1, 257,
								     i, 0);
		    Class58.aClass11_Sub10_Sub13_Sub2_1228
			.method426(arg1, 256, i + -1, 16777215);
		}
		Class40.method743((byte) -102,
				  Class11_Sub10_Sub11.aGraphics2261);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("n.C(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + (arg2 != null ? "{...}" : "null") + ','
				     + arg3 + ')'));
	}
    }
    
    static {
	aClass31_501 = Class64.method992("::noclip", 255);
	anInt502 = 0;
	anInt512 = -1;
	anInt519 = 20;
	aClass31_514 = Class64.method992("Chat panel redrawn", 255);
	anInt524 = -1;
    }
}
