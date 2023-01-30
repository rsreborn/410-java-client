/* Class17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class17
{
    public static int anInt330;
    public static int anInt331;
    public static int anInt332 = 0;
    public static Class31 aClass31_333;
    public static Class40 aClass40_334;
    public static Class31 aClass31_335
	= Class64.method992("Last password change:*6n@gre@", 255);
    public static Class31 aClass31_336
	= Class64.method992("To play on this world move to a free area first",
			    255);
    public static Class31 aClass31_337;
    public static boolean aBoolean338;
    public static int[] anIntArray339;
    public static int anInt340;
    public static Class31 aClass31_341;
    public static int anInt342;
    public static int anInt343;
    public static Class31 aClass31_344;
    public static Class31 aClass31_345;
    
    public static void method562(boolean arg0) {
	Class11_Sub10_Sub12.aFontMetrics2294 = null;
	Class39.anImage718 = null;
	anInt330++;
	Class7.aFont1443 = null;
	if (arg0 != true)
	    method562(true);
    }
    
    public static void method563(byte arg0) {
	try {
	    aClass31_333 = null;
	    aClass31_336 = null;
	    aClass31_345 = null;
	    if (arg0 < 121)
		aClass31_335 = null;
	    aClass31_337 = null;
	    aClass40_334 = null;
	    aClass31_344 = null;
	    aClass31_341 = null;
	    anIntArray339 = null;
	    aClass31_335 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "j.A(" + arg0 + ')');
	}
    }
    
    public static synchronized byte[] method564(int arg0, int arg1) {
	try {
	    anInt331++;
	    if (arg0 == 100 && (Class11_Sub6.anInt1579 ^ 0xffffffff) < -1) {
		byte[] is
		    = client.aByteArrayArray1454[--Class11_Sub6.anInt1579];
		client.aByteArrayArray1454[Class11_Sub6.anInt1579] = null;
		return is;
	    }
	    if ((arg0 ^ 0xffffffff) == -5001
		&& (Class11_Sub10_Sub15.anInt2423 ^ 0xffffffff) < -1) {
		byte[] is = (Class10.aByteArrayArray217
			     [--Class11_Sub10_Sub15.anInt2423]);
		Class10.aByteArrayArray217[Class11_Sub10_Sub15.anInt2423]
		    = null;
		return is;
	    }
	    if (arg1 == (arg0 ^ 0xffffffff) && Class62.anInt1307 > 0) {
		byte[] is = Class39.aByteArrayArray717[--Class62.anInt1307];
		Class39.aByteArrayArray717[Class62.anInt1307] = null;
		return is;
	    }
	    return new byte[arg0];
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "j.C(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    static {
	aClass31_333
	    = (Class64.method992
	       ("Press (Wchange your password(W on front page)3", 255));
	aClass31_337 = Class64.method992("@yel@*V", 255);
	aClass40_334 = new Class40(64);
	aBoolean338 = false;
	anInt340 = 0;
	anInt342 = 0;
	aClass31_341 = Class64.method992("From", 255);
	aClass31_344
	    = Class64.method992("We suspect someone knows your password)3",
				255);
	anInt343 = 0;
	aClass31_345 = Class64.method992("yellow:", 255);
    }
}
