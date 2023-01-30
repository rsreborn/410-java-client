/* Class11_Sub10_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11_Sub10_Sub1 extends Class11_Sub10
{
    public int anInt1927;
    public static Class36 aClass36_1928;
    public static long aLong1929;
    public int anInt1930;
    public static int anInt1931;
    public static Class31 aClass31_1932
	= Class64.method992("@red@Offline", 255);
    public static int anInt1933;
    public int anInt1934;
    public static int anInt1935;
    public static int anInt1936;
    public static int anInt1937;
    public static int anInt1938;
    public static Class55_Sub1 aClass55_Sub1_1939;
    public static int anInt1940;
    public static int anInt1941;
    public static int anInt1942;
    public static Class31 aClass31_1943;
    public static int[] anIntArray1944;
    public static Class31 aClass31_1945;
    public static boolean aBoolean1946;
    public static Class31 aClass31_1947;
    public static Class31 aClass31_1948;
    public static Class40 aClass40_1949;
    public static int[] anIntArray1950;
    public static int anInt1951;
    
    public static void method228(int arg0) {
	try {
	    anInt1935++;
	    if ((Class11_Sub7.anInt1597 ^ 0xffffffff) <= -3
		|| Class39.anInt721 != 0
		|| (Class11_Sub10_Sub11.anInt2269 ^ 0xffffffff) != -1) {
		Class31 class31;
		if (Class39.anInt721 != 1 || Class11_Sub7.anInt1597 >= 2) {
		    if ((Class11_Sub10_Sub11.anInt2269 ^ 0xffffffff) == -2
			&& (Class11_Sub7.anInt1597 ^ 0xffffffff) > -3)
			class31
			    = Class40.method744(0, (new Class31[]
						    { Class44.aClass31_799,
						      Class34.aClass31_641 }));
		    else
			class31 = (Class4.aClass31Array141
				   [Class11_Sub7.anInt1597 - 1]);
		} else
		    class31 = Class40.method744(0, (new Class31[]
						    { Class8.aClass31_168,
						      (Class11_Sub10_Sub6
						       .aClass31_2146),
						      (Class11_Sub10_Sub3
						       .aClass31_2022) }));
		if (arg0 < Class11_Sub7.anInt1597)
		    class31
			= Class40.method744(arg0 + -2,
					    (new Class31[]
					     { class31, aClass31_1945,
					       (Class11_Sub11.method493
						(Class11_Sub7.anInt1597 - 2,
						 (byte) -128)),
					       NotActuallyBuffer.aClass31_491 }));
		RuntimeException_Sub1.aClass11_Sub10_Sub13_Sub2_1357.method440
		    (class31, 4, 15, 16777215, true, Class61.anInt1283 / 1000);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ae.E(" + arg0 + ')');
	}
    }
    
    public static Class11_Sub10_Sub11 method229(byte arg0, int arg1) {
	try {
	    if (arg0 != 30)
		method228(-11);
	    anInt1936++;
	    Class11_Sub10_Sub11 class11_sub10_sub11
		= ((Class11_Sub10_Sub11)
		   aClass40_1949.method735((long) arg1, (byte) -119));
	    if (class11_sub10_sub11 != null)
		return class11_sub10_sub11;
	    byte[] is = Class11_Sub10_Sub4_Sub2_Sub1.aClass55_2814
			    .method887((byte) -119, arg1, 13);
	    class11_sub10_sub11 = new Class11_Sub10_Sub11();
	    class11_sub10_sub11.anInt2252 = arg1;
	    if (is != null)
		class11_sub10_sub11.method381(2, new Buffer(is));
	    aClass40_1949.method742(-120, (long) arg1, class11_sub10_sub11);
	    return class11_sub10_sub11;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "ae.G(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method230(Class55 arg0, byte arg1) {
	try {
	    if (arg1 != -70)
		method233(-57);
	    anInt1940++;
	    Class15.aClass55_318 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "ae.D(" + (arg0 != null ? "{...}"
					       : "null") + ',' + arg1 + ')');
	}
    }
    
    public static void method231(int arg0) {
	try {
	    anIntArray1944 = null;
	    aClass31_1948 = null;
	    aClass31_1932 = null;
	    aClass36_1928 = null;
	    aClass40_1949 = null;
	    aClass55_Sub1_1939 = null;
	    int i = 31 / ((arg0 - -21) / 54);
	    anIntArray1950 = null;
	    aClass31_1947 = null;
	    aClass31_1943 = null;
	    aClass31_1945 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ae.F(" + arg0 + ')');
	}
    }
    
    public void method232(int arg0, Buffer arg1, int arg2) {
	if (arg2 == 1) {
	    anInt1934 = arg1.readUShortBE();
	    anInt1930 = arg1.readUByte();
	    anInt1927 = arg1.readUByte();
	}
	anInt1942++;
	if (arg0 != 30578)
	    method230(null, (byte) -126);
    }
    
    public static int method233(int arg0) {
	try {
	    if (arg0 < 22)
		return 32;
	    anInt1938++;
	    return 5;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ae.B(" + arg0 + ')');
	}
    }
    
    public void method234(Buffer arg0, byte arg1) {
	anInt1937++;
	for (;;) {
	    int i = arg0.readUByte();
	    if ((i ^ 0xffffffff) == -1)
		break;
	    method232(30578, arg0, i);
	}
	if (arg1 > -118)
	    aClass31_1945 = null;
    }
    
    static {
	aLong1929 = 0L;
	anInt1941 = 0;
	aClass36_1928 = new Class36();
	aClass31_1943 = Class64.method992("Mem:", 255);
	anIntArray1944 = new int[50];
	aClass31_1945 = Class64.method992("@whi@ )4 ", 255);
	aBoolean1946 = false;
	aClass31_1947 = Class64.method992("Hide", 255);
	aClass31_1948 = Class64.method992("Loading fonts )2 ", 255);
	aClass40_1949 = new Class40(64);
	anIntArray1950 = new int[] { 1, 2, 4, 8 };
	anInt1951 = 0;
    }
}
